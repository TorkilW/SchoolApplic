package really.needmore.coffee.fagSystem;

import java.util.HashMap;
import java.util.Map;

public class DatabaseSyst {
    private static Map<Long, Avtale> avtaler = new HashMap<>();
    private static Map<Long, Kunde> kunder = new HashMap<>();


    public static Map<Long, Avtale> getAvtaler(){
        return avtaler;
    }

   /* public AvtaleMock addAvtale(AvtaleMock k){
        avtaler.put(, k);
        return k;
    }*/

    public static Map<Long, Kunde> getKunder(){
        return kunder;
    }

}
