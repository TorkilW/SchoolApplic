package no.needmore.coffee.integrasjonslag.testingAvJerseyKlienter;


import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

public class ApiKlient2 {
    public static void main(String[] args) {


        Client client = ClientBuilder.newClient();
        String avtale = client
                .target("http://localhost:8080/webapi/avtaler/1")
                .request(MediaType.APPLICATION_JSON)
                .get(String.class);
        /*WebTarget target = client.target("http://localhost:8080/webapi/avtaler/1");
        Builder builder = target.request();
        Response response = builder.get();*/
        //Avtale avtale = response.readEntity(Avtale.class);
        //System.out.println(avtale.getKundeNavn());
        //Endre Avtale til String for lett å kunne feilsøke
        System.out.println(avtale);
    }
}
