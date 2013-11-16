package wildKingdoms.dungeonsAndDigging; //Package directory

import wildKingdoms.dungeonsAndDigging.*;
import wildKingdoms.dungeonsAndDigging.blocks.*;
import wildKingdoms.dungeonsAndDigging.items.*;
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

	/*
	 * ToolMaterial
	 */

	// Telling forge that we are creating these

	public static Item crystal;
	public static Item ruby;
	public static Item saphire;
	
	public static Block crystalOre;
	public static Block rubyOre;
	public static Block saphireOre;
	
	public static Block crystalBlock;
	public static Block rubyBlock;
	public static Block saphireBlock;

	// Declaring Init
	@Init
	public void load(FMLInitializationEvent event) {
		DDBlocks DDBlocksClass = new DDBlocks();
		DDItems DDItemsClass = new DDItems();
		
		DDItemsClass.init(crystal, ruby, saphire, crystalOre, rubyOre, saphireOre);
		DDBlocksClass.init(crystalOre, rubyOre, saphireOre, crystalBlock, rubyBlock, saphireBlock);
		
		DDItemsClass.recipes(crystal, ruby, saphire, crystalBlock, rubyBlock, saphireBlock);
		DDBlocksClass.recipes(crystal, ruby, saphire, crystalBlock, rubyBlock, saphireBlock);
	}

}
