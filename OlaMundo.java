import java.util.Scanner;

public class OlaMundo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor para ambiente: ");
        String ambiente = scanner.nextLine();

        if (ambiente.equals("Timao")) {
            System.out.println("Vai Curintia");
        } else {
            System.out.println("Ambiente desconhecido.");
        }

        scanner.close();
    }
}
