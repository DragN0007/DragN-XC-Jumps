package com.dragn0007.xcjumps.block.vox.jumps;

import com.dragn0007.xcjumps.block.rot.DecorRotator;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class Cliff extends DecorRotator {

    public Cliff() {
        super(NORTH, EAST, SOUTH, WEST);
    }

    public static final VoxelShape NORTH = Stream.of(
            Block.box(-16, 0, -2, 32, 2, 24),
            Block.box(29, 2, -1, 31, 8, 22),
            Block.box(29, 8, -1, 31, 11, 20),
            Block.box(-15, 2, -1, -13, 8, 22),
            Block.box(7, -16, -1, 9, 13, 1),
            Block.box(29, -16, -1, 31, 0, 1),
            Block.box(-15, -16, -1, -13, 0, 1),
            Block.box(-15, 11, -1, -13, 13, 18),
            Block.box(-15, 8, -1, -13, 11, 20),
            Block.box(29, 11, -1, 31, 13, 18),
            Block.box(29, 13, 1, 31, 15, 15),
            Block.box(-15, 13, 1, -13, 15, 15),
            Block.box(-16, 2, 22, 32, 8, 24),
            Block.box(-16, 7.999999999999998, 20, 32, 10.999999999999993, 22),
            Block.box(-16, 10.999999999999993, 18, 32, 12.99999999999999, 20),
            Block.box(-16, 12.99999999999999, 15, 32, 14.99999999999999, 18),
            Block.box(-16, 14.99999999999999, 1, 32, 16.999999999999986, 15),
            Block.box(-16, 12.99999999999999, -2, 32, 14.999999999999988, 1)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape EAST = Stream.of(
            Block.box(-8, 0, -16, 18, 2, 32),
            Block.box(-6, 2, 29, 17, 8, 31),
            Block.box(-4, 8, 29, 17, 11, 31),
            Block.box(-6, 2, -15, 17, 8, -13),
            Block.box(15, -16, 7, 17, 13, 9),
            Block.box(15, -16, 29, 17, 0, 31),
            Block.box(15, -16, -15, 17, 0, -13),
            Block.box(-2, 11, -15, 17, 13, -13),
            Block.box(-4, 8, -15, 17, 11, -13),
            Block.box(-2, 11, 29, 17, 13, 31),
            Block.box(1, 13, 29, 15, 15, 31),
            Block.box(1, 13, -15, 15, 15, -13),
            Block.box(-8, 2, -16, -6, 8, 32),
            Block.box(-6, 7.999999999999998, -16, -4, 10.999999999999993, 32),
            Block.box(-4, 10.999999999999993, -16, -2, 12.99999999999999, 32),
            Block.box(-2, 12.99999999999999, -16, 1, 14.99999999999999, 32),
            Block.box(1, 14.99999999999999, -16, 15, 16.999999999999986, 32),
            Block.box(15, 12.99999999999999, -16, 18, 14.999999999999988, 32)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape SOUTH = Stream.of(
            Block.box(-16, 0, -8, 32, 2, 18),
            Block.box(-15, 2, -6, -13, 8, 17),
            Block.box(-15, 8, -4, -13, 11, 17),
            Block.box(29, 2, -6, 31, 8, 17),
            Block.box(7, -16, 15, 9, 13, 17),
            Block.box(-15, -16, 15, -13, 0, 17),
            Block.box(29, -16, 15, 31, 0, 17),
            Block.box(29, 11, -2, 31, 13, 17),
            Block.box(29, 8, -4, 31, 11, 17),
            Block.box(-15, 11, -2, -13, 13, 17),
            Block.box(-15, 13, 1, -13, 15, 15),
            Block.box(29, 13, 1, 31, 15, 15),
            Block.box(-16, 2, -8, 32, 8, -6),
            Block.box(-16, 7.999999999999998, -6, 32, 10.999999999999993, -4),
            Block.box(-16, 10.999999999999993, -4, 32, 12.99999999999999, -2),
            Block.box(-16, 12.99999999999999, -2, 32, 14.99999999999999, 1),
            Block.box(-16, 14.99999999999999, 1, 32, 16.999999999999986, 15),
            Block.box(-16, 12.99999999999999, 15, 32, 14.999999999999988, 18)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape WEST = Stream.of(
            Block.box(-2, 0, -16, 24, 2, 32),
            Block.box(-1, 2, -15, 22, 8, -13),
            Block.box(-1, 8, -15, 20, 11, -13),
            Block.box(-1, 2, 29, 22, 8, 31),
            Block.box(-1, -16, 7, 1, 13, 9),
            Block.box(-1, -16, -15, 1, 0, -13),
            Block.box(-1, -16, 29, 1, 0, 31),
            Block.box(-1, 11, 29, 18, 13, 31),
            Block.box(-1, 8, 29, 20, 11, 31),
            Block.box(-1, 11, -15, 18, 13, -13),
            Block.box(1, 13, -15, 15, 15, -13),
            Block.box(1, 13, 29, 15, 15, 31),
            Block.box(22, 2, -16, 24, 8, 32),
            Block.box(20, 7.999999999999998, -16, 22, 10.999999999999993, 32),
            Block.box(18, 10.999999999999993, -16, 20, 12.99999999999999, 32),
            Block.box(15, 12.99999999999999, -16, 18, 14.99999999999999, 32),
            Block.box(1, 14.99999999999999, -16, 15, 16.999999999999986, 32),
            Block.box(-2, 12.99999999999999, -16, 1, 14.999999999999988, 32)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();


}
