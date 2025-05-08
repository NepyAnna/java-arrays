public class Welcome {
    public static void main(String[] args) {

        //Crea un array que contenga 5 nombres de coders y con un bucle 'for-each' imprime: ¡Hola <name>, bienvenida a Java!
        String [] coderNames = {"Anna", "Saba", "Nia", "Iris", "More"};

        for(String name: coderNames) {
            System.out.println("¡Hola " + name + ", bienvenida a Java!");
        }

        //Escribe un bucle 'for' que imprima solo los siguientes números: 10 - 30 - 50 - 70 - 90 del array numbers, sin modificarlo ni creando uno nuevo
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        for (int index = 0; index < numbers.length; index++) {
            if(index % 2 == 0) {
                System.out.println(numbers[index]);
            }
        }
        //Crea un array que contenga algunos números y usa un bucle 'for-each' e imprime cada número duplicado (multiplicado por 2)

        int[] numberDuplicates = {3, 7, 1, 4, 9};

        for (int item : numberDuplicates) {
            System.out.println(item * 2);
        }

        //Crea un array de tipo char que contenga las vocales en minúsculas y usa un bucle 'for-each' e imprime cada vocal en mayúsculas

        char[] characters = {'a', 'b', 'c', 'd', 'e', 'f'};

        for(char item : characters) {
            System.out.println(Character.toUpperCase(item));
        }
    }
}
