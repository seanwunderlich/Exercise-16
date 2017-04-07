/**
 * Sean Wunderlich
 * ITSE 1302-011
 * Exercise 16
 * Dice roll program
 */

//This program rolls a pair of dice 1000 times and returns the total number of boxcars rolled

public class Die
{
    private int intNumberOfFaces;
        //Number of sides on the die
    private int intFaceValue;
        //Value showing on the die

    public Die () //Creates a six-sided die with the initial value of 1
    {
        intNumberOfFaces = 6;
        intFaceValue = 1;
    }
    public int intRoll () //Rolls the die and returns the result
    {
        intFaceValue = (int) (Math.random() * intNumberOfFaces) + 1;
        return intFaceValue;
    }
    public int getFaceValue ()
    {
        return intFaceValue;
    } //Returns current value of die
}
