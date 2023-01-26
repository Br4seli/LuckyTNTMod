package luckytnt.tnteffects;

import luckytnt.registry.BlockRegistry;
import luckytntlib.util.IExplosiveEntity;
import luckytntlib.util.explosions.IForEachBlockExplosionEffect;
import luckytntlib.util.explosions.ImprovedExplosion;
import luckytntlib.util.explosions.PrimedTNTEffect;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Ghast;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseFireBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class HellfireTNTEffect extends PrimedTNTEffect{
	
	@Override
	public void serverExplosion(IExplosiveEntity entity) {
		ImprovedExplosion explosion = new ImprovedExplosion(entity.level(), (Entity) entity, entity.getPos().x, entity.getPos().y + 0.5f, entity.getPos().z, 20);
		explosion.doEntityExplosion(2f, true);
		explosion.doBlockExplosion(1f, 1f, 1f, 1.5f, false, false);
		ImprovedExplosion netherExplosion = new ImprovedExplosion(entity.level(), entity.getPos().add(0, 0.5f, 0), 30);
		netherExplosion.doBlockExplosion(1f, 1f, 1f, 1.5f, false, new IForEachBlockExplosionEffect() {
			
			@Override
			public void doBlockExplosion(Level level, BlockPos pos, BlockState state, double distance) {
				if(distance <= 25) {
					if(Math.random() < 0.9f) {
						state.onBlockExploded(level, pos, netherExplosion);
						level.setBlockAndUpdate(pos, Blocks.NETHERRACK.defaultBlockState());
						if(Math.random() < 0.1f) {
							if(level.getBlockState(pos.above()).isAir()) {
								level.setBlockAndUpdate(pos, BaseFireBlock.getState(level, pos));
							}
						}
					}
					else if(Math.random() < 0.3f) {
						state.onBlockExploded(level, pos, netherExplosion);
						level.setBlockAndUpdate(pos, Blocks.LAVA.defaultBlockState());
					}
				}
			}
		});
		for(int i = 0; i <= 5; i++) {
			Ghast ghast = new Ghast(EntityType.GHAST, entity.level());
			ghast.setPos(entity.getPos().add(0, 20 + Math.random() * 20, 0));
			entity.level().addFreshEntity(ghast);
		}
	}
	
	@Override
	public void spawnParticles(IExplosiveEntity entity) {
		Level level = entity.level();
		level.addParticle(ParticleTypes.FLAME, entity.x(), entity.y() + 0.5f, entity.z(), 0, 0.1f, 0);
		level.addParticle(ParticleTypes.FLAME, entity.x(), entity.y() + 0.5f, entity.z(), 0.05f, 0.1f, 0);
		level.addParticle(ParticleTypes.FLAME, entity.x(), entity.y() + 0.5f, entity.z(), -0.05f, 0.1f, 0);
		level.addParticle(ParticleTypes.FLAME, entity.x(), entity.y() + 0.5f, entity.z(), 0, 0.1f, 0.05f);
		level.addParticle(ParticleTypes.FLAME, entity.x(), entity.y() + 0.5f, entity.z(), 0, 0.1f, -0.05f);
		
		level.addParticle(ParticleTypes.FLAME, entity.x(), entity.y() + 0.5f, entity.z(), 0.2f, 0, 0);
		level.addParticle(ParticleTypes.FLAME, entity.x(), entity.y() + 0.5f, entity.z(), -0.2f, 0, 0);
		level.addParticle(ParticleTypes.FLAME, entity.x(), entity.y() + 0.5f, entity.z(), 0, 0, 0.2f);
		level.addParticle(ParticleTypes.FLAME, entity.x(), entity.y() + 0.5f, entity.z(), 0, 0, -0.2f);
		
		level.addParticle(ParticleTypes.FLAME, entity.x(), entity.y() + 0.5f, entity.z(), 0.1f, 0, 0.1f);
		level.addParticle(ParticleTypes.FLAME, entity.x(), entity.y() + 0.5f, entity.z(), -0.1f, 0, -0.1f);
		level.addParticle(ParticleTypes.FLAME, entity.x(), entity.y() + 0.5f, entity.z(), 0.1f, 0, -0.1f);
		level.addParticle(ParticleTypes.FLAME, entity.x(), entity.y() + 0.5f, entity.z(), -0.1f, 0, 0.1f);
	}

	@Override
	public Block getBlock() {
		return BlockRegistry.HELLFIRE_TNT.get();
	}
	
	@Override
	public int getDefaultFuse(IExplosiveEntity entity) {
		return 160;
	}
}