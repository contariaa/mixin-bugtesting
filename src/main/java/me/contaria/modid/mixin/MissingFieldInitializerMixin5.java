package me.contaria.modid.mixin;

import me.contaria.modid.testing.TestAnnotation;
import me.contaria.modid.testing.TestClass5;
import org.spongepowered.asm.mixin.Debug;
import org.spongepowered.asm.mixin.Mixin;

@Debug(export = true)
@Mixin(TestClass5.class)
public abstract class MissingFieldInitializerMixin5 {
    // missing initializer
    private String test1 = "1";
    // missing initializer
    private String test2 = String.valueOf(2);
    @TestAnnotation
    private String test3 = String.valueOf(3);
}
