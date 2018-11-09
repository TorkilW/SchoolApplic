package no.needmore.coffee.integrasjonslag;

import org.junit.jupiter.api.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

class IntegrasjonsKlientTest {


    @Test
    public void test1(){
        Client client= ClientBuilder.newClient();


        WebTarget baseTarget = client.target("http://localhost:8080/webapi/");
        WebTarget avtalerTarget = baseTarget.path("avtaler");
        WebTarget enkelAvtaleTarget = avtalerTarget.path("{avtaleNr}");
        WebTarget kunderTarget = baseTarget.path("kunder");

       /* Response postResponse = avtalerTarget
                .request()
                .post(Entity.json(nyAvtale));
        Avtale opprettedeAvtale = postResponse.readEntity(Avtale.class);
        System.out.println(opprettedeAvtale.getAvtaleNr());

        System.out.println(postResponse);*/
    }
}