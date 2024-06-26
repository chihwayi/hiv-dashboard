package zw.org.mohcc.hiv_dashboard.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.org.mohcc.hiv_dashboard.entity.ArtVisitRegister;
import zw.org.mohcc.hiv_dashboard.entity.ArtVisitRegisterPK;

@Repository
public interface ArtVisitRegisterRepository extends JpaRepository<ArtVisitRegister, ArtVisitRegisterPK> {

    @Override
    Page<ArtVisitRegister> findAll(Pageable pageable);
}
