package chap02.lab03;

import java.util.Scanner;

public class CalculatorExample {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        
        System.out.print("첫 번째 숫자를 입력하세요: ");
        double num1 = sin.nextDouble();        
        System.out.print("두 번째 숫자를 입력하세요: ");
        double num2 = sin.nextDouble();
        
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;          
        System.out.println("덧셈 결과: " + (int) sum);
        System.out.println("뺄셈 결과: " + (int) difference);
        System.out.println("곱셈 결과: " + product);
        System.out.println("나눗셈 결과: " + quotient);
       
        sin.close();
    }
}