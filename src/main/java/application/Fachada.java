package application;

import daojpa.DAO;
import daojpa.DAOFicha;
import entities.Ficha;

import java.util.List;

public class Fachada {

    private static DAOFicha dao = new DAOFicha();

    

    public static void inicializar(){
        DAO.open();
    }

    public static void finalizar(){
        DAO.close();
    }


    public static Ficha criarFichaVazia(String rg){
        Ficha f = new Ficha(rg);

        dao.begin();
        dao.create(f);
        dao.commit();

        return f;
    }

    public static Ficha buscarFicha(Object id){
        dao.begin();
        Ficha f = dao.read(id);
        dao.commit();

        return f;
    }

    public static void deletarFicha(Object id){
        dao.begin();
        Ficha f = dao.read(id);
        dao.delete(f);
        dao.commit();
    }


    public static void preencherResponsavel(Integer id, String nome, String endereco, String telefoneFixo, String celular1, String celular2, String cpf, String cidade, String uf){
        dao.begin();
        Ficha f = dao.read(id);
        f.preencherResponsavel(nome, endereco, telefoneFixo, celular1, celular2, cpf, cidade, uf);
        dao.update(f);
        dao.commit();
    }

    public static void preencherAnimal(Integer id, String nome, String especie, String raca, char sexo, String idade, double peso, String pelagem, String procedencia){
        dao.begin();
        Ficha f = dao.read(id);
        f.preencherAnimal(nome, especie, raca, sexo, idade, peso, pelagem, procedencia);
        dao.update(f);
        dao.commit();
    }

    public static void preencherAnamneseGeral(Integer id, String queixaPrincipal, String historicoMedicoPregresso, String alimentacao, String contactantes, String ambienteOndeVive, String vacinacao, String vermifugacao){
        dao.begin();
        Ficha f = dao.read(id);
        f.preencherAnamneseGeral(queixaPrincipal, historicoMedicoPregresso, alimentacao, contactantes, ambienteOndeVive, vacinacao, vermifugacao);
        dao.update(f);
        dao.commit();
    }

    public static void preencherAnameseSistemaRespiratorio(Integer id, boolean secrecao, boolean tosse, boolean espirro, boolean cianose, boolean dispneia, boolean ruido){
        dao.begin();
        Ficha f = dao.read(id);
        f.preencherAnameseSistemaRespiratorio(secrecao, tosse, espirro, cianose, dispneia, ruido);
        dao.update(f);
        dao.commit();
    }

    public static void preencherAnameseSistemaCardiovascular(Integer id, boolean intoleranciaExercicios, boolean cansaco, boolean sincope, boolean cianose, boolean tosse){
        dao.begin();
        Ficha f = dao.read(id);
        f.preencherAnameseSistemaCardiovascular(intoleranciaExercicios, cansaco, sincope, cianose, tosse);
        dao.update(f);
        dao.commit();
    }

    public static void preencherAnameseSistemaDigestorio(Integer id, String apetite, boolean vomito, boolean diarreia){
        dao.begin();
        Ficha f = dao.read(id);
        f.preencherAnameseSistemaDigestorio(apetite, vomito, diarreia);
        dao.update(f);
        dao.commit();
    }

    public static void preencherAnameseSistemaUrinario(Integer id, String ingestaoAgua, String aspectoUrina, double volumeUrina, int frequenciaUrina, boolean tenesmoVesical, boolean disuria){
        dao.begin();
        Ficha f = dao.read(id);
        f.preencherAnameseSistemaUrinario(ingestaoAgua, aspectoUrina, volumeUrina, frequenciaUrina, tenesmoVesical, disuria);
        dao.update(f);
        dao.commit();
    }

