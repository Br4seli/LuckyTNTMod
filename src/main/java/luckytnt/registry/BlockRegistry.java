package luckytnt.registry;

import luckytnt.LuckyTNTMod;
import luckytnt.block.GunpowderOreBlock;
import luckytnt.block.NuclearWasteBlock;
import luckytnt.block.RedstoneTNTBlock;
import luckytnt.block.SmokeTNTBlock;
import luckytnt.block.TrollTNTBlock;
import luckytnt.block.TrollTNTMk2Block;
import luckytnt.block.TrollTNTMk3Block;
import luckytnt.block.TunnelingTNTBlock;
import luckytnt.block.UraniumOreBlock;
import luckytnt.block.XRayTNTBlock;
import luckytntlib.block.LTNTBlock;
import luckytntlib.block.LuckyTNTBlock;
import luckytntlib.registry.TNTBlockRegistryData;
import net.minecraft.network.chat.contents.TranslatableContents;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockRegistry {

	//TNT
	public static final RegistryObject<LTNTBlock> TNT = LuckyTNTMod.RH.registerTNTBlock(EntityRegistry.TNT, new TNTBlockRegistryData.Builder("tnt").tab(null).addDispenserBehaviour(false).makeItem(false).build());

	//Normal TNTs
	public static final RegistryObject<LTNTBlock> TNT_X5 = LuckyTNTMod.RH.registerTNTBlock("tnt_x5", EntityRegistry.TNT_X5, "n", MaterialColor.COLOR_BLUE, true);
	public static final RegistryObject<LTNTBlock> TNT_X20 = LuckyTNTMod.RH.registerTNTBlock("tnt_x20", EntityRegistry.TNT_X20, "n", MaterialColor.COLOR_GREEN, true);
	public static final RegistryObject<LTNTBlock> TNT_X100 = LuckyTNTMod.RH.registerTNTBlock("tnt_x100", EntityRegistry.TNT_X100, "n", MaterialColor.COLOR_ORANGE, true);
	public static final RegistryObject<LTNTBlock> TNT_X500 = LuckyTNTMod.RH.registerTNTBlock("tnt_x500", EntityRegistry.TNT_X500, "n", MaterialColor.COLOR_BLACK, true);
	public static final RegistryObject<LTNTBlock> COBBLESTONE_HOUSE_TNT = LuckyTNTMod.RH.registerTNTBlock("cobblestone_house_tnt", EntityRegistry.COBBLESTONE_HOUSE_TNT, "n", true);
	public static final RegistryObject<LTNTBlock> WOOD_HOUSE_TNT = LuckyTNTMod.RH.registerTNTBlock("woodhouse_tnt", EntityRegistry.WOOD_HOUSE_TNT, "n");
	public static final RegistryObject<LTNTBlock> BRICK_HOUSE_TNT = LuckyTNTMod.RH.registerTNTBlock("brickhouse_tnt", EntityRegistry.BRICK_HOUSE_TNT, "n");
	public static final RegistryObject<LTNTBlock> DIGGING_TNT = LuckyTNTMod.RH.registerTNTBlock("digging_tnt", EntityRegistry.DIGGING_TNT, "n");
	public static final RegistryObject<LTNTBlock> DRILLING_TNT = LuckyTNTMod.RH.registerTNTBlock("drilling_tnt", EntityRegistry.DRILLING_TNT, "n", MaterialColor.COLOR_ORANGE, true);
	public static final RegistryObject<LTNTBlock> SPHERE_TNT = LuckyTNTMod.RH.registerTNTBlock("sphere_tnt", EntityRegistry.SPHERE_TNT, "n", MaterialColor.COLOR_ORANGE, true);
	public static final RegistryObject<LTNTBlock> FLOATING_ISLAND = LuckyTNTMod.RH.registerTNTBlock(EntityRegistry.FLOATING_ISLAND, new TNTBlockRegistryData.Builder("floating_island").tab("n").description(new TranslatableContents("block.floating_island.description")).build());
	public static final RegistryObject<LTNTBlock> OCEAN_TNT = LuckyTNTMod.RH.registerTNTBlock("ocean_tnt", EntityRegistry.OCEAN_TNT, "n", MaterialColor.COLOR_BLUE, true);
	public static final RegistryObject<LTNTBlock> HELLFIRE_TNT = LuckyTNTMod.RH.registerTNTBlock("hellfire_tnt", EntityRegistry.HELLFIRE_TNT, "n");
	public static final RegistryObject<LTNTBlock> FIRE_TNT = LuckyTNTMod.RH.registerTNTBlock("fire_tnt", EntityRegistry.FIRE_TNT, "n", MaterialColor.COLOR_ORANGE, true);
	public static final RegistryObject<LTNTBlock> SNOW_TNT = LuckyTNTMod.RH.registerTNTBlock("snow_tnt", EntityRegistry.SNOW_TNT, "n", MaterialColor.WOOL, true);
	public static final RegistryObject<LTNTBlock> FREEZE_TNT = LuckyTNTMod.RH.registerTNTBlock("freeze_tnt", EntityRegistry.FREEZE_TNT, "n", MaterialColor.COLOR_LIGHT_BLUE, true);
	public static final RegistryObject<LTNTBlock> VAPORIZE_TNT = LuckyTNTMod.RH.registerTNTBlock("vaporize_tnt", EntityRegistry.VAPORIZE_TNT, "n", MaterialColor.WOOL, true);
	public static final RegistryObject<LTNTBlock> GRAVITY_TNT = LuckyTNTMod.RH.registerTNTBlock("gravity_tnt", EntityRegistry.GRAVITY_TNT, "n", MaterialColor.COLOR_GRAY, false);
	public static final RegistryObject<LTNTBlock> LIGHTNING_TNT = LuckyTNTMod.RH.registerTNTBlock("lightning_tnt", EntityRegistry.LIGHTNING_TNT, "n", MaterialColor.COLOR_YELLOW, false);
	public static final RegistryObject<LTNTBlock> CUBIC_TNT = LuckyTNTMod.RH.registerTNTBlock("cubic_tnt", EntityRegistry.CUBIC_TNT, "n");
	public static final RegistryObject<LTNTBlock> FLOATING_TNT = LuckyTNTMod.RH.registerTNTBlock("floating_tnt", EntityRegistry.FLOATING_TNT, "n", MaterialColor.COLOR_LIGHT_BLUE, true);
	public static final RegistryObject<LTNTBlock> TNT_FIREWORK = LuckyTNTMod.RH.registerTNTBlock("tnt_firework", EntityRegistry.TNT_FIREWORK, "n", MaterialColor.COLOR_BLACK, false);
	public static final RegistryObject<LTNTBlock> SAND_FIREWORK = LuckyTNTMod.RH.registerTNTBlock("sand_firework", EntityRegistry.SAND_FIREWORK, "n", MaterialColor.COLOR_YELLOW, false);
	public static final RegistryObject<LTNTBlock> ARROW_TNT = LuckyTNTMod.RH.registerTNTBlock("arrow_tnt", EntityRegistry.ARROW_TNT, "n", MaterialColor.COLOR_LIGHT_GRAY, true);
	public static final RegistryObject<LTNTBlock> TIMER_TNT = LuckyTNTMod.RH.registerTNTBlock("timer_tnt", EntityRegistry.TIMER_TNT, "n", MaterialColor.COLOR_BLUE, false);
	public static final RegistryObject<LTNTBlock> FLAT_TNT = LuckyTNTMod.RH.registerTNTBlock("flat_tnt", EntityRegistry.FLAT_TNT, "n", MaterialColor.COLOR_GREEN, true);
	public static final RegistryObject<LTNTBlock> MININGFLAT_TNT = LuckyTNTMod.RH.registerTNTBlock("miningflat_tnt", EntityRegistry.MININGFLAT_TNT, "n", MaterialColor.COLOR_ORANGE, true);
	public static final RegistryObject<LTNTBlock> COMPACT_TNT = LuckyTNTMod.RH.registerTNTBlock("compact_tnt", EntityRegistry.COMPACT_TNT, "n");
	public static final RegistryObject<LTNTBlock> ANIMAL_TNT = LuckyTNTMod.RH.registerTNTBlock("animal_tnt", EntityRegistry.ANIMAL_TNT, "n", MaterialColor.COLOR_BROWN, true);
	public static final RegistryObject<LTNTBlock> METEOR_TNT = LuckyTNTMod.RH.registerTNTBlock("meteor_tnt", EntityRegistry.METEOR_TNT, "n", false);
	public static final RegistryObject<LTNTBlock> SPIRAL_TNT = LuckyTNTMod.RH.registerTNTBlock("spiral_tnt", EntityRegistry.SPIRAL_TNT, "n", MaterialColor.COLOR_BROWN, false);
	public static final RegistryObject<LTNTBlock> ERUPTING_TNT = LuckyTNTMod.RH.registerTNTBlock("erupting_tnt", EntityRegistry.ERUPTING_TNT, "n", MaterialColor.COLOR_ORANGE, false);
	public static final RegistryObject<LTNTBlock> GROVE_TNT = LuckyTNTMod.RH.registerTNTBlock("grove_tnt", EntityRegistry.GROVE_TNT, "n", MaterialColor.COLOR_BROWN, true);
	public static final RegistryObject<LTNTBlock> ENDER_TNT = LuckyTNTMod.RH.registerTNTBlock("ender_tnt", EntityRegistry.ENDER_TNT, "n", MaterialColor.COLOR_GREEN, true);
	public static final RegistryObject<LTNTBlock> METEOR_SHOWER = LuckyTNTMod.RH.registerTNTBlock("meteor_shower", EntityRegistry.METEOR_SHOWER, "n", MaterialColor.COLOR_BLUE, false);
	public static final RegistryObject<LTNTBlock> INVERTED_TNT = LuckyTNTMod.RH.registerTNTBlock("inverted_tnt", EntityRegistry.INVERTED_TNT, "n");
	public static final RegistryObject<LTNTBlock> NUCLEAR_TNT = LuckyTNTMod.RH.registerTNTBlock("nuclear_tnt", EntityRegistry.NUCLEAR_TNT, "n", MaterialColor.COLOR_YELLOW, true);
	public static final RegistryObject<LTNTBlock> CHEMICAL_TNT = LuckyTNTMod.RH.registerTNTBlock("chemical_tnt", EntityRegistry.CHEMICAL_TNT, "n", MaterialColor.COLOR_CYAN, true);
	public static final RegistryObject<LTNTBlock> REACTION_TNT = LuckyTNTMod.RH.registerTNTBlock("reaction_tnt", EntityRegistry.REACTION_TNT, "n", MaterialColor.COLOR_CYAN, false);
	public static final RegistryObject<LTNTBlock> EASTER_EGG = LuckyTNTMod.RH.registerTNTBlock("easter_egg", EntityRegistry.EASTER_EGG, "n", MaterialColor.COLOR_GREEN, true);
	public static final RegistryObject<LTNTBlock> DAY_TNT = LuckyTNTMod.RH.registerTNTBlock("day_tnt", EntityRegistry.DAY_TNT, "n", MaterialColor.COLOR_LIGHT_BLUE, true);
	public static final RegistryObject<LTNTBlock> NIGHT_TNT = LuckyTNTMod.RH.registerTNTBlock("night_tnt", EntityRegistry.NIGHT_TNT, "n", MaterialColor.COLOR_BLACK, true);
	public static final RegistryObject<LTNTBlock> VILLAGE_DEFENSE = LuckyTNTMod.RH.registerTNTBlock("village_defense", EntityRegistry.VILLAGE_DEFENSE, "n", MaterialColor.WOOL, true);
	public static final RegistryObject<LTNTBlock> ZOMBIE_APOCALYPSE = LuckyTNTMod.RH.registerTNTBlock("zombie_apocalypse", EntityRegistry.ZOMBIE_APOCALYPSE, "n", MaterialColor.COLOR_GREEN, true);
	public static final RegistryObject<LTNTBlock> SHATTERPROOF_TNT = LuckyTNTMod.RH.registerTNTBlock("shatterproof_tnt", EntityRegistry.SHATTERPROOF_TNT, "n", MaterialColor.COLOR_BLACK, true);
	public static final RegistryObject<LTNTBlock> GRAVEL_FIREWORK = LuckyTNTMod.RH.registerTNTBlock("gravel_firework", EntityRegistry.GRAVEL_FIREWORK, "n", MaterialColor.COLOR_GRAY, false);
	public static final RegistryObject<LTNTBlock> LAVA_OCEAN_TNT = LuckyTNTMod.RH.registerTNTBlock("lava_ocean_tnt", EntityRegistry.LAVA_OCEAN_TNT, "n", MaterialColor.COLOR_ORANGE, true);
	public static final RegistryObject<LTNTBlock> ATTACKING_TNT = LuckyTNTMod.RH.registerLivingTNTBlock("attacking_tnt", EntityRegistry.ATTACKING_TNT, "n", false);
	public static final RegistryObject<LTNTBlock> WALKING_TNT = LuckyTNTMod.RH.registerLivingTNTBlock("walking_tnt", EntityRegistry.WALKING_TNT, "n", false);
	public static final RegistryObject<LTNTBlock> WOOL_TNT = LuckyTNTMod.RH.registerTNTBlock("wool_tnt", EntityRegistry.WOOL_TNT, "n", true);
	public static final RegistryObject<LTNTBlock> SAY_GOODBYE = LuckyTNTMod.RH.registerTNTBlock("say_goodbye", EntityRegistry.SAY_GOODBYE, "n", MaterialColor.COLOR_GREEN, false);
	//public static final RegistryObject<LTNTBlock> ANGRY_MINERS = LuckyTNTMod.RH.registerTNTBlock("angry_miners", EntityRegistry.ANGRY_MINERS, "n", true);
	public static final RegistryObject<LTNTBlock> WITHERING_TNT = LuckyTNTMod.RH.registerTNTBlock("withering_tnt", EntityRegistry.WITHERING_TNT, "n", MaterialColor.COLOR_BROWN, true);
	public static final RegistryObject<LTNTBlock> NUCLEAR_WASTE_TNT = LuckyTNTMod.RH.registerTNTBlock("nuclear_waste_tnt", EntityRegistry.NUCLEAR_WASTE_TNT, "n", MaterialColor.COLOR_LIGHT_GREEN, true);
	public static final RegistryObject<LTNTBlock> STATIC_TNT = LuckyTNTMod.RH.registerTNTBlock("static_tnt", EntityRegistry.STATIC_TNT, "n", MaterialColor.COLOR_ORANGE, true);
	public static final RegistryObject<LTNTBlock> PUMPKIN_BOMB = LuckyTNTMod.RH.registerTNTBlock("pumpkin_bomb", EntityRegistry.PUMPKIN_BOMB, "n", MaterialColor.COLOR_ORANGE, true);
	public static final RegistryObject<LTNTBlock> SMOKE_TNT = LuckyTNTMod.RH.registerTNTBlock(LuckyTNTMod.blockRegistry, LuckyTNTMod.itemRegistry, () -> new SmokeTNTBlock(BlockBehaviour.Properties.of(Material.EXPLOSIVE, MaterialColor.COLOR_RED).sound(SoundType.GRASS)), new TNTBlockRegistryData.Builder("smoke_tnt").tab("n").description(new TranslatableContents("block.smoke_tnt.description")).build());
	public static final RegistryObject<LTNTBlock> TROLL_TNT = LuckyTNTMod.RH.registerTNTBlock(LuckyTNTMod.blockRegistry, LuckyTNTMod.itemRegistry, () -> new TrollTNTBlock(BlockBehaviour.Properties.of(Material.EXPLOSIVE, MaterialColor.COLOR_RED).sound(SoundType.GRASS)), new TNTBlockRegistryData.Builder("troll_tnt").tab("n").build());
	public static final RegistryObject<LTNTBlock> TROLL_TNT_MK2 = LuckyTNTMod.RH.registerTNTBlock(LuckyTNTMod.blockRegistry, LuckyTNTMod.itemRegistry, () -> new TrollTNTMk2Block(BlockBehaviour.Properties.of(Material.EXPLOSIVE, MaterialColor.COLOR_RED).sound(SoundType.GRASS)), new TNTBlockRegistryData.Builder("troll_tnt_mk2").tab("n").build());
	public static final RegistryObject<LTNTBlock> TROLL_TNT_MK3 = LuckyTNTMod.RH.registerTNTBlock(LuckyTNTMod.blockRegistry, LuckyTNTMod.itemRegistry, () -> new TrollTNTMk3Block(BlockBehaviour.Properties.of(Material.EXPLOSIVE, MaterialColor.COLOR_RED).sound(SoundType.GRASS)), new TNTBlockRegistryData.Builder("troll_tnt_mk3").tab("n").build());
	public static final RegistryObject<LTNTBlock> CLUSTER_BOMB = LuckyTNTMod.RH.registerTNTBlock("cluster_bomb", EntityRegistry.CLUSTER_BOMB_TNT, "n");
	public static final RegistryObject<LTNTBlock> AIR_STRIKE = LuckyTNTMod.RH.registerTNTBlock("air_strike", EntityRegistry.AIR_STRIKE, "n");
	public static final RegistryObject<LTNTBlock> SPAMMING_TNT = LuckyTNTMod.RH.registerTNTBlock("spamming_tnt", EntityRegistry.SPAMMING_TNT, "n", MaterialColor.COLOR_BROWN, true);
	public static final RegistryObject<LTNTBlock> BOUNCING_TNT = LuckyTNTMod.RH.registerTNTBlock("bouncing_tnt", EntityRegistry.BOUNCING_TNT, "n", MaterialColor.COLOR_RED, false);
	public static final RegistryObject<LTNTBlock> ROULETTE_TNT = LuckyTNTMod.RH.registerTNTBlock("roulette_tnt", EntityRegistry.ROULETTE_TNT, "n");
	public static final RegistryObject<LTNTBlock> SENSOR_TNT = LuckyTNTMod.RH.registerTNTBlock("sensor_tnt", EntityRegistry.SENSOR_TNT, "n", MaterialColor.COLOR_BLUE, false);
	public static final RegistryObject<LTNTBlock> RAINBOW_FIREWORK = LuckyTNTMod.RH.registerTNTBlock("rainbow_firework", EntityRegistry.RAINBOW_FIREWORK, "n", MaterialColor.WOOL, false);
	public static final RegistryObject<LTNTBlock> XRAY_TNT = LuckyTNTMod.RH.registerTNTBlock(LuckyTNTMod.blockRegistry, LuckyTNTMod.itemRegistry, () -> new XRayTNTBlock(BlockBehaviour.Properties.of(Material.EXPLOSIVE, MaterialColor.COLOR_RED).sound(SoundType.GRASS)), new TNTBlockRegistryData.Builder("xray_tnt").tab("n").build());
	public static final RegistryObject<LTNTBlock> FARMING_TNT = LuckyTNTMod.RH.registerTNTBlock("farming_tnt", EntityRegistry.FARMING_TNT, "n", MaterialColor.COLOR_BROWN, true);
	public static final RegistryObject<LTNTBlock> PHANTOM_TNT = LuckyTNTMod.RH.registerTNTBlock("phantom_tnt", EntityRegistry.PHANTOM_TNT, "n", MaterialColor.COLOR_PURPLE, true);
	public static final RegistryObject<LTNTBlock> SWAP_TNT = LuckyTNTMod.RH.registerTNTBlock("swap_tnt", EntityRegistry.SWAP_TNT, "n", false);
	public static final RegistryObject<LTNTBlock> IGNITER_TNT = LuckyTNTMod.RH.registerTNTBlock("igniter_tnt", EntityRegistry.IGNITER_TNT, "n", MaterialColor.COLOR_LIGHT_GRAY, false);
	public static final RegistryObject<LTNTBlock> MULTIPLYING_TNT = LuckyTNTMod.RH.registerTNTBlock("multiplying_tnt", EntityRegistry.MULTIPLYING_TNT, "n", MaterialColor.COLOR_YELLOW, true);
	public static final RegistryObject<LTNTBlock> BUTTER_TNT = LuckyTNTMod.RH.registerTNTBlock("butter_tnt", EntityRegistry.BUTTER_TNT, "n", MaterialColor.COLOR_YELLOW, true);
	public static final RegistryObject<LTNTBlock> TUNNELING_TNT = LuckyTNTMod.RH.registerTNTBlock(LuckyTNTMod.blockRegistry, LuckyTNTMod.itemRegistry, () -> new TunnelingTNTBlock(BlockBehaviour.Properties.of(Material.EXPLOSIVE, MaterialColor.COLOR_ORANGE).sound(SoundType.GRASS)), new TNTBlockRegistryData.Builder("tunneling_tnt").tab("n").build());
	public static final RegistryObject<LTNTBlock> PHYSICS_TNT = LuckyTNTMod.RH.registerTNTBlock("physics_tnt", EntityRegistry.PHYSICS_TNT, "n", true);
	public static final RegistryObject<LTNTBlock> ORE_TNT = LuckyTNTMod.RH.registerTNTBlock("ore_tnt", EntityRegistry.ORE_TNT, "n", MaterialColor.COLOR_LIGHT_GRAY, true);
	public static final RegistryObject<LTNTBlock> REDSTONE_TNT = LuckyTNTMod.RH.registerTNTBlock(LuckyTNTMod.blockRegistry, LuckyTNTMod.itemRegistry, () -> new RedstoneTNTBlock(BlockBehaviour.Properties.of(Material.EXPLOSIVE, MaterialColor.COLOR_RED).sound(SoundType.GRASS)), new TNTBlockRegistryData.Builder("redstone_tnt").tab("n").build());
	public static final RegistryObject<LTNTBlock> RANDOM_TNT = LuckyTNTMod.RH.registerTNTBlock("random_tnt", EntityRegistry.RANDOM_TNT, "n", true);
	//public static final RegistryObject<LTNTBlock> TURRET_TNT = LuckyTNTMod.RH.registerTNTBlock("turret_tnt", EntityRegistry.TURRET_TNT, "n", MaterialColor.COLOR_BLUE, true);
	public static final RegistryObject<LTNTBlock> PULSE_TNT = LuckyTNTMod.RH.registerTNTBlock("pulse_tnt", EntityRegistry.PULSE_TNT, "n", MaterialColor.COLOR_CYAN, false);
	public static final RegistryObject<LTNTBlock> DIVIDING_TNT = LuckyTNTMod.RH.registerTNTBlock("dividing_tnt", EntityRegistry.DIVIDING_TNT, "n", MaterialColor.COLOR_LIGHT_BLUE, true);
	public static final RegistryObject<LTNTBlock> PICKY_TNT = LuckyTNTMod.RH.registerTNTBlock("picky_tnt", EntityRegistry.PICKY_TNT, "n", true);
	public static final RegistryObject<LTNTBlock> BIG_TNT = LuckyTNTMod.RH.registerTNTBlock("big_tnt", EntityRegistry.BIG_TNT, "n", true);
	public static final RegistryObject<LTNTBlock> ICE_METEOR = LuckyTNTMod.RH.registerTNTBlock("ice_meteor_tnt", EntityRegistry.ICE_METEOR_TNT, "n", MaterialColor.COLOR_LIGHT_BLUE, true);
	public static final RegistryObject<LTNTBlock> HONEY_TNT = LuckyTNTMod.RH.registerTNTBlock("honey_tnt", EntityRegistry.HONEY_TNT, "n", MaterialColor.COLOR_YELLOW, true);
	public static final RegistryObject<LTNTBlock> EATING_TNT = LuckyTNTMod.RH.registerTNTBlock("eating_tnt", EntityRegistry.EATING_TNT, "n", true);
	public static final RegistryObject<LTNTBlock> LUSH_TNT = LuckyTNTMod.RH.registerTNTBlock("lush_tnt", EntityRegistry.LUSH_TNT, "n", MaterialColor.COLOR_LIGHT_GREEN, true);
	public static final RegistryObject<LTNTBlock> GEODE_TNT = LuckyTNTMod.RH.registerTNTBlock("geode_tnt", EntityRegistry.GEODE_TNT, "n", MaterialColor.COLOR_PURPLE, true);
	public static final RegistryObject<LTNTBlock> NETHER_GROVE_TNT = LuckyTNTMod.RH.registerTNTBlock("nether_grove_tnt", EntityRegistry.NETHER_GROVE_TNT, "n", MaterialColor.COLOR_CYAN, true);
	public static final RegistryObject<LTNTBlock> DRIPSTONE_TNT = LuckyTNTMod.RH.registerTNTBlock("dripstone_tnt", EntityRegistry.DRIPSTONE_TNT, "n", MaterialColor.COLOR_BROWN, true);
	public static final RegistryObject<LTNTBlock> GRAVEYARD_TNT = LuckyTNTMod.RH.registerTNTBlock("graveyard_tnt", EntityRegistry.GRAVEYARD_TNT, "n", MaterialColor.COLOR_GRAY, true);
	public static final RegistryObject<LTNTBlock> REPLAY_TNT = LuckyTNTMod.RH.registerTNTBlock("replay_tnt", EntityRegistry.REPLAY_TNT, "n", true);
	public static final RegistryObject<LTNTBlock> END_TNT = LuckyTNTMod.RH.registerTNTBlock("end_tnt", EntityRegistry.END_TNT, "n", MaterialColor.COLOR_BLACK, true);
	public static final RegistryObject<LTNTBlock> CHRISTMAS_TNT = LuckyTNTMod.RH.registerTNTBlock("christmas_tnt", EntityRegistry.CHRISTMAS_TNT, "n", true);
	public static final RegistryObject<LTNTBlock> EARTHQUAKE_TNT = LuckyTNTMod.RH.registerTNTBlock("earthquake_tnt", EntityRegistry.EARTHQUAKE_TNT, "n", MaterialColor.COLOR_LIGHT_BLUE, true);
	public static final RegistryObject<LTNTBlock> LUCKY_TNT = LuckyTNTMod.RH.registerTNTBlock(LuckyTNTMod.blockRegistry, LuckyTNTMod.itemRegistry, () -> new LuckyTNTBlock(BlockBehaviour.Properties.of(Material.EXPLOSIVE, MaterialColor.COLOR_RED).sound(SoundType.GRASS), LuckyTNTMod.RH.TNTLists.get("n")), new TNTBlockRegistryData.Builder("lucky_tnt").tab("n").build());
	
	//God TNTs
	public static final RegistryObject<LTNTBlock> GLOBAL_DISASTER = LuckyTNTMod.RH.registerTNTBlock("global_disaster", EntityRegistry.GLOBAL_DISASTER, "g", MaterialColor.COLOR_BLUE, true);
	public static final RegistryObject<LTNTBlock> HEAVENS_GATE = LuckyTNTMod.RH.registerTNTBlock("heavens_gate", EntityRegistry.HEAVENS_GATE, "g", MaterialColor.QUARTZ, true);
	public static final RegistryObject<LTNTBlock> HELLS_GATE = LuckyTNTMod.RH.registerTNTBlock("hells_gate", EntityRegistry.HELLS_GATE, "g", MaterialColor.COLOR_RED, true);
	public static final RegistryObject<LTNTBlock> MANKINDS_MARK = LuckyTNTMod.RH.registerTNTBlock("mankinds_mark", EntityRegistry.MANKINDS_MARK, "g", MaterialColor.COLOR_RED, true);
	public static final RegistryObject<LTNTBlock> POSEIDONS_WAVE = LuckyTNTMod.RH.registerTNTBlock("poseidons_wave", EntityRegistry.POSEIDONS_WAVE, "g", MaterialColor.COLOR_BLUE, true);
	public static final RegistryObject<LTNTBlock> HEXAHEDRON = LuckyTNTMod.RH.registerTNTBlock("hexahedron", EntityRegistry.HEXAHEDRON, "g", MaterialColor.COLOR_BLACK, true);
	public static final RegistryObject<LTNTBlock> MOUNTAINTOP_REMOVAL = LuckyTNTMod.RH.registerTNTBlock("mountaintop_removal", EntityRegistry.MOUNTAINTOP_REMOVAL, "g", MaterialColor.COLOR_LIGHT_BLUE, true);
	public static final RegistryObject<LTNTBlock> DUST_BOWL = LuckyTNTMod.RH.registerTNTBlock("dust_bowl", EntityRegistry.DUST_BOWL, "g", MaterialColor.SAND, true);
	public static final RegistryObject<LTNTBlock> THE_REVOLUTION = LuckyTNTMod.RH.registerTNTBlock("the_revolution", EntityRegistry.THE_REVOLUTION, "g", MaterialColor.QUARTZ, true);
	
	
	//Other
	public static final RegistryObject<Block> NUCLEAR_WASTE = LuckyTNTMod.blockRegistry.register("nuclear_waste", () -> new NuclearWasteBlock(BlockBehaviour.Properties.of(Material.TOP_SNOW, MaterialColor.COLOR_GREEN).sound(SoundType.SLIME_BLOCK).instabreak().noCollission().noLootTable().randomTicks().lightLevel(s -> 8)));
	public static final RegistryObject<Block> GUNPOWDER_ORE = LuckyTNTMod.blockRegistry.register("gunpowder_ore", () -> new GunpowderOreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(3f, 3f)));
	public static final RegistryObject<Block> DEEPSLATE_GUNPOWDER_ORE = LuckyTNTMod.blockRegistry.register("deepslate_gunpowder_ore", () -> new GunpowderOreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(4.5f, 3f)));
	public static final RegistryObject<Block> URANIUM_ORE = LuckyTNTMod.blockRegistry.register("uranium_ore", () -> new UraniumOreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_GREEN).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(3f, 3f)));
	public static final RegistryObject<Block> DEEPSLATE_URANIUM_ORE = LuckyTNTMod.blockRegistry.register("deepslate_uranium_ore", () -> new UraniumOreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_GREEN).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(4.5f, 3f)));
}