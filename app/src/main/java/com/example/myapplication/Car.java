package com.example.myapplication;

public class Car {
    String opisanie;
    String power;
    String model;
    int picture;

    public void setOpisanie(String opisanie) {
        this.opisanie = opisanie;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public String getOpisanie() {
        return opisanie;
    }

    public String getPower() {
        return power;
    }

    public String getModel() {
        return model;
    }

    public int getPicture() {
        return picture;
    }

    public Car(String opisanie, String power, String model, int picture) {
        this.opisanie = opisanie;
        this.power = power;
        this.model = model;
        this.picture = picture;
    }
}
