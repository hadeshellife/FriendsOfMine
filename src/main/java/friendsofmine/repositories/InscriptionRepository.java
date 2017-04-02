package friendsofmine.repositories;

import friendsofmine.domain.Inscription;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by HadesHellife on 02-Apr-17.
 */
public interface InscriptionRepository extends PagingAndSortingRepository<Inscription, Long>{
    public Page<Inscription> findByParticipantNomOrActiviteTitreAllIgnoreCase(String nom, String titre, Pageable pageable);
}
