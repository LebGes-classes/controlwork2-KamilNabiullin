public class Main {
    public static void main(String args[]){
        Wolf wolf = new Wolf(20, 0, 0, 0);
        Sheep sheep = new Sheep(7, 1, 0, 0);
        System.out.println(wolf.timeToKill(sheep)+" секунд(ы)");
    }
}
