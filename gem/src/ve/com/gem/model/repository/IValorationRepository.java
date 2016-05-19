/**
 * 
 */
package ve.com.gem.model.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import ve.com.gem.model.entity.Valoration;

/**
 * @author alonso y alfonso
 *
 */
public interface IValorationRepository extends CrudRepository<Valoration, Long>{
	
	List<Valoration> findByNameLike(String string);
	
}
