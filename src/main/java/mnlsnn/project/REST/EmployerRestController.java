package mnlsnn.project.REST;

import mnlsnn.project.model.Employer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Employers")
public class EmployerRestController {
    @GetMapping("/")
    List<Employer> getEmployers(){
        return new ArrayList<>(){};
    }
}
