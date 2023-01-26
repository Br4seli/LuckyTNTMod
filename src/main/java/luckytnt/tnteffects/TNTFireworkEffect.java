package luckytnt.tnteffects;

import luckytnt.registry.BlockRegistry;
import luckytnt.registry.EntityRegistry;
import luckytntlib.entity.PrimedLTNT;
import luckytntlib.util.IExplosiveEntity;
import luckytntlib.util.explosions.PrimedTNTEffect;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.block.Block;

public class TNTFireworkEffect extends PrimedTNTEffect{

	@Override
	public void explosionTick(IExplosiveEntity entity) {
		Entity ent = (Entity)entity;
		ent.setDeltaMovement(ent.getDeltaMovement().x, 0.8f, ent.getDeltaMovement().z);
	}
	
	@Override
	public void serverExplosion(IExplosiveEntity entity) {
		for(int count = 0; count <= 300; count++) {
			PrimedLTNT TNT = EntityRegistry.TNT.get().create(entity.level());
			TNT.setPos(entity.getPos());
			TNT.setDeltaMovement((Math.random() - Math.random()) * 1.5f, (Math.random() - Math.random()) * 1.5f, (Math.random() - Math.random()) * 1.5f);
			TNT.setFuse(TNT.getFuse() / 2 + (int)(TNT.getFuse() * (Math.random() + 0.2f)));
			entity.level().addFreshEntity(TNT);
		}
	}
	
	@Override
	public void spawnParticles(IExplosiveEntity entity) {
		entity.level().addParticle(ParticleTypes.FLAME, entity.x(), entity.y() + 0.5f, entity.z(), 0, 0, 0);
	}
	
	@Override
	public Block getBlock() {
		return BlockRegistry.TNT_FIREWORK.get();
	}

	@Override
	public int getDefaultFuse(IExplosiveEntity entity) {
		return 40;
	}
}