package com.dragn0007.xcjumps.block.vox.jumps;

import com.dragn0007.xcjumps.block.rot.DecorRotator;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class Basket extends DecorRotator {

    public Basket() {
        super(NORTH, EAST, SOUTH, WEST);
    }

    public static final VoxelShape NORTH = Stream.of(
            Block.box(-16, 0, 0, 32, 16, 2),
            Block.box(-16, 0, 14, 32, 16, 16),
            Block.box(30, 0, 2, 32, 16, 14),
            Block.box(-16, 0, 2, -14, 16, 14),
            Block.box(-14, 0, 2, 30, 18, 14),
            Block.box(-3, 0, -3, 0, 32, 0),
            Block.box(0, 16, -2, 29, 19, -1),
            Block.box(29, 0, -3, 32, 32, 0)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape EAST = Stream.of(
            Block.box(14, 0, -16, 16, 16, 32),
            Block.box(0, 0, -16, 2, 16, 32),
            Block.box(2, 0, 30, 14, 16, 32),
            Block.box(2, 0, -16, 14, 16, -14),
            Block.box(2, 0, -14, 14, 18, 30),
            Block.box(16, 0, -3, 19, 32, 0),
            Block.box(17, 16, 0, 18, 19, 29),
            Block.box(16, 0, 29, 19, 32, 32)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape SOUTH = Stream.of(
            Block.box(-16, 0, 14, 32, 16, 16),
            Block.box(-16, 0, 0, 32, 16, 2),
            Block.box(-16, 0, 2, -14, 16, 14),
            Block.box(30, 0, 2, 32, 16, 14),
            Block.box(-14, 0, 2, 30, 18, 14),
            Block.box(16, 0, 16, 19, 32, 19),
            Block.box(-13, 16, 17, 16, 19, 18),
            Block.box(-16, 0, 16, -13, 32, 19)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape WEST = Stream.of(
            Block.box(0, 0, -16, 2, 16, 32),
            Block.box(14, 0, -16, 16, 16, 32),
            Block.box(2, 0, -16, 14, 16, -14),
            Block.box(2, 0, 30, 14, 16, 32),
            Block.box(2, 0, -14, 14, 18, 30),
            Block.box(-3, 0, 16, 0, 32, 19),
            Block.box(-2, 16, -13, -1, 19, 16),
            Block.box(-3, 0, -16, 0, 32, -13)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();


}
