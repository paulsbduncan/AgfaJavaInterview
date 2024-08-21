import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PatientService {
    List<Patient> allPatients;
    public PatientService(File source) throws JsonParseException, JsonMappingException, IOException{
        ObjectMapper mapper = new ObjectMapper();
        allPatients = Arrays.asList(mapper.readValue(source, Patient[].class));
    }
    public List<Patient> getPatients() {
        return allPatients;
    }
}
