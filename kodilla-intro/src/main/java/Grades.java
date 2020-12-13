public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    //metoda zwraca ostatnio dodaną wartość
    public int returnAdd(int value) {
        return value;
    }

    //metoda oblicza srednia ocen
    public static void average(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j) {
        double result = (a + b + c + d + e + f + g + h + i + j) / 10;

        System.out.println(result);
    }

}
