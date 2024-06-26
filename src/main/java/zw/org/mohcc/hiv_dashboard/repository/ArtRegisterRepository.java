package zw.org.mohcc.hiv_dashboard.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.org.mohcc.hiv_dashboard.entity.ArtRegister;
import zw.org.mohcc.hiv_dashboard.entity.ArtRegisterPK;

@Repository
public interface ArtRegisterRepository extends JpaRepository<ArtRegister, ArtRegisterPK> {

    @Override
    Page<ArtRegister> findAll(Pageable pageable);
}
