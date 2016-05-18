package ve.com.gem.model.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.google.common.collect.Lists;
import ve.com.gem.model.entity.Gem;
import ve.com.gem.model.repository.IGemRepository;
@Service
public class GemService implements IGemService {
	
	@Autowired
	IGemRepository gemRepository;
    List<Gem> gems = new ArrayList<Gem>();
    
	public GemService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Gem> findAll() {
		gems = Lists.newArrayList(gemRepository.findAll());
	return gems;
	}

	@Override
	public List<Gem> search(String key) {
		return gemRepository.findByNameLike("%"+key+"%");
	}

	@Override
	public void addByName(String name) {
		// TODO Auto-generated method stub
	}

	@Override
	public Gem save(Gem gem) {
		gemRepository.save(gem);
		return gem;
	}
}
