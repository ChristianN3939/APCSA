import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String empty = " hello there";
        greet("Miku");
        greet("Christian");
        fullName("Miku", "Hatsune");
        emptySpace(empty);
        numChar("Miku is my love!");
        reverseName("Miku", "Hatsune");
        timesFive("Miku is my love!");
        nTimes("Miku is my love!", 3);
        compareStr("Hatsune Miku", "Random IV");
        palindrome("Miku");
        
    }



public static void greet (String name) {
     System.out.println("Greetings, " + name);
}

public static void fullName (String firstName, String lastName) {
    System.out.println(firstName + " " + lastName);
}

public static void emptySpace (String empty) {
    empty = empty.substring(1);
  System.out.println(empty);
}

public static void numChar(String str) {
    int numOf = str.length();
     System.out.println("This string has " + numOf + " characters.");
}

public static void reverseName (String firstName, String lastName) {
    System.out.println(lastName + " " + firstName);
}

public static void timesFive (String message) {
    for (int i = 0; i < 5; i++) {
     System.out.println(message);
}

}   

public static void nTimes (String message, int n) {
    for (int i = 0; i < n; i++) {
     System.out.println(message);    
    }
}
public static void compareStr (String str, String strI) {
    int lengthOne = str.length();
    int lengthTwo = strI.length();
    if (lengthOne > lengthTwo) {
     System.out.println("The first string is longer.");
 } else if (lengthTwo > lengthOne) {
     System.out.println("The second string is longer.");
}  else if (lengthOne == lengthTwo) {
     System.out.println("They are the same length.");
}  

}
public static void palindrome (String str) {
   String reverseStr = "";
   for (int i = 0; i < str.length() - 1; i++) {
       reverseStr = reverseStr + str.substring(1, i - 1);
   }
      System.out.println(reverseStr);
}

}