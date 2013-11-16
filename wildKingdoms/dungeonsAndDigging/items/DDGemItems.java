package wildKingdoms.dungeonsAndDigging.items;

import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.*;
import net.minecraft.creativetab.CreativeTabs;

public class DDGemItems extends Item {
	public DDGemItems(int par1) {
		super(par1); // Returns super constructor: par1 is ID
		setCreativeTab(CreativeTabs.tabMaterials); // Tells the game what
													// creative mode tab it goes
													// in
	}
}