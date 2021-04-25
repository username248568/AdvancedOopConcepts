public class Health extends Insurance {
	public Health() {
		super("health");
		setCost();
	}

private double healthCost = 196.00;

@Override
void setCost() {
	price = healthCost;
}

@Override
void display() {
	System.out.print(getType() + " insurance = $" + getPrice() + " per month.");
}

}
