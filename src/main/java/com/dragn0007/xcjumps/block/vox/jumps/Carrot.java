package com.dragn0007.xcjumps.block.vox.jumps;

import com.dragn0007.xcjumps.block.rot.DecorRotator;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class Carrot extends DecorRotator {

    public Carrot() {
        super(NORTH, EAST, SOUTH, WEST);
    }

    public static final VoxelShape NORTH = Stream.of(
            Block.box(20, 0, 2, 32, 12, 14),
            Block.box(7, 1, 3, 20, 11, 13),
            Block.box(-6, 2, 4, 7, 10, 12),
            Block.box(-16, 3, 5, -6, 9, 11),
            Block.box(-14, 2, 4, -12, 6, 12),
            Block.box(-14, 0, 5, -12, 2, 11)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape EAST = Stream.of(
            Block.box(2, 0, 20, 14, 12, 32),
            Block.box(3, 1, 7, 13, 11, 20),
            Block.box(4, 2, -6, 12, 10, 7),
            Block.box(5, 3, -16, 11, 9, -6),
            Block.box(4, 2, -14, 12, 6, -12),
            Block.box(5, 0, -14, 11, 2, -12)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape SOUTH = Stream.of(
            Block.box(-16, 0, 2, -4, 12, 14),
            Block.box(-4, 1, 3, 9, 11, 13),
            Block.box(9, 2, 4, 22, 10, 12),
            Block.box(22, 3, 5, 32, 9, 11),
            Block.box(28, 2, 4, 30, 6, 12),
            Block.box(28, 0, 5, 30, 2, 11)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape WEST = Stream.of(
            Block.box(2, 0, -16, 14, 12, -4),
            Block.box(3, 1, -4, 13, 11, 9),
            Block.box(4, 2, 9, 12, 10, 22),
            Block.box(5, 3, 22, 11, 9, 32),
            Block.box(4, 2, 28, 12, 6, 30),
            Block.box(5, 0, 28, 11, 2, 30)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();


}
