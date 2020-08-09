
package net.mcreator.epochoftheelementals.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.epochoftheelementals.EpochOfTheElementalsModElements;

@EpochOfTheElementalsModElements.ModElement.Tag
public class RoughMysteriousGemItem extends EpochOfTheElementalsModElements.ModElement {
	@ObjectHolder("epoch_of_the_elementals:rough_mysterious_gem")
	public static final Item block = null;
	public RoughMysteriousGemItem(EpochOfTheElementalsModElements instance) {
		super(instance, 26);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64));
			setRegistryName("rough_mysterious_gem");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
