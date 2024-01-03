package com.dragn0007.xcjumps.block.vox.jumps;

import com.dragn0007.xcjumps.block.rot.DecorRotator;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class CastleMiddle extends DecorRotator {

    public CastleMiddle() {
        super(NORTH, EAST, SOUTH, WEST);
    }

    public static final VoxelShape NORTH = Stream.of(
            Block.box(0, 0, 4, 16, 11, 12),
            Block.box(0, 0, 12, 16, 12, 13),
            Block.box(0, 0, 3, 16, 12, 4)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape EAST = Stream.of(
            Block.box(4, 0, 0, 12, 11, 16),
            Block.box(3, 0, 0, 4, 12, 16),
            Block.box(12, 0, 0, 13, 12, 16)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape SOUTH = Stream.of(
            Block.box(0, 0, 4, 16, 11, 12),
            Block.box(0, 0, 12, 16, 12, 13),
            Block.box(0, 0, 3, 16, 12, 4)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape WEST = Stream.of(
            Block.box(4, 0, 0, 12, 11, 16),
            Block.box(3, 0, 0, 4, 12, 16),
            Block.box(12, 0, 0, 13, 12, 16)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();


}
