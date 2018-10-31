package jp.co.sample.form;

/**
 * リクエストパラメータを受け取るフォーム
 * 
 * @author soheinobe
 *
 */
public class RegisterForm {

	/** 価格1 */
	private Integer price1;
	/** 価格2 */
	private Integer price2;
	/** 価格3 */
	private Integer price3;

	@Override
	public String toString() {
		return "Register [price1=" + price1 + ", price2=" + price2 + ", price3=" + price3 + "]";
	}

	/** ゲッターとセッター */
	public Integer getPrice1() {
		return price1;
	}

	public void setPrice1(Integer price1) {
		this.price1 = price1;
	}

	public Integer getPrice2() {
		return price2;
	}

	public void setPrice2(Integer price2) {
		this.price2 = price2;
	}

	public Integer getPrice3() {
		return price3;
	}

	public void setPrice3(Integer price3) {
		this.price3 = price3;
	}

}
