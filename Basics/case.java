import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la moyenne: ");
        float moy = scanner.nextFloat();
        int note = (int) moy;

switch (note) {
            case 0: case 1: case 2: case 3: case 4:
            case 5: case 6: case 7: case 8: case 9:
                System.out.println("Redouble");
                break;

            case 10: case 11:
                System.out.println("Mention passable");
                break;

            case 12: case 13:
                System.out.println("Mention assez bien");
                break;

            case 14: case 15:
                System.out.println("Mention bien");
                break;

            case 16: case 17: case 18: case 19: case 20:
                System.out.println("Mention très bien");
                break;

            default:
                System.out.println("Veuillez entrer une moyenne entre 0 et 20");
        }

        scanner.close();
    }
}

