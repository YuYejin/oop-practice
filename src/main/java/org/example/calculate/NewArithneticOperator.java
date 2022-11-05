package org.example.calculate;

public interface NewArithneticOperator {
    boolean supports(String operator);
    int calculate(int operand1, int operand2);
}
