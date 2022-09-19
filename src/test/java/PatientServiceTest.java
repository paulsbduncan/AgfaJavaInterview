import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PatientServiceTest {
    @Test
    void loadFromJson() throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("testPatients.json").getFile());

        PatientService patientService = new PatientService();
        assertThat(patientService.getPatients(file)).hasSize(5);
    }
}
