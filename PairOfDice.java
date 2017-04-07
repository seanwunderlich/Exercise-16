/**
 * Sean Wunderlich
 * ITSE 1302-011
 * Exercise 16
 * Dice roll program
 */

public class PairOfDice
{
    private Die die1, die2;
    private int intValue1, intValue2, intTotal;

    public PairOfDice () //Creates two dice with initial value of 1
    {
        die1 = new Die();
        die2 = new Die();
        intValue1 = 1;
        intValue2 = 1;
        intTotal = intValue1 + intValue2;
    }
    public int intRoll () //Rolls both dice and returns combined total
    {
        intValue1 = die1.intRoll();
        intValue2 = die2.intRoll();
        intTotal = intValue1 + intValue2;
        return intTotal;
    }
    public int getTotal ()
    {
        return intTotal;
    } //Returns combined total of roll
    public int getDie1 ()
    {
        return intValue1;
    } //Returns value of die 1
    public int getDie2 ()
    {
        return intValue2;
    } //Returns value of die 2
}
