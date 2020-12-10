import com.company.ArithmeticExpression;
import com.company.VerificationException;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class MainCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите для вычисления два числа в следующем формате \"a + b, a - b, a * b, a /  b\".");
        String expression = (scan.nextLine()).toUpperCase();
        scan.close();
        String[] expressionArray = expression.split(" ");
        //VerificationException arrayX = new VerificationException();
        //arrayX.setArray(expessionArray);
        //arrayX.check(expessionArray);
        VerificationException.check(expressionArray);
        //arrayX.print();
        //String[] arabic = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        if (Arrays.asList(Arrays.copyOfRange(ArithmeticExpression.arabic_roman, 0, 10)).contains(expressionArray[0])) {
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




        //ArithmeticExpression numberX = new ArithmeticExpression();
        //numberX.setNumber(expessionArray[0]);
        //int x = ArithmeticExpression.indexPlusOne(expessionArray[0]);
        //numberX.printIndex();

        //ArithmeticExpression numberY = new ArithmeticExpression();
        //numberY.setNumber(expessionArray[2]);
        //int y = ArithmeticExpression.indexPlusOne(expessionArray[2]);
        //numberY.printIndex();

        //int result = 0;
        //result = ArithmeticExpression.resultExpression(y, x,expessionArray[1]);
        //System.out.println(result);

        //System.out.println(ArithmeticExpression.resultExpression(ArithmeticExpression.indexPlusOne(expessionArray[0]), y, expessionArray[1]));

        //System.out.println(expression);
        //System.out.println(expessionArray[1]);

        //String x = scan.next();
        //String mathSign = scan.next();
        //String y = scan.next();




