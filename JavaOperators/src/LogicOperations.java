public class LogicOperations {
    public static void main(String[] args) {

        int x = 8;
        int y = 5;

        System.out.println("x es igual a y? -> " + (x == y));
        System.out.println("x es diferente a y? ->" + (x != y));

        // Operadores relacionales
        System.out.println("x es mayor a y? -> " + (x > y));
        System.out.println("x es menor a y? -> " + (x < y));
        System.out.println("x es mayor o igual a y? -> " + (x >= y));
        System.out.println("x es menor o igual a y? -> " + (x <= y));

        if (x == y){
            System.out.println("x es igual a y");
        } else if (x != y) {
            System.out.println("x es diferente a y");
        } else if (x > y) {
            System.out.println("x es mayor a y");
        } else if (x < y) {
            System.out.println("x es menor a y");
        } else if (x >= y) {
            System.out.println("x es mayor o igual a y");
        } else if (x <= y) {
            System.out.println("x es menor o igual a y");
        }
    }
}
