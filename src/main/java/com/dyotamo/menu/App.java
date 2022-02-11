package com.dyotamo.menu;

import java.util.Scanner;

public class App {

    /**
     * Main menu, front page.
     */
    public static void mainMenu() {
        System.out.println("M-Pesa");
        System.out.println("1. Transferir Dinheiro");
        System.out.println("2. Levantar Dinheiro");

        try (var reader = new Scanner(System.in);) {
            String option = reader.nextLine();
            switch (option) {
                case "1":
                    transferMoney();
                    break;
                case "2":
                    withdrawMoney();
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }
    }

    /**
     * Money transfer.
     */
    public static void transferMoney() {
        System.out.println("1. Para Digitar o Numero");
        System.out.println("0. Para voltar");

        try (var reader = new Scanner(System.in);) {
            String option = reader.nextLine();
            switch (option) {
                case "0":
                    mainMenu();
                    break;
                case "1":
                    typeNumber();
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }
    }

    /**
     * Type number, when selected money transfer.
     *
     */
    private static void typeNumber() {
        System.out.println("Digite o numero ou 0 para voltar");

        try (var reader = new Scanner(System.in);) {
            String option = reader.nextLine();
            switch (option) {
                case "0":
                    transferMoney();
                    break;
                default:
                    System.out.println("Valor transferido com sucesso.");
                    break;
            }
        }
    }

    /**
     * Withdraw money.
     */
    private static void withdrawMoney() {
        System.out.println("1. No Agent");
        System.out.println("0. Para voltar");

        try (var reader = new Scanner(System.in);) {
            String option = reader.nextLine();
            switch (option) {
                case "0":
                    mainMenu();
                    break;
                default:
                    withdrawMoneyFromAgent();
                    break;
            }
        }
    }

    /**
     * Withdraw money from agent.
     */
    private static void withdrawMoneyFromAgent() {
        System.out.println("Digita o codigo do agente ou 0 para voltar");

        try (var reader = new Scanner(System.in);) {
            String option = reader.nextLine();
            switch (option) {
                case "0":
                    withdrawMoney();
                    break;
                default:
                    System.out.println("Valor levantado com sucesso.");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        mainMenu();
    }
}
