public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2015);
        System.out.println("waga: "+notebook.weight+"g, rok: "+notebook.year+", cena: "+notebook.price+"zl");
        notebook.checkPriceAndYear();
        notebook.checkWeight();
        System.out.println("\n");

        Notebook heavyNotebook = new Notebook(2000, 1500, 2020);
        System.out.println("waga: "+heavyNotebook.weight+"g, rok: "+heavyNotebook.year+", cena: "+heavyNotebook.price+"zl");
        heavyNotebook.checkPriceAndYear();
        heavyNotebook.checkWeight();
        System.out.println("\n");

        Notebook oldNotebook = new Notebook(1500, 500, 2001);
        System.out.println("waga: "+oldNotebook.weight+"g, rok: "+oldNotebook.year+", cena: "+oldNotebook.price+"zl");
        oldNotebook.checkPriceAndYear();
        oldNotebook.checkWeight();
        System.out.println("\n");

        Notebook gameNotebook = new Notebook(800, 2000, 2019);
        System.out.println("waga: "+gameNotebook.weight+"g, rok: "+gameNotebook.year+", cena: "+gameNotebook.price+"zl");
        gameNotebook.checkPriceAndYear();
        gameNotebook.checkWeight();
        System.out.println("\n");

        Notebook macNotebook = new Notebook(100, 8000, 2014);
        System.out.println("waga: "+macNotebook.weight+"g, rok: "+macNotebook.year+", cena: "+macNotebook.price+"zl");
        macNotebook.checkPriceAndYear();
        macNotebook.checkWeight();
        System.out.println("\n");

        //Te wiersze pod spodem to jest cos co chcialbym poruszyc na nastepniej rozmowie jbc ;)
        //SimpleArray simpleArray = new SimpleArray();
        //System.out.println(simpleArray.name);
    }
}