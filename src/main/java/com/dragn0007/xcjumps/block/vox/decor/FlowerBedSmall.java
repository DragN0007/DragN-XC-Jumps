package com.dragn0007.xcjumps.block.vox.decor;

import com.dragn0007.xcjumps.block.rot.DecorRotator;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class FlowerBedSmall extends DecorRotator {

    public FlowerBedSmall() {
        super(NORTH, EAST, SOUTH, WEST);
    }

    public static final VoxelShape NORTH = Stream.of(
            Block.box(0.0031999999999996476, 0, 5.3344, 15.9968, 5.3312, 6.0008),
            Block.box(0.0031999999999996476, 0, 9.999199999999998, 15.9968, 5.3312, 10.665600000000001),
            Block.box(15.330400000000001, 0, 6.0008, 15.9968, 5.3312, 9.999199999999998),
            Block.box(0.0031999999999996476, 0, 6.0008, 0.6696, 5.3312, 9.999199999999998),
            Block.box(0.6696, 0, 6.0008, 15.330400000000001, 5.9976, 9.999199999999998)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape EAST = Stream.of(
            Block.box(9.9992, 0, 0.0031999999999996476, 10.665600000000001, 5.3312, 15.9968),
            Block.box(5.334399999999999, 0, 0.0031999999999996476, 6.000800000000002, 5.3312, 15.9968),
            Block.box(6.000800000000002, 0, 15.330400000000001, 9.9992, 5.3312, 15.9968),
            Block.box(6.000800000000002, 0, 0.0031999999999996476, 9.9992, 5.3312, 0.6696),
            Block.box(6.000800000000002, 0, 0.6696, 9.9992, 5.9976, 15.330400000000001)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape SOUTH = Stream.of(
            Block.box(0.0031999999999996476, 0, 5.3344, 15.9968, 5.3312, 6.0008),
            Block.box(0.0031999999999996476, 0, 9.999199999999998, 15.9968, 5.3312, 10.665600000000001),
            Block.box(15.330400000000001, 0, 6.0008, 15.9968, 5.3312, 9.999199999999998),
            Block.box(0.0031999999999996476, 0, 6.0008, 0.6696, 5.3312, 9.999199999999998),
            Block.box(0.6696, 0, 6.0008, 15.330400000000001, 5.9976, 9.999199999999998)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape WEST = Stream.of(
            Block.box(9.9992, 0, 0.0031999999999996476, 10.665600000000001, 5.3312, 15.9968),
            Block.box(5.334399999999999, 0, 0.0031999999999996476, 6.000800000000002, 5.3312, 15.9968),
            Block.box(6.000800000000002, 0, 15.330400000000001, 9.9992, 5.3312, 15.9968),
            Block.box(6.000800000000002, 0, 0.0031999999999996476, 9.9992, 5.3312, 0.6696),
            Block.box(6.000800000000002, 0, 0.6696, 9.9992, 5.9976, 15.330400000000001)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();


}
