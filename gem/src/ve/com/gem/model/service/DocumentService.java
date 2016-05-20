/**
 * 
 */
package ve.com.gem.model.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;

import ve.com.gem.model.entity.Document;
import ve.com.gem.model.repository.IDocumentRepository;

/**
 * @author euddy y moises
 *
 */
@Service
public class DocumentService implements IDocumentService{
	
	@Autowired
	IDocumentRepository documentRepository;
	
	List<Document> documents =  new ArrayList<Document>();

	public DocumentService() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public List<Document> findAll() {
		documents = Lists.newArrayList(documentRepository.findAll());
		return documents;
	}

	@Override
	public List<Document> search(String key) {
		
		return documentRepository.findByDescriptionLike("%"+key+"%");
	}

	@Override
	public void addByDescription(String description) {
		documentRepository.save(new Document(description));
		
	}

	@Override
	public void save(Document document) {
		// TODO Auto-generated method stub
		
	}
	

}
