package com.gro.model.data.temperature;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;

import com.gro.model.AbstractInputPreferences;

@Entity
public class TemperaturePreferences extends AbstractInputPreferences {
    
    @Enumerated(EnumType.STRING)
    @NotNull
    private TemperatureUnit temperatureUnit = TemperatureUnit.CELSIUS;

    public TemperatureUnit getTemperatureUnit() {
        return temperatureUnit;
    }

    public void setTemperatureUnit(TemperatureUnit temperatureUnit) {
        this.temperatureUnit = temperatureUnit;
    }
    
}
