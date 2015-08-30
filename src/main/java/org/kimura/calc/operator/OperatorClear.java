package org.kimura.calc.operator;

import java.util.List;

public class OperatorClear implements Operator {

	public boolean input(List<Operator> ops) {
		// クリア
		ops.clear();
		return true;
	}

	public String display() {
		return null;
	}
}
