package no.needmore.coffee.integrasjonslag;

import no.needmore.coffee.fagsystem.DatabaseClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AvtaleHandler {
    private Map<Long, Avtale> avtaler  = DatabaseClass.getAvtaler();

   // private Avtale avtale = new Avtale((long) 1, (long) 1, "Jon Doe");
    public AvtaleHandler(){
        avtaler.put(1L, new Avtale(1L, "Jon Doe"));
        avtaler.put(2L, new Avtale(2L, "Jon Doe"));
    }

    public List<Avtale> getAvtaler(){
        return new ArrayList<Avtale>(avtaler.values());
    }
    /*public String returnerExempelAvtale(){

        return avtale.toString();
    }*/

    public Avtale getAvtale(long avtaleNr){
        return avtaler.get(avtaleNr);
    }

    public Avtale addAvtale(Avtale avtale){
        avtale.setAvtaleNr((long) (avtaler.size() + 1));
        avtaler.put(avtale.getAvtaleNr(), avtale);
        return avtale;
    }

    public Avtale oppdaterAvtale(Avtale avtale){
        if(avtale.getAvtaleNr() <= 0){
            return null;
        }
        avtaler.put(avtale.getAvtaleNr(), avtale);
        return avtale;
    }

    public Avtale fjernAvtale(long kundeNr){
        return avtaler.remove(kundeNr);
    }

   /* @Override
    public String toString(){
      //  return "Avtalenummer: " + avtale.getAvtaleNr() + "\nKunde Navn: " + avtale.getKundeNavn() + "\nKundenummer: " + avtale.getKundeNr();
    }*/
}
