package no.needmore.coffee.integrasjonslag;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/avtaler")
public class AvtaleRessurs {

    AvtaleHandler avtaleHandler = new AvtaleHandler();


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Avtale> getAvtaler(){
        return avtaleHandler.getAvtaler();
    }

   /* @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Avtale addAvtale(Avtale avtale){
        return avtaleHandler.addAvtale(avtale);
    }*/

    @GET
    @Path("/{avtaleId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Avtale getAvtale(@PathParam("avtaleId") Long avtaleId){
        return  avtaleHandler.getAvtale(avtaleId);

    }
}
