
public class Triangle extends Figure {
public double area;
	public Triangle(int height, int width, String figureType) {
		super(height, width, figureType);
	}

	@Override
	public double area(int height, int width) {
		area = ((height*width)/0.5);
		return area;
	}
	


}
