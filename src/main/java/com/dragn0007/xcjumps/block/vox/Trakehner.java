package com.dragn0007.xcjumps.block.vox;

import com.dragn0007.xcjumps.block.rot.DecorRotator;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class Trakehner extends DecorRotator {

    public Trakehner() {
        super(NORTH, EAST, SOUTH, WEST);
    }

    public static final VoxelShape NORTH = Stream.of(
            Block.box(-13.780000000000001, 0.020000000000000212, 5.58, -8.939999999999998, 21.799999999999997, 10.42),
            Block.box(24.939999999999998, 0.020000000000000212, 5.58, 29.78, 21.799999999999997, 10.42),
            Block.box(-13.780000000000001, -0.8296723497248117, 0.20341131181680527, 29.78, 2.8003276502751895, 5.043411311816806),
            Block.box(-13.780000000000001, -0.8296723497248117, 11.156588688183193, 29.78, 2.8003276502751895, 15.996588688183193),
            Block.box(-14.989999999999998, 19.379999999999995, 4.37, 30.99, 25.429999999999996, 11.629999999999999)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape EAST = Stream.of(
            Block.box(5.58, 0.020000000000000212, -13.780000000000001, 10.42, 21.799999999999997, -8.939999999999998),
            Block.box(5.58, 0.020000000000000212, 24.939999999999998, 10.42, 21.799999999999997, 29.78),
            Block.box(10.956588688183194, -0.8296723497248117, -13.780000000000001, 15.796588688183196, 2.8003276502751895, 29.78),
            Block.box(0.0034113118168068723, -0.8296723497248117, -13.780000000000001, 4.843411311816807, 2.8003276502751895, 29.78),
            Block.box(4.370000000000001, 19.379999999999995, -14.989999999999998, 11.629999999999999, 25.429999999999996, 30.99)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape SOUTH = Stream.of(
            Block.box(-13.780000000000001, 0.020000000000000212, 5.58, -8.939999999999998, 21.799999999999997, 10.42),
            Block.box(24.939999999999998, 0.020000000000000212, 5.58, 29.78, 21.799999999999997, 10.42),
            Block.box(-13.780000000000001, -0.8296723497248117, 0.20341131181680527, 29.78, 2.8003276502751895, 5.043411311816806),
            Block.box(-13.780000000000001, -0.8296723497248117, 11.156588688183193, 29.78, 2.8003276502751895, 15.996588688183193),
            Block.box(-14.989999999999998, 19.379999999999995, 4.37, 30.99, 25.429999999999996, 11.629999999999999)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape WEST = Stream.of(
            Block.box(5.58, 0.020000000000000212, -13.780000000000001, 10.42, 21.799999999999997, -8.939999999999998),
            Block.box(5.58, 0.020000000000000212, 24.939999999999998, 10.42, 21.799999999999997, 29.78),
            Block.box(10.956588688183194, -0.8296723497248117, -13.780000000000001, 15.796588688183196, 2.8003276502751895, 29.78),
            Block.box(0.0034113118168068723, -0.8296723497248117, -13.780000000000001, 4.843411311816807, 2.8003276502751895, 29.78),
            Block.box(4.370000000000001, 19.379999999999995, -14.989999999999998, 11.629999999999999, 25.429999999999996, 30.99)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();


}