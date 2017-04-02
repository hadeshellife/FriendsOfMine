package friendsofmine.service;

import friendsofmine.domain.Activite;
import friendsofmine.repositories.ActiviteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * Created by HadesHellife on 02-Apr-17.
 */
@Service
public abstract class ActiviteService implements ActiviteRepository {

    @Autowired
    private ActiviteRepository activiteRepository;

    @Autowired
    public ActiviteService(ActiviteRepository activiteRepository) {
        this.activiteRepository = activiteRepository;
    }

    public Activite saveActivite(Activite s) {
        return activiteRepository.save(s);
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
