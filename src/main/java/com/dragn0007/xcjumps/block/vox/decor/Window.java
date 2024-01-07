package com.dragn0007.xcjumps.block.vox.decor;

import com.dragn0007.xcjumps.block.rot.DecorRotator;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class Window extends DecorRotator {

    public Window() {
        super(NORTH, EAST, SOUTH, WEST);
    }

    public static final VoxelShape NORTH = Stream.of(
            Block.box(0, 0, 0, 16, 2, 2),
            Block.box(0, 2, 0, 2, 14, 2),
            Block.box(14, 2, 0, 16, 14, 2),
            Block.box(0, 14, 0, 16, 16, 2)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape EAST = Stream.of(
            Block.box(14, 0, 0, 16, 2, 16),
            Block.box(14, 2, 0, 16, 14, 2),
            Block.box(14, 2, 14, 16, 14, 16),
            Block.box(14, 14, 0, 16, 16, 16)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape SOUTH = Stream.of(
            Block.box(0, 0, 14, 16, 2, 16),
            Block.box(14, 2, 14, 16, 14, 16),
            Block.box(0, 2, 14, 2, 14, 16),
            Block.box(0, 14, 14, 16, 16, 16)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape WEST = Stream.of(
            Block.box(0, 0, 0, 2, 2, 16),
            Block.box(0, 2, 14, 2, 14, 16),
            Block.box(0, 2, 0, 2, 14, 2),
            Block.box(0, 14, 0, 2, 16, 16)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

}
