import java.util.Scanner;

public class switchColour {

    public static void main(String[] args){

        switchColour yourColour = new switchColour();
        String selectedColor = yourColour.chooseColour();
        System.out.println("Your colour is: " + selectedColor);

    }


    public static String chooseColour() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Which color do you choose? (Y-yellow, R-red, B-blue, G-green, W-white):");
            String colour = scanner.nextLine().trim().toUpperCase();
            String selectedColor = "";
            switch (colour) {
                case "Y":
                    selectedColor = "Yellow";
                    break;
                case "R":
                    selectedColor = "Red";
                    break;
                case "B":
                    selectedColor = "Blue";
                    break;
                case "G":
                    selectedColor = "Green";
                    break;
                case "W":
                    selectedColor = "White";
                    break;
                default:
                    System.out.println("There is no such color. Try again.");
                    break;
            }return selectedColor;
        }
    }
}