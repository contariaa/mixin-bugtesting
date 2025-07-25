package me.contaria.modid.mixin;

import me.contaria.modid.MixinBugTesting;
import me.contaria.modid.testing.TestAnnotation;
import me.contaria.modid.testing.TestClass7;
import org.spongepowered.asm.mixin.Debug;
import org.spongepowered.asm.mixin.Mixin;

@Debug(export = true)
@Mixin(TestClass7.class)
public abstract class MissingFieldInitializerMixin7 {
    // missing initializer
    private String test1 = "1";
    @TestAnnotation
    private String test2 = MixinBugTesting.test;
}
