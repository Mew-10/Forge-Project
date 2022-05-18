package net.benjamin.mccourse.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public class modTiers {
    }
    public static final ForgeTier CITRINE = new ForgeTier(2, 1400, 1.5f,
            2f, 22, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Moditems.CITRINE.get()));

    public static final ForgeTier COBALT = new ForgeTier(1, 1500, 1f,
            3f, 10, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Moditems.COBALT_INGOT.get()));
}
