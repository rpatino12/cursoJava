public class IncrementDecrement {
    public static void main(String[] args) {
        // Operadores de incremento y decremento de forma posfija
        int lives = 5;
        lives = lives - 1;
        System.out.println(lives); // 4

        lives--;
        System.out.println(lives); // 3

        lives++;
        System.out.println(lives); // 4

        // Gana un regalo por ganar una vida
        int gift = 100 + lives++; // Posfijo unicamente accede al valor de la variable y la usa tal como esta y despues la incrementa en otro proceso
        System.out.println(gift); // 104
        System.out.println(lives); // 5

        // Operadores de incremento y decremento de forma prefija

        gift = 100 + ++lives; // Prefijo incrementa la variable primero y la usa
        System.out.println(gift);
        System.out.println(lives); // 6
    }
}
