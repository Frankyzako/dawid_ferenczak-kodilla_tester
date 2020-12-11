public class Notebook {
    int weight;
    int price;
    int year;


    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 600 || this.price < 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight < 1000) {
            System.out.println("This notebook is very light.");
        } else if (this.weight > 1000 || this.weight < 2000) {
            System.out.println("The notebook is not very heavy.");
        } else {
            System.out.println("This notebook is heavy.");
        }
    }

    public void checkPriceAndYear() {
        if (this.price < 600 || this.year < 2015) {
            System.out.println("This notebook is very cheap and old.");
        } else if (this.price > 600 || this.price < 1000 || this.year < 2015) {
            System.out.println("The price is good, but notebook is old");
        } else if (this.price > 600 || this.price < 1000 || this.year > 2015 ){
            System.out.println("The price is good and notebook is new");
        }else if ( this.price < 600 || this.year > 2015 ){
            System.out.println("This notebook is very cheap and new");
        } else if ( this.price > 1000 || this.year > 2015 ){
            System.out.println("This notebook is expensive and new");
        }else {
            System.out.println("This notebook is expensive and old");
        }
    }

}

