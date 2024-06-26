package zw.org.mohcc.hiv_dashboard.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.org.mohcc.hiv_dashboard.entity.ArtWhoStageRegister;
import zw.org.mohcc.hiv_dashboard.entity.ArtWhoStageRegisterPK;

@Repository
public interface ArtWhoStageRegisterRepository extends JpaRepository<ArtWhoStageRegister, ArtWhoStageRegisterPK> {

    @Override
    Page<ArtWhoStageRegister> findAll(Pageable pageable);
}
