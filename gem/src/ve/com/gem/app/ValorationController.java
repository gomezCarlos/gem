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

import ve.com.gem.model.entity.Valoration;
import ve.com.gem.model.service.IValorationService;

/**
 * @author alonso y alfonso
 *
 */
@RestController
@RequestMapping(value = "/valorations")
public class ValorationController {
	@Autowired
	IValorationService valorationService;
	public ValorationController() {
	}

	@RequestMapping(value="/loadAll",method=RequestMethod.GET)
	public List<Valoration> loadAll(){
	List<Valoration> valorations = valorationService.findAll();
	return valorations;
	}

	@RequestMapping(value="/save",method=RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public ResponseEntity<Valoration> save(@RequestBody Valoration valorations)
	{
	valorationService.save(valorations);
	return new ResponseEntity<Valoration>(valorations,HttpStatus.OK);
	}

}
