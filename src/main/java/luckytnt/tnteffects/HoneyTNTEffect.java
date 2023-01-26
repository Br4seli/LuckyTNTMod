package luckytnt.tnteffects;

import java.util.Random;

import luckytnt.registry.BlockRegistry;
import luckytnt.util.Noise3D;
import luckytntlib.util.IExplosiveEntity;
import luckytntlib.util.explosions.ExplosionHelper;
import luckytntlib.util.explosions.IBlockExplosionCondition;
import luckytntlib.util.explosions.IForEachBlockExplosionEffect;
import luckytntlib.util.explosions.ImprovedExplosion;
import luckytntlib.util.explosions.PrimedTNTEffect;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Bee;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BeehiveBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;

public class HoneyTNTEffect extends PrimedTNTEffect{

	@Override
	public void serverExplosion(IExplosiveEntity entity) {
		Noise3D noise = new Noise3D(80, 80, 80, 5);
		ExplosionHelper.doModifiedSphericalExplosion(entity.level(), entity.getPos(), 20, new Vec3(1f, 1.5f, 1f), new IBlockExplosionCondition() {			
			@Override
			public boolean conditionMet(Level level, BlockPos pos, BlockState state, double distance) {
				if(state.getExplosionResistance(level, pos, ImprovedExplosion.dummyExplosion()) <= 200) {
					return true;
				}
				return false;
			}
		}, new IForEachBlockExplosionEffect() {		
			@Override
			public void doBlockExplosion(Level level, BlockPos pos, BlockState state, double distance) {
				distance += Math.random();
				if(distance <= 18) {
					state.onBlockExploded(level, pos, ImprovedExplosion.dummyExplosion());
					if(distance >= 17 && Math.random() < 0.05f) {
						level.setBlockAndUpdate(pos, Blocks.BEE_NEST.defaultBlockState().setValue(BeehiveBlock.FACING, getRandomDirectionHorizontal()).setValue(BeehiveBlock.HONEY_LEVEL, new Random().nextInt(6)));
					}
					if(Math.random() < 0.025f) {
						Bee bee = new Bee(EntityType.BEE, level);
						bee.setPos(pos.getX(), pos.getY(), pos.getZ());
						level.addFreshEntity(bee);
					}				
				}
				else if(distance <= 20){
					int offX = Math.round(pos.getX() - (float)entity.x());
					int offY = Math.round(pos.getY() - (float)entity.y());
					int offZ = Math.round(pos.getZ() - (float)entity.z());
					state.onBlockExploded(level, pos, ImprovedExplosion.dummyExplosion());
					if(noise.getValue(Mth.clamp(offX + 20, 0, 80), Mth.clamp((int)(offY + 20f * 1.5f), 0, 80), Mth.clamp(offZ + 20, 0, 80)) > 0.7f) {
						level.setBlockAndUpdate(pos, Blocks.HONEY_BLOCK.defaultBlockState());
					}
					else {
						level.setBlockAndUpdate(pos, Blocks.HONEYCOMB_BLOCK.defaultBlockState());
					}
				}
			}
		});
	}
	
	@Override
	public void spawnParticles(IExplosiveEntity entity){
		entity.level().addParticle(ParticleTypes.DRIPPING_HONEY, entity.x(), entity.y(), entity.z(), 0f, 0f, 0f);
	}
	
	@Override
	public Block getBlock() {
		return BlockRegistry.HONEY_TNT.get();
	}
	
	@Override
	public int getDefaultFuse(IExplosiveEntity entity) {
		return 120;
	}
	
	public Direction getRandomDirectionHorizontal() {
		int random = new Random().nextInt(4);
		switch(random) {
			case 0: return Direction.NORTH;
			case 1: return Direction.EAST;
			case 2: return Direction.SOUTH;
			case 3: return Direction.WEST;
		}
		return Direction.NORTH;
	}
}