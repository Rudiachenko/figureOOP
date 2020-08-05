package figures;

public class Circle extends Figures {

    private double radius;

    public Circle(int radius, String colour) {
        super(colour);
        System.out.println("Круг был нарисован");
        this.radius = radius;
    }

    @Override
    public float getSquare() {
        return (float) (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public String getColour() {
        return colour;
    }

    public double getRadius() {
        return radius;
    }

    public String getName() {
        return "Круг";
    }

    @Override
    public String toString() {
        return "Фигура: " + getName() + ", площадь фигуры: "
                + getSquare() + " кв. ед., "
                + "длина радиуса " + getRadius() + " е.д., "
                + "цвет: " + getColour();
    }
}
