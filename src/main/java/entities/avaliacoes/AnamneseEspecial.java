package entities.avaliacoes;

import entities.sistemas.*;

import javax.persistence.*;

@Entity
public class AnamneseEspecial implements Relatorio{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(cascade = {CascadeType.ALL})
    private SistemaRespiratorio sistemaRespiratorio;

    @OneToOne(cascade = {CascadeType.ALL})
    private SistemaCardiovascular sistemaCardiovascular;

    @OneToOne(cascade = {CascadeType.ALL})
    private SistemaDigestorio sistemaDigestorio;

    @OneToOne(cascade = {CascadeType.ALL})
    private SistemaUrinario sistemaUrinario;

    @OneToOne(cascade = {CascadeType.ALL})
    private SistemaReprodutor sistemaReprodutor;

    @OneToOne(cascade = {CascadeType.ALL})
    private SistemaLocomotor sistemaLocomotor;

    @OneToOne(cascade = {CascadeType.ALL})
    private SistemaNeurologico sistemaNeurologico;

    @OneToOne(cascade = {CascadeType.ALL})
    private PeleAnexos peleAnexos;

    @OneToOne(cascade = {CascadeType.ALL})
    private Olhos olhos;

    public AnamneseEspecial() {
        this.sistemaRespiratorio = new SistemaRespiratorio();
        this.sistemaCardiovascular = new SistemaCardiovascular();
        this.sistemaDigestorio = new SistemaDigestorio();
        this.sistemaUrinario = new SistemaUrinario();
        this.sistemaReprodutor = new SistemaReprodutor();
        this.sistemaLocomotor = new SistemaLocomotor();
        this.sistemaNeurologico = new SistemaNeurologico();
        this.peleAnexos = new PeleAnexos();
        this.olhos = new Olhos();
    }

    public SistemaRespiratorio getSistemaRespiratorio() {
        return sistemaRespiratorio;
    }

    public SistemaCardiovascular getSistemaCardiovascular() {
        return sistemaCardiovascular;
    }

    public SistemaDigestorio getSistemaDigestorio() {
        return sistemaDigestorio;
    }

    public SistemaUrinario getSistemaUrinario() {
        return sistemaUrinario;
    }

    public SistemaReprodutor getSistemaReprodutor() {
        return sistemaReprodutor;
    }

    public SistemaLocomotor getSistemaLocomotor() {
        return sistemaLocomotor;
    }

    public SistemaNeurologico getSistemaNeurologico() {
        return sistemaNeurologico;
    }

    public PeleAnexos getPeleAnexos() {
        return peleAnexos;
    }

    public Olhos getOlhos() {
        return olhos;
    }


    public void setSistemaRespiratorio(boolean secrecao, boolean tosse, boolean espirro, boolean cianose, boolean dispneia, boolean ruido) {
        this.getSistemaRespiratorio().setSecrecao(secrecao);
        this.getSistemaRespiratorio().setTosse(tosse);
        this.getSistemaRespiratorio().setEspirro(espirro);
        this.getSistemaRespiratorio().setCianose(cianose);
        this.getSistemaRespiratorio().setDispneia(dispneia);
        this.getSistemaRespiratorio().setRuido(ruido);
    }

    public void setSistemaCardiovascular(boolean intoleranciaExercicios, boolean cansaco, boolean sincope, boolean cianose, boolean tosse) {
        this.getSistemaCardiovascular().setIntoleranciaExercicios(intoleranciaExercicios);
        this.getSistemaCardiovascular().setCansaco(cansaco);
        this.getSistemaCardiovascular().setSincope(sincope);
        this.getSistemaCardiovascular().setCianose(cianose);
        this.getSistemaCardiovascular().setTosse(tosse);
    }

    public void setSistemaDigestorio(String apetite, boolean vomito, boolean diarreia) {
        this.getSistemaDigestorio().setApetite(apetite);
        this.getSistemaDigestorio().setVomito(vomito);
        this.getSistemaDigestorio().setDiarreia(diarreia);
    }

    public void setSistemaUrinario(String ingestaoAgua, String aspectoUrina, double volumeUrina, int frequenciaUrina, boolean tenesmoVesical, boolean disuria) {
        this.getSistemaUrinario().setIngestaoAgua(ingestaoAgua);
        this.getSistemaUrinario().setAspectoUrina(aspectoUrina);
        this.getSistemaUrinario().setVolumeUrina(volumeUrina);
        this.getSistemaUrinario().setFrequenciaUrina(frequenciaUrina);
        this.getSistemaUrinario().setTenesmoVesical(tenesmoVesical);
        this.getSistemaUrinario().setDisuria(disuria);
    }

