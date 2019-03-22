package Lab2;

/**
 * Created by
 * Program will
 */

public class CardboardBox {
    //Define class variables
    private int width = 0, height = 0, depth = 0, numberOfBoxes = 0;
    private String colour;


    public CardboardBox() {
        numberOfBoxes = numberOfBoxes ++;
    }//Default Constructor

    public CardboardBox(int widthOfBox, int heightOfBox, int depthOfBox, String colourOfBox) {
        width = widthOfBox;
        height = heightOfBox;
        depth = depthOfBox;
        colour = colourOfBox;
        numberOfBoxes = numberOfBoxes ++;
    }//Alternative Constructor 1

    public CardboardBox(int widthOfBox, int heightOfBox, int depthOfBox) {
        width = widthOfBox;
        height = heightOfBox;
        depth = depthOfBox;
        numberOfBoxes = numberOfBoxes ++;
    }//Alternative Constructor 2

//    public void setWidth(int widthOfBox) {
//        width = widthOfBox;
//    }
//    public int getWidth() {
//        return width;
//    }
//
//    public void setHeight(int heightOfBox) {
//        height = heightOfBox;
//    }
//    public int getHeight() {
//        return height;
//    }
//
//    public void setDepth(int depthOfBox) {
//        depth = depthOfBox;
//    }
//    public int getDepth() {
//        return depth;
//    }

    //set and get as per above only in two sections not 6
    public void setBox(int widthOfBox, int heightOfBox, int depthOfBox) {
        width = widthOfBox;
        height = heightOfBox;
        depth = depthOfBox;
    }
    public void getBox(int widthOfBox, int heightOfBox, int depthOfBox) {
        width = widthOfBox;
        height = heightOfBox;
        depth = depthOfBox;
    }

    private int volume() {
        return (width * height * depth);
    }

    public void showAllDetails() {
        System.out.println("The WIDTH of the cardboard box is " + width + " units.");
        System.out.println("The HEIGHT of the cardboard box is " + height + " units.");
        System.out.println("The DEPTH of the cardboard box is " + depth + " units.");
        System.out.println("The VOLUME of the cardboard box is " + volume() + " units.");
    }

    public void printTopArea(int area) {
        area = (width * depth);
        System.out.println("The area of the top of the cardboard box is " + area + " units.");
    }
    public void printFrontArea(int area) {
        area = (width * height);
        System.out.println("The area of the front of the cardboard box is " + area + " units.");
    }
    public void printSideArea(int area) {
        area = (height * depth);
        System.out.println("The area of the side of the cardboard box is " + area + " units.");
    }

}//class