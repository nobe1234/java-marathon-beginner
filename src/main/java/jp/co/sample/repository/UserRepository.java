package jp.co.sample.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import jp.co.sample.domain.Info;

/**
 * DAOの役割をするリポジトリークラス.
 * 
 * 主キー検索メソッドを定義.
 * 
 * @author soheinobe
 *
 */
@Repository
public class UserRepository {

	/**
	 * JDBCのドライバークラスなどを注入.
	 */
	@Autowired
	private NamedParameterJdbcTemplate template;

	/**
	 * 結果の操作を定数で定義.
	 */
	private static final RowMapper<Info> INFO_ROW_MAPPER = (rs, i) -> {
		Info info = new Info();
		info.setId(rs.getInt("id"));
		info.setName(rs.getString("name"));
		info.setAge(rs.getInt("age"));
		info.setAddress(rs.getString("address"));
		return info;
	};

	/**
	 * 主キー検索を行うメソッド.
	 * 
	 * フォームに入力したidをキーにして検索をする。
	 * 
	 * @param id
	 * @return
	 */
	public Info load(Integer id) {
		System.out.println("id=" + id);
		String sql = "select id,name,age,address from info where id = :id";
		SqlParameterSource param = new MapSqlParameterSource().addValue("id", id);
		Info info = template.queryForObject(sql, param, INFO_ROW_MAPPER);

		return info;
	}

}
