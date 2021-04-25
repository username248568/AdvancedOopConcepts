public class Life extends Insurance {
public Life() {
		super("life");
		setCost();
	}

private double lifeCost = 36.00;

@Override
void setCost() {
	price = lifeCost;
}

@Override
void display() {
	System.out.print(getType() + " insurance = $" + getPrice() + " per month.");
}

}
