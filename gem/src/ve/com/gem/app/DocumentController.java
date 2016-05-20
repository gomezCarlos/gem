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
import ve.com.gem.model.entity.Document;
import ve.com.gem.model.service.IDocumentService;


/**
 * @author alonso y alfonso
 *
 */
@RestController
@RequestMapping(value = "/documents")
public class DocumentController {
	
	@Autowired
	IDocumentService documentService;
	public DocumentController() {
	}

	@RequestMapping(value="/loadAll",method=RequestMethod.GET)
	public List<Document> loadAll(){
	List<Document> documents = documentService.findAll();
	return documents;
	}

	@RequestMapping(value="/save",method=RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public ResponseEntity<Document> save(@RequestBody Document documents)
	{
	documentService.save(documents);
	return new ResponseEntity<Document>(documents,HttpStatus.OK);
	}

}
