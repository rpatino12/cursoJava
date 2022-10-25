public class DataTypes {
    public static void main(String[] args) {
        // Los datos primitivos en Java son todos estos: boolean, byte, char, short, int, long, float y double
        // Este tipo de dato tiene un rango de -128 a 127 (1 byte)
        byte numeroCorto = 127;
        System.out.println(numeroCorto);

        // Este tipo de dato tiene un rango de -32,768 a 32,767 (2 bytes)
        short numeroMediano = 32767;
        System.out.println(numeroMediano);

        // Este tipo de dato tiene un rango de -2,147,483,648 a 2,147,483,647 (4 bytes)
        int numeroEntero = 1234567890;
        System.out.println(numeroEntero);

        // Este tipo de dato tiene un rango casi infinito (8 bytes)
        // Recuerda poner la L al final, ademas se puede separar los puntos de miles con underscore para que sea mas legible
        long numeroGrande = 9_223_372_036_854_775_807L;
        System.out.println(numeroGrande);

        // Para los datos de tipo decimal hay dos categorias
        // Este tipo de dato tiene un tamaño de (4 bytes)
        // Recuerda poner la F al final
        float numeroDecimalF = 2.45658F;
        System.out.println(numeroDecimalF);

        // Este tipo de dato tiene un tamaño de (8 bytes) y es el tipo de dato que viene por defecto cuando trabajamos con decimales
        double numeroDecimalD = 3.141592653589793238;
        System.out.println(numeroDecimalD);

        // Tipos de datos char, tiene un tamaño de 2 bytes
        // Solo sirve para caracteres y se debe especificar con comillas simples
        char letra = 'b';
        System.out.println(letra);

        // Tipos de datos logicos
        boolean esMayor = true;
        boolean esMenor = false;
        System.out.println("La persona es mayor de edad? " + esMayor);

        // Con la palabra var a partir de Java 10, automaticamente Java va a inferir que tipo de dato es la variable
        var salary = 1000; // Tipo int
        // Pension es el 3% de las ganancias
        var pension = salary * 0.03; // Tipo double
        var totalSalary = salary - pension;
        System.out.println("Tu salario es igual a: " + salary);
        System.out.println("Tu pension es igual a: " + pension);
        System.out.println("Tu salario neto es igual a: " + totalSalary);
        var employeeName = "Ricardo";
        System.out.println("Employee: " + employeeName + "\n" + "Salary: " + totalSalary);
        System.out.println("La palabra reservada 'var' para declarar variables unicamente funciona con la maquina virtual de Java 10 en adelante, si tu entorno de produccion tiene una version menor de Java no es posible correr este codigo alli");
    }
}
