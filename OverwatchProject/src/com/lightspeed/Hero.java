package com.lightspeed;

public abstract class Hero {
    private Ability ability1;
    private Ability ability2;
    private Movement movement;

    public Hero(Ability ability1, Ability ability2, Movement movement) {
        this.ability1 = ability1;
        this.ability2 = ability2;
        this.movement = movement;
    }

    public void useAbility1() {
        ability1.useAbility();
    }
    public void useAbility2() {
        ability2.useAbility();
    }
    public void useMovement() {
        movement.move();
    }

    public void setAbility1(Ability ability1) {
        this.ability1 = ability1;
    }

    public void setAbility2(Ability ability2) {
        this.ability2 = ability2;
    }

    public void setMovement(Movement movement) {
        this.movement = movement;
    }
}
