package entities.sistemas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mucosas {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private String mucosaOcular = "";
    private String mucosaOral = "";
    private String mucosaPenianaVulvar = "";
    private String mucosaAnal = "";

    public Mucosas() {
    }


    public String getMucosaOcular() {
        return mucosaOcular;
    }

    public String getMucosaOral() {
        return mucosaOral;
    }

    public String getMucosaPenianaVulvar() {
        return mucosaPenianaVulvar;
    }

    public String getMucosaAnal() {
        return mucosaAnal;
    }


    public void setMucosaOcular(String mucosaOcular) {
        this.mucosaOcular = mucosaOcular;
    }

    public void setMucosaOral(String mucosaOral) {
        this.mucosaOral = mucosaOral;
    }

    public void setMucosaPenianaVulvar(String mucosaPenianaVulvar) {
        this.mucosaPenianaVulvar = mucosaPenianaVulvar;
    }

    public void setMucosaAnal(String mucosaAnal) {
        this.mucosaAnal = mucosaAnal;
    }


    @Override
    public String toString() {
        return  "- Mucosa ocular: " + mucosaOcular + "\n" +
                "- Mucosa oral: " + mucosaOral + "\n" +
                "- Mucosa peniana/vulvar: " + mucosaPenianaVulvar + "\n" +
                "- Mucosa anal: " + mucosaAnal + "\n";
    }
}
