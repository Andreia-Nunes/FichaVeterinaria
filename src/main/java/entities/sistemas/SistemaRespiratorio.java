package entities.sistemas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SistemaRespiratorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private boolean secrecao;
    private boolean tosse;
    private boolean espirro;
    private boolean cianose;
    private boolean dispneia;
    private boolean ruido;



    public SistemaRespiratorio(){

    }


    public boolean isSecrecao() {
        return secrecao;
    }

    public boolean isTosse() {
        return tosse;
    }

    public boolean isEspirro() {
        return espirro;
    }

    public boolean isCianose() {
        return cianose;
    }

    public boolean isDispneia() {
        return dispneia;
    }

    public boolean isRuido() {
        return ruido;
    }


    public void setSecrecao(boolean secrecao) {
        this.secrecao = secrecao;
    }

    public void setTosse(boolean tosse) {
        this.tosse = tosse;
    }

    public void setEspirro(boolean espirro) {
        this.espirro = espirro;
    }

    public void setCianose(boolean cianose) {
        this.cianose = cianose;
    }

    public void setDispneia(boolean dispneia) {
        this.dispneia = dispneia;
    }

    public void setRuido(boolean ruido) {
        this.ruido = ruido;
    }


    @Override
    public String toString() {
        return  "- Secreção: " + secrecao + "\n" +
                "- Tosse: " + tosse + "\n" +
                "- Espirro: " + espirro + "\n" +
                "- Cianose: " + cianose + "\n" +
                "- Dispneia: " + dispneia + "\n" +
                "- Ruído: " + ruido + "\n";
    }
}
