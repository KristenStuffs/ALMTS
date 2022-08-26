package com.kristen.almts.block.custom;

import com.kristen.almts.block.ModBlocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.GrowingPlantHeadBlock;
import net.minecraft.world.level.block.KelpPlantBlock;
import net.minecraft.world.level.block.LiquidBlockContainer;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;

public class RedLivingSpongePlantBlock extends KelpPlantBlock implements LiquidBlockContainer {
   public RedLivingSpongePlantBlock(BlockBehaviour.Properties p_54323_) {
      super(p_54323_);
   }

   protected GrowingPlantHeadBlock getHeadBlock() {
      return (GrowingPlantHeadBlock)ModBlocks.RED_LIVING_SPONGE.get();
   }

   public FluidState getFluidState(BlockState p_54336_) {
      return Fluids.WATER.getSource(false);
   }

   public boolean canPlaceLiquid(BlockGetter p_54325_, BlockPos p_54326_, BlockState p_54327_, Fluid p_54328_) {
      return false;
   }

   public boolean placeLiquid(LevelAccessor p_54330_, BlockPos p_54331_, BlockState p_54332_, FluidState p_54333_) {
      return false;
   }
}