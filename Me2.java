package Lab2;

/**
 * Created by:
 * Created on:
 * Program to output details of Me
 */

public class Me2 {
    public static void main(String[] args) {
        String name = "Janet Allison";
        String address1 = "Room L130";
        String address2 = "University of Ulster";
        String address3 = "Cromore Road";
        String address4 = "Coleraine";
        String postcode = "BT52 1SA";
        String phone = "Ext. 24243";
        String email = "ja.allison@ulster.ac.uk";
        int heightFeet = 5, heightInches = 8;
        int weight = 140;
        System.out.println("Name:\t\t" + name + "\t\tAddress:\t" +
                address1);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t" + address2);
        System.out.println("Phone:\t\t" + phone + "\t\t\t\t\t\t" +
                address3);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t" + address4);
        System.out.println("email:\t\t" + email +"\t\t\t" + postcode +
                "\n");
        System.out.println("Height:\t\t" + heightFeet + "\'" +
                heightInches +"\"\t\t\t\tWeight:\t\t" + weight + "lbs");
    }//main
}//class