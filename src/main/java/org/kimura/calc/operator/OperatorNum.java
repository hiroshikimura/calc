package org.kimura.calc.operator;

import java.math.BigDecimal;
import java.util.List;

public class OperatorNum implements Operator {
	
	protected String var ;
	
	public OperatorNum(String v) {
		this.var = v;
	}

	public boolean input(List<Operator> ops) {
		// 空の場合はそのまま追加
		if ( ops.size() == 0 ) {
			// 小数点の場合はちょっと書き換え
			if ( var.equals(".")) {
				var = "0.";
			}
			ops.add(this);
			return true;
		}
		Operator last = ops.get(ops.size()-1);
		if ( last instanceof OperatorNum ) {
			OperatorNum n = (OperatorNum)last;
			// 数字の場合は連結
			if ( ".".equals(var) && n.var.contains(".") ) {
				// ただし、小数点がすでにある場合の小数点の場合は拒否
				return false;
			}
			// それ以外の場合は単純に入力を連結
			n.var = new StringBuffer().append(n.var).append(var).toString();
			return true;
		}

		// 数字以外の場合はリストに追加
		ops.add(this);
		return true;
	}

	public String display() {
		return var;
	}
	
	public BigDecimal getNumber() {
		return new BigDecimal( display());
	}
}
