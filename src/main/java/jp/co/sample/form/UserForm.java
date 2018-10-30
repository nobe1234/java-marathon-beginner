package jp.co.sample.form;

/**
 * リクエストフォームを受け取るフォーム.
 * 
 * @author soheinobe
 *
 */
public class UserForm {

	/**  名前  */
	private String name;
	/**  年齢  */
	private Integer age;
	/**  住所  */
	private String address;

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

	@Override
	public String toString() {
		return "UserForm [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

}
