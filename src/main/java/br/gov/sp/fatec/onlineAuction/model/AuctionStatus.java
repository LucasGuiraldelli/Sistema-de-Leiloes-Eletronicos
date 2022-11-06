package br.gov.sp.fatec.onlineAuction.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AuctionStatus {
    OPEN("EM ABERTO"),
    RUNNING("EM ANDAMENTO"),
    CLOSED("FINALIZADO");

    private String value;
}
