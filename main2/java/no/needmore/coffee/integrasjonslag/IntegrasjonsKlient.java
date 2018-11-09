package no.needmore.coffee.integrasjonslag;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.xml.ws.Response;

public class IntegrasjonsKlient {
        Client client= ClientBuilder.newClient();

        WebTarget baseTarget = client.target("http://localhost:8080/webapi/");
        WebTarget avtalerTarget = baseTarget.path("avtaler");
        WebTarget enkelAvtaleTarget = avtalerTarget.path("{avtaleNr}");
        WebTarget kunderTarget = baseTarget.path("kunder");
        WebTarget enkelKundeTarget = kunderTarget.path("{kundeNr}");

        /*public Long registrerKundeFagsystem(){
            Response postResponse =

            return 2L;
        }*/

      /*  Response postResponse = avtalerTarget
                .request()
                .post(Entity.json(nyAvtale));
        Avtale opprettedeAvtale = postResponse.readEntity(Avtale.class);
        System.out.println(opprettedeAvtale.getAvtaleNr());

        System.out.println(postResponse);
*/


}
