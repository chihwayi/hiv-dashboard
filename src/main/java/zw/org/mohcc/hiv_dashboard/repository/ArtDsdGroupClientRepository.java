package zw.org.mohcc.hiv_dashboard.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.org.mohcc.hiv_dashboard.entity.ArtDsdGroupClient;
import zw.org.mohcc.hiv_dashboard.entity.ArtDsdGroupClientPK;

@Repository
public interface ArtDsdGroupClientRepository extends JpaRepository<ArtDsdGroupClient, ArtDsdGroupClientPK> {

    @Override
    Page<ArtDsdGroupClient> findAll(Pageable pageable);
}
