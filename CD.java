package Lab2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CD {
    DecimalFormat df = new DecimalFormat("0.00");
    Scanner keyboard = new Scanner(System.in);

    private int number = 0;
    private String artistName;
    private String albumTitle;
    private double costPrice;
    private double salePrice;
    private int releaseYear;
    private boolean singleCd; //false = double CD

    public CD() {
    }//Default constructor

    public CD(String nameOfArtist, String titleOfAlbum, int yearOfRelease, boolean isItASingleCd) {
        artistName = nameOfArtist;
        albumTitle = titleOfAlbum;
        releaseYear = yearOfRelease;
        singleCd = isItASingleCd;
    }//constructor2

    public CD(String nameOfArtist, String titleOfAlbum, double priceOfAlbum, double salePriceOfAlbum, int yearOfRelease, boolean isItASingleCd) {
        artistName = nameOfArtist;
        albumTitle = titleOfAlbum;
        costPrice = priceOfAlbum;
        salePrice = salePriceOfAlbum;
        releaseYear = yearOfRelease;
        singleCd = isItASingleCd;
    }//constructor3

    public void printAllInfo() {
        System.out.println("Artist Name:     " + artistName);
        System.out.println("Album Title:     " + albumTitle);
        System.out.println("Cost Price:      £" + costPrice);
        System.out.println("Sale Price:      £" + salePrice);
        System.out.println("Year Released:   " + releaseYear);
        System.out.print("Single/Double:   ");
            if (singleCd = true) {
                System.out.println("Single");
            }
            else {
                System.out.println("Double");
            }
    }

    public void getYear(int yearOfRelease) {
        releaseYear = yearOfRelease;
    }

    public void updatePrices(double newPrice) {
        newPrice = 4.00;
        costPrice = (costPrice + newPrice);
        salePrice = ((newPrice*2)+salePrice);
    }

    public void getProfit(double profit) {
        profit = salePrice-costPrice;
        System.out.println("\nProfit made is:  £" + profit);
    }
}//class