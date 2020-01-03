package com.matheussoilegra.coreengineering.tema11;

import java.util.Scanner;

public class Menu {

    private CarreiraFactory carreiraFactory;

    public Menu() {
        carreiraFactory = new CarreiraFactory();
    }

    public void initializar() {
        while (true) {
            System.out.println("Bem-vindo(a) ao Menu de Carreiras:");
            System.out.println("Escolha uma das carreiras abaixo para ver sua descrição: ");
            System.out.println("Programacao");
            System.out.println("Enfermagem");
            System.out.println("Advocacia");

            Scanner teclado = new Scanner(System.in);
            Especialidades especialidades = Especialidades.valueOf(teclado.nextLine().toUpperCase());
            Carreira carreira = carreiraFactory.getCarreira(especialidades);
            carreira.trabalhar();
            System.out.println(carreira.trabalhar());
            System.out.println("Deseja realizar uma nova ação? [S/N]");

            String novaAcao = teclado.nextLine();
            if (novaAcao.equals("N")){
                System.exit(0);
            }
        }
    }

}