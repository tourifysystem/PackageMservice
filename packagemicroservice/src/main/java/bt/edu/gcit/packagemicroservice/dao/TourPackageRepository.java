package bt.edu.gcit.packagemicroservice.dao;

import bt.edu.gcit.packagemicroservice.entity.TourPackage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TourPackageRepository extends JpaRepository<TourPackage, Long> {
    TourPackage findByPackageName(String packageName);
}