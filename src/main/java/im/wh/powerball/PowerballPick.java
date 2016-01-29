package im.wh.powerball;

import java.util.Arrays;

public class PowerballPick {
    private WhiteBall[] whiteBalls;
    private OrangeBall orangeBall;

    public PowerballPick(OrangeBall orangeBall, WhiteBall ... whiteBalls) {
        if(whiteBalls.length != 5) {
            throw new IllegalArgumentException("A PowerBall pick must contain 5 white balls.");
        }
        if(orangeBall == null) {
            throw new IllegalArgumentException("Orange ball cannot be null.");
        }
        for(WhiteBall whiteBall : whiteBalls) {
            if(whiteBall == null) {
                throw new IllegalArgumentException("White balls cannot be null.");
            }
        }
        this.orangeBall = orangeBall;

        Arrays.sort(whiteBalls, (o1, o2) -> Integer.compare(o1.getValue(),o2.getValue()));

        this.whiteBalls = Arrays.copyOf(whiteBalls, whiteBalls.length);
    }

    public WhiteBall[] getWhiteBalls() {
        return Arrays.copyOf(whiteBalls, whiteBalls.length);
    }

    public OrangeBall getOrangeBall() {
        return orangeBall;
    }

    @Override
    public String toString() {
        String str = "";
        for(WhiteBall wb : whiteBalls) {
            str += wb + " ";
        }
        return str + "  " + orangeBall;
    }
}
