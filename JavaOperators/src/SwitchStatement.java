public class SwitchStatement {
    public static void main(String[] args) {

        // Programa para cambiar los modos de pantalla de light to dark
        String colorModeSelected = "Light";

        switch (colorModeSelected) {
            case "Light":
                System.out.println("Change to light mode");
                break;
            case "Night":
                System.out.println("Change to night mode");
                break;
            case "Blue Dark":
                System.out.println("Change to blue dark mode");
                break;
            case "Dark":
                System.out.println("Change to dark mode");
                break;
            default:
                System.out.println("Select a correct option");
        }
    }
}
