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
    double average() {
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return sum / 10;
    }

}


