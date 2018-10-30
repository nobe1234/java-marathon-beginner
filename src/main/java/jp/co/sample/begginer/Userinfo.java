package jp.co.sample.begginer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sample.form.UserForm;

/**
 * 入力した名前、年齢、住所を表示するクラス.
 * 
 * @author soheinobe
 *
 */
@Controller
@RequestMapping("/userinfo")
public class Userinfo {

	/**
	 * 入力フォームへフォワードするメソッド.
	 * 
	 * @return /info/inputuserinfo
	 */
	@RequestMapping("/index")
	public String index() {
		return "/info/inputuserinfo";
	}

	/**
	 * 受け取ったリクエストパラメーターを表示するメソッド.
	 * 
	 * @param model
	 * @param user
	 * @return /info/outputuserinfo
	 */
	@RequestMapping("/outputuserinfo")
	public String toOutput(Model model, UserForm form) {
		form.getName();
		form.getAge();
		form.getAddress();

		model.addAttribute("user", form);
		return "/info/outputuserinfo";
	}
}
