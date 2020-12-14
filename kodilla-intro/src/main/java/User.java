public class User {

    public static void main(String[] args) {
        User dawid = new User("Dawid", 30);
        User maciek = new User("Maciek", 23);
        User rafal = new User("Rafal", 14);
        User krzysiek = new User("Krzysiek", 35);
        User mirek = new User("Mirek", 31);

        User[] users = {dawid, maciek, rafal, krzysiek, mirek};

    }

    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }


    //public double average() {
     //   int sum = 0;
      //  for (int i = 0; i < getAge(); i++) {
      //      sum = sum + getAge()[i];
     //   }
     //   return sum / 5;

   // }
}

