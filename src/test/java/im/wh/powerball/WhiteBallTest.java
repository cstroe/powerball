package im.wh.powerball;

public class WhiteBallTest {
    public void value_gets_returned() {
        WhiteBall ball = new WhiteBall(1);
        assert ball.getValue() == 1;
    }

    public void disallow_invalid_value() {
        try {
            new WhiteBall(0);
            assert false;
        } catch(IllegalArgumentException ignored) {}

        try {
            new WhiteBall(70);
            assert false;
        } catch(IllegalArgumentException ignored) {}
    }
}