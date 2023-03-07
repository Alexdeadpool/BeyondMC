
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.beyondmc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.beyondmc.block.Weed3Block;
import net.mcreator.beyondmc.block.Weed2Block;
import net.mcreator.beyondmc.block.Weed1Block;
import net.mcreator.beyondmc.block.Weed0Block;
import net.mcreator.beyondmc.block.SuspiciousplanksBlock;
import net.mcreator.beyondmc.block.SuspiciouslogBlock;
import net.mcreator.beyondmc.block.SuspiciousleavesBlock;
import net.mcreator.beyondmc.block.SpaceBlock;
import net.mcreator.beyondmc.block.SkyBlock;
import net.mcreator.beyondmc.block.SilveroreBlock;
import net.mcreator.beyondmc.block.SilverbricksBlock;
import net.mcreator.beyondmc.block.RedstonelamponBlock;
import net.mcreator.beyondmc.block.RedredstonelampBlock;
import net.mcreator.beyondmc.block.PinkredstonelamponBlock;
import net.mcreator.beyondmc.block.PinkredstonelampBlock;
import net.mcreator.beyondmc.block.MethylamineoreBlock;
import net.mcreator.beyondmc.block.MethglassBlock;
import net.mcreator.beyondmc.block.LightblueredstonelamponBlock;
import net.mcreator.beyondmc.block.LightblueredstonelampBlock;
import net.mcreator.beyondmc.block.IronbricksBlock;
import net.mcreator.beyondmc.block.DistilledmethblockBlock;
import net.mcreator.beyondmc.block.CoreBlock;
import net.mcreator.beyondmc.block.Coke3Block;
import net.mcreator.beyondmc.block.Coke2Block;
import net.mcreator.beyondmc.block.Coke1Block;
import net.mcreator.beyondmc.block.Coke0Block;
import net.mcreator.beyondmc.block.CocainblockBlock;
import net.mcreator.beyondmc.block.BlueredstonelamponBlock;
import net.mcreator.beyondmc.block.BlueredstonelampBlock;
import net.mcreator.beyondmc.BeyondmcMod;

public class BeyondmcModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BeyondmcMod.MODID);
	public static final RegistryObject<Block> CORE = REGISTRY.register("core", () -> new CoreBlock());
	public static final RegistryObject<Block> WEED_0 = REGISTRY.register("weed_0", () -> new Weed0Block());
	public static final RegistryObject<Block> WEED_1 = REGISTRY.register("weed_1", () -> new Weed1Block());
	public static final RegistryObject<Block> WEED_2 = REGISTRY.register("weed_2", () -> new Weed2Block());
	public static final RegistryObject<Block> WEED_3 = REGISTRY.register("weed_3", () -> new Weed3Block());
	public static final RegistryObject<Block> SUSPICIOUSLEAVES = REGISTRY.register("suspiciousleaves", () -> new SuspiciousleavesBlock());
	public static final RegistryObject<Block> SUSPICIOUSLOG = REGISTRY.register("suspiciouslog", () -> new SuspiciouslogBlock());
	public static final RegistryObject<Block> COCAINBLOCK = REGISTRY.register("cocainblock", () -> new CocainblockBlock());
	public static final RegistryObject<Block> METHYLAMINEORE = REGISTRY.register("methylamineore", () -> new MethylamineoreBlock());
	public static final RegistryObject<Block> DISTILLEDMETHBLOCK = REGISTRY.register("distilledmethblock", () -> new DistilledmethblockBlock());
	public static final RegistryObject<Block> METHGLASS = REGISTRY.register("methglass", () -> new MethglassBlock());
	public static final RegistryObject<Block> SKY = REGISTRY.register("sky", () -> new SkyBlock());
	public static final RegistryObject<Block> SPACE = REGISTRY.register("space", () -> new SpaceBlock());
	public static final RegistryObject<Block> SUSPICIOUSPLANKS = REGISTRY.register("suspiciousplanks", () -> new SuspiciousplanksBlock());
	public static final RegistryObject<Block> SILVERORE = REGISTRY.register("silverore", () -> new SilveroreBlock());
	public static final RegistryObject<Block> IRONBRICKS = REGISTRY.register("ironbricks", () -> new IronbricksBlock());
	public static final RegistryObject<Block> SILVERBRICKS = REGISTRY.register("silverbricks", () -> new SilverbricksBlock());
	public static final RegistryObject<Block> REDSTONELAMPON = REGISTRY.register("redstonelampon", () -> new RedstonelamponBlock());
	public static final RegistryObject<Block> COKE_0 = REGISTRY.register("coke_0", () -> new Coke0Block());
	public static final RegistryObject<Block> COKE_1 = REGISTRY.register("coke_1", () -> new Coke1Block());
	public static final RegistryObject<Block> COKE_2 = REGISTRY.register("coke_2", () -> new Coke2Block());
	public static final RegistryObject<Block> COKE_3 = REGISTRY.register("coke_3", () -> new Coke3Block());
	public static final RegistryObject<Block> REDREDSTONELAMP = REGISTRY.register("redredstonelamp", () -> new RedredstonelampBlock());
	public static final RegistryObject<Block> BLUEREDSTONELAMP = REGISTRY.register("blueredstonelamp", () -> new BlueredstonelampBlock());
	public static final RegistryObject<Block> BLUEREDSTONELAMPON = REGISTRY.register("blueredstonelampon", () -> new BlueredstonelamponBlock());
	public static final RegistryObject<Block> PINKREDSTONELAMP = REGISTRY.register("pinkredstonelamp", () -> new PinkredstonelampBlock());
	public static final RegistryObject<Block> PINKREDSTONELAMPON = REGISTRY.register("pinkredstonelampon", () -> new PinkredstonelamponBlock());
	public static final RegistryObject<Block> LIGHTBLUEREDSTONELAMP = REGISTRY.register("lightblueredstonelamp", () -> new LightblueredstonelampBlock());
	public static final RegistryObject<Block> LIGHTBLUEREDSTONELAMPON = REGISTRY.register("lightblueredstonelampon", () -> new LightblueredstonelamponBlock());
}
