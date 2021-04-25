
public class Fiction extends Books{

	public Fiction(String Title) {
		super(Title);
		setPrice();
	}

	@Override
	public void setPrice() {
		Price = 24.99;
		
	}

	void display() {
		System.out.println("Title:" + getTitle() + " Price: $" + getPrice());
	}
}