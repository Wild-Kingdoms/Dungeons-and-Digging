package wildKingdoms.dungeonsAndDigging.blocks;

import wildKingdoms.dungeonsAndDigging.Main;
import wildKingdoms.dungeonsAndDigging.blocks.ores.DDCrystalOre;
import wildKingdoms.dungeonsAndDigging.blocks.ores.DDRubyOre;
import wildKingdoms.dungeonsAndDigging.blocks.ores.DDSaphireOre;
import wildKingdoms.dungeonsAndDigging.blocks.solidBlocks.DDCrystalBlock;
import wildKingdoms.dungeonsAndDigging.blocks.solidBlocks.DDRubyBlock;
import wildKingdoms.dungeonsAndDigging.blocks.solidBlocks.DDSaphireBlock;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class DDBlocks {
	public static void init(Block crystalOre, Block rubyOre, Block saphireOre,
			Block crystalBlock, Block rubyBlock, Block saphireBlock) {
		// define items/blocks
		// ORES
		crystalOre = new DDCrystalOre(3600, "crystalOre")
				.setUnlocalizedName("crystalOre").setHardness(3.0F)
				.setStepSound(Block.soundStoneFootstep).setResistance(8.0F)
				.setTextureName("DungeonsAndDigging:crystalOre");
		GameRegistry.registerBlock(crystalOre, "crystalOre");

		rubyOre = new DDRubyOre(3601, "rubyOre").setUnlocalizedName("rubyOre")
				.setHardness(2.0F).setStepSound(Block.soundStoneFootstep)
				.setResistance(9.0F)
				.setTextureName("DungeonsAndDigging:rubyOre");
		GameRegistry.registerBlock(rubyOre, "rubyOre");

		saphireOre = new DDSaphireOre(3602, "saphireOre")
				.setUnlocalizedName("saphireOre").setHardness(2.0F)
				.setStepSound(Block.soundStoneFootstep).setResistance(9.0F)
				.setTextureName("DungeonsAndDigging:saphireOre");
		GameRegistry.registerBlock(saphireOre, "saphireOre");

		// SOLID BLOCKS
		crystalBlock = new DDCrystalBlock(3603, "crystalBlock")
				.setUnlocalizedName("crystalBlock").setHardness(3.0F)
				.setStepSound(Block.soundMetalFootstep).setResistance(9.0F)
				.setTextureName("DungeonsAndDigging:crystalBlock");
		GameRegistry.registerBlock(crystalBlock, "crystalBlock");

		rubyBlock = new DDRubyBlock(3604, "rubyBlock")
				.setUnlocalizedName("rubyBlock").setHardness(3.0F)
				.setStepSound(Block.soundMetalFootstep).setResistance(9.0F)
				.setTextureName("DungeonsAndDigging:rubyBlock");
		GameRegistry.registerBlock(rubyBlock, "rubyBlock");

		saphireBlock = new DDSaphireBlock(3605, "saphireBlock")
				.setUnlocalizedName("saphireBlock").setHardness(3.0F)
				.setStepSound(Block.soundMetalFootstep).setResistance(11.0F)
				.setTextureName("DungeonsAndDigging:saphireBlock");
		GameRegistry.registerBlock(saphireBlock, "saphireBlock");

		// adding names
		// ORES
		LanguageRegistry.addName(crystalOre, "Crystal Ore");
		LanguageRegistry.addName(rubyOre, "Ruby Ore");
		LanguageRegistry.addName(saphireOre, "Saphire Ore");

		// SOLILD BLOCKS
		LanguageRegistry.addName(crystalBlock, "Crystal Block");
		LanguageRegistry.addName(rubyBlock, "Ruby Block");
		LanguageRegistry.addName(saphireBlock, "Saphire Block");

		// crafting
	}

	public static void recipes(Item crystal, Item ruby, Item saphire,
			Block crystalBlock, Block rubyBlock, Block saphireBlock) {
		GameRegistry.addRecipe(new ItemStack(crystalBlock, 1),
				new Object[] { "TTT", "TTT", "TTT", 'T', crystal, });
		GameRegistry.addRecipe(new ItemStack(rubyBlock, 1),
				new Object[] { "TTT", "TTT", "TTT", 'T', ruby, });
		GameRegistry.addRecipe(new ItemStack(saphireBlock, 1),
				new Object[] { "TTT", "TTT", "TTT", 'T', saphire, });
	}
}
