package net.slimefun.slimefunmod.item.custom;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.core.BlockPos;
import net.slimefun.slimefunmod.item.ModItems;

import java.util.Random;

public class GoldPan extends Item {
    public GoldPan(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        Level level = pContext.getLevel();
        BlockPos pos = pContext.getClickedPos();
        Block clickedBlock = level.getBlockState(pos).getBlock();

        if (clickedBlock == Blocks.GRAVEL) {
            if (!level.isClientSide()) {
                // Remove o bloco de Gravel
                level.setBlockAndUpdate(pos, Blocks.AIR.defaultBlockState());

                // Lista de itens possíveis
                Item[] dropList = new Item[]{
                        ModItems.SiftedOre.get(),
                        Items.IRON_NUGGET,
                        Items.FLINT,
                        Items.CLAY_BALL
                };

                // Escolhe um item aleatório
                Random random = new Random();
                int index = random.nextInt(dropList.length);
                ItemStack drop = new ItemStack(dropList[index]);

                // Dropar o item no mundo
                ItemEntity itemEntity = new ItemEntity(
                        level,
                        pos.getX() + 0.5,
                        pos.getY() + 1,
                        pos.getZ() + 0.5,
                        drop
                );
                level.addFreshEntity(itemEntity);
                level.playSound(null, pContext.getClickedPos(), SoundEvents.GRAVEL_BREAK, SoundSource.BLOCKS);
            }

            return InteractionResult.SUCCESS;
        }

        return InteractionResult.PASS;
    }
}
