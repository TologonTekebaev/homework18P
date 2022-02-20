package com.company;

import java.util.Arrays;

public class Farm extends DomesticAnimals {
    private String address;
    private Cow[] cows;
    private Horse[] horses;
    private Sheep[] sheep;
    private String OwnerName;

    public Farm() {

    }

    public Farm(String address, Cow[] cows, Horse[] horses, Sheep[] sheeps, String ownerName) {
        this.address = address;
        this.cows = cows;
        this.horses = horses;
        this.sheep = sheeps;
        OwnerName = ownerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "address='" + address + '\'' +
                ", cows=" + Arrays.toString(cows) +
                ", horses=" + Arrays.toString(horses) +
                ", sheeps=" + Arrays.toString(sheep) +
                ", OwnerName='" + OwnerName + '\''
                + Arrays.toString(cows) +"\n"+
                Arrays.toString(sheep) +"\n"+
                Arrays.toString(horses)+"\n";
    }
}
