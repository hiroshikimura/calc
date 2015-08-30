package org.kimura.calc.builder;

import java.math.BigDecimal;
import java.util.List;

import org.kimura.calc.operator.Operator;
import org.kimura.calc.operator.OperatorCalculator;
import org.kimura.calc.operator.OperatorNum;
import org.seasar.framework.util.tiger.CollectionsUtil;

public class Calculator {

	protected	List<Operator> calcOperator = CollectionsUtil.newArrayList();
	
	public Calculator operate(Operator ops) {
		ops.input(this.calcOperator);
		return this ;
	}

	/**
	 * 計算する
	 * @return
	 */
	public Number execute() {
		if ( this.calcOperator.size() == 0 ) {
			return null ;
		}
		BigDecimal n ;
		BigDecimal ans;
		OperatorCalculator o ;
		List<Operator> list = CollectionsUtil.newArrayList(calcOperator);
		ans = new BigDecimal( list.remove(0).display() ) ;
		while( list.size() > 0 ) {
			o = (OperatorCalculator)(list.remove(0));
			n = ((OperatorNum)(list.remove(0))).getNumber();
			try {
				ans = o.operate(ans,n);
			} catch (ArithmeticException aex) {
				// 算術例外
				// ゼロ除算とか
			} catch (Exception ex) {
				
			}
		}
		return ans;
	}

	/**
	 * 次の表示
	 * @return
	 */
	public String display() {
		if ( calcOperator.size() == 0 ) {
			// まだなし
			return "" ;
		}
		StringBuffer sb = new StringBuffer();
		for ( Operator o : calcOperator ) {
			sb.append(o.display());
		}

		return sb.toString() ;
	}
}
