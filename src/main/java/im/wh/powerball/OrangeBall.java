package im.wh.powerball;

public class OrangeBall extends Ball {
    public static final int LOW = 1;
    public static final int HIGH = 35;

    public OrangeBall(int value) {
        super(value, LOW, HIGH);
    }
}
