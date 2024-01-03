package com.dragn0007.xcjumps.block.vox.jumps;

import com.dragn0007.xcjumps.block.rot.DecorRotator;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class KnightRight extends DecorRotator {

    public KnightRight() {
        super(NORTH, EAST, SOUTH, WEST);
    }

    public static final VoxelShape NORTH = Stream.of(
            Block.box(-16, 0, 4.1, 5, 25, 12.1),
            Block.box(0, 0, 1, 2, 32, 3),
            Block.box(0, 0, 13, 2, 32, 15),
            Block.box(2, 25, 1, 16, 27, 3),
            Block.box(2, 16, 13, 16, 18, 15),
            Block.box(2, 16, 1, 16, 18, 3),
            Block.box(2, 7, 13, 16, 9, 15),
            Block.box(2, 7, 1, 16, 9, 3),
            Block.box(2, 25, 13, 16, 27, 15)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape EAST = Stream.of(
            Block.box(3.9000000000000004, 0, -16, 11.9, 25, 5),
            Block.box(13, 0, 0, 15, 32, 2),
            Block.box(1, 0, 0, 3, 32, 2),
            Block.box(13, 25, 2, 15, 27, 16),
            Block.box(1, 16, 2, 3, 18, 16),
            Block.box(13, 16, 2, 15, 18, 16),
            Block.box(1, 7, 2, 3, 9, 16),
            Block.box(13, 7, 2, 15, 9, 16),
            Block.box(1, 25, 2, 3, 27, 16)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape SOUTH = Stream.of(
            Block.box(11, 0, 3.9000000000000004, 32, 25, 11.9),
            Block.box(14, 0, 13, 16, 32, 15),
            Block.box(14, 0, 1, 16, 32, 3),
            Block.box(0, 25, 13, 14, 27, 15),
            Block.box(0, 16, 1, 14, 18, 3),
            Block.box(0, 16, 13, 14, 18, 15),
            Block.box(0, 7, 1, 14, 9, 3),
            Block.box(0, 7, 13, 14, 9, 15),
            Block.box(0, 25, 1, 14, 27, 3)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape WEST = Stream.of(
            Block.box(4.1, 0, 11, 12.1, 25, 32),
            Block.box(1, 0, 14, 3, 32, 16),
            Block.box(13, 0, 14, 15, 32, 16),
            Block.box(1, 25, 0, 3, 27, 14),
            Block.box(13, 16, 0, 15, 18, 14),
            Block.box(1, 16, 0, 3, 18, 14),
            Block.box(13, 7, 0, 15, 9, 14),
            Block.box(1, 7, 0, 3, 9, 14),
            Block.box(13, 25, 0, 15, 27, 14)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();


}
