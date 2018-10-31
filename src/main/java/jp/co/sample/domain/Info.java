package jp.co.sample.domain;

/**
 * ユーザー情報を表すドメイン.
 * 
 * @author soheinobe
 *
 */
public class Info {

	/** id(主キー) */
	private Integer id;
	/** 名前 */
	private String name;
	/** 年齢 */
	private Integer age;
	/** 住所 */
	private String address;

	@Override
	public String toString() {
		return "info [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
