import java.util.Scanner;

public class Boxes {
    public static void main(String[] args) {

        
        /* ¡Nos mudamos de piso! vamos a crear un pequeño programa que nos ayude a saber en que caja pusimos las siguientes cosas:

        Caja 0. Libros
        Caja 1. Utensilios de cocina
        Caja 2. Artículos de baño
        Caja 3. Bolsos
        Caja 4. Zapatos
        Caja 5. Cosas de verano
        Caja 6. Cosas de invierno
        */

        //Crea un array con las cosas que contienen las cajas

        //Pregunta al usuario lo siguiente: Hola, soy tu asistente de la organización ¿Qué deseas buscar? (la respuesta deberá aparecer en la terminal en la misma línea)

        //Crea un programa que te devuelva lo siguiente: <cosas> están en la caja <índice> en el caso de no existir que devuelva: <cosas> no las empacaste, oops!
        Scanner scanner = new Scanner(System.in);
        boolean found = false;
        String userAnswer;

        String[] boxes = {
                "Libros",
                "Utensilios de cocina",
                "Artículos de baño",
                "Bolsos",
                "Zapatos",
                "Cosas de verano",
                "Cosas de invierno"
        };

        System.out.println("Hola, soy tu asistente de la organización ¿Qué deseas buscar?");
        userAnswer = scanner.nextLine();

        for(int index = 0; index < boxes.length; index++){
            if (boxes[index].equalsIgnoreCase(userAnswer)){
                System.out.println(userAnswer + " están en la caja " + index + ".");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(userAnswer + " no las empacaste, oops!");
        }
    }
}
