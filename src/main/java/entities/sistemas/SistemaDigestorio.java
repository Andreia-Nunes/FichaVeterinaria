package entities.sistemas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SistemaDigestorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String apetite = "";
    private boolean vomito;
    private boolean diarreia;

    public SistemaDigestorio() {

    }

    public String getApetite() {
        return apetite;
    }

    public boolean isVomito() {
        return vomito;
    }

    public boolean isDiarreia() {
        return diarreia;
    }


    public void setApetite(String apetite) {
        this.apetite = apetite;
    }

    public void setVomito(boolean vomito) {
        this.vomito = vomito;
    }

    public void setDiarreia(boolean diarreia) {
        this.diarreia = diarreia;
    }


    @Override
    public String toString() {
        return  "- Apetite: " + apetite + "\n" +
                "- Vômito: " + vomito + "\n" +
                "- Diarréia: " + diarreia + "\n";
    }
}
