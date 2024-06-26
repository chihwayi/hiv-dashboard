package zw.org.mohcc.hiv_dashboard.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.org.mohcc.hiv_dashboard.entity.ArtAppointment;
import zw.org.mohcc.hiv_dashboard.entity.ArtAppointmentPK;

import java.util.List;

@Repository
public interface ArtAppointmentRepository extends JpaRepository<ArtAppointment, ArtAppointmentPK> {
    List<ArtAppointment> findArtAppointmentBySiteId(String siteId);

    @Override
    Page<ArtAppointment> findAll(Pageable pageable);
}
