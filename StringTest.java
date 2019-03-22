package Lab9;


public class StringTest {

    public static void main(String[] args) {

        char firstLetter, letter;

        String thisString = "ABC";
        String thatString = "abc";
        String someString = "aBc";
        String anyString = "MIXtuRe OF Upper AND lower";
        String spaceyString = "   R YY   ";
        String bigString = "ABCDEFGHIJ";
        String myString;

        boolean areTheSame;

        int size, position;

        // Assign the first letter of thisString to firstLetter and print
        // out the value of firstLetter
        firstLetter = thisString.charAt(0);
        System.out.print("The value of the first letter in the String ");
        System.out.println(thisString + " is " + firstLetter + "\n");

        // Assign the second letter of thisString to letter and print
        // out the value of letter
        letter = thisString.charAt(1);
        System.out.print("The value of the second letter in the String ");
        System.out.println(thisString + " is " + letter + "\n");

        // Test if thisString and thatString are the same and print out
        // the result
        areTheSame = thisString.equals(thatString);
        System.out.print("The 2 Strings '" + thisString + "' and '");
        System.out.print(thatString + "'");
        if (areTheSame) {
            System.out.println(" are the same" + "\n");
        }//if
        else {
            System.out.println(" are NOT the same" + "\n");
        }//else

        // Test if thisString and thatString are the same (ignoring case)
        // and print out the result
        areTheSame = thisString.equalsIgnoreCase(thatString);
        System.out.print("IGNORING CASE the 2 Strings '" + thisString);
        System.out.print("' and '" + thatString + "'");
        if (areTheSame) {
            System.out.println(" are the same" + "\n");
        }//if
        else {
            System.out.println(" are NOT the same" + "\n");
        }//else

        // Assign the length of thisString to size and print out the result
        size = thisString.length();
        System.out.print("The length of the String: '" + thisString);
        System.out.println("' is " + size + " characters" + "\n");

        // Assign the number of characters in bigString to size and print
        // out the result
        size = bigString.length();
        System.out.print("The length of the String: '" + bigString);
        System.out.println("' is " + size + " characters" + "\n");

        // Assign myString to the third to ninth characters of anyString.
        // Print out anyString and myString
        myString = anyString.substring(2, 9);
        System.out.println("anyString = " + anyString);
        System.out.println("myString = " + myString + "\n");

        // Assign myString to spaceyString, trimming leading and trailing
        // spaces. Print out both spaceyString and myString
        myString = spaceyString.trim();
        System.out.println("spaceyString = " + spaceyString);
        System.out.println("myString = " + myString + "\n");

        // Change someString to all lowercase letters. Print out the initial
        // and final values of someString
        System.out.println("INITIALLY someString = " + someString);
        someString = someString.toLowerCase();
        System.out.println("FINALLY someString = " + someString + "\n");

        // Replace all occurrences of the letter 'r' with 'S' in anyString.
        // Print out the initial and final values of anyString
        System.out.println("INITIALLY anyString = " + anyString);
        anyString = anyString.replace('r', 'S');
        System.out.println("FINALLY anyString = " + anyString + "\n");

        // Change someString to the uppercase version of someString and print
        // out the result
        System.out.println("INITIALLY someString = " + someString);
        someString = someString.toUpperCase();
        System.out.println("FINALLY someString = " + someString + "\n");

        // Concatenate anyString and someString and store in anyString.
        // Print out the initial and final values of anyString
        System.out.println("INITIALLY anyString = " + anyString);
        anyString = anyString.concat(someString);
        System.out.println("FINALLY anyString = " + anyString + "\n");

        // Assign letter to the last character of anyString and print out the
        // position and value of the last character
        position = anyString.length() - 1;
        letter = anyString.charAt(position);
        System.out.print("The last letter of the String '" + anyString);
        System.out.print("' is '" + letter + "' and is the ");
        System.out.println((position + 1) + "th letter");

    } //main
} //class
