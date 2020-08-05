package figures;

public class Trapezoid extends Figures {

    private int bottomSide;
    private int upperSide;
    private int height;

    public Trapezoid(int bottomSide, int upperSide, int height, String colour) {
        super(colour);
        System.out.println("Трапеция была нарисована");
        this.bottomSide = bottomSide;
        this.upperSide = upperSide;
        this.height = height;
    }

    @Override
    public float getSquare() {
        return (float) ((bottomSide + upperSide) / 2 * height);
    }

    @Override
    public String getColour() {
        return colour;
    }

    public double getHeight() {
        return height;
    }

    public String getName() {
        return "Трапеция";
    }

    @Override
    public String toString() {
        return "Фигура: " + getName() + ", площадь фигуры: "
                + getSquare() + " кв. ед., "
                + "длина высоты " + getHeight() + " е.д., "
                + "цвет: " + getColour();
    }
}
