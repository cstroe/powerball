package im.wh.powerball;

public class GenerateWinningPick {

    public static void main(String[] argv) {
        PowerballPickGenerator gen = new RandomPowerballPickGenerator();

        System.out.println("Powerball Picks:\n\n");

        for(int i = 1; i <= 1; i++) {
            System.out.printf("%3d.  ", i);
            System.out.println(gen.get());
        }
    }
}
