import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Principal {
    public static void main(String args[]) {
        entregaNome();
    }

    public static void entregaNome() {
        Scanner scan = new Scanner(System.in);
        Scanner scanRepeat = new Scanner(System.in);
        Set<String> conjNomes = new TreeSet<>();

        while (1 == 1) {
            System.out.println("Escreva um nome: ");
            String name = scan.nextLine();

            while(conjNomes.contains(name)) {
                System.out.println("");
                System.out.println("Esse nome ja foi adicionado!");
                System.out.println("Por favor adicione outro: ");
                name = scan.nextLine();
            }

            conjNomes.add(name);
            System.out.println("");
            System.out.println("Nomes adicionados:");
            System.out.println(conjNomes);
            
            System.out.println("");
            System.out.println("Deseja adicionar outro nome? (Caso sim, escreva 'sim')");
            String repeat = scanRepeat.nextLine();
            if (repeat.equalsIgnoreCase("sim")) {
                System.out.println("");
                continue;
            } else {
                System.out.println("");
                System.out.println("Finalizando programa!");
                break;
            }
        }
    }
}
