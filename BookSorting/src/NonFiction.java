
public class NonFiction extends Books{

	public NonFiction(String Title) {
		super(Title);
		setPrice();
	}

	@Override
	public void setPrice() {
		Price = 37.99;
		
	}

	void display() {
		System.out.println("Title:" + getTitle() + " Price: $" + getPrice());
	}
}
