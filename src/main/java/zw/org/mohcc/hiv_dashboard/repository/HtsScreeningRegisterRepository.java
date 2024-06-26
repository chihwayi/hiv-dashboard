package zw.org.mohcc.hiv_dashboard.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.org.mohcc.hiv_dashboard.entity.HtsScreeningRegister;
import zw.org.mohcc.hiv_dashboard.entity.HtsScreeningRegisterPK;

@Repository
public interface HtsScreeningRegisterRepository extends JpaRepository<HtsScreeningRegister, HtsScreeningRegisterPK> {

    @Override
    Page<HtsScreeningRegister> findAll(Pageable pageable);
}
