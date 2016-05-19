/**
 * 
 */
package ve.com.gem.model.service;

import java.util.List;

import ve.com.gem.model.entity.Goal;

/**
 * @author alonso y alfonso
 *
 */
public interface IGoalService {
	
	List<Goal> findAll();
	List<Goal> search(String key);
	void addByName(String name);
	void save(Goal goals);

}
