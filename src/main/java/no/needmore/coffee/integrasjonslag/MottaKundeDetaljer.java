package no.needmore.coffee.integrasjonslag;

import javax.annotation.PostConstruct;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.net.URISyntaxException;

@Path("/MottaKundeDetaljer")
public class MottaKundeDetaljer {

    AvtaleHandler avtaleHandler = new AvtaleHandler();

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Avtale addAvtale(Avtale avtale){
        return avtaleHandler.addAvtale(avtale);
    }


    /*@POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response opprettAvtale() throws URISyntaxException {
        URI uri = new URI("/regKunde");
        return Response.temporaryRedirect(uri).build();
    }*/



}
