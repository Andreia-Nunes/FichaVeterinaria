package entities;

import entities.avaliacoes.AnamneseEspecial;
import entities.avaliacoes.AnamneseGeral;
import entities.avaliacoes.ExameFisico;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Entity
public class Ficha {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String rg = "";

    @Temporal(TemporalType.DATE)
    private Date data;

    @OneToOne(cascade = {CascadeType.ALL})
    private Responsavel responsavel;

    @OneToOne(cascade = {CascadeType.ALL})
    private Animal animal;

    @OneToOne(cascade = {CascadeType.ALL})
    private AnamneseGeral anamneseGeral;

    @OneToOne(cascade = {CascadeType.ALL})
    private AnamneseEspecial anamneseEspecial;

    @OneToOne(cascade = {CascadeType.ALL})
    private ExameFisico exameFisico;

    public Ficha(String rg) {
        this.rg = rg;
        this.data = new Date();
        this.responsavel = new Responsavel();
        this.animal = new Animal();
        this.anamneseGeral = new AnamneseGeral();
        this.anamneseEspecial = new AnamneseEspecial();
        this.exameFisico = new ExameFisico();
    }

    public Ficha() {}

    public String consultarRg() { return this.rg; }

    public String consultarDataAtendimento (){
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        return formatador.format(this.data);
    }

    public String consultarResponsavel (){
        return this.responsavel.toString();
    }

    public String consultarAnimal (){
        return this.animal.toString();
    }

    public String consultarRelatorioAnamneseGeral (){
        return this.anamneseGeral.gerarRelatorio();
    }

    public String consultarRelatorioAnamneseEspecial (){
        return this.anamneseEspecial.gerarRelatorio();
    }

    public String consultarRelatorioExameFisico (){
        return this.exameFisico.gerarRelatorio();
    }

    public String consultarRelatorioCompleto (){
        String relatorioCompleto =
                "\nDATA DE ATENDIMENTO: " + this.consultarDataAtendimento() + "\n" +
                "\nRESPONSÁVEL \n" + this.consultarResponsavel() + "\n" +
                "ANIMAL \n" + this.consultarAnimal() + "\n" +
                "ANAMNESE GERAL \n" + this.consultarRelatorioAnamneseGeral() + "\n" +
                "ANAMNESE ESPECIAL \n" + this.consultarRelatorioAnamneseEspecial() + "\n" +
                "EXAME FÍSICO \n" + this.consultarRelatorioExameFisico();

        return relatorioCompleto;
    }


    public void preencherResponsavel(String nome, String endereco, String telefoneFixo, String celular1, String celular2, String cpf, String cidade, String uf) {
        this.responsavel.setNome(nome);
        this.responsavel.setEndereco(endereco);
        this.responsavel.setTelefoneFixo(telefoneFixo);
        this.responsavel.setCelular1(celular1);
        this.responsavel.setCelular2(celular2);
        this.responsavel.setCpf(cpf);
        this.responsavel.setCidade(cidade);
        this.responsavel.setUf(uf);
    }

    public void preencherAnimal(String nome, String especie, String raca, char sexo, String idade, double peso, String pelagem, String procedencia) {
        this.animal.setNome(nome);
        this.animal.setEspecie(especie);
        this.animal.setRaca(raca);
        this.animal.setSexo(sexo);
        this.animal.setIdade(idade);
        this.animal.setPeso(peso);
        this.animal.setPelagem(pelagem);
        this.animal.setProcedencia(procedencia);
    }

    public void preencherAnamneseGeral(String queixaPrincipal, String historicoMedicoPregresso, String alimentacao, String contactantes, String ambienteOndeVive, String vacinacao, String vermifugacao) {
        this.anamneseGeral.setQueixaPrincipal(queixaPrincipal);
        this.anamneseGeral.setHistoricoMedicoPregresso(historicoMedicoPregresso);
        this.anamneseGeral.setAlimentacao(alimentacao);
        this.anamneseGeral.setContactantes(contactantes);
        this.anamneseGeral.setAmbienteOndeVive(ambienteOndeVive);
        this.anamneseGeral.setVacinacao(vacinacao);
        this.anamneseGeral.setVermifugacao(vermifugacao);
    }

    public void preencherAnameseSistemaRespiratorio(boolean secrecao, boolean tosse, boolean espirro, boolean cianose, boolean dispneia, boolean ruido){
        this.anamneseEspecial.setSistemaRespiratorio(secrecao, tosse, espirro, cianose, dispneia, ruido);
    }