    public void setSistemaReprodutor(boolean secrecao, boolean cio, boolean anticoncepcional, boolean prenhez, int numeroFilhotes, String mamas, String alteracaoComportamento) {
        this.getSistemaReprodutor().setSecrecao(secrecao);
        this.getSistemaReprodutor().setCio(cio);
        this.getSistemaReprodutor().setAnticoncepcional(anticoncepcional);
        this.getSistemaReprodutor().setPrenhez(prenhez);
        this.getSistemaReprodutor().setNumeroFilhotes(numeroFilhotes);
        this.getSistemaReprodutor().setMamas(mamas);
        this.getSistemaReprodutor().setAlteracaoComportamento(alteracaoComportamento);
    }

    public void setSistemaLocomotor(boolean claudicacao, String trauma, String aumentoVolume, boolean marcha, String impotenciaDeMembro, String frequenciaExercicios, String tipoExercicios) {
        this.getSistemaLocomotor().setClaudicacao(claudicacao);
        this.getSistemaLocomotor().setTrauma(trauma);
        this.getSistemaLocomotor().setAumentoVolume(aumentoVolume);
        this.getSistemaLocomotor().setMarcha(marcha);
        this.getSistemaLocomotor().setImpotenciaDeMembro(impotenciaDeMembro);
        this.getSistemaLocomotor().setFrequenciaExercicios(frequenciaExercicios);
        this.getSistemaLocomotor().setTipoExercicios(tipoExercicios);
    }

    public void setSistemaNeurologico(boolean convulsao, boolean sincopes, boolean deficitsNeurologicos, boolean deambulacao, String audicao, String olfato, String propriocepcao, String manias, String degluticao, boolean alteracaoLatidoMiado) {
        this.getSistemaNeurologico().setConvulsao(convulsao);
        this.getSistemaNeurologico().setSincopes(sincopes);
        this.getSistemaNeurologico().setDeficitsNeurologicos(deficitsNeurologicos);
        this.getSistemaNeurologico().setDeambulacao(deambulacao);
        this.getSistemaNeurologico().setAudicao(audicao);
        this.getSistemaNeurologico().setOlfato(olfato);
        this.getSistemaNeurologico().setPropriocepcao(propriocepcao);
        this.getSistemaNeurologico().setManias(manias);
        this.getSistemaNeurologico().setDegluticao(degluticao);
        this.getSistemaNeurologico().setAlteracaoLatidoMiado(alteracaoLatidoMiado);
    }

    public void setPeleAnexos(String higiene, boolean secrecao, boolean alopecia, boolean prurido, boolean lesoes, boolean descamacao, boolean parasitas, String orelha) {
        this.getPeleAnexos().setHigiene(higiene);
        this.getPeleAnexos().setSecrecao(secrecao);
        this.getPeleAnexos().setAlopecia(alopecia);
        this.getPeleAnexos().setPrurido(prurido);
        this.getPeleAnexos().setLesoes(lesoes);
        this.getPeleAnexos().setDescamacao(descamacao);
        this.getPeleAnexos().setParasitas(parasitas);
        this.getPeleAnexos().setOrelha(orelha);
    }

    public void setOlhos(boolean secrecao, boolean olhoVermelho, boolean olhoEsbranquicado, boolean deficitVisual, boolean blefaroespasmo, boolean fotofobia, String primeiroOlhoAfetado) {
        this.getOlhos().setSecrecao(secrecao);
        this.getOlhos().setOlhoVermelho(olhoVermelho);
        this.getOlhos().setOlhoEsbranquicado(olhoEsbranquicado);
        this.getOlhos().setDeficitVisual(deficitVisual);
        this.getOlhos().setBlefaroespasmo(blefaroespasmo);
        this.getOlhos().setFotofobia(fotofobia);
        this.getOlhos().setPrimeiroOlhoAfetado(primeiroOlhoAfetado);
    }


    @Override
    public String gerarRelatorio() {
        String relatorio =
                "\nSistema Respiratório \n" + this.getSistemaRespiratorio() + "\n" +
                "Sistema Cardiovascular \n" + this.getSistemaCardiovascular() + "\n" +
                "Sistema Digestório \n" + this.getSistemaDigestorio() + "\n" +
                "Sistema Urinário \n" + this.getSistemaUrinario() + "\n" +
                "Sistema Reprodutor \n" + this.getSistemaReprodutor() + "\n" +
                "Sistema Locomotor \n" + this.getSistemaLocomotor() + "\n" +
                "Sistema Neurológico \n" + this.getSistemaNeurologico() + "\n" +
                "Pele e anexos \n" + this.getPeleAnexos() + "\n" +
                "Olhos \n" + this.getOlhos() + "\n";

        return relatorio;
    }
}
