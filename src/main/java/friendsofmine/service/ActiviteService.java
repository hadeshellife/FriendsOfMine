package friendsofmine.service;

import friendsofmine.domain.Activite;
import friendsofmine.repositories.ActiviteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by HadesHellife on 02-Apr-17.
 */
@Service
public class ActiviteService{

    @Autowired
    private ActiviteRepository activiteRepository;

    public Activite saveActivite(Activite act) {
        if(act==null)
            throw new IllegalArgumentException();
        return activiteRepository.save(act);
    }

    public Activite findOneActivite(Long id) {
        return activiteRepository.findOne(id);
    }

    public Long countActivite() {
        return activiteRepository.count();
    }

    public ActiviteRepository getActiviteRepository() {
        return activiteRepository;
    }

    public void setActiviteRepository(ActiviteRepository activiteRepository) {
        this.activiteRepository = activiteRepository;
    }
}
