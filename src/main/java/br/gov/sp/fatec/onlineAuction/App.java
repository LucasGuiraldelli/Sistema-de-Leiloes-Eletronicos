package br.gov.sp.fatec.onlineAuction;

import br.gov.sp.fatec.onlineAuction.controller.AuctionController;
import br.gov.sp.fatec.onlineAuction.controller.ClientController;
import br.gov.sp.fatec.onlineAuction.controller.FinancialInstitutionController;
import br.gov.sp.fatec.onlineAuction.controller.RealtyController;
import br.gov.sp.fatec.onlineAuction.controller.VehicleController;
import io.javalin.Javalin;


public class App 
{
    public static void main( String[] args )
    {
        var app = Javalin.create();

        new FinancialInstitutionController().configure(app);
        new ClientController().configure(app);
        new AuctionController().configure(app);
        new RealtyController().configure(app);
        new VehicleController().configure(app);

        app.start(8080);
    }
}
