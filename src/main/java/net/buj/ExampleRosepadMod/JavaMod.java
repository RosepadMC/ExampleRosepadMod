package net.buj.ExampleRosepadMod;

import net.buj.rml.Environment;
import net.buj.rml.RosepadMod;

import java.util.Locale;

public class JavaMod extends RosepadMod {

    @Override
    public void pre(Environment environment) {
        System.out.println("Pre-init in " + environment.name().toLowerCase(Locale.ROOT) + " environment");
    }

    @Override
    public void init(Environment environment) {
        System.out.println("Init in " + environment.name().toLowerCase(Locale.ROOT) + " environment");
    }
}
