public class Loops {
    public static void main(String[] args) {

        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        int numberOfNumbers = numbers.length;

        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }

            sumAndDisplay(numbers[0], numbers[1], numbers[2], numbers[3], numbers[4]);

    }
    private static void sumAndDisplay(int a, int b, int c, int d, int f) {
        int result = a + b + c + d + f;

        System.out.println("sum of numbers is: "+result);
    }

}
