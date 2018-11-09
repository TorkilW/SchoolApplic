package no.needmore.coffee.integrasjonslag.testingAvJerseyKlienter;


import no.needmore.coffee.integrasjonslag.Avtale;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class ApiKlient4 {
    public static void main(String[] args) {


        Client client = ClientBuilder.newClient();


        WebTarget baseTarget = client.target("http://localhost:8080/webapi/");
        WebTarget avtalerTarget = baseTarget.path("avtaler");
        WebTarget enkelAvtaleTarget = avtalerTarget.path("{avtaleId}");


        Avtale avtale1 = enkelAvtaleTarget
                .resolveTemplate("avtaleId", "1")
                .request(MediaType.APPLICATION_JSON)
                .get(Avtale.class);


        Avtale avtale2 = enkelAvtaleTarget
                .resolveTemplate("avtaleId", "2")
                .request(MediaType.APPLICATION_JSON)
                .get(Avtale.class);


        Avtale nyAvtale = new Avtale(6L, "Jane DoepleGanger");
        Response postResponse = avtalerTarget
                .request()
                .post(Entity.json(nyAvtale));
        Avtale opprettedeAvtale = postResponse.readEntity(Avtale.class);
        System.out.println(opprettedeAvtale.getAvtaleNr());

        WebTarget kunderTarget = baseTarget.path("kunder");

    }
}
