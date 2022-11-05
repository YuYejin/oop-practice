package org.example;

import java.util.Arrays;

public enum ArithneticOperator {
    ADDITION("+") {
        @Override
        public int arithneticCaculate(int operand1, int operand2) {
            return operand1 + operand2;
        }
    }, SUBSTRACTION("-") {
        @Override
        public int arithneticCaculate(int operand1, int operand2) {
            return operand1 - operand2;
        }
    }, MULTIPLICATION("*") {
        @Override
        public int arithneticCaculate(int operand1, int operand2) {
            return operand1 * operand2;
        }
    }, DIVISION("/") {
        @Override
        public int arithneticCaculate(int operand1, int operand2) {
            return operand1 / operand2;
        }
    };

    private final String operator;

    ArithneticOperator(String operator) {
        this.operator = operator;
    }

    public abstract int arithneticCaculate(final int operand1, final int operand2);

    public static int calculate(int operand1, String operator, int operand2) {
        ArithneticOperator arithneticOperator = Arrays.stream(values())
                .filter(v -> v.operator.equals(operator))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다."));

        return arithneticOperator.arithneticCaculate(operand1, operand2);
    }
}
