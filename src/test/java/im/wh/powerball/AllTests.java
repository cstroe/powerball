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
        {
            PowerballPickTest test = new PowerballPickTest();
            test.correct_number_of_arguments();
        }
        {
            PowerballPickTest test = new PowerballPickTest();
            test.no_null_orange_ball_allowed();
        }
        {
            PowerballPickTest test = new PowerballPickTest();
            test.no_null_white_balls_allowed();
        }
        {
            PowerballPickTest test = new PowerballPickTest();
            test.defensive_copy_of_whiteballs_array_in_getter();
        }
        {
            PowerballPickTest test = new PowerballPickTest();
            test.defensive_copy_of_whiteballs_array_in_constructor();
        }
    }
}
