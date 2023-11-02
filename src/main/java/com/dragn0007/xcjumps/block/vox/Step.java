package com.dragn0007.xcjumps.block.vox;

import com.dragn0007.xcjumps.block.rot.DecorRotator;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class Step extends DecorRotator {

    public Step() {
        super(NORTH, EAST, SOUTH, WEST);
    }

    public static final VoxelShape NORTH = Stream.of(
            Block.box(0, 0, 0, 16, 3, 8),
            Block.box(0, 3, -1, 16, 4, 8),
            Block.box(0, 0, 8, 16, 6, 16),
            Block.box(0, 6, 7, 16, 7, 16),
            Block.box(0, 0, 16, 16, 9, 24),
            Block.box(0, 9, 15, 16, 10, 24),
            Block.box(0, 0, 24, 16, 12, 32),
            Block.box(0, 12, 23, 16, 13, 32)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape EAST = Stream.of(
            Block.box(8, 0, 0, 16, 3, 16),
            Block.box(8, 3, 0, 17, 4, 16),
            Block.box(0, 0, 0, 8, 6, 16),
            Block.box(0, 6, 0, 9, 7, 16),
            Block.box(-8, 0, 0, 0, 9, 16),
            Block.box(-8, 9, 0, 1, 10, 16),
            Block.box(-16, 0, 0, -8, 12, 16),
            Block.box(-16, 12, 0, -7, 13, 16)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape SOUTH = Stream.of(
            Block.box(0, 0, 8, 16, 3, 16),
            Block.box(0, 3, 8, 16, 4, 17),
            Block.box(0, 0, 0, 16, 6, 8),
            Block.box(0, 6, 0, 16, 7, 9),
            Block.box(0, 0, -8, 16, 9, 0),
            Block.box(0, 9, -8, 16, 10, 1),
            Block.box(0, 0, -16, 16, 12, -8),
            Block.box(0, 12, -16, 16, 13, -7)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape WEST = Stream.of(
            Block.box(0, 0, 0, 8, 3, 16),
            Block.box(-1, 3, 0, 8, 4, 16),
            Block.box(8, 0, 0, 16, 6, 16),
            Block.box(7, 6, 0, 16, 7, 16),
            Block.box(16, 0, 0, 24, 9, 16),
            Block.box(15, 9, 0, 24, 10, 16),
            Block.box(24, 0, 0, 32, 12, 16),
            Block.box(23, 12, 0, 32, 13, 16)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();


}
