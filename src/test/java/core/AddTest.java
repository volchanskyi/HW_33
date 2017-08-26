package core;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.instanceOf;

import org.testng.annotations.Test;

public class AddTest {
    @Test
    public void add_test_instanceOf() {
	assertThat(Calculator.add(2, 2), instanceOf(Double.class));
    }

    @Test
    public void add_test_2_param() {
	assertThat(Calculator.add(2, 2), equalTo(4.0));
    }

    @Test
    public void add_test_3_param() {
	assertThat(Calculator.add(2, 2, 2), equalTo(6.0));
    }

    @Test
    public void add_test_4_param() {
	assertThat(Calculator.add(2, 2, 2, 2), equalTo(8.0));
    }
}
