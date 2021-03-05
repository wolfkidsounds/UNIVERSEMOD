
package net.universemod.creativetab;

import net.universemod.item.ItemUniverseDust;
import net.universemod.ElementsUniverseMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@ElementsUniverseMod.ModElement.Tag
public class TabUNIVERSEMOD extends ElementsUniverseMod.ModElement {
	public TabUNIVERSEMOD(ElementsUniverseMod instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabuniversemod") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemUniverseDust.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
