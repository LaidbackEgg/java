package Lab2;

public class TestCD {
    public static void main (String [] args) {
    // CD1
    CD myCD = new CD("Bob Marley", "Legend",
            1980, true);
        myCD.printAllInfo();
        System.out.print("\n");

    // CD2
    CD yourCD = new CD("Bonnie Raitt", "Nick of Time",
            6.25, 11.99, 1989, true );
        yourCD.printAllInfo();

        myCD.getProfit(0);

    }//main
}//TestCD class
