package wildKingdoms.dungeonsAndDigging.blocks;

import wildKingdoms.dungeonsAndDigging.Main;
import wildKingdoms.dungeonsAndDigging.blocks.ores.DDCrystalOre;
import wildKingdoms.dungeonsAndDigging.blocks.ores.DDRubyOre;
import wildKingdoms.dungeonsAndDigging.blocks.ores.DDSapphireOre;
import wildKingdoms.dungeonsAndDigging.blocks.solidBlocks.DDCrystalBlock;
import wildKingdoms.dungeonsAndDigging.blocks.solidBlocks.DDRubyBlock;
import wildKingdoms.dungeonsAndDigging.blocks.solidBlocks.DDSapphireBlock;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class DDBlocks {
	public static void init(Block crystalOre, Block rubyOre, Block sapphireOre,
			Block crystalBlock, Block rubyBlock, Block sapphireBlock) {
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

		sapphireOre = new DDSapphireOre(3602, "sapphireOre")
				.setUnlocalizedName("sapphireOre").setHardness(2.0F)
				.setStepSound(Block.soundStoneFootstep).setResistance(9.0F)
				.setTextureName("DungeonsAndDigging:sapphireOre");
		GameRegistry.registerBlock(sapphireOre, "sapphireOre");

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

		sapphireBlock = new DDSapphireBlock(3605, "sapphireBlock")
				.setUnlocalizedName("sapphireBlock").setHardness(3.0F)
				.setStepSound(Block.soundMetalFootstep).setResistance(11.0F)
				.setTextureName("DungeonsAndDigging:sapphireBlock");
		GameRegistry.registerBlock(sapphireBlock, "sapphireBlock");

		// adding names
		// ORES
		LanguageRegistry.addName(crystalOre, "Crystal Ore");
		LanguageRegistry.addName(rubyOre, "Ruby Ore");
		LanguageRegistry.addName(sapphireOre, "sapphire Ore");

		// SOLILD BLOCKS
		LanguageRegistry.addName(crystalBlock, "Crystal Block");
		LanguageRegistry.addName(rubyBlock, "Ruby Block");
		LanguageRegistry.addName(sapphireBlock, "sapphire Block");

		// crafting
	}

	public static void recipes(Item crystal, Item ruby, Item sapphire,
			Block crystalBlock, Block rubyBlock, Block sapphireBlock) {
		GameRegistry.addRecipe(new ItemStack(crystalBlock, 1),
				new Object[] { "TTT", "TTT", "TTT", 'T', crystal, });
		GameRegistry.addRecipe(new ItemStack(rubyBlock, 1),
				new Object[] { "TTT", "TTT", "TTT", 'T', ruby, });
		GameRegistry.addRecipe(new ItemStack(sapphireBlock, 1),
				new Object[] { "TTT", "TTT", "TTT", 'T', sapphire, });
	}
}
