public class coinflip
{
    public static void main(String[] args)
    {
       int heads = 0;
       int tails = 0;
       
       for(int flips = 100; flips > 0; flips--) {
           double randNum = Math.random();
           
           if (randNum >= 0.5 ) {
               heads = heads + 1;
             
               
           } else if (randNum < 0.5) {
               tails = tails + 1;
           }
       }
       System.out.println("Heads: " + heads);
       System.out.println("Tails: " + tails);
    }
}