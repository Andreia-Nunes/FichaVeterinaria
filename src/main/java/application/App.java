package application;

import daojpa.DAO;
import daojpa.DAOFicha;
import entities.Ficha;

public class App {
    public static void main(String[] args) {

        Fachada.inicializar();


        Fachada.criarFichaVazia("1.222.333");

        System.out.println(Fachada.buscarFicha(1).consultarRelatorioCompleto());


        Fachada.preencherResponsavel(1,
                "Andréia Nunes Pereira",
                "Av. Epitácio Pessoa, nº 1234",
                "(83) 3222-2222",
                "(83) 99999-9999",
                "(83) 99999-9999",
                "000.111.222-33",
                "João Pessoa",
                "PB"
                );


        Fachada.preencherAnimal(1,
                "Tobby",
                "Cão",
                "Schnawzer",
                'M',
                "13",
                5.0,
                "Preta",
                "Doméstica"
                );

        Fachada.preencherAnamneseGeral(1,
                "Consulta de rotina",
                "Nenhum problema de saúde.",
                "Ração específica para animais de porte pequeno.",
                "Nenhum",
                "Casa",
                "Completa",
                "Tomou vermifugo há 2 meses."
                );


        System.out.println(Fachada.buscarFicha(1).consultarRelatorioCompleto());

        Fachada.finalizar();
    }
}


