package entities.sistemas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SistemaNeurologico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private boolean convulsao;
    private boolean sincopes;
    private boolean deficitsNeurologicos;
    private boolean deambulacao;
    private String audicao = "";
    private String olfato = "";
    private String propriocepcao = "";
    private String manias = "";
    private String degluticao = "";
    private boolean alteracaoLatidoMiado;

    public SistemaNeurologico() {
    }


    public boolean isConvulsao() {
        return convulsao;
    }

    public boolean isSincopes() {
        return sincopes;
    }

    public boolean isDeficitsNeurologicos() {
        return deficitsNeurologicos;
    }

    public boolean isDeambulacao() {
        return deambulacao;
    }

    public String getAudicao() {
        return audicao;
    }

    public String getOlfato() {
        return olfato;
    }

    public String getPropriocepcao() {
        return propriocepcao;
    }

    public String getManias() {
        return manias;
    }

    public String getDegluticao() {
        return degluticao;
    }

    public boolean isAlteracaoLatidoMiado() {
        return alteracaoLatidoMiado;
    }


    public void setConvulsao(boolean convulsao) {
        this.convulsao = convulsao;
    }

    public void setSincopes(boolean sincopes) {
        this.sincopes = sincopes;
    }

    public void setDeficitsNeurologicos(boolean deficitsNeurologicos) {
        this.deficitsNeurologicos = deficitsNeurologicos;
    }

    public void setDeambulacao(boolean deambulacao) {
        this.deambulacao = deambulacao;
    }

    public void setAudicao(String audicao) {
        this.audicao = audicao;
    }

    public void setOlfato(String olfato) {
        this.olfato = olfato;
    }

    public void setPropriocepcao(String propriocepcao) {
        this.propriocepcao = propriocepcao;
    }

    public void setManias(String manias) {
        this.manias = manias;
    }

    public void setDegluticao(String degluticao) {
        this.degluticao = degluticao;
    }

    public void setAlteracaoLatidoMiado(boolean alteracaoLatidoMiado) {
        this.alteracaoLatidoMiado = alteracaoLatidoMiado;
    }


    @Override
    public String toString() {
        return  "- Convuls??o: " + convulsao + "\n" +
                "- Sincopes: " + sincopes + "\n" +
                "- Deficits neurol??gicos: " + deficitsNeurologicos + "\n" +
                "- Deambula????o: " + deambulacao + "\n" +
                "- Audi????o: " + audicao + "\n" +
                "- Olfato: " + olfato + "\n" +
                "- Propriocep????o: " + propriocepcao + "\n" +
                "- Manias: " + manias + "\n" +
                "- Degluti????o: " + degluticao + "\n" +
                "- Altera????o latido/miado: " + alteracaoLatidoMiado + "\n";
    }
}
