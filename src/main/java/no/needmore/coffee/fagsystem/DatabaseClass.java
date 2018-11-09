package no.needmore.coffee.fagsystem;

import no.needmore.coffee.integrasjonslag.Avtale;

import java.util.HashMap;
import java.util.Map;

public class DatabaseClass {


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
