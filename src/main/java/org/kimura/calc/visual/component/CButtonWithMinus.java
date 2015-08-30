package org.kimura.calc.visual.component;

import org.kimura.calc.operator.Operator;
import org.kimura.calc.operator.OperatorMinus;

public class CButtonWithMinus extends CButton {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CButtonWithMinus(String label) {
		super(label);
	}

	public Operator getOperator() {
		return new OperatorMinus();
	}

}
