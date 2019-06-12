package com.company;

public class City {

    private String name;
    private int population;

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }                                           //getters/setters
                                                //  &
    public String getName() {                   // constructor
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
