package zw.org.mohcc.hiv_dashboard.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.org.mohcc.hiv_dashboard.entity.PrepRegister;
import zw.org.mohcc.hiv_dashboard.entity.PrepRegisterPK;

@Repository
public interface PrepRegisterRepository extends JpaRepository<PrepRegister, PrepRegisterPK>{

    @Override
    Page<PrepRegister> findAll(Pageable pageable);
}
