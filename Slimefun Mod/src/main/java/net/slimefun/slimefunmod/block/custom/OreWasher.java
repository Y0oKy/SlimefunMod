package net.slimefun.slimefunmod.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.slimefun.slimefunmod.item.ModItems;
import net.slimefun.slimefunmod.util.TaskQueue;

public class OreWasher extends Block {

    public OreWasher(Properties properties) {
        super(properties);
    }

    @Override
    protected ItemInteractionResult useItemOn(
            ItemStack heldItem,
            BlockState state,
            Level level,
            BlockPos pos,
            Player player,
            InteractionHand hand,
            BlockHitResult hit
    ) {
        Item item = heldItem.getItem();

        if (item == ModItems.SiftedOre.get()) {
            if (!player.isCreative()) {
                heldItem.shrink(1); // consome apenas 1 gravel
            }

            // Som de interação (feedback imediato)
            level.playSound(null, pos, SoundEvents.BOAT_PADDLE_WATER, SoundSource.BLOCKS, 1.0F, 1.0F);

            // Adiciona tarefa independente (como TaskQueue no Bukkit)
            if (!level.isClientSide) {
                TaskQueue.schedule(60, () -> { // 20 ticks = 1 segundo delay
                    RandomSource random = level.getRandom();

                    Item[] dropList = new Item[]{
                            ModItems.Aluminum_Dust.get(),
                            ModItems.Copper_Dust.get(),
                            ModItems.Gold_Dust.get(),
                            ModItems.Iron_Dust.get(),
                            ModItems.Lead_Dust.get(),
                            ModItems.Magnesium_Dust.get(),
                            ModItems.Tin_Dust.get(),
                            ModItems.Silver_Dust.get(),
                            ModItems.Stone_Chunk.get(),
                            ModItems.Zinc_Dust.get()
                    };

// repete 3x
                    for (int i = 0; i < 3; i++) {
                        ItemStack drop = new ItemStack(dropList[random.nextInt(dropList.length)]);

                        ItemEntity itemEntity = new ItemEntity(
                                level,
                                pos.getX() + 0.5,
                                pos.getY() + 1,
                                pos.getZ() + 0.5,
                                drop
                        );
                        level.addFreshEntity(itemEntity);
                    }

                    level.playSound(null, pos, SoundEvents.ITEM_PICKUP, SoundSource.BLOCKS, 0.8F, 1.2F);
                });
            }

            return ItemInteractionResult.SUCCESS;
        }

        return ItemInteractionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
    }
}
