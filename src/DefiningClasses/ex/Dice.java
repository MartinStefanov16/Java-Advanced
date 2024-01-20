package DefiningClasses.ex;

class Dice {
    private int sides;
    private String colour;

    public void setSides(int sides) {
        this.sides = sides;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getSides() {return sides;}
    public String getColour() {return colour;}

    @Override
    public String toString (){
        return String.format("color: %s, sides: %d", getColour(), getSides());
    }

}
