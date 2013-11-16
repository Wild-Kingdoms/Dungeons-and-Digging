package wildKingdoms.dungeonsAndDigging.items;

import wildKingdoms.dungeonsAndDigging.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class DDItems {
	public static void init(Item crystal, Item ruby, Item sapphire,
			Block crystalOre, Block rubyOre, Block sapphireBlock) {
		// define items/blocks
		crystal = new DDGemItems(3200).setUnlocalizedName("crystal")
				.setTextureName("DungeonsAndDigging:crystal");
		ruby = new DDGemItems(3201).setUnlocalizedName("ruby").setTextureName(
				"DungeonsAndDigging:ruby");
		ruby = new DDGemItems(3202).setUnlocalizedName("sapphire")
				.setTextureName("DungeonsAndDigging:sapphire");

		// adding names
		LanguageRegistry.addName(crystal, "Crystal");
		LanguageRegistry.addName(ruby, "Ruby");
		LanguageRegistry.addName(ruby, "Sapphire");

	}

	public static void recipes(Item crystal, Item ruby, Item sapphire,
			Block crystalBlock, Block rubyBlock, Block sapphireBlock) {
		GameRegistry.addShapelessRecipe(new ItemStack(crystal, 9),
				new Object[] { crystalBlock });
		GameRegistry.addShapelessRecipe(new ItemStack(ruby, 9),
				new Object[] { rubyBlock });
		GameRegistry.addShapelessRecipe(new ItemStack(sapphire, 9),
				new Object[] { sapphireBlock });
	}
}
