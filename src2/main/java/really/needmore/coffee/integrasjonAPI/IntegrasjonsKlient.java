package really.needmore.coffee.integrasjonAPI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class IntegrasjonsKlient {

    Client client= ClientBuilder.newClient();
    WebTarget baseTarget = client.target("http://localhost:8080/webapi/");
    WebTarget avtalerTarget = baseTarget.path("avtaler");
    WebTarget enkelAvtaleTarget = avtalerTarget.path("{avtaleNr}");
    WebTarget kunderTarget = baseTarget.path("kunder");
    WebTarget enkelKundeTarget = kunderTarget.path("{kundeNr}");

    public Long opprettKunde(AvtaleForesp avtaleForesp){
        AvtaleForesp nyAvtale = new AvtaleForesp(avtaleForesp);
        Response postResponse =
    }

    AvtaleForesp nyAvtale = new AvtaleForesp();
    Response postResponse = avtalerTarget
            .request()
            .post(Entity.json(nyAvtale));
    AvtaleForesp opprettedeAvtale = postResponse.readEntity(AvtaleForesp.class);
        System.out.println(opprettedeAvtale.getAvtaleNr());
}
