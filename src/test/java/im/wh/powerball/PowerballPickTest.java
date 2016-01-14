package im.wh.powerball;

public class PowerballPickTest {
    public void correct_number_of_arguments() {
        OrangeBall ob = new OrangeBall(2);
        WhiteBall wb1 = new WhiteBall(3);
        try {
            new PowerballPick(ob, wb1);
            assert false;
        } catch(IllegalArgumentException ignored) {}
    }

    public void no_null_orange_ball_allowed() {
        WhiteBall wb = new WhiteBall(3);
        try {
            new PowerballPick(null, wb, wb, wb, wb, wb);
            assert false;
        } catch (IllegalArgumentException ignored) {}
    }

    public void no_null_white_balls_allowed() {
        OrangeBall ob = new OrangeBall(1);
        WhiteBall wb = new WhiteBall(3);
        try {
            new PowerballPick(ob, wb, wb, null, wb, wb);
            assert false;
        } catch (IllegalArgumentException ignored) {}
    }
}