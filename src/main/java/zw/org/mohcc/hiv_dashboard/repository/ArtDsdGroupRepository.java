package zw.org.mohcc.hiv_dashboard.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.org.mohcc.hiv_dashboard.entity.ArtDsdGroup;
import zw.org.mohcc.hiv_dashboard.entity.ArtDsdGroupPK;

@Repository
public interface ArtDsdGroupRepository extends JpaRepository<ArtDsdGroup, ArtDsdGroupPK> {

    @Override
    Page<ArtDsdGroup> findAll(Pageable pageable);
}
