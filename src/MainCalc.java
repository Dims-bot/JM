import com.company.ArithmeticExpression;
import com.company.VerificationException;

import java.util.Arrays;
import java.util.Scanner;

public class MainCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите для вычисления два числа в следующем формате \"a + b, a - b, a * b, a /  b\".");
        String expression = (scan.nextLine()).toUpperCase();
        scan.close();
        String[] expressionArray = expression.split(" ");

        VerificationException.check(expressionArray);

        if (Arrays.asList(Arrays.copyOfRange(ArithmeticExpression.arabicRoman, 0, 10)).contains(expressionArray[0])) {
            int y = ArithmeticExpression.indexPlusOne(expressionArray[2]); // не знаю как лучше с отдельными переменными или использовать ссылки
            // на метод как сделал для х?
            System.out.println(ArithmeticExpression.resultExpression
                    (ArithmeticExpression.indexPlusOne(expressionArray[0]), y, expressionArray[1]));
        } else {
            int y = ArithmeticExpression.indexPlusOne(expressionArray[2]);
            System.out.println(ArithmeticExpression.arabicToRoman
                    (ArithmeticExpression.resultExpression
                            (ArithmeticExpression.indexPlusOne(expressionArray[0]), y, expressionArray[1])));
        }
    }
}









