package im.wh.powerball;

import java.util.Random;

public class RandomPowerballPickGenerator implements PowerballPickGenerator {

    @Override
    public PowerballPick get() {
        WhiteBall[] whiteBalls = new WhiteBall[5];

        Random rand = new Random();

        OrangeBall ob = new OrangeBall(rand.nextInt(OrangeBall.HIGH) + OrangeBall.LOW);

        whiteBalls[0] = generateWhiteball(rand, whiteBalls);
        whiteBalls[1] = generateWhiteball(rand, whiteBalls);
        whiteBalls[2] = generateWhiteball(rand, whiteBalls);
        whiteBalls[3] = generateWhiteball(rand, whiteBalls);
        whiteBalls[4] = generateWhiteball(rand, whiteBalls);

        return new PowerballPick(ob, whiteBalls[0], whiteBalls[1], whiteBalls[2], whiteBalls[3], whiteBalls[4]);
    }

    private WhiteBall generateWhiteball(Random rand, WhiteBall[] whiteBalls) {
        while(true) {
            int generatedInt = rand.nextInt(WhiteBall.HIGH) + WhiteBall.LOW;

            for(int i = 0; i < 5; i++ ) {
                if(whiteBalls[i] == null) {
                    break;
                }
                if(whiteBalls[i].getValue() == generatedInt) {
                    generatedInt = -1;
                    break;
                }
            }

            if(generatedInt != -1) {
                return new WhiteBall(generatedInt);
            }
        }
    }
}
