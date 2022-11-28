package entities.sistemas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SistemaUrinario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String ingestaoAgua = "";
    private String aspectoUrina = "";
    private double volumeUrina;
    private int frequenciaUrina;
    private boolean tenesmoVesical;
    private boolean disuria;

    public SistemaUrinario() {
    }

    public String getIngestaoAgua() {
        return ingestaoAgua;
    }

    public String getAspectoUrina() {
        return aspectoUrina;
    }

    public double getVolumeUrina() {
        return volumeUrina;
    }

    public int getFrequenciaUrina() {
        return frequenciaUrina;
    }

    public boolean isTenesmoVesical() {
        return tenesmoVesical;
    }

    public boolean isDisuria() {
        return disuria;
    }


    public void setIngestaoAgua(String ingestaoAgua) {
        this.ingestaoAgua = ingestaoAgua;
    }

    public void setAspectoUrina(String aspectoUrina) {
        this.aspectoUrina = aspectoUrina;
    }

    public void setVolumeUrina(double volumeUrina) {
        this.volumeUrina = volumeUrina;
    }

    public void setFrequenciaUrina(int frequenciaUrina) {
        this.frequenciaUrina = frequenciaUrina;
    }

    public void setTenesmoVesical(boolean tenesmoVesical) {
        this.tenesmoVesical = tenesmoVesical;
    }

    public void setDisuria(boolean disuria) {
        this.disuria = disuria;
    }


    @Override
    public String toString() {
        return  "- Ingestão água: " + ingestaoAgua + "\n" +
                "- Aspecto urina: " + aspectoUrina + "\n" +
                "- Volume urina: " + volumeUrina + "\n" +
                "- Frequencia urina: " + frequenciaUrina + "\n" +
                "- Tenesmo vesical: " + tenesmoVesical + "\n" +
                "- Disuria: " + disuria + "\n";
    }
}
