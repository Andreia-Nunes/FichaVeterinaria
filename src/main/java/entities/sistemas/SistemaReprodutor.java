package entities.sistemas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SistemaReprodutor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private boolean secrecao;
    private boolean cio;
    private boolean anticoncepcional;
    private boolean prenhez;
    private int numeroFilhotes;
    private String mamas = "";
    private String alteracaoComportamento = "";

    public SistemaReprodutor() {
    }


    public boolean isSecrecao() {
        return secrecao;
    }

    public boolean isCio() {
        return cio;
    }

    public boolean isAnticoncepcional() {
        return anticoncepcional;
    }

    public boolean isPrenhez() {
        return prenhez;
    }

    public int getNumeroFilhotes() {
        return numeroFilhotes;
    }

    public String getMamas() {
        return mamas;
    }

    public String getAlteracaoComportamento() {
        return alteracaoComportamento;
    }


    public void setSecrecao(boolean secrecao) {
        this.secrecao = secrecao;
    }

    public void setCio(boolean cio) {
        this.cio = cio;
    }

    public void setAnticoncepcional(boolean anticoncepcional) {
        this.anticoncepcional = anticoncepcional;
    }

    public void setPrenhez(boolean prenhez) {
        this.prenhez = prenhez;
    }

    public void setNumeroFilhotes(int numeroFilhotes) {
        this.numeroFilhotes = numeroFilhotes;
    }

    public void setMamas(String mamas) {
        this.mamas = mamas;
    }

    public void setAlteracaoComportamento(String alteracaoComportamento) {
        this.alteracaoComportamento = alteracaoComportamento;
    }


    @Override
    public String toString() {
        return  "- Secreção: " + secrecao + "\n" +
                "- Cio: " + cio + "\n" +
                "- Anticoncepcional: " + anticoncepcional + "\n" +
                "- Prenhez: " + prenhez + "\n" +
                "- Número de filhotes: " + numeroFilhotes + "\n" +
                "- Mamas: " + mamas + "\n" +
                "- Alteração do comportamento: " + alteracaoComportamento + "\n";
    }
}
