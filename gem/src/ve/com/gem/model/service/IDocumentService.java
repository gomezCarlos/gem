/**
 * 
 */
package ve.com.gem.model.service;

import java.util.List;

import ve.com.gem.model.entity.Document;

/**
 * @author euddy y alfonso
 *
 */
public interface IDocumentService {
	
	List<Document> findAll();
	List<Document> search(String key);	
	void addByDescription(String description);
	void save(Document documents);

}
