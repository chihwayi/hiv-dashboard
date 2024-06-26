package zw.org.mohcc.hiv_dashboard.repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.org.mohcc.hiv_dashboard.entity.AncBookedRegister;
import zw.org.mohcc.hiv_dashboard.entity.AncBookedRegisterPK;

@Repository
public interface AncBookedRegisterRepository  extends JpaRepository<AncBookedRegister, AncBookedRegisterPK> {

    @Override
    Page<AncBookedRegister> findAll(Pageable pageable);
}
