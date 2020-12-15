public class Grades {
    public static void main(String[] args){

        Grades grades1 = new Grades();
        grades1.average();
    }


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
        double sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
            System.out.println(sum);
        }
        return sum / 10;
    }

}


