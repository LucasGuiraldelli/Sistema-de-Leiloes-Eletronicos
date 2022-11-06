package br.gov.sp.fatec.onlineAuction.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum VehicleType {
    CAR("CARRO"),
    MOTORCYCLE("MOTOCICLETA");

    private String value;
}
