package com.dragn0007.xcjumps.block.vox.jumps;

import com.dragn0007.xcjumps.block.rot.DecorRotator;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class KnightMiddle extends DecorRotator {

    public KnightMiddle() {
        super(NORTH, EAST, SOUTH, WEST);
    }

    public static final VoxelShape NORTH = Stream.of(
            Block.box(0, 25, 1, 16, 27, 3),
            Block.box(0, 16, 13, 16, 18, 15),
            Block.box(0, 16, 1, 16, 18, 3),
            Block.box(0, 7, 13, 16, 9, 15),
            Block.box(0, 7, 1, 16, 9, 3),
            Block.box(0, 25, 13, 16, 27, 15)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape EAST = Stream.of(
            Block.box(13, 25, 0, 15, 27, 16),
            Block.box(1, 16, 0, 3, 18, 16),
            Block.box(13, 16, 0, 15, 18, 16),
            Block.box(1, 7, 0, 3, 9, 16),
            Block.box(13, 7, 0, 15, 9, 16),
            Block.box(1, 25, 0, 3, 27, 16)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape SOUTH = Stream.of(
            Block.box(0, 25, 1, 16, 27, 3),
            Block.box(0, 16, 13, 16, 18, 15),
            Block.box(0, 16, 1, 16, 18, 3),
            Block.box(0, 7, 13, 16, 9, 15),
            Block.box(0, 7, 1, 16, 9, 3),
            Block.box(0, 25, 13, 16, 27, 15)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape WEST = Stream.of(
            Block.box(13, 25, 0, 15, 27, 16),
            Block.box(1, 16, 0, 3, 18, 16),
            Block.box(13, 16, 0, 15, 18, 16),
            Block.box(1, 7, 0, 3, 9, 16),
            Block.box(13, 7, 0, 15, 9, 16),
            Block.box(1, 25, 0, 3, 27, 16)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();


}
