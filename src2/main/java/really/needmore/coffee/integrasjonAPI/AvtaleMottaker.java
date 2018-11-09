package really.needmore.coffee.integrasjonAPI;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import really.needmore.coffee.integrasjonAPI.AvtaleForesp;

@Path("/avtaler")
public class AvtaleMottaker {

    AvtaleForesp avtaleForesp = new AvtaleForesp();
    IntegrasjonsKlient integrasjonsKlient = new IntegrasjonsKlient();

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public AvtaleForesp opprettKunde(AvtaleForesp avtaleForesp){
        integrasjonsKlient.addKunde();
        return avtaleForesp;
    }


}
