package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Animal {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome = "";
    private String especie = "";
    private String raca = "";
    private char sexo = ' ';
    private String idade = "";
    private double peso;
    private String pelagem = "";
    private String procedencia = "";

    public Animal() {
    }



    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public String getRaca() {
        return raca;
    }

    public char getSexo() {
        return sexo;
    }

    public String getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public String getPelagem() {
        return pelagem;
    }

    public String getProcedencia() {
        return procedencia;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setPelagem(String pelagem) {
        this.pelagem = pelagem;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }


    @Override
    public String toString() {
        return  "- Nome: " + nome + "\n" +
                "- Espécie: " + especie + "\n" +
                "- Raça: " + raca + "\n" +
                "- Sexo: " + sexo + "\n" +
                "- Idade: " + idade + "\n" +
                "- Peso: " + peso + "\n" +
                "- Pelagem: " + pelagem + "\n" +
                "- Procedência: " + procedencia + "\n";
    }
}
