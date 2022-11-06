package br.gov.sp.fatec.onlineAuction.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RealtyType {
    APARTMENT("APARTAMENTO"),
    LAND("TERRENO"),
    HOUSE("CASA"),
    COMERCIAL("EDIFÍCIO COMERCIAL");

    private String value;
}
