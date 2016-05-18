package ve.com.gem.model.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;

import ve.com.gem.model.entity.Company;
import ve.com.gem.model.repository.ICompanyRepository;
import ve.com.gem.model.service.ICompanyService;
//Created by Andres & Ronaldo Team (4)

@Service
public class CompanyService implements ICompanyService {

	@Autowired
	ICompanyRepository companyRepository;
	
	List<Company> companies =  new ArrayList<Company>();
	
	public CompanyService() {

	}

	@Override
	public List<Company> findAll() {
		companies = Lists.newArrayList(companyRepository.findAll());
		return companies;
	}

	@Override
	public List<Company> search(String key) {
		
		return companyRepository.findByNameLike("%"+key+"%");
	}

	@Override
	public void addByName(String name) {
		companyRepository.save(new Company(new Integer(companies.size()+1).longValue(),name));
		//personas.add(new Persona(new Integer(personas.size()+1).longValue(),name));
		
	}

	@Override
	public void save(Company companies) {
		// TODO Auto-generated method stub
		
	}

}
