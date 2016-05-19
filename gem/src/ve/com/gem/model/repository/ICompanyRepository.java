package ve.com.gem.model.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import ve.com.gem.model.entity.Company;
/** Created by Andres & Ronaldo Team (4)
*/

public interface ICompanyRepository extends CrudRepository<Company, Long> {

	List<Company> findByNameLike(String string);
	
}
