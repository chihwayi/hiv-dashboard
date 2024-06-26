package zw.org.mohcc.hiv_dashboard.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.org.mohcc.hiv_dashboard.entity.AncVisit;
import zw.org.mohcc.hiv_dashboard.entity.AncVisitPK;

@Repository
public interface AncVisitRepository extends JpaRepository<AncVisit, AncVisitPK> {

    @Override
    Page<AncVisit> findAll(Pageable pageable);
}
