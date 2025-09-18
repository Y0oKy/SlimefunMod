package net.slimefun.slimefunmod.item.custom;

import net.minecraft.core.BlockPos;
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
import net.slimefun.slimefunmod.item.ModItems;

import java.util.Random;

public class NetherGoldPan extends Item {
    public NetherGoldPan(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        Level level = pContext.getLevel();
        BlockPos pos = pContext.getClickedPos();
        Block clickedBlock = level.getBlockState(pos).getBlock();

        if (clickedBlock == Blocks.SOUL_SAND||clickedBlock == Blocks.SOUL_SOIL) {
            if (!level.isClientSide()) {
                // Remove o bloco de Gravel
                level.setBlockAndUpdate(pos, Blocks.AIR.defaultBlockState());

                // Lista de itens possíveis
                Item[] dropList = new Item[]{
                        Items.GHAST_TEAR,
                        Items.GOLD_NUGGET,
                        Items.BLAZE_POWDER,
                        Items.QUARTZ
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
                level.playSound(null, pContext.getClickedPos(), SoundEvents.SOUL_SAND_BREAK, SoundSource.BLOCKS);
            }

            return InteractionResult.SUCCESS;
        }

        return InteractionResult.PASS;
    }
}
