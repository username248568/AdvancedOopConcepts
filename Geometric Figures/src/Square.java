
public class Square extends Figure {
public double area;
	public Square(int height, int width, String figureType) {
		super(height, width, figureType);
	}

	@Override
	public double area(int height, int width) {
		area = (height*width);
		return area;
	}

}
