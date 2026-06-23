/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : CustomBehavior.java
 *  * Created On : 2026-06-23 07:58
 *  * Author     : Wilson K Sam
 *  * Copyright  : (c) 2026 Wilson K Sam
 *  * =============================================================================
 *  *
 *  * Description:
 *  * This source file is part of a coding practice project created for learning,
 *  * experimentation, interview preparation, and demonstration of software
 *  * development concepts and best practices.
 *  *
 *   * Purpose:
 *   * -
 *  * Notes:
 *  * -
 *  *
 *  * =============================================================================
 *
 */

package org.wilsonks.java8_2014.lambda_expressions.uses;

public class CustomBehavior {

    @FunctionalInterface
    public interface BetValidator {
        boolean validate(String betType, String betPocket, double amount, double balance);
    }



    public static void main(String[] args) {


        BetValidator rouletteRules = (betType, betPocket, amount, balance) -> {
            if(amount < 0) {return false;}
            if(balance < amount) {return false;}

            boolean validBet = switch (betType) {
                case "INSIDE": if (amount < 10 || amount > 100  ) yield false; else yield  true;
                case "OUTSIDE": if (amount < 100 || amount > 1000) yield false ; else yield  true;
                default:
                    yield  false;
            };
            return validBet;

        };

        boolean isValidBet1 = rouletteRules.validate("INSIDE", "100", 10, 2000);
        boolean isValidBet2 = rouletteRules.validate("INSIDE", "100", 200, 2000);

        System.out.println(isValidBet1);
        System.out.println(isValidBet2);
    }
}
