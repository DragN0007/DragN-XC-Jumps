package com.dragn0007.xcjumps.block.vox.jumps;

import com.dragn0007.xcjumps.block.rot.DecorRotator;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class CastleRight extends DecorRotator {

    public CastleRight() {
        super(NORTH, EAST, SOUTH, WEST);
    }

    public static final VoxelShape NORTH = Stream.of(
            Block.box(1, 0, 2, 4, 15, 5),
            Block.box(0, 0, 2, 1, 16, 5),
            Block.box(4, 0, 2, 5, 16, 5),
            Block.box(1, 0, 1, 4, 16, 2),
            Block.box(1, 0, 5, 4, 16, 6),
            Block.box(1, 0, 11, 4, 15, 14),
            Block.box(0, 0, 11, 1, 16, 14),
            Block.box(4, 0, 11, 5, 16, 14),
            Block.box(1, 0, 10, 4, 16, 11),
            Block.box(1, 0, 14, 4, 16, 15),
            Block.box(2, 0, 4, 16, 11, 12),
            Block.box(1, 0, 6, 2, 12, 10),
            Block.box(5, 0, 12, 16, 12, 13),
            Block.box(5, 0, 3, 16, 12, 4)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape EAST = Stream.of(
            Block.box(11, 0, 1, 14, 15, 4),
            Block.box(11, 0, 0, 14, 16, 1),
            Block.box(11, 0, 4, 14, 16, 5),
            Block.box(14, 0, 1, 15, 16, 4),
            Block.box(10, 0, 1, 11, 16, 4),
            Block.box(2, 0, 1, 5, 15, 4),
            Block.box(2, 0, 0, 5, 16, 1),
            Block.box(2, 0, 4, 5, 16, 5),
            Block.box(5, 0, 1, 6, 16, 4),
            Block.box(1, 0, 1, 2, 16, 4),
            Block.box(4, 0, 2, 12, 11, 16),
            Block.box(6, 0, 1, 10, 12, 2),
            Block.box(3, 0, 5, 4, 12, 16),
            Block.box(12, 0, 5, 13, 12, 16)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape SOUTH = Stream.of(
            Block.box(12, 0, 11, 15, 15, 14),
            Block.box(15, 0, 11, 16, 16, 14),
            Block.box(11, 0, 11, 12, 16, 14),
            Block.box(12, 0, 14, 15, 16, 15),
            Block.box(12, 0, 10, 15, 16, 11),
            Block.box(12, 0, 2, 15, 15, 5),
            Block.box(15, 0, 2, 16, 16, 5),
            Block.box(11, 0, 2, 12, 16, 5),
            Block.box(12, 0, 5, 15, 16, 6),
            Block.box(12, 0, 1, 15, 16, 2),
            Block.box(0, 0, 4, 14, 11, 12),
            Block.box(14, 0, 6, 15, 12, 10),
            Block.box(0, 0, 3, 11, 12, 4),
            Block.box(0, 0, 12, 11, 12, 13)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape WEST = Stream.of(
            Block.box(2, 0, 12, 5, 15, 15),
            Block.box(2, 0, 15, 5, 16, 16),
            Block.box(2, 0, 11, 5, 16, 12),
            Block.box(1, 0, 12, 2, 16, 15),
            Block.box(5, 0, 12, 6, 16, 15),
            Block.box(11, 0, 12, 14, 15, 15),
            Block.box(11, 0, 15, 14, 16, 16),
            Block.box(11, 0, 11, 14, 16, 12),
            Block.box(10, 0, 12, 11, 16, 15),
            Block.box(14, 0, 12, 15, 16, 15),
            Block.box(4, 0, 0, 12, 11, 14),
            Block.box(6, 0, 14, 10, 12, 15),
            Block.box(12, 0, 0, 13, 12, 11),
            Block.box(3, 0, 0, 4, 12, 11)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();


}
