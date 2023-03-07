
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.beyondmc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.beyondmc.item.WeedItem;
import net.mcreator.beyondmc.item.SuspiciousseedsItem;
import net.mcreator.beyondmc.item.SuspiciouspowderItem;
import net.mcreator.beyondmc.item.SusknifeItem;
import net.mcreator.beyondmc.item.SteroidsItem;
import net.mcreator.beyondmc.item.SteroidcapsuleItem;
import net.mcreator.beyondmc.item.StayoutofmyterritoryItem;
import net.mcreator.beyondmc.item.SilveringotItem;
import net.mcreator.beyondmc.item.RawsilverItem;
import net.mcreator.beyondmc.item.PrismarinesoldiersItem;
import net.mcreator.beyondmc.item.PrismarinegauntletItem;
import net.mcreator.beyondmc.item.PrismarinecolossusItem;
import net.mcreator.beyondmc.item.PistolItem;
import net.mcreator.beyondmc.item.Perc30Item;
import net.mcreator.beyondmc.item.NeedleItem;
import net.mcreator.beyondmc.item.MethItem;
import net.mcreator.beyondmc.item.LeanItem;
import net.mcreator.beyondmc.item.KatanaItem;
import net.mcreator.beyondmc.item.Islandheisttheme2Item;
import net.mcreator.beyondmc.item.Islandheisttheme1Item;
import net.mcreator.beyondmc.item.HomedepotItem;
import net.mcreator.beyondmc.item.HeroinneedleItem;
import net.mcreator.beyondmc.item.HeroinItem;
import net.mcreator.beyondmc.item.HammerItem;
import net.mcreator.beyondmc.item.EssenceItem;
import net.mcreator.beyondmc.item.DollarItem;
import net.mcreator.beyondmc.item.CupItem;
import net.mcreator.beyondmc.item.CocainItem;
import net.mcreator.beyondmc.item.BettercallsaulItem;
import net.mcreator.beyondmc.BeyondmcMod;

