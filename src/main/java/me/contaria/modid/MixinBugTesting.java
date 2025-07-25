package me.contaria.modid;

import me.contaria.modid.testing.*;
import net.fabricmc.api.ModInitializer;

public class MixinBugTesting implements ModInitializer {
    public static String test = "test";

    @Override
    public void onInitialize() {
        TestClass1.init();
        TestClass2.init();
        TestClass3.init();
        TestClass4.init();
        TestClass5.init();
        TestClass6.init();
        TestClass7.init();
    }
}
