package ve.com.gem.model.service;

import java.util.List;

import ve.com.gem.model.entity.Company;

/** Created by Andres & Ronaldo Team (4)
*/
public interface ICompanyService {

		List<Company> findAll();
		List<Company> search(String key);
		void addByName(String name);
		void save(Company companies);
}
