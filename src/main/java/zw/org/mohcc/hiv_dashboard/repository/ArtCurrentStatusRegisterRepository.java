package zw.org.mohcc.hiv_dashboard.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.org.mohcc.hiv_dashboard.entity.ArtCurrentStatusRegister;
import zw.org.mohcc.hiv_dashboard.entity.ArtCurrentStatusRegisterPK;

@Repository
public interface ArtCurrentStatusRegisterRepository extends JpaRepository<ArtCurrentStatusRegister, ArtCurrentStatusRegisterPK> {

    @Override
    Page<ArtCurrentStatusRegister> findAll(Pageable pageable);
}
