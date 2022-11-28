package entities.sistemas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Olhos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private boolean secrecao;
    private boolean olhoVermelho;
    private boolean olhoEsbranquicado;
    private boolean deficitVisual;
    private boolean blefaroespasmo;
    private boolean fotofobia;
    private String primeiroOlhoAfetado = "";

    public Olhos() {
    }


    public boolean isSecrecao() {
        return secrecao;
    }

    public boolean isOlhoVermelho() {
        return olhoVermelho;
    }

    public boolean isOlhoEsbranquicado() {
        return olhoEsbranquicado;
    }

    public boolean isDeficitVisual() {
        return deficitVisual;
    }

    public boolean isBlefaroespasmo() {
        return blefaroespasmo;
    }

    public boolean isFotofobia() {
        return fotofobia;
    }

    public String getPrimeiroOlhoAfetado() {
        return primeiroOlhoAfetado;
    }


    public void setSecrecao(boolean secrecao) {
        this.secrecao = secrecao;
    }

    public void setOlhoVermelho(boolean olhoVermelho) {
        this.olhoVermelho = olhoVermelho;
    }

    public void setOlhoEsbranquicado(boolean olhoEsbranquicado) {
        this.olhoEsbranquicado = olhoEsbranquicado;
    }

    public void setDeficitVisual(boolean deficitVisual) {
        this.deficitVisual = deficitVisual;
    }

    public void setBlefaroespasmo(boolean blefaroespasmo) {
        this.blefaroespasmo = blefaroespasmo;
    }

    public void setFotofobia(boolean fotofobia) {
        this.fotofobia = fotofobia;
    }

    public void setPrimeiroOlhoAfetado(String primeiroOlhoAfetado) {
        this.primeiroOlhoAfetado = primeiroOlhoAfetado;
    }


    @Override
    public String toString() {
        return  "- Secreção: " + secrecao + "\n" +
                "- Olho vermelho: " + olhoVermelho + "\n" +
                "- Olho esbranquicado: " + olhoEsbranquicado + "\n" +
                "- Deficit visual: " + deficitVisual + "\n" +
                "- Blefaroespasmo: " + blefaroespasmo + "\n" +
                "- Fotofobia: " + fotofobia + "\n" +
                "- Primeiro olho afetado: " + primeiroOlhoAfetado + "\n";
    }
}
