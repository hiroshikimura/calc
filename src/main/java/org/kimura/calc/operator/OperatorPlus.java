package org.kimura.calc.operator;

import java.math.BigDecimal;
import java.util.List;

public class OperatorPlus implements OperatorCalculator {

	public boolean input(List<Operator> ops) {
		if ( ops.size() == 0 ) {
			// いきなり演算子は拒否
			return false ;
		}

		if ( ops.get(ops.size()-1) instanceof OperatorNum ) {
			ops.add(this);
			return true;
		}
		return false;
	}

	public String display() {
		return "＋";
	}

	public BigDecimal operate(BigDecimal var1, BigDecimal var2) {
		return var1.add(var2);
	}

}
