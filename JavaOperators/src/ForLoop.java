public class ForLoop {
    // Programa con 'For-loop' para utilizar la linterna del celular para que te puedas comunicar y escribir S.O.S con codigo morse automaticamente
    // S.O.S en codigo morse: (...___...) tres cortos, tres largos y tres cortos

    static boolean isLightTurnedOn = false;


    public static void main(String[] args) {
        turnOnOffTheLight();

        for (int i = 0; isLightTurnedOn && i < 10; i++) {
            printSOS();
        }

        // Vamos a ver el uso de las palabras reservadas 'continue' y 'break' dentro de los ciclos

        // Break: Si deseamos que el ciclo termine antes al momento de encontrar un valor que cumpla con la condicion especificada
        // El ciclo para al encontrar un numero igual a 4
        for (int i = 0; i < 10; i++) {
            if (i == 4){
                System.out.println("");
                break;
            }
            else {
                System.out.println("i: " + i);
            }
        }

        // Continue: Si deseamos que la iteracion termine y pase a la siguiente iteracion
        // La iteracion pasa a la siguiente al encontrar un numero igual a 4, entonces imprimira todos los numeros menos el 4
        for (int i = 0; i < 10; i++) {
            if (i == 4){
                continue;
            }
            else {
                System.out.println("i: " + i);
            }
        }
    }

    // Metodo para imprimir un mensaje de S.O.S en codigo morse
    public static void printSOS() {
        System.out.println(". . . _ _ _ . . .");
    }

    // Metodo para que responda al touch del usuario y prenda o apague la linterna
    public static boolean turnOnOffTheLight(){
        // Usando un if statement pero con el operador ternario
        isLightTurnedOn = (isLightTurnedOn) ? false:true;
        return isLightTurnedOn;
    }
}
