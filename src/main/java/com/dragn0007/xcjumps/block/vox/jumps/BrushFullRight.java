package com.dragn0007.xcjumps.block.vox.jumps;

import com.dragn0007.xcjumps.block.rot.DecorRotator;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class BrushFullRight extends DecorRotator {

    public BrushFullRight() {
        super(NORTH, EAST, SOUTH, WEST);
    }

    public static final VoxelShape NORTH = Stream.of(
            Block.box(0, 9, 4, 16, 11, 12),
            Block.box(0, 25, 6, 16, 30, 10),
            Block.box(0, 25, 10, 16, 27, 12),
            Block.box(0, 25, 4, 16, 27, 6),
            Block.box(0, 23, 4, 16, 25, 12),
            Block.box(0, 11, 4, 16, 13, 6),
            Block.box(0, 11, 10, 16, 13, 12),
            Block.box(-2, 0, 3.9000000000000004, 0, 17, 12.1),
            Block.box(-1.8999999999999986, 15, 4, -0.10000000000000142, 32, 12),
            Block.box(0, 11, 6, 16, 16, 10)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape EAST = Stream.of(
            Block.box(4, 9, 0, 12, 11, 16),
            Block.box(6, 25, 0, 10, 30, 16),
            Block.box(4, 25, 0, 6, 27, 16),
            Block.box(10, 25, 0, 12, 27, 16),
            Block.box(4, 23, 0, 12, 25, 16),
            Block.box(10, 11, 0, 12, 13, 16),
            Block.box(4, 11, 0, 6, 13, 16),
            Block.box(3.9000000000000004, 0, -2, 12.1, 17, 0),
            Block.box(4, 15, -1.8999999999999986, 12, 32, -0.10000000000000142),
            Block.box(6, 11, 0, 10, 16, 16)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape SOUTH = Stream.of(
            Block.box(0, 9, 4, 16, 11, 12),
            Block.box(0, 25, 6, 16, 30, 10),
            Block.box(0, 25, 4, 16, 27, 6),
            Block.box(0, 25, 10, 16, 27, 12),
            Block.box(0, 23, 4, 16, 25, 12),
            Block.box(0, 11, 10, 16, 13, 12),
            Block.box(0, 11, 4, 16, 13, 6),
            Block.box(16, 0, 3.9000000000000004, 18, 17, 12.1),
            Block.box(16.1, 15, 4, 17.9, 32, 12),
            Block.box(0, 11, 6, 16, 16, 10)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape WEST = Stream.of(
            Block.box(4, 9, 0, 12, 11, 16),
            Block.box(6, 25, 0, 10, 30, 16),
            Block.box(10, 25, 0, 12, 27, 16),
            Block.box(4, 25, 0, 6, 27, 16),
            Block.box(4, 23, 0, 12, 25, 16),
            Block.box(4, 11, 0, 6, 13, 16),
            Block.box(10, 11, 0, 12, 13, 16),
            Block.box(3.9000000000000004, 0, 16, 12.1, 17, 18),
            Block.box(4, 15, 16.1, 12, 32, 17.9),
            Block.box(6, 11, 0, 10, 16, 16)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();


}
