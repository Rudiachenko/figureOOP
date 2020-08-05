package figures;

public abstract class Figures {
    public String colour;

    public Figures(String colour) {
        this.colour = colour;
    }

    public abstract float getSquare();

    public abstract String getColour();
}
