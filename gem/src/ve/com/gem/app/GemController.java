package ve.com.gem.app;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ve.com.gem.model.entity.Gem;
import ve.com.gem.model.service.IGemService;

@RestController
@RequestMapping(value = "/gem")
public class GemController {
	@Autowired
	IGemService gemService;
	public GemController() {
	}
	
	@RequestMapping(value="/loadAll",method=RequestMethod.GET)
	public List<Gem> loadAll(){
		List<Gem> gems = gemService.findAll();
		return gems;
	}
	
	@RequestMapping(value="/save",method=RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public ResponseEntity<Gem> save(@RequestBody Gem gem)
	{
		gemService.save(gem);
		return new ResponseEntity<Gem>(gem,HttpStatus.OK);
	}
}