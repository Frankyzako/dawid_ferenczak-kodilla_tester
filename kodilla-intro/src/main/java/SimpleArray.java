public class SimpleArray {
    public static void main(String[] args) {
        String[] names = new String[5];
        names[0]="Dawid";
        names[1]="Wiesiek";
        names[2]="Zdzisek";
        names[3]="Stasek";
        names[4]="Mietek";

        String  name = names[2];

       System.out.println(name);

        int numberOfElements = names.length;

        System.out.println("My board has: " + numberOfElements + " objects");
    }
}
