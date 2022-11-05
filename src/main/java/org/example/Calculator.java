package org.example;

import org.example.calculate.*;

import java.util.List;

public class Calculator {
    private static final List<NewArithneticOperator> arithneticOperator = List.of(
            new AdditionOperator(),
            new SubstractionOperator(),
            new MultiplicationOperator(),
            new DivisionOperator());

    public static int calculate(int operand1, String operator, int operand2) {
        return arithneticOperator.stream()
                .filter(arithneticOperator -> arithneticOperator.supports(operator))
                .map(arithneticOperator -> arithneticOperator.calculate(operand1, operand2))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다"));
    }
}