public class BeyondmcModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BeyondmcMod.MODID);
	public static final RegistryObject<Item> AMONGUS_SPAWN_EGG = REGISTRY.register("amongus_spawn_egg", () -> new ForgeSpawnEggItem(BeyondmcModEntities.AMONGUS, -3407872, -16724788, new Item.Properties().tab(BeyondmcModTabs.TAB_BEYOND)));
	public static final RegistryObject<Item> GREMLIN_SPAWN_EGG = REGISTRY.register("gremlin_spawn_egg", () -> new ForgeSpawnEggItem(BeyondmcModEntities.GREMLIN, -16711853, -9752052, new Item.Properties().tab(BeyondmcModTabs.TAB_BEYOND)));
	public static final RegistryObject<Item> PRISMARINEGAUNTLET = REGISTRY.register("prismarinegauntlet", () -> new PrismarinegauntletItem());
	public static final RegistryObject<Item> KATANA = REGISTRY.register("katana", () -> new KatanaItem());
	public static final RegistryObject<Item> PISTOL = REGISTRY.register("pistol", () -> new PistolItem());
	public static final RegistryObject<Item> CORE = block(BeyondmcModBlocks.CORE, BeyondmcModTabs.TAB_BEYOND);
	public static final RegistryObject<Item> SUSKNIFE = REGISTRY.register("susknife", () -> new SusknifeItem());
	public static final RegistryObject<Item> ESSENCE = REGISTRY.register("essence", () -> new EssenceItem());
	public static final RegistryObject<Item> HOMEDEPOT = REGISTRY.register("homedepot", () -> new HomedepotItem());
	public static final RegistryObject<Item> WEED_0 = block(BeyondmcModBlocks.WEED_0, null);
	public static final RegistryObject<Item> WEED_1 = block(BeyondmcModBlocks.WEED_1, null);
	public static final RegistryObject<Item> WEED_2 = block(BeyondmcModBlocks.WEED_2, null);
	public static final RegistryObject<Item> WEED_3 = block(BeyondmcModBlocks.WEED_3, null);
	public static final RegistryObject<Item> SUSPICIOUSSEEDS = REGISTRY.register("suspiciousseeds", () -> new SuspiciousseedsItem());
	public static final RegistryObject<Item> SUSPICIOUSLEAVES = block(BeyondmcModBlocks.SUSPICIOUSLEAVES, BeyondmcModTabs.TAB_BEYOND);
	public static final RegistryObject<Item> SUSPICIOUSPOWDER = REGISTRY.register("suspiciouspowder", () -> new SuspiciouspowderItem());
	public static final RegistryObject<Item> COCAIN = REGISTRY.register("cocain", () -> new CocainItem());
	public static final RegistryObject<Item> SUSPICIOUSLOG = block(BeyondmcModBlocks.SUSPICIOUSLOG, BeyondmcModTabs.TAB_BEYOND);
	public static final RegistryObject<Item> COCAINBLOCK = block(BeyondmcModBlocks.COCAINBLOCK, BeyondmcModTabs.TAB_BEYOND);
	public static final RegistryObject<Item> WEED = REGISTRY.register("weed", () -> new WeedItem());
	public static final RegistryObject<Item> METHYLAMINEORE = block(BeyondmcModBlocks.METHYLAMINEORE, BeyondmcModTabs.TAB_BEYOND);
	public static final RegistryObject<Item> DISTILLEDMETHBLOCK = block(BeyondmcModBlocks.DISTILLEDMETHBLOCK, BeyondmcModTabs.TAB_BEYOND);
	public static final RegistryObject<Item> HAMMER = REGISTRY.register("hammer", () -> new HammerItem());
	public static final RegistryObject<Item> METHGLASS = block(BeyondmcModBlocks.METHGLASS, BeyondmcModTabs.TAB_BEYOND);
	public static final RegistryObject<Item> METH = REGISTRY.register("meth", () -> new MethItem());
	public static final RegistryObject<Item> PERC_30 = REGISTRY.register("perc_30", () -> new Perc30Item());
	public static final RegistryObject<Item> SKY = block(BeyondmcModBlocks.SKY, BeyondmcModTabs.TAB_BEYOND);
	public static final RegistryObject<Item> NEEDLE = REGISTRY.register("needle", () -> new NeedleItem());
	public static final RegistryObject<Item> HEROINNEEDLE = REGISTRY.register("heroinneedle", () -> new HeroinneedleItem());
	public static final RegistryObject<Item> SPACE = block(BeyondmcModBlocks.SPACE, BeyondmcModTabs.TAB_BEYOND);
	public static final RegistryObject<Item> HEROIN = REGISTRY.register("heroin", () -> new HeroinItem());
	public static final RegistryObject<Item> STEROIDS = REGISTRY.register("steroids", () -> new SteroidsItem());
	public static final RegistryObject<Item> CUP = REGISTRY.register("cup", () -> new CupItem());
	public static final RegistryObject<Item> LEAN = REGISTRY.register("lean", () -> new LeanItem());
	public static final RegistryObject<Item> STEROIDCAPSULE = REGISTRY.register("steroidcapsule", () -> new SteroidcapsuleItem());
	public static final RegistryObject<Item> SUSPICIOUSPLANKS = block(BeyondmcModBlocks.SUSPICIOUSPLANKS, BeyondmcModTabs.TAB_BEYOND);
	public static final RegistryObject<Item> DOLLAR = REGISTRY.register("dollar", () -> new DollarItem());
	public static final RegistryObject<Item> STAYOUTOFMYTERRITORY = REGISTRY.register("stayoutofmyterritory", () -> new StayoutofmyterritoryItem());
	public static final RegistryObject<Item> BETTERCALLSAUL = REGISTRY.register("bettercallsaul", () -> new BettercallsaulItem());
	public static final RegistryObject<Item> PRISMARINECOLOSSUS = REGISTRY.register("prismarinecolossus", () -> new PrismarinecolossusItem());
	public static final RegistryObject<Item> PRISMARINESOLDIERS = REGISTRY.register("prismarinesoldiers", () -> new PrismarinesoldiersItem());
	public static final RegistryObject<Item> SILVERORE = block(BeyondmcModBlocks.SILVERORE, BeyondmcModTabs.TAB_BEYOND);
	public static final RegistryObject<Item> RAWSILVER = REGISTRY.register("rawsilver", () -> new RawsilverItem());
	public static final RegistryObject<Item> SILVERINGOT = REGISTRY.register("silveringot", () -> new SilveringotItem());
	public static final RegistryObject<Item> IRONBRICKS = block(BeyondmcModBlocks.IRONBRICKS, BeyondmcModTabs.TAB_BEYOND);
	public static final RegistryObject<Item> SILVERBRICKS = block(BeyondmcModBlocks.SILVERBRICKS, BeyondmcModTabs.TAB_BEYOND);
	public static final RegistryObject<Item> REDSTONELAMPON = block(BeyondmcModBlocks.REDSTONELAMPON, null);
	public static final RegistryObject<Item> COKE_0 = block(BeyondmcModBlocks.COKE_0, BeyondmcModTabs.TAB_BEYOND);
	public static final RegistryObject<Item> COKE_1 = block(BeyondmcModBlocks.COKE_1, BeyondmcModTabs.TAB_BEYOND);
	public static final RegistryObject<Item> COKE_2 = block(BeyondmcModBlocks.COKE_2, BeyondmcModTabs.TAB_BEYOND);
	public static final RegistryObject<Item> COKE_3 = block(BeyondmcModBlocks.COKE_3, BeyondmcModTabs.TAB_BEYOND);
	public static final RegistryObject<Item> ISLANDHEISTTHEME_1 = REGISTRY.register("islandheisttheme_1", () -> new Islandheisttheme1Item());
	public static final RegistryObject<Item> ISLANDHEISTTHEME_2 = REGISTRY.register("islandheisttheme_2", () -> new Islandheisttheme2Item());
	public static final RegistryObject<Item> REDREDSTONELAMP = block(BeyondmcModBlocks.REDREDSTONELAMP, BeyondmcModTabs.TAB_BEYOND);
	public static final RegistryObject<Item> BLUEREDSTONELAMP = block(BeyondmcModBlocks.BLUEREDSTONELAMP, BeyondmcModTabs.TAB_BEYOND);
	public static final RegistryObject<Item> BLUEREDSTONELAMPON = block(BeyondmcModBlocks.BLUEREDSTONELAMPON, BeyondmcModTabs.TAB_BEYOND);
	public static final RegistryObject<Item> PINKREDSTONELAMP = block(BeyondmcModBlocks.PINKREDSTONELAMP, BeyondmcModTabs.TAB_BEYOND);
	public static final RegistryObject<Item> PINKREDSTONELAMPON = block(BeyondmcModBlocks.PINKREDSTONELAMPON, BeyondmcModTabs.TAB_BEYOND);
	public static final RegistryObject<Item> LIGHTBLUEREDSTONELAMP = block(BeyondmcModBlocks.LIGHTBLUEREDSTONELAMP, BeyondmcModTabs.TAB_BEYOND);
	public static final RegistryObject<Item> LIGHTBLUEREDSTONELAMPON = block(BeyondmcModBlocks.LIGHTBLUEREDSTONELAMPON, BeyondmcModTabs.TAB_BEYOND);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
