package tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import codeToTest.Calculator;

public class Calculator_Add_Equals {
  @Test
  public void evaluatesExpression() {
    Calculator calculator = new Calculator();
    int sum = calculator.evaluate("1+2+3");
    assertEquals( 6, sum );
  }
}