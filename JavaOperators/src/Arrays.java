public class Arrays {
    public static void main(String[] args) {
        // Los nombres de los arrays deben ir en plural y se declara con la palabra reservada 'new', ya que un array es un objeto
        String[] androidVersions = new String[17];

        // Tambien se pueden ubicar los square brackets despues del nombre del array
        String weekDays[] = new String[7];
        weekDays[0] = "monday";
        weekDays[1] = "tuesday";
        weekDays[2] = "wednesday";
        weekDays[3] = "thursday";
        weekDays[4] = "friday";
        weekDays[5] = "saturday";
        weekDays[6] = "sunday";

        for (String day:weekDays) {
            if (day != null){
                System.out.println(day);
            }
        }
        System.out.println();

        String[][] cities = new String[4][2]; // elementos en total 4 * 2 = 8

        // Ya cuando tengo arreglos de 3 dimensiones es mejor llevar esos elementos a una base de datos
        int[][][] numbers = new int[2][2][2];

        // Arreglos de 3 y 4 dimensiones no son muy utilizados en programas para manejo de datos, sino que son mas utiles en calculos numericos
        int[][][][] numbers4 = new int[2][2][2][2];

        // Vamos a llenar el array de android versions
        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Banana bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

//        System.out.println(androidVersions[0]);
//        System.out.println(androidVersions[1]);
//        System.out.println(androidVersions[2]);
//        System.out.println(androidVersions[3]);

//        for (int i = 0; i < androidVersions.length; i++) {
//            if (androidVersions[i] == null){
//                break;
//            } else {
//                System.out.println(androidVersions[i]);
//            }
//        }

        for (String version:androidVersions) {
            if (version == null) {
                break;
            } else {
                System.out.println(version);
            }
        }

        // Agregamos un doble salto de linea, para mejorar el formato de salida
        System.out.println();
        System.out.println();

        // Ahora llenemos el array de dos dimensiones
        /*
        * +-----------------------+
        * |  Country  |  City     |
        * -------------------------
        * | Mexico    |  CDMX     |  // 3
        * | Mexico    |  Cancun   |  // 2
        * | Colombia  |  Bogota   |  // 1
        * | Colombia  |  Medellin |  // 0
        * +-----------------------+
        *  */  // 0        // 1

        // el primer indice son las filas y el segundo las columnas
        cities[0][0] = "Colombia";
        cities[0][1] = "Medellin";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogota";
        cities[2][0] = "Mexico";
        cities[2][1] = "Cancun";
        cities[3][0] = "Mexico";
        cities[3][1] = "CDMX";

        /*System.out.println(cities[0][0]);
        System.out.println(cities[0][1]);
        System.out.println(cities[1][0]);
        System.out.println(cities[1][1]);
        System.out.println(cities[2][0]);
        System.out.println(cities[2][1]);
        System.out.println(cities[3][0]);
        System.out.println(cities[3][1]);*/

        /*for (int i = 0; i < cities.length; i++) {
            // con este segundo for loop accedo a cada fila y para saber cuantos elementos tiene simplemente llamo 'cities[i].length'
            for (int j = 0; j < cities[i].length; j++) {
                System.out.println(cities[i][j]);
            }
            
        }*/

        for (String[] row : cities) {
            for (String element : row) {
                System.out.println(element);
            }
        }

        System.out.println();
        System.out.println();

        // Ahora llenemos el array de 4 dimensiones con un mono dentro de la fila 1, columna 0, elemento 0, elemento 1, en este caso es mejor utilizar una base de datos
        String[][][][] animals = new String[2][3][2][2];
        animals[1][0][0][1] = "Monkey";
//        System.out.println(animals[1][0][0][1]);

        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 0 ; j++) {
                for (int k = 0; k <= 0; k++) {
                    for (int l = 0; l <= 1; l++) {
                        System.out.println(animals[i][j][k][l]);
                    }
                }
            }
        }
    }
}
