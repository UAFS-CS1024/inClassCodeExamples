package inClassOct20;

public class Parent {
	private String name;
	private int id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void show() {
		System.out.printf("ID:   %d\n", this.getId());
		System.out.printf("Name: %s\n", this.getName());
	}
}
