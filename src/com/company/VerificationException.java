package com.company;

import java.util.Arrays;
import java.util.Objects;

public class VerificationException {
    //public static String[] expression;

    //public void setArray(String[] expression) {
        //this.expression = expression;
    //}

    //private final String[] arabic = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    //private final String[] roman = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    //private final String[] mathSign = {"+", "-", "*", "/"};

    public static void check(String[] expression) {
        if (expression.length > 3) {
            System.err.println("Калькулятор умеет выполнять операции только с двумя числами: a + b, a - b, a * b, a / b!");
            System.exit(0);
        } else if (expression.length < 3) {
            System.err.println("Калькулятор принимает на вход только два числа в формате \"1 + 2\"! Введите ваши данные в указанном формате заново.");
            System.exit(0);
        }
        //else
            //System.out.println();

        if ((Arrays.asList(Arrays.copyOfRange(ArithmeticExpression.arabic_roman, 0, 10)).contains(expression[0]) &
                Arrays.asList(Arrays.copyOfRange(ArithmeticExpression.arabic_roman, 0, 10)).contains(expression[2]) &
                Arrays.asList(Arrays.copyOfRange(ArithmeticExpression.arabic_roman, 20, 24)).contains(expression[1]))
                ||
                (Arrays.asList(Arrays.copyOfRange(ArithmeticExpression.arabic_roman, 10, 20)).contains(expression[0]) &
                        Arrays.asList(Arrays.copyOfRange(ArithmeticExpression.arabic_roman, 10, 20)).contains(expression[2]) &
                        Arrays.asList(Arrays.copyOfRange(ArithmeticExpression.arabic_roman, 20, 24)).contains(expression[1])))
            System.out.print("");

        else {System.err.println("Калькулятор принимает на вход одновременно только два целых арвбских или римских числа от 1 до 10 включительно! ");
            System.exit(0);
        }

    }

}
