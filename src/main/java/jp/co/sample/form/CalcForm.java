package jp.co.sample.form;

/**
 * リクエストパラメータをうけとるフォーム.
 * 
 * @author soheinobe
 *
 */
public class CalcForm {

	/** 数値１ */
	private Integer num1;
	/** 数値２ */
	private Integer num2;

	@Override
	public String toString() {
		return "Calc [num1=" + num1 + ", num2=" + num2 + "]";
	}

	/** ゲッターとセッター */
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
