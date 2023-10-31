package com.dragn0007.xcjumps.block.vox;

import com.dragn0007.xcjumps.block.rot.DecorRotator;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class Flat extends DecorRotator {

    public Flat() {
        super(NORTH, EAST, SOUTH, WEST);
    }

    public static final VoxelShape NORTH = Stream.of(
            Block.box(0, 1.5549950316754564, 1.5925349916894316, 16, 3.5549950316754564, 9.592534991689432),
            Block.box(0.1999999999999993, 0, 7, 2.8000000000000007, 3, 9),
            Block.box(13.2, 0, 7, 15.8, 3, 9)
            Block.box(0, 8, 14, 16, 10, 16)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape EAST = Stream.of(
            Block.box(-1, 0, 15, 17, 2, 16),
            Block.box(-1, 0, 0, 17, 2, 1),
            Block.box(14, 2, 0, 16, 5, 16),
            Block.box(0, 2, 1, 14, 5, 2),
            Block.box(0, 7, 1, 10, 8, 2),
            Block.box(2, 8, 14, 8, 9, 15),
            Block.box(2, 8, 1, 8, 9, 2),
            Block.box(0, 5, 14, 12, 7, 15),
            Block.box(0, 2, 14, 14, 5, 15),
            Block.box(0, 7, 14, 10, 8, 15),
            Block.box(0, 5, 1, 12, 7, 2),
            Block.box(12, 5, 0, 14, 7, 16),
            Block.box(10, 7, 0, 12, 9, 16),
            Block.box(8, 8, 0, 10, 10, 16),
            Block.box(2, 9, 0, 8, 10.999999999999998, 16),
            Block.box(0, 8, 0, 2, 10, 16)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape SOUTH = Stream.of(
            Block.box(0, 0, -1, 1, 2, 17),
            Block.box(15, 0, -1, 16, 2, 17),
            Block.box(0, 2, 14, 16, 5, 16),
            Block.box(14, 2, 0, 15, 5, 14),
            Block.box(14, 7, 0, 15, 8, 10),
            Block.box(1, 8, 2, 2, 9, 8),
            Block.box(14, 8, 2, 15, 9, 8),
            Block.box(1, 5, 0, 2, 7, 12),
            Block.box(1, 2, 0, 2, 5, 14),
            Block.box(1, 7, 0, 2, 8, 10),
            Block.box(14, 5, 0, 15, 7, 12),
            Block.box(0, 5, 12, 16, 7, 14),
            Block.box(0, 7, 10, 16, 9, 12),
            Block.box(0, 8, 8, 16, 10, 10),
            Block.box(0, 9, 2, 16, 10.999999999999998, 8),
            Block.box(0, 8, 0, 16, 10, 2)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape WEST = Stream.of(
            Block.box(-1, 0, 0, 17, 2, 1),
            Block.box(-1, 0, 15, 17, 2, 16),
            Block.box(0, 2, 0, 2, 5, 16),
            Block.box(2, 2, 14, 16, 5, 15),
            Block.box(6, 7, 14, 16, 8, 15),
            Block.box(8, 8, 1, 14, 9, 2),
            Block.box(8, 8, 14, 14, 9, 15),
            Block.box(4, 5, 1, 16, 7, 2),
            Block.box(2, 2, 1, 16, 5, 2),
            Block.box(6, 7, 1, 16, 8, 2),
            Block.box(4, 5, 14, 16, 7, 15),
            Block.box(2, 5, 0, 4, 7, 16),
            Block.box(4, 7, 0, 6, 9, 16),
            Block.box(6, 8, 0, 8, 10, 16),
            Block.box(8, 9, 0, 14, 10.999999999999998, 16),
            Block.box(14, 8, 0, 16, 10, 16)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();


}
