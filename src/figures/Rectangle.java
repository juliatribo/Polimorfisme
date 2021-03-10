package figures;


public class Rectangle extends Figure{

    private double base;
    private double height;

    public Rectangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    public double area(){
        double area = this.base * this.height;
        return area;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

