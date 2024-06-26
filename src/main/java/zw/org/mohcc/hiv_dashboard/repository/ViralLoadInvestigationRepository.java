package zw.org.mohcc.hiv_dashboard.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.org.mohcc.hiv_dashboard.entity.ViralLoadInvestigation;
import zw.org.mohcc.hiv_dashboard.entity.ViralLoadInvestigationPK;

@Repository
public interface ViralLoadInvestigationRepository extends JpaRepository<ViralLoadInvestigation, ViralLoadInvestigationPK> {

    @Override
    Page<ViralLoadInvestigation> findAll(Pageable pageable);
}
