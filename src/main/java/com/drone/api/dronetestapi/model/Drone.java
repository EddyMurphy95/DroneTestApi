package com.drone.api.dronetestapi.model;

import java.math.BigInteger;
import java.text.DecimalFormat;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Drone {
    @Id
    @NotBlank(message = "Serial Number Required!")
    @Column(name = "serial-number")
    private String serialNumber;
    @NotBlank(message = "Model is Required!")
    @Column(name = "model")
    private String model;
    @NotBlank(message = "Weight is Required!")
    @Max(value = 500, message = "Weight should not exceed 500 grams")
    @Column(name = "weight")
    private BigInteger weight;// weight limit 500grams max
    @NotBlank(message = "battery Capacity Number Required!")
    @Column(name = "battery-capacity")
    private DecimalFormat batteryCapacity;
    @Column(name = "state")
    @NotNull(message = "state Required!")
    private String state; // (IDLE, LOADING, LOADED, DELIVERING, DELIVERED, RETURNING)

    public Drone(String serialNumber, String model, BigInteger weight, DecimalFormat batteryCapacity, String state) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.weight = weight;
        this.batteryCapacity = batteryCapacity;
        this.state = state;
    }

    public Drone() {
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BigInteger getWeight() {
        return this.weight;
    }

    public void setWeight(BigInteger weight) {
        this.weight = weight;
    }

    public DecimalFormat getBatteryCapacity() {
        return this.batteryCapacity;
    }

    public void setBatteryCapacity(DecimalFormat batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
