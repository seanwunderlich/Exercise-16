/**
 * Sean Wunderlich
 * ITSE 1302-011
 * Exercise 16
 * Dice roll program
 */

public class BoxCar
{
    public static void main (String[] args)
    {
        final int intTotalRolls = 1000, intTargetAmount = 12; //Sets total rolls to 1000 and boxcar
                                                                //amount to 12
        int intTotal, intCount = 0; //Initial values of total and count are 0

        PairOfDice dice = new PairOfDice();

        for (int intRoll = 1; intRoll <= intTotalRolls; intRoll++)
            //For every roll that is less than the total amount of rolls, add to total roll count
        {
            intTotal = dice.intRoll(); //Total amount rolled equals the total value of each dice
            if (intTotal == intTargetAmount) //If total amount rolled equals the target amount
                intCount++; //Add to the boxcar count
        }
        System.out.println ("Number of rolls: " + intTotalRolls); //Print total number of rolls
        System.out.println ("Number of Box Cars: " + intCount); //Print total number of boxcars
    }
}
