package com.gmb.goingtothemoonandbeyond;


import javafx.scene.Node;

public class ShipSprite extends Sprite {
    boolean isAlive = true;
    String description;

    public ShipSprite(Node view, String description) {
        super(view);
        this.description = description;
    }

    public ShipSprite(Node view, PVector location, String description) {
        super(view, location);
        this.description = description;
    }

    public ShipSprite(Node view, PVector location, PVector velocity, String description) {
        super(view, location, velocity);
        this.description = description;
    }

    public ShipSprite(Node view, PVector location, PVector velocity, PVector acceleration, String description) {
        super(view, location, velocity, acceleration);
        this.description = description;
    }

    public ShipSprite(Node view, PVector location, PVector velocity, PVector acceleration, double mass, String description) {
        super(view, location, velocity, acceleration, mass);
        this.description = description;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

