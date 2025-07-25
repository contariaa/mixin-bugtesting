package me.contaria.modid.mixin;

import me.contaria.modid.testing.TestAnnotation;
import me.contaria.modid.testing.TestClass3;
import org.spongepowered.asm.mixin.Debug;
import org.spongepowered.asm.mixin.Mixin;

@Debug(export = true)
@Mixin(TestClass3.class)
public abstract class MissingFieldInitializerMixin3 {
    private String test1 = "1";
    private String test2 = String.valueOf(2);
    @TestAnnotation
    private String test3 = "3";
}
