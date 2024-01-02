package com.dragn0007.xcjumps.block.vox.decor;

import com.dragn0007.xcjumps.block.rot.DecorRotator;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class HorseHeadStatue extends DecorRotator {

    public HorseHeadStatue() {
        super(NORTH, EAST, SOUTH, WEST);
    }

    public static final VoxelShape NORTH = Stream.of(
            Block.box(5.800000000000001, 0, 3, 10.2, 12, 12)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape EAST = Stream.of(
            Block.box(3.5, 0, 5.300000000000001, 12.5, 12, 9.7)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape SOUTH = Stream.of(
            Block.box(5.800000000000001, 0, 3, 10.2, 12, 12)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape WEST = Stream.of(
            Block.box(3.5, 0, 5.300000000000001, 12.5, 12, 9.7)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

}
