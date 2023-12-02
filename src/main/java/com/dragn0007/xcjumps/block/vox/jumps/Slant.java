package com.dragn0007.xcjumps.block.vox.jumps;

import com.dragn0007.xcjumps.block.rot.DecorRotator;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class Slant extends DecorRotator {

    public Slant() {
        super(NORTH, EAST, SOUTH, WEST);
    }

    public static final VoxelShape NORTH = Stream.of(
            Block.box(15, 0, 14, 16, 16, 16),
            Block.box(0, 0, 14, 1, 16, 16),
            Block.box(1, 11.7, 12, 15, 14, 14),
            Block.box(1, 13.7, 14, 15, 16, 16),
            Block.box(1.5, 9.7, 10, 14.5, 12, 12),
            Block.box(2, 7.7, 8, 14, 10, 10),
            Block.box(3, 5.7, 6, 13, 8, 8),
            Block.box(4, 3.7, 4, 12, 6, 6),
            Block.box(4.5, 1.7000000000000002, 2, 11.5, 4, 4),
            Block.box(5.1, 0, 0, 10.9, 2, 2)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape EAST = Stream.of(
            Block.box(0, 0, 15, 2, 16, 16),
            Block.box(0, 0, 0, 2, 16, 1),
            Block.box(2, 11.7, 1, 4, 14, 15),
            Block.box(0, 13.7, 1, 2, 16, 15),
            Block.box(4, 9.7, 1.5, 6, 12, 14.5),
            Block.box(6, 7.7, 2, 8, 10, 14),
            Block.box(8, 5.7, 3, 10, 8, 13),
            Block.box(10, 3.7, 4, 12, 6, 12),
            Block.box(12, 1.7000000000000002, 4.5, 14, 4, 11.5),
            Block.box(14, 0, 5.1, 16, 2, 10.9)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape SOUTH = Stream.of(
            Block.box(0, 0, 0, 1, 16, 2),
            Block.box(15, 0, 0, 16, 16, 2),
            Block.box(1, 11.7, 2, 15, 14, 4),
            Block.box(1, 13.7, 0, 15, 16, 2),
            Block.box(1.5, 9.7, 4, 14.5, 12, 6),
            Block.box(2, 7.7, 6, 14, 10, 8),
            Block.box(3, 5.7, 8, 13, 8, 10),
            Block.box(4, 3.7, 10, 12, 6, 12),
            Block.box(4.5, 1.7000000000000002, 12, 11.5, 4, 14),
            Block.box(5.1, 0, 14, 10.9, 2, 16)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape WEST = Stream.of(
            Block.box(14, 0, 0, 16, 16, 1),
            Block.box(14, 0, 15, 16, 16, 16),
            Block.box(12, 11.7, 1, 14, 14, 15),
            Block.box(14, 13.7, 1, 16, 16, 15),
            Block.box(10, 9.7, 1.5, 12, 12, 14.5),
            Block.box(8, 7.7, 2, 10, 10, 14),
            Block.box(6, 5.7, 3, 8, 8, 13),
            Block.box(4, 3.7, 4, 6, 6, 12),
            Block.box(2, 1.7000000000000002, 4.5, 4, 4, 11.5),
            Block.box(0, 0, 5.1, 2, 2, 10.9)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();


}
