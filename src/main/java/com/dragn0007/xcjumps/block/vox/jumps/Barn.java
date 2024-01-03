package com.dragn0007.xcjumps.block.vox.jumps;

import com.dragn0007.xcjumps.block.rot.DecorRotator;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class Barn extends DecorRotator {

    public Barn() {
        super(NORTH, EAST, SOUTH, WEST);
    }

    public static final VoxelShape NORTH = Stream.of(
            Block.box(-15.75, 0, 3, 31.75, 10, 13),
            Block.box(-15.95, 9, 3, 31.95, 10, 13),
            Block.box(-15.875, 10, 4, 31.875, 11, 12),
            Block.box(-15.875, 11, 5, 31.875, 12, 11),
            Block.box(-15.875, 12, 6, 31.875, 13, 10),
            Block.box(-15.875, 13, 7, 31.875, 14, 9)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape EAST = Stream.of(
            Block.box(3, 0, -15.75, 13, 10, 31.75),
            Block.box(3, 9, -15.95, 13, 10, 31.95),
            Block.box(4, 10, -15.875, 12, 11, 31.875),
            Block.box(5, 11, -15.875, 11, 12, 31.875),
            Block.box(6, 12, -15.875, 10, 13, 31.875),
            Block.box(7, 13, -15.875, 9, 14, 31.875)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape SOUTH = Stream.of(
            Block.box(-15.75, 0, 3, 31.75, 10, 13),
            Block.box(-15.95, 9, 3, 31.95, 10, 13),
            Block.box(-15.875, 10, 4, 31.875, 11, 12),
            Block.box(-15.875, 11, 5, 31.875, 12, 11),
            Block.box(-15.875, 12, 6, 31.875, 13, 10),
            Block.box(-15.875, 13, 7, 31.875, 14, 9)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape WEST = Stream.of(
            Block.box(3, 0, -15.75, 13, 10, 31.75),
            Block.box(3, 9, -15.95, 13, 10, 31.95),
            Block.box(4, 10, -15.875, 12, 11, 31.875),
            Block.box(5, 11, -15.875, 11, 12, 31.875),
            Block.box(6, 12, -15.875, 10, 13, 31.875),
            Block.box(7, 13, -15.875, 9, 14, 31.875)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();


}
