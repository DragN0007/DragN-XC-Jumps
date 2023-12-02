package com.dragn0007.xcjumps.block.vox.jumps;

import com.dragn0007.xcjumps.block.rot.DecorRotator;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class WoodenRoundDouble extends DecorRotator {

    public WoodenRoundDouble() {
        super(NORTH, EAST, SOUTH, WEST);
    }

    public static final VoxelShape NORTH = Stream.of(
            Block.box(0, 17, 0, 16, 20, 2),
            Block.box(1, 17, 2, 2, 20, 16),
            Block.box(1, 22, 6, 2, 23, 16),
            Block.box(14, 23, 8, 15, 24, 14),
            Block.box(1, 23, 8, 2, 24, 14),
            Block.box(14, 20, 4, 15, 22, 16),
            Block.box(14, 17, 2, 15, 20, 16),
            Block.box(14, 22, 6, 15, 23, 16),
            Block.box(1, 20, 4, 2, 22, 16),
            Block.box(0, 20, 2, 16, 22, 4),
            Block.box(0, 22, 4, 16, 24, 6),
            Block.box(0, 23, 6, 16, 25, 8),
            Block.box(0, 24, 8, 16, 26, 14),
            Block.box(0, 23, 14, 16, 25, 16),
            Block.box(0, 2, 0, 2, 15, 2),
            Block.box(0, 2, 14, 2, 15, 16),
            Block.box(14, 0, -1, 16, 2, 17),
            Block.box(14, 15, -1, 16, 17, 17),
            Block.box(14, 2, 0, 16, 15, 2),
            Block.box(14, 2, 14, 16, 15, 16),
            Block.box(0, 0, -1, 2, 2, 17),
            Block.box(0, 15, -1, 2, 17, 17)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape EAST = Stream.of(
            Block.box(14, 17, 0, 16, 20, 16),
            Block.box(0, 17, 1, 14, 20, 2),
            Block.box(0, 22, 1, 10, 23, 2),
            Block.box(2, 23, 14, 8, 24, 15),
            Block.box(2, 23, 1, 8, 24, 2),
            Block.box(0, 20, 14, 12, 22, 15),
            Block.box(0, 17, 14, 14, 20, 15),
            Block.box(0, 22, 14, 10, 23, 15),
            Block.box(0, 20, 1, 12, 22, 2),
            Block.box(12, 20, 0, 14, 22, 16),
            Block.box(10, 22, 0, 12, 24, 16),
            Block.box(8, 23, 0, 10, 25, 16),
            Block.box(2, 24, 0, 8, 26, 16),
            Block.box(0, 23, 0, 2, 25, 16),
            Block.box(14, 2, 0, 16, 15, 2),
            Block.box(0, 2, 0, 2, 15, 2),
            Block.box(-1, 0, 14, 17, 2, 16),
            Block.box(-1, 15, 14, 17, 17, 16),
            Block.box(14, 2, 14, 16, 15, 16),
            Block.box(0, 2, 14, 2, 15, 16),
            Block.box(-1, 0, 0, 17, 2, 2),
            Block.box(-1, 15, 0, 17, 17, 2)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape SOUTH = Stream.of(
            Block.box(0, 17, 14, 16, 20, 16),
            Block.box(14, 17, 0, 15, 20, 14),
            Block.box(14, 22, 0, 15, 23, 10),
            Block.box(1, 23, 2, 2, 24, 8),
            Block.box(14, 23, 2, 15, 24, 8),
            Block.box(1, 20, 0, 2, 22, 12),
            Block.box(1, 17, 0, 2, 20, 14),
            Block.box(1, 22, 0, 2, 23, 10),
            Block.box(14, 20, 0, 15, 22, 12),
            Block.box(0, 20, 12, 16, 22, 14),
            Block.box(0, 22, 10, 16, 24, 12),
            Block.box(0, 23, 8, 16, 25, 10),
            Block.box(0, 24, 2, 16, 26, 8),
            Block.box(0, 23, 0, 16, 25, 2),
            Block.box(14, 2, 14, 16, 15, 16),
            Block.box(14, 2, 0, 16, 15, 2),
            Block.box(0, 0, -1, 2, 2, 17),
            Block.box(0, 15, -1, 2, 17, 17),
            Block.box(0, 2, 14, 2, 15, 16),
            Block.box(0, 2, 0, 2, 15, 2),
            Block.box(14, 0, -1, 16, 2, 17),
            Block.box(14, 15, -1, 16, 17, 17)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape WEST = Stream.of(
            Block.box(0, 17, 0, 2, 20, 16),
            Block.box(2, 17, 14, 16, 20, 15),
            Block.box(6, 22, 14, 16, 23, 15),
            Block.box(8, 23, 1, 14, 24, 2),
            Block.box(8, 23, 14, 14, 24, 15),
            Block.box(4, 20, 1, 16, 22, 2),
            Block.box(2, 17, 1, 16, 20, 2),
            Block.box(6, 22, 1, 16, 23, 2),
            Block.box(4, 20, 14, 16, 22, 15),
            Block.box(2, 20, 0, 4, 22, 16),
            Block.box(4, 22, 0, 6, 24, 16),
            Block.box(6, 23, 0, 8, 25, 16),
            Block.box(8, 24, 0, 14, 26, 16),
            Block.box(14, 23, 0, 16, 25, 16),
            Block.box(0, 2, 14, 2, 15, 16),
            Block.box(14, 2, 14, 16, 15, 16),
            Block.box(-1, 0, 0, 17, 2, 2),
            Block.box(-1, 15, 0, 17, 17, 2),
            Block.box(0, 2, 0, 2, 15, 2),
            Block.box(14, 2, 0, 16, 15, 2),
            Block.box(-1, 0, 14, 17, 2, 16),
            Block.box(-1, 15, 14, 17, 17, 16)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();


}
