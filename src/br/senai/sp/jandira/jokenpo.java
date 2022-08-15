package br.senai.sp.jandira;

import java.util.Random;
import java.util.Scanner;

public class jokenpo {

	public static void main(String[] args) {

		// Declarar as variáveis que iremos utilizar

		Scanner leitor = new Scanner(System.in);
		Random sorteio = new Random(); // new usado pra guardar palavra
		int escolhaJogador, escolhaComputador;

		// Mostrar as opções ao úsuario
		System.out.println("***JOKENPÔ***");
		System.out.println();
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		System.out.println("----------------------");
		System.out.println();
		System.out.print("Faça a sua escolha (1-3): ");

		// Receber a escolha do jogador
		escolhaJogador = leitor.nextInt();

		// Gerar a escolha do computador
		escolhaComputador = sorteio.nextInt(1, 4);

		System.out.println();
		// Mostrar as escolhar de cada jogador
		if (escolhaJogador == 1) {
			System.out.println("Você escolheu PEDRA!");
		}
		if (escolhaJogador == 2) {
			System.out.println("Você escolheu PAPEL!");
		}
		if (escolhaJogador == 3) {
			System.out.println("Você escolheu TESOURA!");
		}
		System.out.println();
		// Computador escolha
		if (escolhaComputador == 1) {
			System.out.println("Compudador escolheu PEDRA!");
		}
		if (escolhaComputador == 2) {
			System.out.println("Computador escolheu PAPEL!");
		}
		if (escolhaComputador == 3) {
			System.out.println("Computador escolheu TESOURA!");
		}
		System.out.println();
		// Determinar o ganhador
		if (escolhaJogador == 1) {
			if (escolhaComputador == 1) {
				System.out.println("O jogo empatou!!");
			}
			if (escolhaComputador == 2) {
				System.out.println("O computador ganhou!!");
			}
			if (escolhaComputador == 3) {
				System.out.println("Você ganhou!!");
			}
		}

		if (escolhaJogador == 2) {
			if (escolhaComputador == 1) {
				System.out.println("Você ganhou!!");
			}
			if (escolhaComputador == 2) {
				System.out.println("O jogo empatou!!");
			}
			if (escolhaComputador == 3) {
				System.out.println("Computador ganhou!!");
			}
		}

		if (escolhaJogador == 3) {
			if (escolhaComputador == 1) {
				System.out.println("Computador ganhou!!");
			}
			if (escolhaComputador == 2) {
				System.out.println("Você ganhou!!");
			}
			if (escolhaComputador == 3) {
				System.out.println("O jogo empatou!!");
			}
		}

	}

}
