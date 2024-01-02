package com.mercurows.fast_projectile_fix;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(FastProjectileFix.MODID)
public class FastProjectileFix {
    public static final String MODID = "fast_projectile_fix";

    public FastProjectileFix() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
