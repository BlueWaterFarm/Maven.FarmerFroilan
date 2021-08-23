package com.zipcodewilmington.froilansfarm.animals;


import com.zipcodewilmington.froilansfarm.Rideable;


public class Horse extends Animal implements Rideable {

    private boolean isBeingRidden = false;

    public String makeNoise() {
        return "neigh!";
    }

    public void move() {

    }

    @Override
    public boolean getIsBeingRidden() {
        return isBeingRidden;
    }

    @Override
    public void setIsBeingRidden(boolean isBeingRidden) {
        this.isBeingRidden = isBeingRidden;
    }
}
