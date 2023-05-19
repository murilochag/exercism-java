public class Lasagna {

    public int fornTime = 40;
    public int remaining;


    public int expectedMinutesInOven() {
        return this.fornTime;
    }

    public int remainingMinutesInOven(int ovenTime){
        this.remaining = this.fornTime - ovenTime;
        return this.remaining;

    }

    public int preparationTimeInMinutes(int layers){
        int preparationTime = layers * 2;
        return preparationTime;
    }

    public int totalTimeInMinutes(int layers, int ovenTime) {
        int totalTime = (layers * 2) + ovenTime;
        return totalTime;
    }

    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();
        System.out.println(lasagna.totalTimeInMinutes(1, 30));
    }
}
