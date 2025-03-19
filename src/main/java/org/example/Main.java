package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Informe os dados do usuário: ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome completo: ");
        String nomeCompleto = scanner.next();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        System.out.print("Nome completo da mãe: ");
        String nomeDaMae = scanner.next();
        System.out.print("Nome completo do pai: ");
        String nomeDoPai = scanner.next();
        System.out.println("------------------------------");

        Usuario usuario = new Usuario(nomeCompleto, idade, nomeDaMae, nomeDoPai);
        System.out.println(usuario.toString());
        System.out.println("------------------------------");
        tamanhoNome(nomeCompleto, nomeDaMae, nomeDoPai);
    }

    public static void tamanhoNome(String nome, String nomeDaMae, String nomeDoPai) {
        if (nome.length() > nomeDaMae.length() && nome.length() > nomeDoPai.length()) {
            System.out.println("O nome do usuário é o maior!");
        } else if (nomeDaMae.length() > nome.length() && nomeDaMae.length() > nomeDoPai.length()) {
            System.out.println("O nome da mãe é o maior!");
        } else {
            System.out.println("O nome do pai é o maior!");
        }
    }
}