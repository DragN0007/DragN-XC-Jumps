package com.dragn0007.xcjumps.block.vox.jumps;

import com.dragn0007.xcjumps.block.rot.DecorRotator;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class SlantBush extends DecorRotator {

    public SlantBush() {
        super(NORTH, EAST, SOUTH, WEST);
    }

    public static final VoxelShape NORTH = Stream.of(
            Block.box(-10, 0, -16, -6, 24, 32),
            Block.box(-6, 0, -16, -2, 22, 32),
            Block.box(-2, 0, -16, 2, 20, 32),
            Block.box(2, 0, -16, 6, 18, 32),
            Block.box(6, 0, -16, 10, 16, 32),
            Block.box(10, 0, -16, 14, 14, 32),
            Block.box(14, 0, -16, 18, 12, 32),
            Block.box(18, 0, -16, 26, 10, 32),
            Block.box(6, 14, -8, 12, 24, 24),
            Block.box(-6, 20, -12, 1, 32, 28),
            Block.box(19, 10, -5, 24, 16, 21)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape EAST = Stream.of(
            Block.box(-10, 0, -16, -6, 24, 32),
            Block.box(-6, 0, -16, -2, 22, 32),
            Block.box(-2, 0, -16, 2, 20, 32),
            Block.box(2, 0, -16, 6, 18, 32),
            Block.box(6, 0, -16, 10, 16, 32),
            Block.box(10, 0, -16, 14, 14, 32),
            Block.box(14, 0, -16, 18, 12, 32),
            Block.box(18, 0, -16, 26, 10, 32),
            Block.box(6, 14, -8, 12, 24, 24),
            Block.box(-6, 20, -12, 1, 32, 28),
            Block.box(19, 10, -5, 24, 16, 21)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape SOUTH = Stream.of(
            Block.box(-16, 0, -10, 32, 24, -6),
            Block.box(-16, 0, -6, 32, 22, -2),
            Block.box(-16, 0, -2, 32, 20, 2),
            Block.box(-16, 0, 2, 32, 18, 6),
            Block.box(-16, 0, 6, 32, 16, 10),
            Block.box(-16, 0, 10, 32, 14, 14),
            Block.box(-16, 0, 14, 32, 12, 18),
            Block.box(-16, 0, 18, 32, 10, 26),
            Block.box(-8, 14, 6, 24, 24, 12),
            Block.box(-12, 20, -6, 28, 32, 1),
            Block.box(-5, 10, 19, 21, 16, 24)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape WEST = Stream.of(
            Block.box(22, 0, -16, 26, 24, 32),
            Block.box(18, 0, -16, 22, 22, 32),
            Block.box(14, 0, -16, 18, 20, 32),
            Block.box(10, 0, -16, 14, 18, 32),
            Block.box(6, 0, -16, 10, 16, 32),
            Block.box(2, 0, -16, 6, 14, 32),
            Block.box(-2, 0, -16, 2, 12, 32),
            Block.box(-10, 0, -16, -2, 10, 32),
            Block.box(4, 14, -8, 10, 24, 24),
            Block.box(15, 20, -12, 22, 32, 28),
            Block.box(-8, 10, -5, -3, 16, 21)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();


}
