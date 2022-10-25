public class IfStatement {
    public static void main(String[] args) {

        // Vamos a hacer un programa para un dispositivo movil y que envie un archivo via bluethoot
        boolean isBluethootEnabled = false;
        int fileSended = 3;

        if (isBluethootEnabled)
        {
            //Send file
            fileSended++;
            System.out.println("Archivo enviado");
        }
        else
        {
            fileSended--;
            System.out.println("No se pudo enviar el archivo, por favor enciende el bluethoot");
        }
        System.out.println(isBluethootEnabled);
        System.out.println(fileSended);

        // Operador ternario
        int edad = 12;
        String adulto;
        adulto = (edad >= 18)? "Si": "No";
        System.out.println("Es mayor de edad: " + adulto);
    }
}
