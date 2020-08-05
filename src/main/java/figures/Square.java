package figures;

public class Square extends Figures {

    private int sideLength;

    public Square(int sideLength, String colour) {
        super(colour);
        System.out.println("Квадрат был нарисован");
        this.sideLength = sideLength;
    }

    @Override
    public float getSquare() {
        return (float) Math.pow(sideLength, 2);
    }

    @Override
    public String getColour() {
        return colour;
    }

    public double getSide() {
        return sideLength;
    }

    public double perimeter() {
        return 4 * sideLength;
    }

    public String getName() {
        return "Квадрат";
    }

    @Override
    public String toString() {
        return "Фигура: " + getName() + ", площадь фигуры: "
                + getSquare() + " кв. ед., "
                + "длина периметра " + perimeter() + " е.д., "
                + "длина стороны " + getSide()
                + " цвет: " + getColour();
    }
}
