import java.util.Scanner;

void main() {

    Scanner leitor = new Scanner(System.in);
    String escolha;

    do {
        IO.println("=== Calculadora ===");

        IO.print("Escolha o primeiro número: ");
        double num1 = leitor.nextDouble();

        IO.print("Digite o operador: ");
        String operador = leitor.next();

        IO.print("Escolha o segundo número: ");
        double num2 = leitor.nextDouble();

        double resulado = switch (operador) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> {
                if (num2 == 0) {
                    IO.print("Erro! Divisão por 0");
                    yield 0;
                } else {
                    yield num1 / num2;
                }
            }
            default -> {
                IO.print("Operador invalido");
                yield 0;
            }
        };

        IO.println("Resultado: " + resulado);
        IO.print("Gostaria de calcular de novo? ");
        escolha = leitor.next();

    } while (escolha.equals("Sim"));
    leitor.close();
}
