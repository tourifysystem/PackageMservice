package bt.edu.gcit.packagemicroservice.service;

import bt.edu.gcit.packagemicroservice.entity.TourPackage;
import java.util.List;

public interface TourPackageService {
    TourPackage createPackage(TourPackage tourPackage);
    List<TourPackage> getAllPackages();
    TourPackage getPackageById(Long id);
    TourPackage updatePackage(TourPackage tourPackage);
    void deletePackage(Long id);
}