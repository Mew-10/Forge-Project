package net.benjamin.mccourse.block.custom;
import net.benjamin.mccourse.item.Moditems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.BeetrootBlock;

public class TurnipCropBlock extends BeetrootBlock {
    public TurnipCropBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return Moditems.TURNIP_SEEDS.get();
    }
}