    public static void preencherAnameseSistemaReprodutor(Integer id, boolean secrecao, boolean cio, boolean anticoncepcional, boolean prenhez, int numeroFilhotes, String mamas, String alteracaoComportamento){
        dao.begin();
        Ficha f = dao.read(id);
        f.preencherAnameseSistemaReprodutor(secrecao, cio, anticoncepcional, prenhez, numeroFilhotes, mamas, alteracaoComportamento);
        dao.update(f);
        dao.commit();
    }

    public static void preencherAnameseSistemaLocomotor(Integer id, boolean claudicacao, String trauma, String aumentoVolume, boolean marcha, String impotenciaDeMembro, String frequenciaExercicios, String tipoExercicios){
        dao.begin();
        Ficha f = dao.read(id);
        f.preencherAnameseSistemaLocomotor(claudicacao, trauma, aumentoVolume, marcha, impotenciaDeMembro, frequenciaExercicios, tipoExercicios);
        dao.update(f);
        dao.commit();
    }

    public static void preencherAnameseSistemaNeurologico(Integer id, boolean convulsao, boolean sincopes, boolean deficitsNeurologicos, boolean deambulacao, String audicao, String olfato, String propriocepcao, String manias, String degluticao, boolean alteracaoLatidoMiado){
        dao.begin();
        Ficha f = dao.read(id);
        f.preencherAnameseSistemaNeurologico(convulsao, sincopes, deficitsNeurologicos, deambulacao, audicao, olfato, propriocepcao, manias, degluticao, alteracaoLatidoMiado);
        dao.update(f);
        dao.commit();
    }

    public static void preencherAnamesePeleAnexos(Integer id, String higiene, boolean secrecao, boolean alopecia, boolean prurido, boolean lesoes, boolean descamacao, boolean parasitas, String orelha){
        dao.begin();
        Ficha f = dao.read(id);
        f.preencherAnamesePeleAnexos(higiene, secrecao, alopecia, prurido, lesoes, descamacao, parasitas, orelha);
        dao.update(f);
        dao.commit();
    }

    public static void preencherAnameseOlhos(Integer id, boolean secrecao, boolean olhoVermelho, boolean olhoEsbranquicado, boolean deficitVisual, boolean blefaroespasmo, boolean fotofobia, String primeiroOlhoAfetado){
        dao.begin();
        Ficha f = dao.read(id);
        f.preencherAnameseOlhos(secrecao, olhoVermelho, olhoEsbranquicado, deficitVisual, blefaroespasmo, fotofobia, primeiroOlhoAfetado);
        dao.update(f);
        dao.commit();
    }

    public static void preencherExameFisico(Integer id, String postura, String nivelConsciencia, double escoreCorporal, double temperaturaRetal, int frequenciaRespiratoria, int frequenciaCardiaca, int tempoPreenchimentoCapilar, int pulso, String hidratacao){
        dao.begin();
        Ficha f = dao.read(id);
        f.preencherExameFisico(postura, nivelConsciencia, escoreCorporal, temperaturaRetal, frequenciaRespiratoria, frequenciaCardiaca, tempoPreenchimentoCapilar, pulso, hidratacao);
        dao.update(f);
        dao.commit();
    }

    public static void preencherAnamneseLinfonodos(Integer id, String linfonodosSubMandibulares, String linfonodosPreEscapulares, String linfonodosPopliteos, String linfonodosInguinais){
        dao.begin();
        Ficha f = dao.read(id);
        f.preencherAnamneseLinfonodos(linfonodosSubMandibulares, linfonodosPreEscapulares, linfonodosPopliteos, linfonodosInguinais);
        dao.update(f);
        dao.commit();
    }

    public static void preencherAnamneseMucosas(Integer id, String mucosaOcular, String mucosaOral, String mucosaPenianaVulvar, String mucosaAnal){
        dao.begin();
        Ficha f = dao.read(id);
        f.preencherAnamneseMucosas(mucosaOcular, mucosaOral, mucosaPenianaVulvar, mucosaAnal);
        dao.update(f);
        dao.commit();
    }

}
