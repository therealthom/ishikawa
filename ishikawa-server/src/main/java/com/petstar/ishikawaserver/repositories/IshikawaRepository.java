
package com.petstar.ishikawaserver.repositories;

import com.petstar.ishikawaserver.domain.Ishikawa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IshikawaRepository extends CrudRepository<Ishikawa, Long> {

    @Override
    void delete(Ishikawa deleted);

}
