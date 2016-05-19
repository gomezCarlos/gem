package ve.com.gem.model.service;

import java.util.List;


import ve.com.gem.model.entity.Valoration;

public interface IValorationService {
	
	List<Valoration> findAll();
	List<Valoration> search(String key);
	void addByName(String name);
	void save(Valoration valorations);

}
