public class RandomNumbers {

    public static void main(String[] args){

        int sumaLiczb= 0;
        int wylosowanaLiczba;

        while(sumaLiczb>5000) {
            wylosowanaLiczba = (int)(1+Math.random()*30);
            sumaLiczb = wylosowanaLiczba + wylosowanaLiczba;
            System.out.println(sumaLiczb);
        }
    }
}
