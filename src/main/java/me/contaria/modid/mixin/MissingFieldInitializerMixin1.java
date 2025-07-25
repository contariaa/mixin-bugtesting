package me.contaria.modid.mixin;

import me.contaria.modid.testing.TestAnnotation;
import me.contaria.modid.testing.TestClass1;
import org.spongepowered.asm.mixin.Debug;
import org.spongepowered.asm.mixin.Mixin;

@Debug(export = true)
@Mixin(TestClass1.class)
public abstract class MissingFieldInitializerMixin1 {
    // missing initializer
    private String test1 = "1";
    @TestAnnotation
    private String test2 = String.valueOf(2);
}
