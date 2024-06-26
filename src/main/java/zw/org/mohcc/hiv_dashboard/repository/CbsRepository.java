package zw.org.mohcc.hiv_dashboard.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.org.mohcc.hiv_dashboard.entity.Cbs;
import zw.org.mohcc.hiv_dashboard.entity.CbsPK;

@Repository
public interface CbsRepository extends JpaRepository<Cbs, CbsPK> {

    @Override
    Page<Cbs> findAll(Pageable pageable);
}
