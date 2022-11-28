package entities.avaliacoes;

import entities.sistemas.Linfonodos;
import entities.sistemas.Mucosas;

import javax.persistence.*;

@Entity
public class ExameFisico implements Relatorio {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private String postura = "";
    private String nivelConsciencia = "";
    private double escoreCorporal;
    private double temperaturaRetal;
    private int frequenciaRespiratoria;
    private int frequenciaCardiaca;
    private int tempoPreenchimentoCapilar;
    private int pulso;
    private String hidratacao = "";

    @OneToOne(cascade = {CascadeType.ALL})
    private Linfonodos linfonodos;

    @OneToOne(cascade = {CascadeType.ALL})
    private Mucosas mucosas;

    public ExameFisico() {
        this.linfonodos = new Linfonodos();
        this.mucosas = new Mucosas();
    }


    public String getPostura() {
        return postura;
    }

    public String getNivelConsciencia() {
        return nivelConsciencia;
    }

    public double getEscoreCorporal() {
        return escoreCorporal;
    }

    public double getTemperaturaRetal() {
        return temperaturaRetal;
    }

    public int getFrequenciaRespiratoria() {
        return frequenciaRespiratoria;
    }

    public int getFrequenciaCardiaca() {
        return frequenciaCardiaca;
    }

    public int getTempoPreenchimentoCapilar() {
        return tempoPreenchimentoCapilar;
    }

    public int getPulso() {
        return pulso;
    }

    public String getHidratacao() {
        return hidratacao;
    }

    public Linfonodos getLinfonodos() {
        return linfonodos;
    }

    public Mucosas getMucosas() {
        return mucosas;
    }


    public void setPostura(String postura) {
        this.postura = postura;
    }

    public void setNivelConsciencia(String nivelConsciencia) {
        this.nivelConsciencia = nivelConsciencia;
    }

    public void setEscoreCorporal(double escoreCorporal) {
        this.escoreCorporal = escoreCorporal;
    }

    public void setTemperaturaRetal(double temperaturaRetal) {
        this.temperaturaRetal = temperaturaRetal;
    }

    public void setFrequenciaRespiratoria(int frequenciaRespiratoria) {
        this.frequenciaRespiratoria = frequenciaRespiratoria;
    }

    public void setFrequenciaCardiaca(int frequenciaCardiaca) {
        this.frequenciaCardiaca = frequenciaCardiaca;
    }

    public void setTempoPreenchimentoCapilar(int tempoPreenchimentoCapilar) {
        this.tempoPreenchimentoCapilar = tempoPreenchimentoCapilar;
    }

    public void setPulso(int pulso) {
        this.pulso = pulso;
    }

    public void setHidratacao(String hidratacao) {
        this.hidratacao = hidratacao;
    }

    public void setLinfonodos(String linfonodosSubMandibulares, String linfonodosPreEscapulares, String linfonodosPopliteos, String linfonodosInguinais){
        this.getLinfonodos().setLinfonodosSubMandibulares(linfonodosSubMandibulares);
        this.getLinfonodos().setLinfonodosPreEscapulares(linfonodosPreEscapulares);
        this.getLinfonodos().setLinfonodosPopliteos(linfonodosPopliteos);
        this.getLinfonodos().setLinfonodosInguinais(linfonodosInguinais);
    }

    public void setMucosas(String mucosaOcular, String mucosaOral, String mucosaPenianaVulvar, String mucosaAnal){
        this.getMucosas().setMucosaOcular(mucosaOcular);
        this.getMucosas().setMucosaOral(mucosaOral);
        this.getMucosas().setMucosaPenianaVulvar(mucosaPenianaVulvar);
        this.getMucosas().setMucosaAnal(mucosaAnal);
    }


    @Override
    public String gerarRelatorio() {
        String relatorio =
                "- Postura: " + this.getPostura() + "\n" +
                "- Nível de consciência: " + this.getNivelConsciencia() + "\n" +
                "- Escore corporal: " + this.getEscoreCorporal() + "\n" +
                "- Temperatura retal: " + this.getTemperaturaRetal() + "\n" +
                "- Frequência respiratória: " + this.getFrequenciaRespiratoria() + "\n" +
                "- Frequência cardíaca: " + this.getFrequenciaCardiaca() + "\n" +
                "- Tempo de preenchimento capilar: " + this.getTempoPreenchimentoCapilar() + "\n" +
                "- Pulso: " + this.getPulso() + "\n" +
                "- Hidratação: " + this.getHidratacao() + "\n" +
                "\nLinfonodos \n" + this.getLinfonodos() + "\n" +
                "Mucosas \n" + this.getMucosas() + "\n";

        return relatorio;
    }
}
