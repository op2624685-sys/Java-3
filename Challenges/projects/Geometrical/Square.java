package projects.Geometrical;

public class Square extends Shape{
    private long sideInCms;

    public Square(long sideInCms) {
        this.sideInCms = sideInCms;
    }

    public long getSideInCms() {
        return sideInCms;
    }

    @Override
    public double calculateArea() {
        return Math.pow(sideInCms, 2) ;
    }

}
