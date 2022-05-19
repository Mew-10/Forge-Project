package net.benjamin.mccourse.world.feature;

import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {

        public static final PlacedFeature CHERRY_BLOSSOM_PLACED = PlacementUtils.register("cherry_blossom_placed",
                ModConfiguredFeature.CHERRY_BLOSSOM_TREE_CHECKED.placed(VegetationPlacements.treePlacement(
                        PlacementUtils.countExtra(1, 0.1f, 2))));
    public static final PlacedFeature PINK_ROSE_PLACED = PlacementUtils.register("pink_rose_placed",
            ModConfiguredFeature.PINK_ROSE.placed(InSquarePlacement.spread(),
                    PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

    public static final PlacedFeature CITRINE_ORE_PLACED = PlacementUtils.register("citrine_ore_placed",
            ModConfiguredFeature.CITRINE_ORE.placed(ModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
    }
