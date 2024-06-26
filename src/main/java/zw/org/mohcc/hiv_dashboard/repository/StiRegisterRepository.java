package zw.org.mohcc.hiv_dashboard.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.org.mohcc.hiv_dashboard.entity.StiRegister;
import zw.org.mohcc.hiv_dashboard.entity.StiRegisterPK;

@Repository
public interface StiRegisterRepository extends JpaRepository<StiRegister, StiRegisterPK> {

    @Override
    Page<StiRegister> findAll(Pageable pageable);
}
