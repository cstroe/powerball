package im.wh.powerball;

public class WhiteBall extends Ball {
    public static final int LOW = 1;
    public static final int HIGH = 59;

    public WhiteBall(int val) {
        super(val, LOW, HIGH);
    }
}
