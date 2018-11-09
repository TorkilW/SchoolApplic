package no.needmore.coffee.integrasjonslag;

import javax.xml.bind.annotation.XmlRootElement;
import java.text.SimpleDateFormat;
import java.util.Date;

@XmlRootElement
public class Avtale {
    private String kundeNavn;
    private Long kundeNr;
    private Long avtaleNr;
    private String avtaleOpprettelsesTidspunkt;

    public Avtale(){
        setAvtaleOpprettelsesTidspunkt();
    }

    public Avtale(Long kundeNr, String kundeNavn){
        this.kundeNavn = kundeNavn;
        this.kundeNr = kundeNr;
        setAvtaleOpprettelsesTidspunkt();
    }

    public Avtale(Avtale avtale){
        this.kundeNavn = avtale.kundeNavn;
        this.kundeNr = avtale.kundeNr;
        setAvtaleOpprettelsesTidspunkt();
    }



    public Long getAvtaleNr() {
        return avtaleNr;
    }

    public void setAvtaleNr(Long avtaleNr) {
        this.avtaleNr = avtaleNr;
    }

    public String getAvtaleOpprettelsesTidspunkt() {
        return avtaleOpprettelsesTidspunkt;
    }

    public Long getKundeNr() {
        return kundeNr;
    }

    public void setKundeNr(Long kundeNr) {
        this.kundeNr = kundeNr;
    }

    public String getKundeNavn() {
        return kundeNavn;
    }

    public void setKundeNavn(String kundeNavn) {
        this.kundeNavn = kundeNavn;
    }

    private void setAvtaleOpprettelsesTidspunkt() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        this.avtaleOpprettelsesTidspunkt = formatter.format(date);
    }

}
