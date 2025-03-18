package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Informe os dados do usuário: ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome: ");
        String nomeCompleto = scanner.next();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        System.out.print("Nome da mãe: ");
        String nomeDaMae = scanner.next();
        System.out.print("Nome do pai: ");
        String nomeDoPai = scanner.next();

        System.out.println("------------------------------");

        Usuario usuario = new Usuario(nomeCompleto, idade, nomeDaMae, nomeDoPai);
        System.out.println(usuario.toString());
    }
}