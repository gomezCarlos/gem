/**
 * 
 */
package ve.com.gem.model.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import ve.com.gem.model.entity.Company;
import ve.com.gem.model.entity.Goal;

/**
 * @author alonso y alfonso
 * 
 *
 */
public interface IGoalRepository extends CrudRepository<Goal, Long>  {
	
	List<Goal> findByNameLike(String string);
	
}
