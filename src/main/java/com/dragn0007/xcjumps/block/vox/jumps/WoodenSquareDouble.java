package com.dragn0007.xcjumps.block.vox.jumps;

import com.dragn0007.xcjumps.block.rot.DecorRotator;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class WoodenSquareDouble extends DecorRotator {

    public WoodenSquareDouble() {
        super(NORTH, EAST, SOUTH, WEST);
    }

    public static final VoxelShape NORTH = Stream.of(
            Block.box(0, 17, 1, 16, 29, 2),
            Block.box(1, 17, 2, 15, 28, 14),
            Block.box(0, 28, 2, 16, 29.5, 14),
            Block.box(0, 17, 14, 16, 29, 15),
            Block.box(0, 26, 0, 16, 28, 1),
            Block.box(0, 26, 15, 16, 28, 16),
            Block.box(0, 23, 0, 16, 25, 1),
            Block.box(0, 23, 15, 16, 25, 16),
            Block.box(0, 20, 0, 16, 22, 1),
            Block.box(0, 20, 15, 16, 22, 16),
            Block.box(0, 17, 0, 16, 19, 1),
            Block.box(0, 17, 15, 16, 19, 16),
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
            Block.box(14, 17, 0, 15, 29, 16),
            Block.box(2, 17, 1, 14, 28, 15),
            Block.box(2, 28, 0, 14, 29.5, 16),
            Block.box(1, 17, 0, 2, 29, 16),
            Block.box(15, 26, 0, 16, 28, 16),
            Block.box(0, 26, 0, 1, 28, 16),
            Block.box(15, 23, 0, 16, 25, 16),
            Block.box(0, 23, 0, 1, 25, 16),
            Block.box(15, 20, 0, 16, 22, 16),
            Block.box(0, 20, 0, 1, 22, 16),
            Block.box(15, 17, 0, 16, 19, 16),
            Block.box(0, 17, 0, 1, 19, 16),
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
            Block.box(0, 17, 1, 16, 29, 2),
            Block.box(1, 17, 2, 15, 28, 14),
            Block.box(0, 28, 2, 16, 29.5, 14),
            Block.box(0, 17, 14, 16, 29, 15),
            Block.box(0, 26, 0, 16, 28, 1),
            Block.box(0, 26, 15, 16, 28, 16),
            Block.box(0, 23, 0, 16, 25, 1),
            Block.box(0, 23, 15, 16, 25, 16),
            Block.box(0, 20, 0, 16, 22, 1),
            Block.box(0, 20, 15, 16, 22, 16),
            Block.box(0, 17, 0, 16, 19, 1),
            Block.box(0, 17, 15, 16, 19, 16),
            Block.box(0, 2, 0, 2, 15, 2),
            Block.box(0, 2, 14, 2, 15, 16),
            Block.box(14, 0, -1, 16, 2, 17),
            Block.box(14, 15, -1, 16, 17, 17),
            Block.box(14, 2, 0, 16, 15, 2),
            Block.box(14, 2, 14, 16, 15, 16),
            Block.box(0, 0, -1, 2, 2, 17),
            Block.box(0, 15, -1, 2, 17, 17)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape WEST = Stream.of(
            Block.box(14, 17, 0, 15, 29, 16),
            Block.box(2, 17, 1, 14, 28, 15),
            Block.box(2, 28, 0, 14, 29.5, 16),
            Block.box(1, 17, 0, 2, 29, 16),
            Block.box(15, 26, 0, 16, 28, 16),
            Block.box(0, 26, 0, 1, 28, 16),
            Block.box(15, 23, 0, 16, 25, 16),
            Block.box(0, 23, 0, 1, 25, 16),
            Block.box(15, 20, 0, 16, 22, 16),
            Block.box(0, 20, 0, 1, 22, 16),
            Block.box(15, 17, 0, 16, 19, 16),
            Block.box(0, 17, 0, 1, 19, 16),
            Block.box(14, 2, 0, 16, 15, 2),
            Block.box(0, 2, 0, 2, 15, 2),
            Block.box(-1, 0, 14, 17, 2, 16),
            Block.box(-1, 15, 14, 17, 17, 16),
            Block.box(14, 2, 14, 16, 15, 16),
            Block.box(0, 2, 14, 2, 15, 16),
            Block.box(-1, 0, 0, 17, 2, 2),
            Block.box(-1, 15, 0, 17, 17, 2)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();


}
