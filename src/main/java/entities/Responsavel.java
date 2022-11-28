package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Responsavel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome = "";
    private String endereco = "";
    private String telefoneFixo = "";
    private String celular1 = "";
    private String celular2 = "";
    private String cpf = "";
    private String cidade = "";
    private String uf = "";

    public Responsavel() {
    }


    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefoneFixo() {
        return telefoneFixo;
    }

    public String getCelular1() {
        return celular1;
    }

    public String getCelular2() {
        return celular2;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUf() {
        return uf;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefoneFixo(String telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }

    public void setCelular1(String celular1) {
        this.celular1 = celular1;
    }

    public void setCelular2(String celular2) {
        this.celular2 = celular2;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }


    @Override
    public String toString() {
        return  "- Nome: " + nome + "\n" +
                "- Endereço: " + endereco + "\n" +
                "- Telefone fixo: " + telefoneFixo + "\n" +
                "- Celular 1: " + celular1 + "\n" +
                "- Celular 2: " + celular2 + "\n" +
                "- CPF: " + cpf + "\n" +
                "- Cidade: " + cidade + "\n" +
                "- UF: " + uf + "\n";
    }
}
