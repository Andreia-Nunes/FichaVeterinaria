package entities.sistemas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PeleAnexos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String higiene = "";
    private boolean secrecao;
    private boolean alopecia;
    private boolean prurido;
    private boolean lesoes;
    private boolean descamacao;
    private boolean parasitas;
    private String orelha = "";

    public PeleAnexos() {
    }


    public String getHigiene() {
        return higiene;
    }

    public boolean isSecrecao() {
        return secrecao;
    }

    public boolean isAlopecia() {
        return alopecia;
    }

    public boolean isPrurido() {
        return prurido;
    }

    public boolean isLesoes() {
        return lesoes;
    }

    public boolean isDescamacao() {
        return descamacao;
    }

    public boolean isParasitas() {
        return parasitas;
    }

    public String getOrelha() {
        return orelha;
    }


    public void setHigiene(String higiene) {
        this.higiene = higiene;
    }

    public void setSecrecao(boolean secrecao) {
        this.secrecao = secrecao;
    }

    public void setAlopecia(boolean alopecia) {
        this.alopecia = alopecia;
    }

    public void setPrurido(boolean prurido) {
        this.prurido = prurido;
    }

    public void setLesoes(boolean lesoes) {
        this.lesoes = lesoes;
    }

    public void setDescamacao(boolean descamacao) {
        this.descamacao = descamacao;
    }

    public void setParasitas(boolean parasitas) {
        this.parasitas = parasitas;
    }

    public void setOrelha(String orelha) {
        this.orelha = orelha;
    }


    @Override
    public String toString() {
        return  "- Higiene: " + higiene + "\n" +
                "- Secreção: " + secrecao + "\n" +
                "- Alopecia: " + alopecia + "\n" +
                "- Prurido: " + prurido + "\n" +
                "- Lesões: " + lesoes + "\n" +
                "- Descamação: " + descamacao + "\n" +
                "- Parasitas: " + parasitas + "\n" +
                "- Orelha: " + orelha + "\n";
    }
}
