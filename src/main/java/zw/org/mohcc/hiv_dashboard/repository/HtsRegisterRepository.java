package zw.org.mohcc.hiv_dashboard.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.org.mohcc.hiv_dashboard.entity.HtsRegister;
import zw.org.mohcc.hiv_dashboard.entity.HtsRegisterPK;

@Repository
public interface HtsRegisterRepository extends JpaRepository<HtsRegister, HtsRegisterPK> {

    @Override
    Page<HtsRegister> findAll(Pageable pageable);
}
