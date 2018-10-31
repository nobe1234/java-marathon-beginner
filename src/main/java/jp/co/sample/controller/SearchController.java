package jp.co.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sample.domain.Info;
import jp.co.sample.service.UserService;

/**
 * フォームに入力されたIDで検索を行い、ユーザー情報を表示するクラス.
 * 
 * @author soheinobe
 *
 */
@Controller
@RequestMapping("/search")
public class SearchController {

	/** サービスクラスを注入. */
	@Autowired
	private UserService service;

	/**
	 * 処理の起点となるメソッド.
	 * 
	 * @return 入力フォーム
	 */
	@RequestMapping("/index")
	public String index() {
		return "db/userinfosearch";
	}

	/**
	 * 主キー検索メソッドを呼び出し、画面表示するクラス.
	 * 
	 * 検索結果で出たオブジェクトをリクエストスコープへ格納する。
	 * 
	 * @param モデル
	 * @param ドメイン
	 * @return ユーザー画面出力
	 */
	@RequestMapping("/execute")
	public String execute(Model model, Info info) {
		info = service.load(info.getId());
		model.addAttribute("info", info);
		return "db/userinfoview";
	}

}
