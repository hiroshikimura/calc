package org.kimura.calc.visual.component;

import org.kimura.calc.operator.Operator;
import org.kimura.calc.operator.OperatorNum;

public class CButtonWithNum extends CButton {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected final String numericLabel;
	public CButtonWithNum(String label) {
		super(label);
		numericLabel = label;
	}

	public Operator getOperator() {
		return new OperatorNum(numericLabel);
	}

}
