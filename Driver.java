package BowlerEquals;


/**
 * This is a short driver to test the equals method
 * for the Bowler class
 *
 * @auther Arion Almond
 * @author L. Lehmann
 * @version 3/13/2016
 */
public class Driver
{
   public static void main(String[ ] args)
   {
       Bowler b1, b2;//declare two reference variables

       //create two Bolwer objects and assign their addresses to the reference variables
       //keep changing the values of these initial fileds and run to see the different outputs.
       b1 = new Bowler("Norton", "Ralph", 234 );
       b2 = new Bowler("Norton", "Ed", 234 );
       //print the contents of the two Bolwer objects using the toString( ) method I wrote in the Bowler class
       System.out.println(b1);
       System.out.println(b2);

       //b1.equals(b2) means b1 is calling the equals method and b2 is the parameter to the equals method
       //that I wrote in the Bowler class
         if(b1.equals(b2))
         {
             System.out.println("The two Bowlers should be considered the Same ");
         }
         else
         {
            System.out.println("The two Bowlers should be considered different Different");
          }


    }
}
