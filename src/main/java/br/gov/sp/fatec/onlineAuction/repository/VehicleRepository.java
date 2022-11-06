package br.gov.sp.fatec.onlineAuction.repository;

import br.gov.sp.fatec.onlineAuction.model.Vehicle;
import br.gov.sp.fatec.onlineAuction.model.VehicleType;

public interface VehicleRepository {
    public Vehicle findByType(VehicleType type);
}
