import java.util.Scanner;
public class menuPrincipal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in );
            Genero genero1 = new Genero("rock",
                    "120bpm",
                    1950,
                    "EU",
                    "Chuck Berry",
                    "Festival de California" );
            Genero genero2  = new Genero("chicha",
                    "100bpm",
                    1970,
                    "Ecuador",
                    "Glorita Cedeño",
                    "Chicha Fest");
        Genero genero3 = new Genero("pasillo","123bpm",1990,"Ecuador","Julio Jaramillo","Pasillo Ecuatoriano");

        //con el set podemos cambiar al valor predeterminado en la clase

        System.out.println(genero1.getAnio());
        System.out.println(genero2.getAnio());
        System.out.println(genero3.getAnio());




        System.out.println("Ingrese el año a cambiar: ");
        int aniotemporal = entrada.nextInt();
        genero1.setAnio(aniotemporal);
        System.out.println(genero1.getAnio());

        //
        genero1.imprimirDatos();

    }
}
