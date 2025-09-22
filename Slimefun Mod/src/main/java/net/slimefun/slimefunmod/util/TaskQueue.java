package net.slimefun.slimefunmod.util;

import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.LinkedList;
import java.util.Queue;

@Mod.EventBusSubscriber
public class TaskQueue {
    private static final Queue<ScheduledTask> tasks = new LinkedList<>();

    public static void schedule(int delayTicks, Runnable action) {
        tasks.add(new ScheduledTask(delayTicks, action));
    }

    @SubscribeEvent
    public static void onServerTick(TickEvent.ServerTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            tasks.removeIf(ScheduledTask::tick);
        }
    }

    private static class ScheduledTask {
        private int ticksRemaining;
        private final Runnable action;

        ScheduledTask(int delayTicks, Runnable action) {
            this.ticksRemaining = delayTicks;
            this.action = action;
        }

        // retorna true quando terminar
        boolean tick() {
            if (--ticksRemaining <= 0) {
                action.run();
                return true;
            }
            return false;
        }
    }
}
