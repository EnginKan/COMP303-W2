package OCP;

import java.security.InvalidParameterException;

public class Calculator {

  public void calculate(CalculatorOperation operation) {
    if (operation == null) {
      throw new InvalidParameterException("Can not perform operation");
    }
     else{
       operation.perform();
    }
  }
}