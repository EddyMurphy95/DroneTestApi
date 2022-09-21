package com.drone.api.dronetestapi.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class Medication {
    @Id
    @Pattern(regexp = "^[0-9A-Z_]*$", message = "Input not allowed")
    @NotBlank(message = "code cannot be blank")
    private String code;
    @Pattern(regexp = "^[0-9a-zA-Z_]*$", message = "name accepts only alphanumeric values")
    @NotBlank(message = "name cannot be blank")
    private String name;
    @NotBlank(message = "weight cannot be blank")
    private double weight;
    @NotBlank(message = "image cannot be blank")
    private String image;

    public Medication() {
    }

    public Medication(String code, String name, double weight, String image) {
        this.code = code;
        this.name = name;
        this.weight = weight;
        this.image = image;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "{" +
                " code='" + getCode() + "'" +
                ", name='" + getName() + "'" +
                ", weight='" + getWeight() + "'" +
                ", image='" + getImage() + "'" +
                "}";
    }

}
