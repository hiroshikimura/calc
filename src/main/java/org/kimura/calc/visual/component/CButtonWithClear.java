package org.kimura.calc.visual.component;

import org.kimura.calc.operator.Operator;
import org.kimura.calc.operator.OperatorClear;

public class CButtonWithClear extends CButton {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CButtonWithClear(String txt){
		super(txt);
	}
	public Operator getOperator() {
		return new OperatorClear();
	}

}
