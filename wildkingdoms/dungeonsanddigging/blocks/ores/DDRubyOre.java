package wildkingdoms.dungeonsanddigging.blocks.ores;

import java.util.Random;

import wildkingdoms.dungeonsanddigging.Main;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class DDRubyOre extends Block {

	public DDRubyOre(int par1, String texture) {
		super(par1, Material.rock);
		setCreativeTab(CreativeTabs.tabBlock); // place in creative tabs

	}

	// drops when broken with pickaxe
	public int idDropped(int par1, Random par2Random, int par3) {
		return Main.ruby.itemID;
	}

	public int quantityDropped(Random random) {
		return 1;
	}

}