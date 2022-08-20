package com.kristen.almts.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class GiantClamShellBlock extends Block {
    public GiantClamShellBlock(Properties properties) {
        super(properties);
    }

    private static final VoxelShape SHAPE =  Block.box(3, 0, 5, 13, 8, 10);

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE;
    }
    
    
}
