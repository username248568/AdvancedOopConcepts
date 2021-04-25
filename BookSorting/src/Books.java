
public abstract class Books {
private String Title;
double Price;

public Books(String Title) {
	this.Title = Title;
	this.Price = 0.0;
}

public String getTitle() {
	return Title;
}


public double getPrice() {
	return Price;
}

public abstract void setPrice();

}