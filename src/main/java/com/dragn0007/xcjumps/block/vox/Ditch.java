package com.dragn0007.xcjumps.block.vox;

import com.dragn0007.xcjumps.block.rot.DecorRotator;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class Ditch extends DecorRotator {

    public Ditch() {
        super(NORTH, EAST, SOUTH, WEST);
    }

    public static final VoxelShape NORTH = Stream.of(
            Block.box(-14.989999999999998, 0.07999999999999544, 16.069999999999997, 30.99, 6.129999999999997, 23.329999999999995),
            Block.box(-14.989999999999998, 0.07999999999999544, -7.330000000000002, 30.99, 6.129999999999997, -0.07000000000000531)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape EAST = Stream.of(
            Block.box(-7.329999999999998, 0.07999999999999544, -14.990000000000002, -0.07000000000000028, 6.129999999999997, 30.989999999999995),
            Block.box(16.07, 0.07999999999999544, -14.990000000000002, 23.33, 6.129999999999997, 30.989999999999995)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape SOUTH = Stream.of(
            Block.box(-14.989999999999998, 0.07999999999999544, 16.069999999999997, 30.99, 6.129999999999997, 23.329999999999995),
            Block.box(-14.989999999999998, 0.07999999999999544, -7.330000000000002, 30.99, 6.129999999999997, -0.07000000000000531)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape WEST = Stream.of(
            Block.box(-7.329999999999998, 0.07999999999999544, -14.990000000000002, -0.07000000000000028, 6.129999999999997, 30.989999999999995),
            Block.box(16.07, 0.07999999999999544, -14.990000000000002, 23.33, 6.129999999999997, 30.989999999999995)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();


}
