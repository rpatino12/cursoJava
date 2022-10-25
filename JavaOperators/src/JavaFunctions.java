public class JavaFunctions {
    public static void main(String[] args) {

        double radius = 3;
        // Area de un circulo
        double areaCircle = calculateCircleArea(radius);
        System.out.println(areaCircle);

        // Area de una esfera
        System.out.println(calculateSphereArea(radius));

        // Volumen de una esfera
        double sphereVolume = calculateSphereVolume(radius);
        System.out.println((int) sphereVolume);

        // Convertir pesos colombianos a dólares
        System.out.println("Tienes $" + convertToDollars(200, "MXN") + " dolares");
    }


    // Las funciones deben estar al nivel de la clase
    // Funcion para calcular el area de un circulo: PI * r^2
    /**
     * Descripción: Función que especificando el radio, calcula el área de un círculo
     * @param r Radio del círculo
     * @return Devuelve el área del círculo
     */
    // La palabra reservada 'static' solo aplica para metodos que comparten el metodo main
    public static double calculateCircleArea(double r){
        return Math.PI * Math.pow(r, 2);
    }


    // Funcion para calcular el area de una esfera: 4 * PI * r^2
    /**
     * Descripción: Función que especificando el radio, calcula el área de una esfera
     * @param r Radio de la esfera
     * @return Devuelve el área de la esfera
     */
    public static double calculateSphereArea(double r){
        return 4 * Math.PI * Math.pow(r, 2);
    }


    // Funcion para calcular el volumen de una esfera: (4/3) * PI * r^3

    /**
     * Descripción: Función que especificando el radio, calcula el volumen de una esfera
     * @param r Radio de la esfera
     * @return Devuelve el volumen de la esfera
     */
    public static double calculateSphereVolume(double r){
        return (4/3) * Math.PI * Math.pow(r, 3);
    }


    // Funcion para conversion de moneda
    /**
     * Descripción: Función que especificando su moneda (COP, MXN, ARS) convierte una cantidad de dinero a dólares
     *
     * @param quantity Cantidad de dinero a convertir
     * @param currency Tipo de moneda: Solo acepta COP, MXN o ARS
     * @return dollars Devuelve la cantidad equivalente en dólares
     * */
    public static double convertToDollars(double quantity, String currency){
        double dollarValue;
        double dollars;
        // Evaluo que tipo de moneda estoy conviertiendo COP, MXN, ARS
        switch (currency){
            case "COP":
                dollarValue = 3780.48;
                break;
            case "MXN":
                dollarValue = 19.58;
                break;
            case "ARS":
                dollarValue = 121.27;
                break;
            default:
                dollarValue = 1;
        }
        System.out.println("El valor del dolar es de: " + dollarValue + " " + currency);
        dollars = quantity / dollarValue;
        return dollars;
    }
}
