package com.yvaldm.performance.carperformanceservice.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CarRequestResponse {

    private long id;
    private String code;
    private Transmission transmission;
    private ArtificialIntelligence ai;

    @JsonProperty("max-speed")
    private ValueRequestResponse maxSpeed;

    public CarRequestResponse() {
    }

    public CarRequestResponse(long id, String code, Transmission transmission, ArtificialIntelligence ai, ValueRequestResponse maxSpeed) {
        this.id = id;
        this.code = code;
        this.transmission = transmission;
        this.ai = ai;
        this.maxSpeed = maxSpeed;
    }

    public long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public ArtificialIntelligence getAi() {
        return ai;
    }

    public ValueRequestResponse getMaxSpeed() {
        return maxSpeed;
    }
}
