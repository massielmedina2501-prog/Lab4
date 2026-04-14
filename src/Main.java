import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===Bienvenido a veterinaria cachito===");
        System.out.println("ingrese los datos que le pediremos a continuacion:");
        System.out.println("____________________________");
        System.out.println("Ingrese nombre del perro:");
        String nombrePerro = sc.nextLine();

        System.out.println("Ingrese edad del perro:");
        int edadPerro = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese raza del perro:");
        String raza = sc.nextLine();

        Perro perro = new Perro(nombrePerro, edadPerro, raza);

        System.out.println("______________________");

        System.out.println("Ingrese nombre del gato:");
        String nombreGato = sc.nextLine();

        System.out.println("Ingrese edad del gato:");
        int edadGato = sc.nextInt();

        System.out.println("¿Es de interior? (true para si /false para no):");
        boolean esInterior = sc.nextBoolean();

        Gato gato = new Gato(nombreGato, edadGato, esInterior);

        System.out.println("_________________________");

        perro.mostrarInfo();
        perro.hacerSonido();

        System.out.println("_________________________");

        gato.mostrarInfo();
        gato.hacerSonido();


    }
}