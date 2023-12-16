public abstract class Animal {
    private double h;
    public static double hf;
    private double xCord;
    private double yCord;
    private double zCord; // высота

    public Animal(double h, double xCord, double yCord, double zCord) {
        this.h = h;
        this.xCord = xCord;
        this.yCord = yCord;
        this.zCord = zCord;
    }
    Animal(){

    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public static double getHf() {
        return hf;
    }

    public static void setHf(double hf) {
        Animal.hf = hf;
    }

    public double getxCord() {
        return xCord;
    }

    public void setxCord(double xCord) {
        this.xCord = xCord;
    }

    public double getyCord() {
        return yCord;
    }

    public void setyCord(double yCord) {
        this.yCord = yCord;
    }

    public double getzCord() {
        return zCord;
    }

    public void setzCord(double zCord) {
        this.zCord = zCord;
    }
    public double[] getCords(Animal animal){
        double x = this.getxCord();
        double y = this.getyCord();
        double z = this.getzCord();
        return new double[] {x, y, z};
    }

}
