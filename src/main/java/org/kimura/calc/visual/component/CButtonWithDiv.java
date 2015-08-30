package org.kimura.calc.visual.component;

import org.kimura.calc.operator.Operator;
import org.kimura.calc.operator.OperatorDiv;

public class CButtonWithDiv extends CButton {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CButtonWithDiv(String label) {
		super(label);
	}

	public Operator getOperator() {
		return new OperatorDiv();
	}

}
