package wildkingdoms.dungeonsanddigging.items;

import wildkingdoms.dungeonsanddigging.Main;
import wildkingdoms.dungeonsanddigging.items.tools.*;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class DDItems {
	public static void init() {
		// define items/blocks
		// Gems
		Main.crystal = new DDGemItems(3200).setUnlocalizedName("crystal")
				.setTextureName("dungeonsanddigging:crystal");
		Main.ruby = new DDGemItems(3201).setUnlocalizedName("ruby")
				.setTextureName("dungeonsanddigging:ruby");
		Main.sapphire = new DDGemItems(3202).setUnlocalizedName("sapphire")
				.setTextureName("dungeonsanddigging:sapphire");

		// Tools
		Main.crystalAxe = new CrystalAxe(9000, Main.enumToolMaterialCrystal)
				.setUnlocalizedName("crystalAxe").setTextureName(
						"dungeonsanddigging:crystalaxe");
		Main.crystalShovel = new CrystalShovel(9001,
				Main.enumToolMaterialCrystal).setUnlocalizedName(
				"crystalShovel").setTextureName(
				"dungeonsanddigging:crystalshovel");
		Main.crystalPickaxe = new CrystalPickaxe(9002,
				Main.enumToolMaterialCrystal).setUnlocalizedName(
				"crystalPickaxe").setTextureName(
				"dungeonsanddigging:crystalpickaxe");
		Main.crystalHoe = new CrystalHoe(9003, Main.enumToolMaterialCrystal)
				.setUnlocalizedName("crystalHoe").setTextureName(
						"dungeonsanddigging:crystalhoe");
		Main.crystalSword = new CrystalSword(9004, Main.enumToolMaterialCrystal)
				.setUnlocalizedName("crystalSword").setTextureName(
						"dungeonsanddigging:crystalsword");

		Main.rubyAxe = new CrystalAxe(9005, Main.enumToolMaterialRuby)
				.setUnlocalizedName("rubyAxe").setTextureName(
						"dungeonsanddigging:rubyaxe");
		Main.rubyShovel = new CrystalShovel(9006, Main.enumToolMaterialRuby)
				.setUnlocalizedName("rubyShovel").setTextureName(
						"dungeonsanddigging:rubyshovel");
		Main.rubyPickaxe = new CrystalPickaxe(9007, Main.enumToolMaterialRuby)
				.setUnlocalizedName("rubyPickaxe").setTextureName(
						"dungeonsanddigging:rubypickaxe");
		Main.rubyHoe = new CrystalHoe(9008, Main.enumToolMaterialRuby)
				.setUnlocalizedName("rubyHoe").setTextureName(
						"dungeonsanddigging:rubyhoe");
		Main.rubySword = new CrystalSword(9009, Main.enumToolMaterialRuby)
				.setUnlocalizedName("rubySword").setTextureName(
						"dungeonsanddigging:rubysword");

		Main.sapphireAxe = new CrystalAxe(9010, Main.enumToolMaterialSapphire)
				.setUnlocalizedName("sapphireAxe").setTextureName(
						"dungeonsanddigging:sapphireaxe");
		Main.sapphireShovel = new CrystalShovel(9011,
				Main.enumToolMaterialSapphire).setUnlocalizedName(
				"sapphireShovel").setTextureName(
				"dungeonsanddigging:sapphireshovel");
		Main.sapphirePickaxe = new CrystalPickaxe(9012,
				Main.enumToolMaterialSapphire).setUnlocalizedName(
				"sapphirePickaxe").setTextureName(
				"dungeonsanddigging:sapphirepickaxe");
		Main.sapphireHoe = new CrystalHoe(9013, Main.enumToolMaterialSapphire)
				.setUnlocalizedName("sapphireHoe").setTextureName(
						"dungeonsanddigging:sapphirehoe");
		Main.sapphireSword = new CrystalSword(9014,
				Main.enumToolMaterialSapphire).setUnlocalizedName(
				"sapphireSword").setTextureName(
				"dungeonsanddigging:sapphiresword");

		// adding names
		// Gems
		LanguageRegistry.addName(Main.crystal, "Crystal");
		LanguageRegistry.addName(Main.ruby, "Ruby");
		LanguageRegistry.addName(Main.sapphire, "Sapphire");

		// Tools
		LanguageRegistry.addName(Main.crystalAxe, "Crystal Axe");
		LanguageRegistry.addName(Main.crystalShovel, "Crystal Shovel");
		LanguageRegistry.addName(Main.crystalPickaxe, "Crystal Pickaxe");
		LanguageRegistry.addName(Main.crystalHoe, "Crystal Hoe");
		LanguageRegistry.addName(Main.crystalSword, "Crystal Sword");

		LanguageRegistry.addName(Main.rubyAxe, "Ruby Axe");
		LanguageRegistry.addName(Main.rubyShovel, "Ruby Shovel");
		LanguageRegistry.addName(Main.rubyPickaxe, "Ruby Pickaxe");
		LanguageRegistry.addName(Main.rubyHoe, "Ruby Hoe");
		LanguageRegistry.addName(Main.rubySword, "Ruby Sword");

		LanguageRegistry.addName(Main.sapphireAxe, "Sapphire Axe");
		LanguageRegistry.addName(Main.sapphireShovel, "Sapphire Shovel");
		LanguageRegistry.addName(Main.sapphirePickaxe, "Sapphire Pickaxe");
		LanguageRegistry.addName(Main.sapphireHoe, "Sapphire Hoe");
		LanguageRegistry.addName(Main.sapphireSword, "Sapphire Sword");

	}

	public static void recipes() {
		// Solid Block to Gem
		GameRegistry.addShapelessRecipe(new ItemStack(Main.crystal, 9),
				new Object[] { Main.crystalBlock });
		GameRegistry.addShapelessRecipe(new ItemStack(Main.ruby, 9),
				new Object[] { Main.rubyBlock });
		GameRegistry.addShapelessRecipe(new ItemStack(Main.sapphire, 9),
				new Object[] { Main.sapphireBlock });

		// Tools
		GameRegistry.addRecipe(new ItemStack(Main.crystalAxe, 1), new Object[] {
				"TT ", "TS ", " S ", 'T', Main.crystal, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Main.crystalAxe, 1), new Object[] {
				"TT ", " ST", " S ", 'T', Main.crystal, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Main.crystalShovel, 1),
				new Object[] { " T ", " S ", " S ", 'T', Main.crystal, 'S',
						Item.stick });
		GameRegistry.addRecipe(new ItemStack(Main.crystalPickaxe, 1),
				new Object[] { "TTT", " S ", " S ", 'T', Main.crystal, 'S',
						Item.stick });
		GameRegistry.addRecipe(new ItemStack(Main.crystalHoe, 1), new Object[] {
				"TT ", " S ", " S ", 'T', Main.crystal, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Main.crystalHoe, 1), new Object[] {
				" TT", " S ", " S ", 'T', Main.crystal, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Main.crystalSword, 1),
				new Object[] { " T ", " T ", " S ", 'T', Main.crystal, 'S',
						Item.stick });

		GameRegistry.addRecipe(new ItemStack(Main.rubyAxe, 1), new Object[] {
				"TT ", "TS ", " S ", 'T', Main.ruby, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Main.rubyAxe, 1), new Object[] {
				"TT ", " ST", " S ", 'T', Main.ruby, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Main.rubyShovel, 1), new Object[] {
				" T ", " S ", " S ", 'T', Main.ruby, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Main.rubyPickaxe, 1),
				new Object[] { "TTT", " S ", " S ", 'T', Main.ruby, 'S',
						Item.stick });
		GameRegistry.addRecipe(new ItemStack(Main.rubyHoe, 1), new Object[] {
				"TT ", " S ", " S ", 'T', Main.ruby, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Main.rubyHoe, 1), new Object[] {
				" TT", " S ", " S ", 'T', Main.ruby, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Main.rubySword, 1), new Object[] {
				" T ", " T ", " S ", 'T', Main.ruby, 'S', Item.stick });

		GameRegistry.addRecipe(new ItemStack(Main.sapphireAxe, 1),
				new Object[] { "TT ", "TS ", " S ", 'T', Main.sapphire, 'S',
						Item.stick });
		GameRegistry.addRecipe(new ItemStack(Main.sapphireAxe, 1),
				new Object[] { "TT ", " ST", " S ", 'T', Main.sapphire, 'S',
						Item.stick });
		GameRegistry.addRecipe(new ItemStack(Main.sapphireShovel, 1),
				new Object[] { " T ", " S ", " S ", 'T', Main.sapphire, 'S',
						Item.stick });
		GameRegistry.addRecipe(new ItemStack(Main.sapphirePickaxe, 1),
				new Object[] { "TTT", " S ", " S ", 'T', Main.sapphire, 'S',
						Item.stick });
		GameRegistry.addRecipe(new ItemStack(Main.sapphireHoe, 1),
				new Object[] { "TT ", " S ", " S ", 'T', Main.sapphire, 'S',
						Item.stick });
		GameRegistry.addRecipe(new ItemStack(Main.sapphireHoe, 1),
				new Object[] { " TT", " S ", " S ", 'T', Main.sapphire, 'S',
						Item.stick });
		GameRegistry.addRecipe(new ItemStack(Main.sapphireSword, 1),
				new Object[] { " T ", " T ", " S ", 'T', Main.sapphire, 'S',
						Item.stick });

	}
}
