package inClassOct20;

public class Child extends Parent {
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public void show() {
		super.show();
		System.out.printf("Color: %s\n", this.getColor());
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
}
