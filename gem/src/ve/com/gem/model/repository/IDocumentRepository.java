/**
 * 
 */
package ve.com.gem.model.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import ve.com.gem.model.entity.Document;

/**
 * @author euddy y moises
 * 
 *
 */
public interface IDocumentRepository extends CrudRepository<Document, Long>  {
	
	List<Document> findByDescriptionLike(String string);
	
}
