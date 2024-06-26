package zw.org.mohcc.hiv_dashboard.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.org.mohcc.hiv_dashboard.entity.ArtTransferOutRegister;
import zw.org.mohcc.hiv_dashboard.entity.ArtTransferOutRegisterPK;

@Repository
public interface ArtTransferOutRegisterRepository extends JpaRepository<ArtTransferOutRegister, ArtTransferOutRegisterPK> {

    @Override
    Page<ArtTransferOutRegister> findAll(Pageable pageable);
}
