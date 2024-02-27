package co.edu.uptc.models;

import java.io.Serializable;

// Se declara una clase Animal que implementa la interfaz Serializable indicando
// que dicho objeto es serializable

public class Animal implements Serializable {

    private String name;
    private int weight;

    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animals [name=" + name + ", weight=" + weight + "]";
    }

}
