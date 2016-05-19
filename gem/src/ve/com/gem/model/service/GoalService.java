/**
 * 
 */
package ve.com.gem.model.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;

import ve.com.gem.model.entity.Goal;
import ve.com.gem.model.entity.Valoration;
import ve.com.gem.model.repository.IGoalRepository;
import ve.com.gem.model.repository.IValorationRepository;

/**
 * @author alonso y alfonso
 *
 */
@Service
public class GoalService implements IGoalService{
	
	@Autowired
	IGoalRepository goalRepository;
	
	List<Goal> goals=  new ArrayList<Goal>();

	public GoalService() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public List<Goal> findAll() {
		goals = Lists.newArrayList(goalRepository.findAll());
		return goals;
	}

	@Override
	public List<Goal> search(String key) {
		
		return goalRepository.findByNameLike("%"+key+"%");
	}

	@Override
	public void addByName(String name) {
		goalRepository.save(new Goal(name));
		//personas.add(new Persona(new Integer(personas.size()+1).longValue(),name));
		//valorationRepository.save(new Valoration())
	}

	@Override
	public void save(Goal goals) {
		// TODO Auto-generated method stub
		
	}
	
	

}
