package core;

import org.testng.annotations.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;


public class DivideTest {
    @Test
    public void divide_test_instanceOf() {
	assertThat(Calculator.divide(10, 2), instanceOf(Double.class));
    }

    @Test
    public void divide_test_2_param() {
	assertThat(Calculator.divide(20, 3), closeTo(6.66, 0.09));
    }

    @Test
    public void divide_test_3_param() {
	assertThat(Calculator.divide(10, 3, 2), closeTo(1.66, 0.09));
    }

    @Test
    public void divide_test_4_param() {
	assertThat(Calculator.divide(100, 40, 5, 3), closeTo(0.16, 0.09));
    }

}
