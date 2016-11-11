package fh.java.geometry.model.quadrilateral;

/**
 * Created by Kevin on 11.11.2016.
 */
public class Trapeze extends QuadrangularShape{
    private double sideA;
    private double sideB;
    private double sideC;
    private double height;
    private double sideD;
    //Contructor
    public Trapeze(int x, int y,double sideA, double sideB, double sideC,double sideD, double height) {
        this.x = x;
        this.y = y;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
        this.height = height;
    }
    //Getter and setter
    public double getSideA() {
        return sideA;
    }
    public void setSideA(double sideA) {
        this.sideA = sideA;
    }
    public double getSideB() {
        return sideB;
    }
    public void setSideB(double sideB) {
        this.sideB = sideB;
    }
    public double getSideC() {
        return sideC;
    }
    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getSideD() {
        return sideD;
    }
    public void setSideD(double sideD) {
        this.sideD = sideD;
    }
    //equal and Hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Trapeze trapeze = (Trapeze) o;

        if (Double.compare(trapeze.sideA, sideA) != 0) return false;
        if (Double.compare(trapeze.sideB, sideB) != 0) return false;
        if (Double.compare(trapeze.sideC, sideC) != 0) return false;
        return Double.compare(trapeze.height, height) == 0;

    }
    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideC);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    //calc Area and Perimeter
    public double calcArea()
    {
        return ((sideA+sideC)*height)/2;
    }
    @Override
    public double calcPerimeter()
    {
        return sideA+sideB+sideC+sideD;
    }
    @Override
    public double calculateVolume(){return 0;}
    public double calculateSurfaceArea(){return 0;}
    //ToString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Trapeze{");
        sb.append("sideA=").append(sideA);
        sb.append(", sideC=").append(sideC);
        sb.append(", height=").append(height);
        sb.append(", area=").append(calcArea());
        sb.append(", perimeter=").append(calcPerimeter());
        sb.append('}');
        return sb.toString();
    }
}
