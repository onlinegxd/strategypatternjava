package com.lightspeed;

public class Main {

    public static void main(String[] args) {
	    Tracer tracer = new Tracer();
        Sombra sombra = new Sombra();

        tracer.useAbility1();
        tracer.useAbility2();
        tracer.useMovement();
        tracer.setMovement(new A());
        tracer.useMovement();

        sombra.useAbility1();
        sombra.useAbility2();
        sombra.useMovement();
        sombra.setMovement(new D());
        sombra.useMovement();
    }
}
