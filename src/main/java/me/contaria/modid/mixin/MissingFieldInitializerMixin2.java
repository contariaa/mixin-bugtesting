package me.contaria.modid.mixin;

import me.contaria.modid.testing.TestAnnotation;
import me.contaria.modid.testing.TestClass2;
import org.spongepowered.asm.mixin.Debug;
import org.spongepowered.asm.mixin.Mixin;

@Debug(export = true)
@Mixin(TestClass2.class)
public abstract class MissingFieldInitializerMixin2 {
    private String test1 = "1";
    @TestAnnotation
    private String test2 = String.valueOf(2);
    private String test3 = "3";
}
