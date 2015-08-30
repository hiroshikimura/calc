package org.kimura.calc.visual.component;

import org.kimura.calc.operator.Operator;
import org.kimura.calc.operator.OperatorMul;

public class CButtonWithMul extends CButton {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CButtonWithMul(String label) {
		super(label);
	}

	public Operator getOperator() {
		return new OperatorMul();
	}

}
