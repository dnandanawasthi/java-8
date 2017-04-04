package com.code.java8.lambdaexpression;

/*
    Class describe lambda expression
 */
public class FirstLambdaExpression {

    public static void main(String[] args) {
        FirstLambdaExpression tester = new FirstLambdaExpression();

        //function definition with type declaration
        MathOperation addition = (int a, int b) -> a + b;
        System.out.println("Addition of two input is: "+addition.operation(5,5));

        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));

        //function definition without parenthesis in parameter
        GreetingService greetService1 = message -> System.out.println("Hello " + message);

        //function definition with parenthesis in parameter
        GreetingService greetService2 = (message) -> System.out.println("Hello " + message);

        greetService1.sayMessage("Jack");
        greetService2.sayMessage("Pack");
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}