import java.lang.Math;
public class Wolf extends Animal{
    private static double hf = 20;
    public static int d = 4;

    public Wolf(double h, double xCord, double yCord, double zCord) {
        super(h, xCord, yCord, zCord);
    }
    Wolf(){

    }

    public static double getHf() {
        return hf;
    }

    public static int getD() {
        return d;
    }
    public double getR(Sheep sheep){
        double[] wolfCords = this.getCords(this);
        double[] sheepCords = sheep.getCords(sheep);
        double r = Math.pow((Math.pow((wolfCords[0]-sheepCords[0]), 2)
                - Math.pow((wolfCords[1]-sheepCords[1]), 2)
                - Math.pow((wolfCords[2]-sheepCords[2]), 2)), 0.5);
        return r;
    }

    public boolean isWolfClose(Sheep sheep){
        boolean isClose = false;
        if (this.getR(sheep) <= 1){
            isClose = true;
        }
        return isClose;
    }
    public double attack(Sheep sheep){
        double damage = 0;
        if (this.isWolfClose(sheep)){
            damage = ((this.getH()/this.hf)*this.d)/(Math.pow(this.getR(sheep), 2));
        }
        return damage;
    }

    public double timeToKill(Sheep sheep){
        double time = 0;
        double damage = this.attack(sheep);
        if (damage == 0){
            System.out.println("Волк не убьёт овцу");
            return time;
        }
        System.out.print("Волк убьёт овцу за ");
        time = sheep.getH()/damage;

        return time;
    }
}
