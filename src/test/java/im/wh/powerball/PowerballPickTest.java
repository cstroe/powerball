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

    public void defensive_copy_of_whiteballs_array_in_getter() {
        final int FOUR = 4;

        OrangeBall ob = new OrangeBall(1);
        WhiteBall wb1 = new WhiteBall(2);
        WhiteBall wb2 = new WhiteBall(3);
        WhiteBall wb3 = new WhiteBall(FOUR);
        WhiteBall wb4 = new WhiteBall(5);
        WhiteBall wb5 = new WhiteBall(6);

        PowerballPick pick = new PowerballPick(ob, wb1, wb2, wb3, wb4, wb5);

        WhiteBall[] whiteBalls = pick.getWhiteBalls();
        assert whiteBalls[2].getValue() == FOUR;

        whiteBalls[2] = new WhiteBall(7);
        assert pick.getWhiteBalls()[2].getValue() == FOUR;
    }

    public void defensive_copy_of_whiteballs_array_in_constructor() {
        final int FIVE = 5;

        OrangeBall ob = new OrangeBall(1);
        WhiteBall wb1 = new WhiteBall(2);
        WhiteBall wb2 = new WhiteBall(3);
        WhiteBall wb3 = new WhiteBall(5);
        WhiteBall wb4 = new WhiteBall(FIVE);
        WhiteBall wb5 = new WhiteBall(6);

        WhiteBall whiteBalls[] = new WhiteBall[5];
        whiteBalls[0] = wb1;
        whiteBalls[1] = wb2;
        whiteBalls[2] = wb3;
        whiteBalls[3] = wb4;
        whiteBalls[4] = wb5;

        PowerballPick pick = new PowerballPick(ob, whiteBalls);
        assert pick.getWhiteBalls()[3].getValue() == FIVE;

        whiteBalls[3] = new WhiteBall(8);
        assert pick.getWhiteBalls()[3].getValue() == FIVE;
    }
}