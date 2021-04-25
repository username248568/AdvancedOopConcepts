
public class UseFigure {
public static void main(String[] args) {
	int height;
	int width;
	String figureType;
	double area;
Figure[] figures = new Figure[2];
figures[0] = new Square(8,8,"Square");
figures[1] = new Triangle(8,8,"Triangle");

for (int i = 0; i < figures.length; i++) {
	height = figures[i].getHeight();
	width = figures[i].getWidth();
	figureType = figures[i].getFigureType();
	area = figures[i].area(height, width);
	System.out.println("Type : "+ figureType + ", height: " +
	height + ", width: " + width + ", area: " + area);	
}
}
}