package entities.sistemas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Linfonodos {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private String linfonodosSubMandibulares = "";
    private String linfonodosPreEscapulares = "";
    private String linfonodosPopliteos = "";
    private String linfonodosInguinais = "";

    public Linfonodos() {
    }


    public String getLinfonodosSubMandibulares() {
        return linfonodosSubMandibulares;
    }

    public String getLinfonodosPreEscapulares() {
        return linfonodosPreEscapulares;
    }

    public String getLinfonodosPopliteos() {
        return linfonodosPopliteos;
    }

    public String getLinfonodosInguinais() {
        return linfonodosInguinais;
    }


    public void setLinfonodosSubMandibulares(String linfonodosSubMandibulares) {
        this.linfonodosSubMandibulares = linfonodosSubMandibulares;
    }

    public void setLinfonodosPreEscapulares(String linfonodosPreEscapulares) {
        this.linfonodosPreEscapulares = linfonodosPreEscapulares;
    }

    public void setLinfonodosPopliteos(String linfonodosPopliteos) {
        this.linfonodosPopliteos = linfonodosPopliteos;
    }

    public void setLinfonodosInguinais(String linfonodosInguinais) {
        this.linfonodosInguinais = linfonodosInguinais;
    }


    @Override
    public String toString() {
        return  "- Linfonodos SubMandibulares: " + linfonodosSubMandibulares + "\n" +
                "- Linfonodos pré-escapulares: " + linfonodosPreEscapulares + "\n" +
                "- Linfonodos popliteos: " + linfonodosPopliteos + "\n" +
                "- Linfonodos inguinais: " + linfonodosInguinais + "\n";
    }
}
