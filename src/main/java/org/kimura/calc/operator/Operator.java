package org.kimura.calc.operator;

import java.util.List;

public interface Operator {

	boolean input(List<Operator> ops);
	String display();
}
