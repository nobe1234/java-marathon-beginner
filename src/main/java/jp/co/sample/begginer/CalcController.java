package jp.co.sample.begginer;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sample.form.CalcForm;

/**
 * 受け取った数値を掛け合わせる計算をするクラス.
 * 
 * @author soheinobe
 *
 */
@Controller
@RequestMapping("/calc")
public class CalcController {

	@Autowired
	private HttpSession session;

	/**
	 * 処理の起点となるメソッド.
	 * 
	 * @return
	 */
	@RequestMapping("/index")
	public String index() {
		return "/value/inputvalue";
	}

	/**
	 * 受け取ったフォームから数値を取り出し、リクエストスコープへ格納する.
	 * 
	 * 画面出力へフォワードする.
	 * 
	 * @param フォーム
	 * @param モデル
	 * @return 出力画面
	 */
	@RequestMapping("/output")
	public String toOutput(CalcForm form) {
		Integer num1 = form.getNum1();
		Integer num2 = form.getNum2();

		Integer answer = num1 * num2;

		session.setAttribute("form", form);
		session.setAttribute("answer", answer);
		return "/value/outputvalue";
	}

	/**
	 * @param フォーム
	 * @param モデル
	 * @return ２つ目の入力画面
	 */
	@RequestMapping("/output2")
	public String toOutput2(CalcForm form, Model model) {

		return "/value/outputvalue2";
	}

}
