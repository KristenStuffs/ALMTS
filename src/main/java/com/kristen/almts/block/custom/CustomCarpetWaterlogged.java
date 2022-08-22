package com.kristen.almts.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class CustomCarpetWaterlogged extends Block implements SimpleWaterloggedBlock {
	   public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

   protected static final VoxelShape SHAPE = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 1.0D, 16.0D);

   public CustomCarpetWaterlogged(BlockBehaviour.Properties p_152915_) {
      super(p_152915_);
      this.registerDefaultState(this.stateDefinition.any().setValue(WATERLOGGED, Boolean.valueOf(false)));
   }
   
   protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_153687_) {
       p_153687_.add(WATERLOGGED);
    }

   public VoxelShape getShape(BlockState p_152917_, BlockGetter p_152918_, BlockPos p_152919_, CollisionContext p_152920_) {
      return SHAPE;
   }

   @SuppressWarnings("deprecation")
	public BlockState updateShape(BlockState p_153680_, Direction p_153681_, BlockState p_153682_, LevelAccessor p_153683_, BlockPos p_153684_, BlockPos p_153685_) {
       if (p_153680_.getValue(WATERLOGGED)) {
          p_153683_.scheduleTick(p_153684_, Fluids.WATER, Fluids.WATER.getTickDelay(p_153683_));
       }

       return super.updateShape(p_153680_, p_153681_, p_153682_, p_153683_, p_153684_, p_153685_);
    }

    @SuppressWarnings("deprecation")
	public FluidState getFluidState(BlockState p_153699_) {
       return p_153699_.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(p_153699_);
    }

   public boolean canSurvive(BlockState p_152922_, LevelReader p_152923_, BlockPos p_152924_) {
      return !p_152923_.isEmptyBlock(p_152924_.below());
   }
}