package ve.com.gem.app;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ve.com.gem.model.entity.Company;
import ve.com.gem.model.service.ICompanyService;
/** Created by Andres & Ronaldo Team (4)
*/
@RestController
@RequestMapping(value = "/companies")
public class CompanyController {
@Autowired
ICompanyService companyService;
public CompanyController() {
}

@RequestMapping(value="/loadAll",method=RequestMethod.GET)
public List<Company> loadAll(){
List<Company> companies = companyService.findAll();
return companies;
}

@RequestMapping(value="/save",method=RequestMethod.GET, produces = "application/json; charset=UTF-8")
public ResponseEntity<Company> save(@RequestBody Company companies)
{
companyService.save(companies);
return new ResponseEntity<Company>(companies,HttpStatus.OK);
}
}