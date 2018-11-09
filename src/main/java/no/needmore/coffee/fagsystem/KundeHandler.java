package no.needmore.coffee.fagsystem;


import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.util.Map;

@Path("/regkunde")
public class KundeHandler {

    private Map<Long, Kunde> kunder  = DatabaseClass.getKunder();

    Client client = ClientBuilder.newClient();
    WebTarget fagSystem = client.target("localhost8080/webapi/MottaKundeDetaljer");

    KundeService kundeService = new KundeService();

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Kunde addKunde(Kunde kunde) {
        kundeService.addKunde(kunde);
        kunde.setKundeNr((long) (kunder.size() + 1));
        kunder.put(kunde.getKundeNr(), kunde);
        return kunde;
    }



}