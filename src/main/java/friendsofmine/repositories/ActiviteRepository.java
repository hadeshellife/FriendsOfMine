package friendsofmine.repositories;

import friendsofmine.domain.Activite;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by HadesHellife on 02-Apr-17.
 */

public interface ActiviteRepository extends PagingAndSortingRepository<Activite,Long>{
}
