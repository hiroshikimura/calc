package org.kimura.calc.visual.component;

import javax.swing.JButton;

import org.kimura.calc.operator.OperationFactory;

public abstract class CButton extends JButton implements OperationFactory {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public  CButton(String label){
		super(label);
	}
}
