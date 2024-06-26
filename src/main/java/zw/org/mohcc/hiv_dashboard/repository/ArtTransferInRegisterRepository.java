package zw.org.mohcc.hiv_dashboard.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.org.mohcc.hiv_dashboard.entity.ArtTransferInRegister;
import zw.org.mohcc.hiv_dashboard.entity.ArtTransferInRegisterPK;

@Repository
public interface ArtTransferInRegisterRepository extends JpaRepository<ArtTransferInRegister, ArtTransferInRegisterPK> {

    @Override
    Page<ArtTransferInRegister> findAll(Pageable pageable);
}
