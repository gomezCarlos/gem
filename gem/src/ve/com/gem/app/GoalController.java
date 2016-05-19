/**
 * 
 */
package ve.com.gem.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ve.com.gem.model.entity.Goal;
import ve.com.gem.model.service.IGoalService;

/**
 * @author alonso y alfonso
 *
 */
@RestController
@RequestMapping(value = "/goals")
public class GoalController {
	
	@Autowired
	IGoalService goalService;
	public GoalController() {
	}

	@RequestMapping(value="/loadAll",method=RequestMethod.GET)
	public List<Goal> loadAll(){
	List<Goal> goals = goalService.findAll();
	return goals;
	}

	@RequestMapping(value="/save",method=RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public ResponseEntity<Goal> save(@RequestBody Goal goals)
	{
	goalService.save(goals);
	return new ResponseEntity<Goal>(goals,HttpStatus.OK);
	}

}
