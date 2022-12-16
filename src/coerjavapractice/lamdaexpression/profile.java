package coerjavapractice.lamdaexpression;

public class profile {
	
	
	private int id;
	private String name;
	private int birthday;
	private int birthMonth;
	private int birthYear;
	private int age;
	public profile(int id, String name, int birthday, int birthMonth, int birthYear, int age) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.birthMonth = birthMonth;
		this.birthYear = birthYear;
		this.age = age;
	}
	public int getBirthday() {
		return birthday;
	}
	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}
	public int getBirthMonth() {
		return birthMonth;
	}
	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "profile [id=" + id + ", name=" + name + ", birthday=" + birthday + ", birthMonth=" + birthMonth
				+ ", birthYear=" + birthYear + ", age=" + age + "]";
	}
	public profile() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
