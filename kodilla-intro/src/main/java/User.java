public class User {
    public static void main(String[] args) {
    User dawid = new User("Dawid", 10);
    User maciek = new User("Maciek", 23);
    User rafal = new User("Rafal", 14);
    User krzysiek = new User("Krzysiek", 35);
    User mirek = new User("Mirek", 31);

    User[] users = {dawid, maciek, rafal, krzysiek, mirek};

    int sum = 0;
    for (int i = 0; i < users.length; i++) {
        sum = sum + users[i].getAge();
    }
    double av= sum / users.length;
    System.out.println("Srednia wieku uzydkowników to: " + av);

        for(int i = 0; i <= 4; i++){
            if(av>users[i].getAge()){
                System.out.println("Uzydkownicy ktorych wiek jest ponizej sredniej to: \n" + users[i].getName());
            }
        }


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

}

