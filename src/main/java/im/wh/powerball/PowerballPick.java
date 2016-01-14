package im.wh.powerball;

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
        this.whiteBalls = whiteBalls;
    }
}
