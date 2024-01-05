package com.dragn0007.xcjumps.block.vox.decor;

import com.dragn0007.xcjumps.block.rot.DecorRotator;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class WallMedal extends DecorRotator {

    public WallMedal() {
        super(NORTH, EAST, SOUTH, WEST);
    }

    public static final VoxelShape NORTH = Stream.of(
            Block.box(7.3, 12, 13, 8.700000000000001, 13, 15),
            Block.box(6.299999999999999, 11, 15, 9.700000000000001, 14, 16),
            Block.box(7.3, 13, 13, 8.7, 14, 14)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape EAST = Stream.of(
            Block.box(1, 12, 7.3, 3, 13, 8.700000000000001),
            Block.box(0, 11, 6.299999999999999, 1, 14, 9.700000000000001),
            Block.box(2, 13, 7.3, 3, 14, 8.7)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape SOUTH = Stream.of(
            Block.box(7.299999999999999, 12, 1, 8.7, 13, 3),
            Block.box(6.299999999999999, 11, 0, 9.700000000000001, 14, 1),
            Block.box(7.300000000000001, 13, 2, 8.7, 14, 3)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape WEST = Stream.of(
            Block.box(13, 12, 7.299999999999999, 15, 13, 8.7),
            Block.box(15, 11, 6.299999999999999, 16, 14, 9.700000000000001),
            Block.box(13, 13, 7.300000000000001, 14, 14, 8.7)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

}
