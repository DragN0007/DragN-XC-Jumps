package com.dragn0007.xcjumps.block.vox.jumps;

import com.dragn0007.xcjumps.block.rot.DecorRotator;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class Short extends DecorRotator {

    public Short() {
        super(NORTH, EAST, SOUTH, WEST);
    }

    public static final VoxelShape NORTH = Stream.of(
            Block.box(14, 0, 14, 16, 9, 16),
            Block.box(14.5, 6, 2, 15.5, 9, 14),
            Block.box(0.5, 6, 2, 1.5, 9, 14),
            Block.box(0, 0, 14, 2, 9, 16),
            Block.box(0, 0, 0, 2, 9, 2),
            Block.box(14, 0, 0, 16, 9, 2),
            Block.box(0, 6, -2, 16, 9, 0),
            Block.box(0, 9, 16, 16, 10, 17),
            Block.box(0, 6, 16, 16, 9, 18),
            Block.box(0, 9, -1, 16, 10, 0),
            Block.box(0, 9, 0, 16, 11, 16)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape EAST = Stream.of(
            Block.box(0, 0, 14, 2, 9, 16),
            Block.box(2, 6, 14.5, 14, 9, 15.5),
            Block.box(2, 6, 0.5, 14, 9, 1.5),
            Block.box(0, 0, 0, 2, 9, 2),
            Block.box(14, 0, 0, 16, 9, 2),
            Block.box(14, 0, 14, 16, 9, 16),
            Block.box(16, 6, 0, 18, 9, 16),
            Block.box(-1, 9, 0, 0, 10, 16),
            Block.box(-2, 6, 0, 0, 9, 16),
            Block.box(16, 9, 0, 17, 10, 16),
            Block.box(0, 9, 0, 16, 11, 16)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape SOUTH = Stream.of(
            Block.box(14, 0, 14, 16, 9, 16),
            Block.box(14.5, 6, 2, 15.5, 9, 14),
            Block.box(0.5, 6, 2, 1.5, 9, 14),
            Block.box(0, 0, 14, 2, 9, 16),
            Block.box(0, 0, 0, 2, 9, 2),
            Block.box(14, 0, 0, 16, 9, 2),
            Block.box(0, 6, -2, 16, 9, 0),
            Block.box(0, 9, 16, 16, 10, 17),
            Block.box(0, 6, 16, 16, 9, 18),
            Block.box(0, 9, -1, 16, 10, 0),
            Block.box(0, 9, 0, 16, 11, 16)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape WEST = Stream.of(
            Block.box(0, 0, 14, 2, 9, 16),
            Block.box(2, 6, 14.5, 14, 9, 15.5),
            Block.box(2, 6, 0.5, 14, 9, 1.5),
            Block.box(0, 0, 0, 2, 9, 2),
            Block.box(14, 0, 0, 16, 9, 2),
            Block.box(14, 0, 14, 16, 9, 16),
            Block.box(16, 6, 0, 18, 9, 16),
            Block.box(-1, 9, 0, 0, 10, 16),
            Block.box(-2, 6, 0, 0, 9, 16),
            Block.box(16, 9, 0, 17, 10, 16),
            Block.box(0, 9, 0, 16, 11, 16)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();


}
