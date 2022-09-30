import java.util.List;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.assertj.core.api.Assertions.assertThat;

class GoodToGoTest {
    @Test
    void iCanRunTests(){
        var items = List.of("One", "Two", "Three");
        assertThat(items)
                .hasSize(3)
                .containsExactly("One", "Two", "Three")
                .doesNotContain("Four");
    }

    @Test
    void iCanRunTestsWithHamcrest(){
        assertThat(List.of("One", "Two", "Three"),hasSize(3));
    }
}
