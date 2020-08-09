
package net.mcreator.epochoftheelementals.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.epochoftheelementals.EpochOfTheElementalsModElements;

@EpochOfTheElementalsModElements.ModElement.Tag
public class XarthiteHoeItem extends EpochOfTheElementalsModElements.ModElement {
	@ObjectHolder("epoch_of_the_elementals:xarthite_hoe")
	public static final Item block = null;
	public XarthiteHoeItem(EpochOfTheElementalsModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 441;
			}

			public float getEfficiency() {
				return 8f;
			}

			public float getAttackDamage() {
				return 1f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 21;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("xarthite_hoe"));
	}
}
