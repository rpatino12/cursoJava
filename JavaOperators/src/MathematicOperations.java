public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        // El metodo ceil devuelve un entero hacia arriba, pero el dato sigue siendo de tipo double
        System.out.println(Math.ceil(x));

        // El metodo floor devuelve un entero hacia abajo, pero el dato sigue siendo de tipo double
        System.out.println(Math.floor(x));

        // Para redondear un numero al entero mas cercano, aqui el dato que devuelve seria de tipo int
        System.out.println(Math.round(x));

        // Devuelve un numero elevado a otro, el primer parametro es la base y el segundo es la potencia
        System.out.println(Math.pow(y, 3));

        // Devuelve el numero mayor
        System.out.println(Math.max(x, y));

        // Devuelve la raiz cuadrada
        System.out.println(Math.sqrt(25));

        // Area de un circulo: PI * r^2
        System.out.println(Math.PI * Math.pow(y, 2));

        // Area de una esfera: 4 * PI * r^2
        System.out.println(4 * Math.PI * Math.pow(y, 2));

        // Volumen de una esfera: (4/3) * PI * r^3
        double volumenEsfera = (4/3) * Math.PI * Math.pow(y, 3);
        System.out.println((int) volumenEsfera);
    }
}
