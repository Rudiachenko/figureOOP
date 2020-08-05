package figures;

public class Triangle extends Figures {

    private int leftSide;
    private int rightSide;
    private int bottomSide;

    public Triangle(int leftSide, int rightSide, int bottomSide, String colour) {
        super(colour);
        System.out.println("Треугольник был нарисован");
        this.leftSide = leftSide;
        this.rightSide = rightSide;
        this.bottomSide = bottomSide;
    }

    @Override
    public float getSquare() {
        float halfOfPerimeter = (float) ((leftSide + rightSide + bottomSide) / 2);
        return (float) (Math.sqrt(halfOfPerimeter * (halfOfPerimeter - leftSide)
                * (halfOfPerimeter - rightSide) * (halfOfPerimeter - bottomSide)));
    }

    @Override
    public String getColour() {
        return colour;
    }

    public double getLeftSide() {
        return leftSide;
    }

    public String getName() {
        return "Треугольник";
    }

    @Override
    public String toString() {
        return "Фигура: " + getName() + ", площадь фигуры: "
                + getSquare() + " кв. ед., "
                + "Длина левой стороны " + getLeftSide() + " е.д., "
                + "цвет: " + getColour();
    }
}
