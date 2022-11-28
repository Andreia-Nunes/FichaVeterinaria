package entities.sistemas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SistemaCardiovascular {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private boolean intoleranciaExercicios;
    private boolean cansaco;
    private boolean sincope;
    private boolean cianose;
    private boolean tosse;

    public SistemaCardiovascular() {
    }


    public boolean isIntoleranciaExercicios() {
        return intoleranciaExercicios;
    }

    public boolean isCansaco() {
        return cansaco;
    }

    public boolean isSincope() {
        return sincope;
    }

    public boolean isCianose() {
        return cianose;
    }

    public boolean isTosse() {
        return tosse;
    }


    public void setIntoleranciaExercicios(boolean intoleranciaExercicios) {
        this.intoleranciaExercicios = intoleranciaExercicios;
    }

    public void setCansaco(boolean cansaco) {
        this.cansaco = cansaco;
    }

    public void setSincope(boolean sincope) {
        this.sincope = sincope;
    }

    public void setCianose(boolean cianose) {
        this.cianose = cianose;
    }

    public void setTosse(boolean tosse) {
        this.tosse = tosse;
    }


    @Override
    public String toString() {
        return  "- Intolerância a exercícios: " + intoleranciaExercicios + "\n" +
                "- Cansaço: " + cansaco + "\n" +
                "- Síncope: " + sincope + "\n" +
                "- Cianose: " + cianose + "\n" +
                "- Tosse: " + tosse + "\n";
    }
}
