package im.wh.powerball;

public class OrangeBallTest {
    public void value_gets_returned() {
        OrangeBall ob = new OrangeBall(2);
        assert ob.getValue() == 2;
    }

    public void disallow_invalid_values() {
        try {
            new OrangeBall(0);
            assert false;
        } catch(IllegalArgumentException ignored) {}

        try {
            new OrangeBall(27);
            assert false;
        } catch(IllegalArgumentException ignored) {}
    }
}