package org.example;
import java.util.Scanner;



public class CifraMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Cifra de César ===");
        System.out.println("1 - Criptografar mensagem");
        System.out.println("2 - Descriptografar (testando 25 combinações)");
        System.out.print("Digite sua opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite sua mensagem: ");
        String mensagem = scanner.nextLine().toUpperCase(); // Deixa tudo em maiúsculo

        if (opcao == 1) {
            System.out.print("Digite a chave (1 a 25): ");
            int chave = scanner.nextInt();
            String criptografada = criptografar(mensagem, chave);
            System.out.println("\nMensagem criptografada:");
            System.out.println(criptografada);

        } else if (opcao == 2) {
            System.out.println("\n=== Tentativas de descriptografia ===");
            for (int chave = 1; chave <= 25; chave++) {
                String tentativa = criptografar(mensagem, 26 - chave); // inverte a chave
                System.out.println("Chave " + chave + ": " + tentativa);
            }

        } else {
            System.out.println("Opção inválida!");
        }

        scanner.close();
    }

    public static String criptografar(String texto, int chave) {
        StringBuilder resultado = new StringBuilder();

        for (char c : texto.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                char novaLetra = (char) ((c - base + chave) % 26 + base);
                resultado.append(novaLetra);
            } else {
                resultado.append(c);
            }
        }

        return resultado.toString();
    }
 }
