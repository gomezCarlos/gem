package ve.com.gem.model.service;

import java.util.List;

import ve.com.gem.model.entity.Gem;

public interface IGemService {
	 List<Gem> findAll();
	 List<Gem> search(String key);
	 void addByName(String name);
	 Gem save (Gem gem);
	 
}
