public class LeapYear {

    public static void main(String[] args){

        int year= 4000;
        //int year= 1994;
 //ok test
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("rok "+year+" jest przestepny");
                }else{ System.out.println("rok "+year+" nie jest przestepny"); }
            }else {System.out.println("rok "+year+" jest przestepny");}
        }else{System.out.println("rok "+year+" nie jest przestepny");}
    }
}
