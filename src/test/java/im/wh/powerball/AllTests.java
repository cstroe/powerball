package im.wh.powerball;

public class AllTests {
    public static void main(String[] argv) {
        {
            WhiteBallTest test = new WhiteBallTest();
            test.value_gets_returned();
        }
        {
            WhiteBallTest test = new WhiteBallTest();
            test.disallow_invalid_value();
        }
        {
            OrangeBallTest test = new OrangeBallTest();
            test.value_gets_returned();
        }
        {
            OrangeBallTest test = new OrangeBallTest();
            test.disallow_invalid_values();
        }
    }
}
