package BowlerEquals;


/**
 * This class holds basic information about a Bowler.
 * It is used as an example of the toString( ) method and the equals( )
 * method.
 * 
 * @author L. Lehmann 
 * @version 3/10/2014
 */
public class Bowler
{
    private String lastName;
    private String firstName;
    private double highScore;
    
   //the default, no-args constructor
    public Bowler( )
    {
       lastName = new String("unknown");
       firstName = new String("unknown");
        highScore = 0;
    }
    
    //the constructror that allows the user of this class to provide initiall values
    //for the three fields
    public Bowler(String inL, String inF, double inH)
    {
        lastName = new String(inL);
        firstName = new String(inF);
        highScore = inH;
    }
   
    public String getLastName( )
    {
        return lastName;
    }
    
    public String getFirstName( )
    {
        return firstName;
        
    }
    
    public double getHighScore( )
    {
        return highScore;
    }
    
   //the toString method MUST have this header
   //the toString( ) method returns a textual representation of the state of the object
    public String toString( )
    {
        return firstName + "  " + lastName + " " + highScore;
    }
    
    //the equals( ) method can be called to determine if two distinct
    //Bowler obhjects should be considered "equal"
    //The equals( ) method returns true if the objects should be considered
    //equivalent and false if the two objects should be considered not equivalent
    //You, the programmer decides how that equality is determined.
    //The equals method always takes one and only one parameter, a referece of the same
    //type as the class
    public boolean equals(Bowler other)//<--note the parater is of type Bowler reference
    {
       //the keyword this referes to the reference object that claaed the method
        return this.highScore == other.highScore 
               && this.lastName.equals(other.lastName);//this is calling the equals method of the String class because lastName is a String
    }
    
    
    
    
    
    
    
    
    
    
}
