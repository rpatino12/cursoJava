public class EjercicioClase21 {
    public static void main(String[] args) {

        // Primer ejercicio
        String papa = "Guillermo";
        int edadPapa = 65;
        String mama = "Myriam";
        int edadMama = 61;
        String hermanaMayor = "Paulina";
        int edadHermanaMayor = 32;
        String hermanaMenor = "Emanuela";
        int edadHermanaMenor = 30;
        String yo = "Ricardo";
        int edad = 26;

        System.out.println("Mi familia esta compuesta por: " + "\n" +
                "Papa: " + papa + " tiene " + edadPapa + " años" + "\n" +
                "Mama: " + mama + " tiene " + edadMama + " años" + "\n" +
                "Hermana: " + hermanaMayor + " tiene " + edadHermanaMayor + " años" + "\n" +
                "Hermana: " + hermanaMenor + " tiene " + edadHermanaMenor + " años" + "\n" +
                "Yo: " + yo + " tengo " + edad + " años" + "\n");

        // Segundo ejercicio
        char caracter = 'z';
        int caracterInt = caracter;
        // Como pasa de un tipo de variable mas pequeño a uno mas grande el casting se hace de forma implicita
        System.out.println("Char convertido a integer : " + caracterInt + " - Valor Correspondiente de z en la tabla ASCII"); // 122

        int entero = 250;
        long enteroL = entero;
        // Como pasa de un tipo de variable mas pequeño a uno mas grande el casting se hace de forma implicita
        System.out.println(enteroL);
        // Como pasa de un tipo de variable mas grande a uno mas pequeño el casting se hace de forma explicita
        short enteroS = (short) enteroL;
        System.out.println(enteroS);

        double numeroFlotante = 301.067;
        long numeroFlotanteL = (long) numeroFlotante;
        // Como pasa de un tipo de variable mas grande a uno mas pequeño el casting se hace de forma explicita
        System.out.println(numeroFlotanteL);

        int i = 100;
        // Como pasa de un tipo de variable mas pequeño a uno mas grande el casting se hace de forma implicita
        float iFloat = i;
        iFloat += 5000.66;
        System.out.println(iFloat);

        int numero = 737;
        numero *= 100;
        System.out.println(numero);
        // Como pasa de un tipo de variable mas grande a uno mas pequeño el casting se hace de forma explicita
        byte numeroByte = (byte) numero;
        System.out.println("Un dato de tipo entero convertido a byte pasan cosas raras: 737000 = " + numeroByte);

        double decimal = 298.638;
        decimal /= 25;
        System.out.println(decimal);
        // Como pasa de un tipo de variable mas grande a uno mas pequeño el casting se hace de forma explicita
        long numerito = (long) decimal;
        System.out.println(numerito);
    }
}
