
package net.mcreator.epochoftheelementals.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.epochoftheelementals.EpochOfTheElementalsModElements;

@EpochOfTheElementalsModElements.ModElement.Tag
public class XarthiteSwordItem extends EpochOfTheElementalsModElements.ModElement {
	@ObjectHolder("epoch_of_the_elementals:xarthite_sword")
	public static final Item block = null;
	public XarthiteSwordItem(EpochOfTheElementalsModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 441;
			}

			public float getEfficiency() {
				return 8f;
			}

			public float getAttackDamage() {
				return 4f;
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
		}, 3, -3f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("xarthite_sword"));
	}
}
