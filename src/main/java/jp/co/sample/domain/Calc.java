package jp.co.sample.domain;

/**
 * 計算数値を表すドメイン.
 * 
 * @author soheinobe
 *
 */
public class Calc {

	/** 数値１ */
	private Integer num1;
	/** 数値２ */
	private Integer num2;

	@Override
	public String toString() {
		return "Calc [num1=" + num1 + ", num2=" + num2 + "]";
	}

	public Integer getNum1() {
		return num1;
	}

	public void setNum1(Integer num1) {
		this.num1 = num1;
	}

	public Integer getNum2() {
		return num2;
	}

	public void setNum2(Integer num2) {
		this.num2 = num2;
	}

}
