package wildKingdoms.dungeonsAndDigging; //Package directory

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
@Mod(modid = "Dungeons-and-Digging", name = "Dungeons and Digging", version = "v1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class Main {

	/*
	 * ToolMaterial
	 */

	// Telling forge that we are creating these

	public static Item ruby;
	public static Item sapphire;
	public static Item crystal;
	public static Item rubySword;
	public static Item sapphireSword;
	public static Item crystalSword;

	// Declaring Init
	@Init
	public void load(FMLInitializationEvent event) {
		// define items/blocks

		// adding names

		// crafting

	}

}
