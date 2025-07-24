package com.algaworks.algasensors.temperature.monitoring.api.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SensorAlertInput {
    private Double minTemperature;
    private Double maxTemperature;
}
