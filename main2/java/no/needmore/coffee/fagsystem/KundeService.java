package no.needmore.coffee.fagsystem;

import java.util.Map;


public class KundeService {
    private Map<Long, Kunde> kunder = DatabaseClass.getKunder();

    public Kunde getKunde(long kundeNr){
        return kunder.get(kundeNr);
    }

    public Kunde addKunde(Kunde kunde){
        kunde.setKundeNr((long) (kunder.size() + 1));
        kunder.put(kunde.getKundeNr(), kunde);
        return kunde;
    }

    public Kunde oppdaterKunde(Kunde kunde){
        if(kunde.getKundeNr() <= 0){
            return null;
        }
        kunder.put(kunde.getKundeNr(), kunde);
        return kunde;
    }

    public Kunde fjernKunde(long kundeNr){
        return kunder.remove(kundeNr);
    }
}
