package ru.mirea.labs.lab4.task1;

public class Circle {
    private int radius;
    private float metallic, roughness;

    public Circle(int radius, float metallic, float roughness) {
        this.radius = radius;
        this.metallic = metallic;
        this.roughness = roughness;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getMetallic() {
        return metallic;
    }

    public void setMetallic(float metallic) {
        this.metallic = metallic;
    }

    public float getRoughness() {
        return roughness;
    }

    public void setRoughness(float roughness) {
        this.roughness = roughness;
    }

    @Override
    public String toString() {
        return "Ball: \n" + "  radius = " + radius + ",\n  metallic = " + metallic + ",\n  roughness=" + roughness;
    }
}
