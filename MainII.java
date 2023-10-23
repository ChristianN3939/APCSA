public class MainII {
    public static void main(String[] args) {
      generateRandomPassword();
      generateRandomPassword();
      generateRandomPassword();

    }
    public static void generateRandomPassword () {
        String randLetter = "";
        for (int i = 0; i < 5; i++) {
            String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        double num = (Math.random() * alphabet.length);
        int numRound = (int)num;
        String letter = alphabet[numRound];   
        randLetter = randLetter + letter;

        }
      

        String randIntII = "";
        for (int i = 0; i < 3; i++) {
        String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        double randInt = (Math.random() * numbers.length);
        int randIntRound = (int)randInt;
        String number = numbers[randIntRound];
        randIntII = randIntII + number;
        }
       

       String randChar = "";
      
       for (int i = 0; i < 1; i++){
         String[] charS = {"-", "+", "=", "'", "!", "#", "$", "%", "&", "*"};
         double randCharII = (Math.random() * charS.length);
         int randCharIIRound = (int)randCharII;
         String charGet = charS[randCharIIRound];
         randChar = randChar + charGet;

       }
       System.out.println(randLetter + randIntII + randChar);
        
    }

}
