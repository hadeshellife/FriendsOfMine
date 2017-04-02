package friendsofmine.repositories;

import friendsofmine.domain.Utilisateur;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by HadesHellife on 02-Apr-17.
 */

public interface UtilisateurRepository extends PagingAndSortingRepository<Utilisateur, Long> {
}
