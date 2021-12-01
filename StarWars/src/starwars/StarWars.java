package starwars;

import java.util.Scanner;

/**
 *
 * @author William Atef Tadrous
 */
public class StarWars {

    public static void main(String[] args) {
        boolean gameOver = false; //Este booleano me indicará cuando el jugador ha perdido para poder finalizar la partida
        Scanner sc = new Scanner(System.in);
        long v1, v2, total, res; //Declaro cuatro variables de enteros las cuales reasignaré en todo el programa para ahorrar memoria.

        //Pantalla PERDER
        if (gameOver) { //Solo se ejecutará cuando el jugador pierda.
            System.out.println("Ese no era el código correcto... La misión ha sido un fracaso... :( :( :\n"
                    + "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");
        } else { //En caso contrario, el jugador habrá ganado.
            System.out.println("Luke Skywalker introduce el tiempo correcto, activa el\n"
                    + "temporizador y empiezan a sonar las alarmas. Salen de allí\n"
                    + "corriendo, no hay tiempo que perder. La nave se convierte  en un\n"
                    + "hervidero de soldados de arriba a abajo y entre el caos que les\n"
                    + "rodea consiguen llegar a la nave y salir de allí a toda prisa. A\n"
                    + "medida que se alejan observan por la ventana la imagen de la\n"
                    + "colosal estrella de la muerte explotando en el silencio del espacio,\n"
                    + "desapareciendo para siempre junto a los restos del malvado\n"
                    + "imperio.\n"
                    + "¡Has salvado la galaxia gracias a la Fuerza Jedi de las matemáticas!\n"
                    + "Enhorabuena ;D");
        }

        //FIN
        System.out.println("Gracias por jugar :D");
    }

}
