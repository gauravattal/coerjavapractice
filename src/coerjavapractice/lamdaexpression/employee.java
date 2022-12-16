package coerjavapractice.lamdaexpression;

public class employee {

	private int id;
	private String name;
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
	public employee() {
		super();
		
		System.out.println("inherited constructor called");
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + "]";
	}
	public employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
