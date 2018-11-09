package no.needmore.coffee.fagsystem;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Kunde {
    private String kundeNavn;
    private Long kundeNr;
    private String opprettelsesTidspunkt;


    public Kunde(){
        setOpprettelsesTidspunkt();
    }

    public Kunde(Kunde kunde){
        this.kundeNavn = kunde.getKundeNavn();
        setOpprettelsesTidspunkt();
    }

    public Kunde(String kundeNavn, Long kundeNr){
        this.kundeNavn = kundeNavn;
        this.kundeNr = kundeNr;
        setOpprettelsesTidspunkt();

    }

    public long getKundeNr() {
        return kundeNr;
    }

    public void setKundeNr(Long kundeNr) {
        this.kundeNr = kundeNr;
    }

    public String getOpprettelsesTidspunkt() {
        return opprettelsesTidspunkt;
    }

    private void setOpprettelsesTidspunkt() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        this.opprettelsesTidspunkt = formatter.format(date);;
    }

    public String getKundeNavn() {
        return kundeNavn;
    }

    public void setKundeNavn(String kundeNavn) {
        this.kundeNavn = kundeNavn;
    }
}
