package figures;

public class MainApp {
    static final int MAX_VALUE = 6;
    static final int MIN_VALUE = 5;

    public static void main(String[] args) {
        int countOfFigure = (int) (Math.random() * 5 + 1);
        Figures[] figures = new Figures[countOfFigure];
        String[] colours = {"синий", "красный", "желтый", "оранжевый",
                "зелёный", "фиолетовый", "Голубой"};

        int i = 0;
        while (i != countOfFigure) {
            int colourIndex = (int) (Math.random() * MAX_VALUE);
            int sideOfFigure = (int) (Math.random() * MAX_VALUE + MIN_VALUE);
            int numbOfFigure = (int) (Math.random() * 3);
            switch (numbOfFigure) {
                case 0:
                    Triangle triangle = new Triangle(sideOfFigure, sideOfFigure,
                            sideOfFigure, colours[colourIndex]);
                    figures[i] = triangle;
                    break;
                case 1:
                    Circle circle = new Circle((int) ((Math.random() * MAX_VALUE) + MIN_VALUE),
                            colours[colourIndex]);
                    figures[i] = circle;
                    break;
                case 2:
                    Square square = new Square(sideOfFigure, colours[colourIndex]);
                    figures[i] = square;
                    break;
                case 3:
                    Trapezoid trapezoid = new Trapezoid(sideOfFigure, sideOfFigure + MIN_VALUE,
                            (int) (Math.random() * MAX_VALUE + MIN_VALUE), colours[colourIndex]);
                    figures[i] = trapezoid;
                    break;
                default:
                    System.out.println("Число не равно 0, 1, 2, 3 "
                            + "- не удалось сгенерировать фигуру");
            }
            i++;
        }
        for (Figures figure : figures) {
            System.out.println(figure);
        }
    }
}
