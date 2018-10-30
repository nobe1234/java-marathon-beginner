package jp.co.sample.begginer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sample.domain.User;

/**
 * 入力した名前、年齢、住所を表示するクラス.
 * @author soheinobe
 *
 */
@Controller
@RequestMapping("/userinfo")
public class Userinfo {
	
	/**
	 * 入力フォームへフォワードするメソッド.
	 * @return /info/inputuserinfo
	 */
	@RequestMapping("/index")
	public String index() {
		return "/info/inputuserinfo";
	}

	/**
	 * 受け取ったリクエストパラメーターを表示するメソッド.
	 * @param model
	 * @param user
	 * @return /info/outputuserinfo
	 */
	@RequestMapping("/outputuserinfo")
	public String toOutput(Model model,User user) {
		user.getName();
		user.getName();
		user.getAddress();
		model.addAttribute("user",user);
		return "/info/outputuserinfo";
	}
}
