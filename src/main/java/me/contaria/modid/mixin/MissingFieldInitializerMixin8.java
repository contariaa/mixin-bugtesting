package me.contaria.modid.mixin;

import me.contaria.modid.testing.TestAnnotation;
import me.contaria.modid.testing.TestClass8;
import org.spongepowered.asm.mixin.Debug;
import org.spongepowered.asm.mixin.Mixin;

@Debug(export = true)
@Mixin(TestClass8.class)
public abstract class MissingFieldInitializerMixin8 {
    // missing initializer
    private String test1 = "1";
    @TestAnnotation
    private Object test2 = new Object();
}
