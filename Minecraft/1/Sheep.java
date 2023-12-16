public class Sheep extends Animal{
    private static double hf = 8;
    public Sheep(double h, double xCord, double yCord, double zCord) {
        super(h, xCord, yCord, zCord);
    }
    Sheep(){

    }

    public static double getHf() {
        return hf;
    }
    public void changeHP(double damage){
        this.setH(getH()-damage);
    }

}
