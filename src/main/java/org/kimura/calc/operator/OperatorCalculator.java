package org.kimura.calc.operator;

import java.math.BigDecimal;


public interface OperatorCalculator 
		extends Operator {

	BigDecimal operate(BigDecimal var1, BigDecimal var2);
}
