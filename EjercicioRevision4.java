
import java.util.Scanner;

public class EjercicioRevision4 { //Agregamos metodo Main new
    public static void main(String[] args) {
        //    Scanner s = new Scanner(); //No estaba importado la java.util.Scanner ni el sistem in
        Scanner s = new Scanner(System.in);

        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s.nextLine();

        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");//En el texto dice jugdar 1 cuando deber ser jugador 2
        //Escane de mas, no es necesario
        //Scanner s2 = new Scanner();
        String j2 = s.nextLine();

        if (j1 == j2) {//la condicional tenia un parentecis de mas
            System.out.println("Empate");
        } else {
            int g = 2;
            switch (j1) {
                case "piedra":
                    if (j2 == "tijeras") {
                        g = 1;
                        System.out.println("Gano jugador uno");
                    }

                case "papel":
                    if (j2 == "piedra") {
                        g = 1;
                    }//la condicional no tenia bien cerrada su corchete
                        case "tijera":
                            if (j2.equals("papel")) {
                                g = 1;
                            }
                            break;
                        default:
                    }
                    System.out.println("Gana el jugador " + g);
            }
        }
    }