    public void preencherAnameseSistemaCardiovascular(boolean intoleranciaExercicios, boolean cansaco, boolean sincope, boolean cianose, boolean tosse){
        this.anamneseEspecial.setSistemaCardiovascular(intoleranciaExercicios, cansaco, sincope, cianose, tosse);
    }

    public void preencherAnameseSistemaDigestorio(String apetite, boolean vomito, boolean diarreia){
        this.anamneseEspecial.setSistemaDigestorio(apetite, vomito, diarreia);
    }

    public void preencherAnameseSistemaUrinario(String ingestaoAgua, String aspectoUrina, double volumeUrina, int frequenciaUrina, boolean tenesmoVesical, boolean disuria){
        this.anamneseEspecial.setSistemaUrinario(ingestaoAgua, aspectoUrina, volumeUrina, frequenciaUrina, tenesmoVesical, disuria);
    }

    public void preencherAnameseSistemaReprodutor(boolean secrecao, boolean cio, boolean anticoncepcional, boolean prenhez, int numeroFilhotes, String mamas, String alteracaoComportamento){
        this.anamneseEspecial.setSistemaReprodutor(secrecao, cio, anticoncepcional, prenhez, numeroFilhotes, mamas, alteracaoComportamento);
    }

    public void preencherAnameseSistemaLocomotor(boolean claudicacao, String trauma, String aumentoVolume, boolean marcha, String impotenciaDeMembro, String frequenciaExercicios, String tipoExercicios){
        this.anamneseEspecial.setSistemaLocomotor(claudicacao, trauma, aumentoVolume, marcha, impotenciaDeMembro, frequenciaExercicios, tipoExercicios);
    }

    public void preencherAnameseSistemaNeurologico(boolean convulsao, boolean sincopes, boolean deficitsNeurologicos, boolean deambulacao, String audicao, String olfato, String propriocepcao, String manias, String degluticao, boolean alteracaoLatidoMiado){
        this.anamneseEspecial.setSistemaNeurologico(convulsao, sincopes, deficitsNeurologicos, deambulacao, audicao, olfato, propriocepcao, manias, degluticao, alteracaoLatidoMiado);
    }

    public void preencherAnamesePeleAnexos(String higiene, boolean secrecao, boolean alopecia, boolean prurido, boolean lesoes, boolean descamacao, boolean parasitas, String orelha){
        this.anamneseEspecial.setPeleAnexos(higiene, secrecao, alopecia, prurido, lesoes, descamacao, parasitas, orelha);
    }

    public void preencherAnameseOlhos(boolean secrecao, boolean olhoVermelho, boolean olhoEsbranquicado, boolean deficitVisual, boolean blefaroespasmo, boolean fotofobia, String primeiroOlhoAfetado){
        this.anamneseEspecial.setOlhos(secrecao, olhoVermelho, olhoEsbranquicado, deficitVisual, blefaroespasmo, fotofobia, primeiroOlhoAfetado);
    }

    public void preencherExameFisico(String postura, String nivelConsciencia, double escoreCorporal, double temperaturaRetal, int frequenciaRespiratoria, int frequenciaCardiaca, int tempoPreenchimentoCapilar, int pulso, String hidratacao) {
        this.exameFisico.setPostura(postura);
        this.exameFisico.setNivelConsciencia(nivelConsciencia);
        this.exameFisico.setEscoreCorporal(escoreCorporal);
        this.exameFisico.setTemperaturaRetal(temperaturaRetal);
        this.exameFisico.setFrequenciaRespiratoria(frequenciaRespiratoria);
        this.exameFisico.setFrequenciaCardiaca(frequenciaCardiaca);
        this.exameFisico.setTempoPreenchimentoCapilar(tempoPreenchimentoCapilar);
        this.exameFisico.setPulso(pulso);
        this.exameFisico.setHidratacao(hidratacao);
    }

    public void preencherAnamneseLinfonodos(String linfonodosSubMandibulares, String linfonodosPreEscapulares, String linfonodosPopliteos, String linfonodosInguinais){
        this.exameFisico.setLinfonodos(linfonodosSubMandibulares, linfonodosPreEscapulares, linfonodosPopliteos, linfonodosInguinais);
    }

    public void preencherAnamneseMucosas(String mucosaOcular, String mucosaOral, String mucosaPenianaVulvar, String mucosaAnal){
        this.exameFisico.setMucosas(mucosaOcular, mucosaOral, mucosaPenianaVulvar, mucosaAnal);
    }




}
