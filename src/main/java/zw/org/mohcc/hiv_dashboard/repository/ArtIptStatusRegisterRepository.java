package zw.org.mohcc.hiv_dashboard.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.org.mohcc.hiv_dashboard.entity.ArtIptStatusRegister;
import zw.org.mohcc.hiv_dashboard.entity.ArtIptStatusRegisterPK;

@Repository
public interface ArtIptStatusRegisterRepository extends JpaRepository<ArtIptStatusRegister, ArtIptStatusRegisterPK> {

    @Override
    Page<ArtIptStatusRegister> findAll(Pageable pageable);
}
