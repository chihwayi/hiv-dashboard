package zw.org.mohcc.hiv_dashboard.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.org.mohcc.hiv_dashboard.entity.HtsRegisterTest;
import zw.org.mohcc.hiv_dashboard.entity.HtsRegisterTestPK;

@Repository
public interface HtsRegisterTestRepository extends JpaRepository<HtsRegisterTest, HtsRegisterTestPK> {

    @Override
    Page<HtsRegisterTest> findAll(Pageable pageable);
}
