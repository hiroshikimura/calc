package org.kimura.calc.visual.component;

import org.kimura.calc.operator.Operator;
import org.kimura.calc.operator.OperatorPlus;

public class CButtonWithPlus extends CButton {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CButtonWithPlus(String label) {
		super(label);
	}

	public Operator getOperator() {
		return new OperatorPlus();
	}

}
