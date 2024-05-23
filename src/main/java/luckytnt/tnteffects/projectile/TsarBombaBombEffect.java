package luckytnt.tnteffects.projectile;

import java.util.List;

import com.mojang.math.Vector3f;

import luckytnt.network.ClientboundHydrogenBombPacket;
import luckytnt.network.PacketHandler;
import luckytnt.registry.BlockRegistry;
import luckytnt.registry.EffectRegistry;
import luckytnt.util.NuclearBombLike;
import luckytntlib.util.IExplosiveEntity;
import luckytntlib.util.explosions.ImprovedExplosion;
import luckytntlib.util.tnteffects.PrimedTNTEffect;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.DustParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraftforge.network.PacketDistributor;

public class TsarBombaBombEffect extends PrimedTNTEffect implements NuclearBombLike {

	@Override
	public void serverExplosion(IExplosiveEntity entity) {
		if(entity.level() instanceof ServerLevel) {
			PacketHandler.CHANNEL.send(PacketDistributor.TRACKING_ENTITY.with(() -> (Entity)entity), new ClientboundHydrogenBombPacket(((Entity)entity).getId()));
		}
		
		ImprovedExplosion explosion = new ImprovedExplosion(entity.level(), (Entity)entity, entity.getPos(), 160f);
		explosion.doEntityExplosion(15f, true);
		explosion.doBlockExplosion(1f, 1f, 0.167f, 0.05f, false, true);
		
		List<LivingEntity> list = entity.level().getEntitiesOfClass(LivingEntity.class, new AABB(entity.x() - 90, entity.y() - 65, entity.z() - 90, entity.x() + 90, entity.y() + 65, entity.z() + 90));
		for(LivingEntity living : list) {
			living.addEffect(new MobEffectInstance(EffectRegistry.CONTAMINATED_EFFECT.get(), 3600, 0, true, true, true));
		}
		
		for(int offX = -300; offX <= 300; offX++) {
			for(int offY = -300 / 3; offY <= 300 / 3; offY++) {
				for(int offZ = -300; offZ <= 300; offZ++) {
					double distance = Math.sqrt(offX * offX + offY * offY + offZ * offZ);
					BlockPos pos = new BlockPos(entity.x() + offX, entity.y() + offY, entity.z() + offZ);
					BlockState state = entity.level().getBlockState(pos);
					if(distance <= 300 && state.getExplosionResistance(entity.level(), pos, ImprovedExplosion.dummyExplosion(entity.level())) <= 200) {
						if(distance <= 150 && entity.level().getBlockState(pos.below()).isFaceSturdy(entity.level(), pos.below(), Direction.UP) && Math.random() < 0.2D && (state.isAir() || state.getBlock().defaultDestroyTime() <= 0.2f)) {
							entity.level().setBlock(pos, BlockRegistry.NUCLEAR_WASTE.get().defaultBlockState(), 3);
						}
						if(state.is(BlockTags.LEAVES)) {
							entity.level().setBlock(pos, Blocks.AIR.defaultBlockState(), 3);
						}
					}
				}
			}
		}
	}
	
	@Override
	public void displayMushroomCloud(IExplosiveEntity ent) {
		for(int count = 0; count < 1500; count++) {
			ent.level().addParticle(new DustParticleOptions(new Vector3f(1f, 2f, 0f), 10f), true, ent.x() + Math.random() * 60 - Math.random() * 60, ent.y() + Math.random() * 3 - Math.random() * 3, ent.z() + Math.random() * 60 - Math.random() * 60, 0, 0, 0);
		}
		for(int count = 0; count < 1000; count++) {
			ent.level().addParticle(new DustParticleOptions(new Vector3f(1f, 2f, 0f), 10f), true, ent.x() + Math.random() * 20 - Math.random() * 20, ent.y() + 3 + Math.random() * 3 - Math.random() * 3, ent.z() + Math.random() * 20 - Math.random() * 20, 0, 0, 0);
		}
		for(int count = 0; count < 800; count++) {
			ent.level().addParticle(new DustParticleOptions(new Vector3f(1f, 2f, 0f), 10f), true, ent.x() + Math.random() * 10 - Math.random() * 10, ent.y() + Math.random() * 3 - Math.random() * 3, ent.z() + Math.random() * 10 - Math.random() * 10, 0, 0, 0);
		}
		for(int count = 0; count < 600; count++) {
			ent.level().addParticle(new DustParticleOptions(new Vector3f(1f, 2f, 0f), 10f), true, ent.x() + Math.random() * 6 - Math.random() * 6, ent.y() + 4 + Math.random() * 3 - Math.random() * 3, ent.z() + Math.random() * 6 - Math.random() * 6, 0, 0, 0);
		}
		for(int count = 0; count < 600; count++) {
			ent.level().addParticle(new DustParticleOptions(new Vector3f(1f, 2f, 0f), 10f), true, ent.x() + Math.random() * 2 - Math.random() * 2, ent.y() + 15 + Math.random() * 12 - Math.random() * 12, ent.z() + Math.random() * 2 - Math.random() * 2, 0, 0, 0);
		}
		for(int count = 0; count < 600; count++) {
			ent.level().addParticle(new DustParticleOptions(new Vector3f(1f, 2f, 0f), 10f), true, ent.x() + Math.random() * 6 - Math.random() * 6, ent.y() + 22 + Math.random() * 3 - Math.random() * 3, ent.z() + Math.random() * 6 - Math.random() * 6, 0, 0, 0);
		}
		for(int count = 0; count < 600; count++) {
			ent.level().addParticle(new DustParticleOptions(new Vector3f(1f, 2f, 0f), 10f), true, ent.x() + Math.random() * 6 - Math.random() * 6, ent.y() + 29 + Math.random() * 3 - Math.random() * 3, ent.z() + Math.random() * 6 - Math.random() * 6, 0, 0, 0);
		}
		for(int count = 0; count < 2000; count++) {
			ent.level().addParticle(new DustParticleOptions(new Vector3f(1f, 2f, 0f), 10f), true, ent.x() + Math.random() * 12 - Math.random() * 12, ent.y() + 24 + Math.random() * 6 - Math.random() * 6, ent.z() + Math.random() * 12 - Math.random() * 12, 0, 0, 0);
		}
		for(int count = 0; count < 2000; count++) {
			ent.level().addParticle(ParticleTypes.LARGE_SMOKE, true, ent.x() + Math.random() * 2 - Math.random() * 2, ent.y() + 22 + Math.random() * 2 - Math.random() * 2, ent.z() + Math.random() * 2 - Math.random() * 2, Math.random() * 2 - Math.random() * 2, Math.random() * 2 - Math.random() * 2, Math.random() * 2 - Math.random() * 2);
		}
	}
}
