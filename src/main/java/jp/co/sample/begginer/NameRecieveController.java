package jp.co.sample.begginer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * フォームで入力した名前を表示するクラス.
 * @author soheinobe
 *
 */
@Controller
@RequestMapping("/nameRecieve")
public class NameRecieveController {

	/**
	 *処理の起点をなるメソッド.input.jspへフォワードする。
	 *
	 * @return input
	 */
	@RequestMapping("/index")
	public String index() {
		return "input";
	}
	
	/**
	 * 名前を受け取って出力画面を表示する.
	 * @param 
	 * @param
	 * @return 出力画面
	 */
	@RequestMapping("/toOutput")
	public String toOutput(Model model,String name) {
		model.addAttribute("name",name);
		return "/outputName";
	}
}