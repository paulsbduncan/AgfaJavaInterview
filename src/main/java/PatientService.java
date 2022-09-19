import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * TODO describe this class
 *
 * @author Paul Duncan (paul.duncan@agfa.com)
 */
public class PatientService {
    public List<Patient> getPatients(File source) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return Arrays.asList(mapper.readValue(source, Patient[].class));
    }
}
