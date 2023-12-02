package com.dragn0007.xcjumps.block.vox.jumps;

import com.dragn0007.xcjumps.block.rot.DecorRotator;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class WoodenSquare extends DecorRotator {

    public WoodenSquare() {
        super(NORTH, EAST, SOUTH, WEST);
    }

    public static final VoxelShape NORTH = Stream.of(
            Block.box(0, 0, 1, 16, 12, 2),
            Block.box(1, 0, 2, 15, 11, 14),
            Block.box(0, 11, 2, 16, 12.5, 14),
            Block.box(0, 0, 14, 16, 12, 15),
            Block.box(0, 9, 0, 16, 11, 1),
            Block.box(0, 9, 15, 16, 11, 16),
            Block.box(0, 6, 0, 16, 8, 1),
            Block.box(0, 6, 15, 16, 8, 16),
            Block.box(0, 3, 0, 16, 5, 1),
            Block.box(0, 3, 15, 16, 5, 16),
            Block.box(0, 0, 0, 16, 2, 1),
            Block.box(0, 0, 15, 16, 2, 16)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape EAST = Stream.of(
            Block.box(14, 0, 0, 15, 12, 16),
            Block.box(2, 0, 1, 14, 11, 15),
            Block.box(2, 11, 0, 14, 12.5, 16),
            Block.box(1, 0, 0, 2, 12, 16),
            Block.box(15, 9, 0, 16, 11, 16),
            Block.box(0, 9, 0, 1, 11, 16),
            Block.box(15, 6, 0, 16, 8, 16),
            Block.box(0, 6, 0, 1, 8, 16),
            Block.box(15, 3, 0, 16, 5, 16),
            Block.box(0, 3, 0, 1, 5, 16),
            Block.box(15, 0, 0, 16, 2, 16),
            Block.box(0, 0, 0, 1, 2, 16)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape SOUTH = Stream.of(
            Block.box(0, 0, 1, 16, 12, 2),
            Block.box(1, 0, 2, 15, 11, 14),
            Block.box(0, 11, 2, 16, 12.5, 14),
            Block.box(0, 0, 14, 16, 12, 15),
            Block.box(0, 9, 0, 16, 11, 1),
            Block.box(0, 9, 15, 16, 11, 16),
            Block.box(0, 6, 0, 16, 8, 1),
            Block.box(0, 6, 15, 16, 8, 16),
            Block.box(0, 3, 0, 16, 5, 1),
            Block.box(0, 3, 15, 16, 5, 16),
            Block.box(0, 0, 0, 16, 2, 1),
            Block.box(0, 0, 15, 16, 2, 16)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape WEST = Stream.of(
            Block.box(14, 0, 0, 15, 12, 16),
            Block.box(2, 0, 1, 14, 11, 15),
            Block.box(2, 11, 0, 14, 12.5, 16),
            Block.box(1, 0, 0, 2, 12, 16),
            Block.box(15, 9, 0, 16, 11, 16),
            Block.box(0, 9, 0, 1, 11, 16),
            Block.box(15, 6, 0, 16, 8, 16),
            Block.box(0, 6, 0, 1, 8, 16),
            Block.box(15, 3, 0, 16, 5, 16),
            Block.box(0, 3, 0, 1, 5, 16),
            Block.box(15, 0, 0, 16, 2, 16),
            Block.box(0, 0, 0, 1, 2, 16)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();


}
