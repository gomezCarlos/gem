/**
 * 
 */
package ve.com.gem.model.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;

import ve.com.gem.model.entity.Valoration;
import ve.com.gem.model.repository.IValorationRepository;

/**
 * @author alonso y alfonso
 *
 */
@Service
public class ValorationService implements IValorationService{
	
	@Autowired
	IValorationRepository valorationRepository;
	
	List<Valoration> valorations =  new ArrayList<Valoration>();

	public ValorationService() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public List<Valoration> findAll() {
		valorations = Lists.newArrayList(valorationRepository.findAll());
		return valorations;
	}

	@Override
	public List<Valoration> search(String key) {
		
		return valorationRepository.findByNameLike("%"+key+"%");
	}

	@Override
	public void addByName(String name) {
		valorationRepository.save(new Valoration(name));
		//personas.add(new Persona(new Integer(personas.size()+1).longValue(),name));
		//valorationRepository.save(new Valoration())
	}

	@Override
	public void save(Valoration valorations) {
		// TODO Auto-generated method stub
		
	}
	

}
