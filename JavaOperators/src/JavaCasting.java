public class JavaCasting {
    public static void main(String[] args) {

        // En un año ubicar 30 perritos
        // Cuantos perritos ubiqué al mes?

        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        // Estimacion: Perritos al mes, pq es una variable de tipo entera y no puedo tener 2.5 perritos
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

        // Exactitud
        int a = 50;
        int b = 12;

        // Exactitud: Aqui si quiero saber el promedio mensual exacto, entonces hago un casting y convierto el resultado a un numero decimal
        System.out.println((double) a/b);

        double c = (double) a/b;
        System.out.println(c);

        // Aqui el casting se hace de forma implicita, es decir la letra 'a' se convierte automaticamente en un numero entero (que en este caso es el codigo ascii de la letra a minuscula)
        char n = 'a';
        int numeroEntero = n;
        System.out.println(numeroEntero);

        // Aqui el casting se debe de hacer de forma explicita, tengo que especificar la conversion ya que un dato de tipo char no cabe dentro de un dato short
        short nS = (short) n;
        System.out.println(nS);

        System.out.println("Actualizando el archivo .jar");
    }
}
