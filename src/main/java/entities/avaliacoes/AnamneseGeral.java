package entities.avaliacoes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AnamneseGeral implements Relatorio{

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private String queixaPrincipal = "";
    private String historicoMedicoPregresso = "";
    private String alimentacao = "";
    private String contactantes = "";
    private String ambienteOndeVive = "";
    private String vacinacao = "";
    private String vermifugacao = "";

    public AnamneseGeral() {
    }


    public String getQueixaPrincipal() {
        return queixaPrincipal;
    }

    public String getHistoricoMedicoPregresso() {
        return historicoMedicoPregresso;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public String getContactantes() {
        return contactantes;
    }

    public String getAmbienteOndeVive() {
        return ambienteOndeVive;
    }

    public String getVacinacao() {
        return vacinacao;
    }

    public String getVermifugacao() {
        return vermifugacao;
    }


    public void setQueixaPrincipal(String queixaPrincipal) {
        this.queixaPrincipal = queixaPrincipal;
    }

    public void setHistoricoMedicoPregresso(String historicoMedicoPregresso) {
        this.historicoMedicoPregresso = historicoMedicoPregresso;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    public void setContactantes(String contactantes) {
        this.contactantes = contactantes;
    }

    public void setAmbienteOndeVive(String ambienteOndeVive) {
        this.ambienteOndeVive = ambienteOndeVive;
    }

    public void setVacinacao(String vacinacao) {
        this.vacinacao = vacinacao;
    }

    public void setVermifugacao(String vermifugacao) {
        this.vermifugacao = vermifugacao;
    }


    @Override
    public String gerarRelatorio() {
        String relatorio =
                "- Queixa principal: " + this.getQueixaPrincipal() + "\n" +
                "- Histórico médico pregresso: " + this.getHistoricoMedicoPregresso() + "\n" +
                "- Alimentação: " + this.getAlimentacao() + "\n" +
                "- Contactantes: " + this.getContactantes() + "\n" +
                "- Ambiente onde vive: " + this.getAmbienteOndeVive() + "\n" +
                "- Vacinação: " + this.getVacinacao() + "\n" +
                "- Vermifugação: " + this.getVermifugacao() + "\n";

        return relatorio;
    }
}
