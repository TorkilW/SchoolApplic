package no.needmore.coffee.integrasjonslag.testingAvJerseyKlienter;


import no.needmore.coffee.integrasjonslag.Avtale;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class ApiKlient3 {
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


        System.out.println(avtale2.getKundeNavn());
        System.out.println(avtale1.getKundeNavn());


        WebTarget kunderTarget = baseTarget.path("kunder");

    }
}
