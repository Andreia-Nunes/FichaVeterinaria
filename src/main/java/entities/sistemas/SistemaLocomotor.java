package entities.sistemas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SistemaLocomotor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private boolean claudicacao;
    private String trauma = "";
    private String aumentoVolume = "";
    private boolean marcha;
    private String impotenciaDeMembro = "";
    private String frequenciaExercicios = "";
    private String tipoExercicios = "";

    public SistemaLocomotor() {
    }


    public boolean isClaudicacao() {
        return claudicacao;
    }

    public String getTrauma() {
        return trauma;
    }

    public String getAumentoVolume() {
        return aumentoVolume;
    }

    public boolean isMarcha() {
        return marcha;
    }

    public String getImpotenciaDeMembro() {
        return impotenciaDeMembro;
    }

    public String getFrequenciaExercicios() {
        return frequenciaExercicios;
    }

    public String getTipoExercicios() {
        return tipoExercicios;
    }


    public void setClaudicacao(boolean claudicacao) {
        this.claudicacao = claudicacao;
    }

    public void setTrauma(String trauma) {
        this.trauma = trauma;
    }

    public void setAumentoVolume(String aumentoVolume) {
        this.aumentoVolume = aumentoVolume;
    }

    public void setMarcha(boolean marcha) {
        this.marcha = marcha;
    }

    public void setImpotenciaDeMembro(String impotenciaDeMembro) {
        this.impotenciaDeMembro = impotenciaDeMembro;
    }

    public void setFrequenciaExercicios(String frequenciaExercicios) {
        this.frequenciaExercicios = frequenciaExercicios;
    }

    public void setTipoExercicios(String tipoExercicios) {
        this.tipoExercicios = tipoExercicios;
    }


    @Override
    public String toString() {
        return  "- Claudicação: " + claudicacao + "\n" +
                "- Trauma: " + trauma + "\n" +
                "- Aumento de volume: " + aumentoVolume + "\n" +
                "- Marcha: " + marcha + "\n" +
                "- Impotência de membro: " + impotenciaDeMembro + "\n" +
                "- Frequencia de exercícios: " + frequenciaExercicios + "\n" +
                "- Tipo de exercícios: " + tipoExercicios + "\n";
    }
}
