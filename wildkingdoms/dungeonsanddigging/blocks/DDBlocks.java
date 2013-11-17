package wildkingdoms.dungeonsanddigging.blocks;

import wildkingdoms.dungeonsanddigging.Main;
import wildkingdoms.dungeonsanddigging.blocks.ores.DDCrystalOre;
import wildkingdoms.dungeonsanddigging.blocks.ores.DDRubyOre;
import wildkingdoms.dungeonsanddigging.blocks.ores.DDSapphireOre;
import wildkingdoms.dungeonsanddigging.blocks.solidblocks.DDCrystalBlock;
import wildkingdoms.dungeonsanddigging.blocks.solidblocks.DDRubyBlock;
import wildkingdoms.dungeonsanddigging.blocks.solidblocks.DDSapphireBlock;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class DDBlocks {
	public static void init() {
		// define items/blocks
		// ORES
		Main.crystalOre = new DDCrystalOre(3600, "crystalOre")
				.setUnlocalizedName("crystalOre").setHardness(3.0F)
				.setStepSound(Block.soundStoneFootstep).setResistance(8.0F)
				.setTextureName("dungeonsanddigging:crystalore");
		GameRegistry.registerBlock(Main.crystalOre, "crystalOre");

		Main.rubyOre = new DDRubyOre(3601, "rubyOre").setUnlocalizedName("rubyOre")
				.setHardness(2.0F).setStepSound(Block.soundStoneFootstep)
				.setResistance(9.0F)
				.setTextureName("dungeonsanddigging:rubyore");
		GameRegistry.registerBlock(Main.rubyOre, "rubyOre");

		Main.sapphireOre = new DDSapphireOre(3602, "sapphireOre")
				.setUnlocalizedName("sapphireOre").setHardness(2.0F)
				.setStepSound(Block.soundStoneFootstep).setResistance(9.0F)
				.setTextureName("dungeonsanddigging:sapphireore");
		GameRegistry.registerBlock(Main.sapphireOre, "sapphireOre");

		// SOLID BLOCKS
		Main.crystalBlock = new DDCrystalBlock(3603, "crystalBlock")
				.setUnlocalizedName("crystalBlock").setHardness(3.0F)
				.setStepSound(Block.soundMetalFootstep).setResistance(9.0F)
				.setTextureName("dungeonsanddigging:crystalblock");
		GameRegistry.registerBlock(Main.crystalBlock, "crystalBlock");

		Main.rubyBlock = new DDRubyBlock(3604, "rubyBlock")
				.setUnlocalizedName("rubyBlock").setHardness(3.0F)
				.setStepSound(Block.soundMetalFootstep).setResistance(9.0F)
				.setTextureName("dungeonsanddigging:rubyblock");
		GameRegistry.registerBlock(Main.rubyBlock, "rubyBlock");

		Main.sapphireBlock = new DDSapphireBlock(3605, "sapphireBlock")
				.setUnlocalizedName("sapphireBlock").setHardness(3.0F)
				.setStepSound(Block.soundMetalFootstep).setResistance(11.0F)
				.setTextureName("dungeonsanddigging:sapphireblock");
		GameRegistry.registerBlock(Main.sapphireBlock, "sapphireBlock");

		// adding names
		// ORES
		LanguageRegistry.addName(Main.crystalOre, "Crystal Ore");
		LanguageRegistry.addName(Main.rubyOre, "Ruby Ore");
		LanguageRegistry.addName(Main.sapphireOre, "Sapphire Ore");

		// SOLILD BLOCKS
		LanguageRegistry.addName(Main.crystalBlock, "Crystal Block");
		LanguageRegistry.addName(Main.rubyBlock, "Ruby Block");
		LanguageRegistry.addName(Main.sapphireBlock, "Sapphire Block");

		// crafting
	}

	public static void recipes() {
		GameRegistry.addRecipe(new ItemStack(Main.crystalBlock, 1),
				new Object[] { "TTT", "TTT", "TTT", 'T', Main.crystal, });
		GameRegistry.addRecipe(new ItemStack(Main.rubyBlock, 1),
				new Object[] { "TTT", "TTT", "TTT", 'T', Main.ruby, });
		GameRegistry.addRecipe(new ItemStack(Main.sapphireBlock, 1),
				new Object[] { "TTT", "TTT", "TTT", 'T', Main.sapphire, });
	}
}
