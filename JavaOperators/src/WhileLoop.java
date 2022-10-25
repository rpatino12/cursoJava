public class WhileLoop {
    // Programa para utilizar la linterna del celular para que te puedas comunicar y escribir S.O.S con codigo morse automaticamente
    // S.O.S en codigo morse: (...___...) tres cortos, tres largos y tres cortos

    static boolean isLightTurnedOn = false;


    public static void main(String[] args) {
        turnOnOffTheLight();

        // Para que no se repita el ciclo while infinitamente, agregamos una variable i que sera el numero de veces que se repita el mensaje de S.O.S
        int i = 0;
        while (isLightTurnedOn && i < 10) {
            printSOS();
            i++;
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
