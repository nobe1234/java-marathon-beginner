package jp.co.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.sample.domain.Info;
import jp.co.sample.repository.UserRepository;

/**
 * リポジトリのメソッドを呼び出し、そのまま返すためのメソッド.
 * 
 * 今回はコントローラで使用するための経由だけを行う.
 * 
 * @author soheinobe
 *
 */
@Service
public class UserService {

	/**
	 * リポジトリを注入
	 */
	@Autowired
	private UserRepository repository;

	/**
	 * リポジトリから主キー検索メソッドを呼び出している.
	 * 
	 * @param 入力された主キー
	 * @return インフォオブジェクト（主キー検索結果のテーブル１件）
	 */
	public Info load(Integer id) {

		Info info = repository.load(id);
		return info;

	}

}
