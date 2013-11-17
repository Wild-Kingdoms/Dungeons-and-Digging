package wildkingdoms.dungeonsanddigging; //Package directory

import wildkingdoms.dungeonsanddigging.*;
import wildkingdoms.dungeonsanddigging.blocks.*;
import wildkingdoms.dungeonsanddigging.items.*;
import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

/*
 * Basic needed forge stuff
 */
@Mod(modid = "DungeonsAndDigging", name = "Dungeons & Digging", version = "v1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class Main {
	//Gems
	public static Item crystal;
	public static Item ruby;
	public static Item sapphire;
	
	//Ores
	public static Block crystalOre;
	public static Block rubyOre;
	public static Block sapphireOre;
	
	//Solid Blocks
	public static Block crystalBlock;
	public static Block rubyBlock;
	public static Block sapphireBlock;
	
	//Tools
	public static Item crystalAxe;
	public static Item crystalShovel;
	public static Item crystalSword;
	public static Item crystalPickaxe;
	public static Item crystalHoe;
	
	public static Item rubyAxe;
	public static Item rubyShovel;
	public static Item rubySword;
	public static Item rubyPickaxe;
	public static Item rubyHoe;
	
	public static Item sapphireAxe;
	public static Item sapphireShovel;
	public static Item sapphireSword;
	public static Item sapphirePickaxe;
	public static Item sapphireHoe;
	
	//Enum Tool Materials
	public static EnumToolMaterial enumToolMaterialCrystal= EnumHelper.addToolMaterial("crystal", 3, 1600, 8.5F, 3.0F, 12);
	public static EnumToolMaterial enumToolMaterialRuby= EnumHelper.addToolMaterial("ruby", 3, 1550, 8.5F, 3.0F, 20);
	public static EnumToolMaterial enumToolMaterialSapphire= EnumHelper.addToolMaterial("sapphire", 3, 1561, 8.0F, 3.0F, 28);

	// Declaring Init
	@Init
	public void load(FMLInitializationEvent event) {
		DDBlocks DDBlocksClass = new DDBlocks();
		DDItems DDItemsClass = new DDItems();
		
		DDItemsClass.init();
		DDBlocksClass.init();
		
		DDItemsClass.recipes();
		DDBlocksClass.recipes();
		
		GameRegistry.registerWorldGenerator(new OreGenerator());
	}

}

