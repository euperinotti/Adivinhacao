package com.adivinhacao;

import java.util.Random;
import java.util.Scanner;

public final class App {
    private App() {}

    public static void main(String[] args) throws InterruptedException {
        Integer randomNumber = new Random().nextInt(100);
        Scanner scanner = new Scanner(System.in);
        Integer attempts = 1;
        Integer input;

        System.out.println("Bem vindo ao jogo do adivinha!");
        System.out.println("Escolhendo um número...");
        Thread.sleep(2000);
        System.out.println("Tente adivinhar");

        while(attempts <= 5) {
            System.out.print("Input...: ");
            input = scanner.nextInt();

            if (input == randomNumber) {
                System.out.println("Parabéns! Você acertou");
                break;
            } else if (input < randomNumber) {
                System.out.println("Errou, tente um número maior");
            } else if (input > randomNumber) {
                System.out.println("Errou, tente um número menor");
            }

            if (attempts == 5) {
                System.out.println("Você não tem mais tentativas restantes");
                break;
            }
            attempts++;
        }

        System.out.println("O número era: " + randomNumber);
    }
}