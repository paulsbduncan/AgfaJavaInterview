import java.util.List;

import org.junit.jupiter.api.Test;

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
}
