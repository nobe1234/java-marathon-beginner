package jp.co.sample.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sample.form.RegisterForm;

/**
 * 入れた商品の合計金額とその税込価格を計算するクラス.
 * 
 * @author soheinobe
 *
 */
@Controller
@RequestMapping("/register")
public class RegisterController {

	/**
	 * アプリケーションスコープのDI
	 */
	@Autowired
	private ServletContext application;

	/**
	 * 処理の起点となるメソッド.
	 * 
	 * @return 入力フォーム
	 */
	@RequestMapping("/index")
	public String index() {
		return "/tax/buyGoods";

	}

	/**
	 * 計算結果を表示するクラス.
	 * 
	 * 結果表示ページへフォワードする.
	 * 
	 * @param フォーム
	 * @return 結果表示クラス
	 */
	@RequestMapping("/totalprice")
	public String totalPrice(RegisterForm form) {
		Integer price1 = form.getPrice1();
		Integer price2 = form.getPrice2();
		Integer price3 = form.getPrice3();

		Integer totalprice = price1 + price2 + price3;
		Integer taxTotalPrice = (int) (totalprice * 1.08);

		application.setAttribute("totalprice", totalprice);
		application.setAttribute("taxTotalPrice", taxTotalPrice);

		return "/tax/totalPrice";
	}

}
