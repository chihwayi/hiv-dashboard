package zw.org.mohcc.hiv_dashboard.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.org.mohcc.hiv_dashboard.entity.AncRegister;
import zw.org.mohcc.hiv_dashboard.entity.AncRegisterPK;

@Repository
public interface AncRegisterRepository extends JpaRepository<AncRegister, AncRegisterPK> {

    @Override
    Page<AncRegister> findAll(Pageable pageable);
}
