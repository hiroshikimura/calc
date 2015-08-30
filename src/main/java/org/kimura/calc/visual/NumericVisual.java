package org.kimura.calc.visual;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import org.kimura.calc.builder.Calculator;
import org.kimura.calc.operator.OperatorNum;
import org.kimura.calc.visual.component.CButton;
import org.kimura.calc.visual.component.CButtonWithClear;
import org.kimura.calc.visual.component.CButtonWithDiv;
import org.kimura.calc.visual.component.CButtonWithMinus;
import org.kimura.calc.visual.component.CButtonWithMul;
import org.kimura.calc.visual.component.CButtonWithNum;
import org.kimura.calc.visual.component.CButtonWithPlus;

public class NumericVisual extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected	Calculator calculator = new Calculator();
	protected JLabel lblLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			NumericVisual dialog = new NumericVisual();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public NumericVisual() {
		getContentPane().addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				keyPressed(e);
			}
		});
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 258, 300);
		getContentPane().setLayout(null);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 239, 258, 39);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
			{
				JButton cancelButton = new JButton("終了");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						performClose(e);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}

		int offset_x,offset_y;

		offset_x = 20;
		offset_y = 70;

		JButton btnTen01 = new CButtonWithNum("1");
		btnTen01.setBounds(0 + offset_x, 0 + offset_y, 50, 30);
		getContentPane().add(btnTen01);
		btnTen01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				performNumericBtnDown(e);
			}
		});

		JButton btnTen02 = new CButtonWithNum("2");
		btnTen02.setBounds(55 + offset_x, 0 + offset_y, 50, 30);
		getContentPane().add(btnTen02);
		btnTen02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				performNumericBtnDown(e);
			}
		});

		JButton btnTen03 = new CButtonWithNum("3");
		btnTen03.setBounds(110 + offset_x, 0 + offset_y, 50, 30);
		getContentPane().add(btnTen03);
		btnTen03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				performNumericBtnDown(e);
			}
		});

		JButton btnTen04 = new CButtonWithNum("4");
		btnTen04.setBounds(0 + offset_x, 32 + offset_y, 50, 30);
		getContentPane().add(btnTen04);
		btnTen04.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				performNumericBtnDown(e);
			}
		});

		JButton btnTen05 = new CButtonWithNum("5");
		btnTen05.setBounds(55 + offset_x, 32 + offset_y, 50, 30);
		getContentPane().add(btnTen05);
		btnTen05.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				performNumericBtnDown(e);
			}
		});

		JButton btnTen06 = new CButtonWithNum("6");
		btnTen06.setBounds(110 + offset_x, 32 + offset_y, 50, 30);
		getContentPane().add(btnTen06);
		btnTen06.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				performNumericBtnDown(e);
			}
		});

		JButton btnTen07 = new CButtonWithNum("7");
		btnTen07.setBounds(0 + offset_x, 64 + offset_y, 50, 30);
		getContentPane().add(btnTen07);
		btnTen07.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				performNumericBtnDown(e);
			}
		});

		JButton btnTen08 = new CButtonWithNum("8");
		btnTen08.setBounds(55 + offset_x, 64 + offset_y, 50, 30);
		getContentPane().add(btnTen08);
		btnTen08.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				performNumericBtnDown(e);
			}
		});

		JButton btnTen09 = new CButtonWithNum("9");
		btnTen09.setBounds(110 + offset_x, 64 + offset_y, 50, 30);
		getContentPane().add(btnTen09);
		btnTen09.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				performNumericBtnDown(e);
			}
		});

		JButton btnTen00 = new CButtonWithNum("0");
		btnTen00.setBounds(0 + offset_x, 96 + offset_y, 50, 30);
		getContentPane().add(btnTen00);
		btnTen00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				performNumericBtnDown(e);
			}
		});

		JButton btnTenPeriod = new CButtonWithNum(".");
		btnTenPeriod.setBounds(55 + offset_x, 96 + offset_y, 50, 30);
		getContentPane().add(btnTenPeriod);
		btnTenPeriod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				performNumericBtnDown(e);
			}
		});

		JButton btnTenClear = new CButtonWithClear("C");
		btnTenClear.setBounds(110 + offset_x, 96 + offset_y, 50, 30);
		getContentPane().add(btnTenClear);
		btnTenClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				performNumericBtnDown(e);
			}
		});

		JButton btnTenPlus = new CButtonWithPlus("＋");
		btnTenPlus.setBounds(165 + offset_x, 0 + offset_y, 50, 30);
		getContentPane().add(btnTenPlus);
		btnTenPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				performNumericBtnDown(e);
			}
		});

		JButton btnTenMinus = new CButtonWithMinus("−");
		btnTenMinus.setBounds(165 + offset_x, 32 + offset_y, 50, 30);
		getContentPane().add(btnTenMinus);
		btnTenMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				performNumericBtnDown(e);
			}
		});

		JButton btnTenMul = new CButtonWithMul("✕");
		btnTenMul.setBounds(165 + offset_x, 64 + offset_y, 50, 30);
		getContentPane().add(btnTenMul);
		btnTenMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				performNumericBtnDown(e);
			}
		});

		JButton btnTenDiv = new CButtonWithDiv("÷");
		btnTenDiv.setBounds(165 + offset_x, 96 + offset_y, 50, 30);
		getContentPane().add(btnTenDiv);
		btnTenDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				performNumericBtnDown(e);
			}
		});
		
		lblLabel = new JLabel("");
		lblLabel.setBackground(Color.WHITE);
		lblLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblLabel.setBounds(20, 19, 215, 39);
		getContentPane().add(lblLabel);
		
		CButtonWithNum btnTenEqs = new CButtonWithNum("＝");
		btnTenEqs.setText("＝");
		btnTenEqs.setBounds(0 + offset_x, 128 + offset_y, 50, 30);
		getContentPane().add(btnTenEqs);
		btnTenEqs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				performBtnEquals(e);
			}
		});
	}
	protected void performBtnEquals(ActionEvent e) {
		Number num = this.calculator.execute();
		lblLabel.setText(num.toString());
	}
	public void keyPressed(KeyEvent e) {
		char c = e.getKeyChar();
		if ( (c >= '0' && c <= '9' ) || c == '.' ) {
			String str = new StringBuffer().append( c ).toString();
			calculator.operate(new OperatorNum(str));
		}
		lblLabel.setText(calculator.display());
	}

	protected void performNumericBtnDown(ActionEvent e) {
		CButton btn = (CButton)e.getSource();

		calculator.operate(btn.getOperator());
		
		lblLabel.setText(calculator.display());
	}
	protected void performClose(ActionEvent e) {
		this.dispose();
	}
}
