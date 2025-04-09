package bt.edu.gcit.packagemicroservice.service.impl;

import bt.edu.gcit.packagemicroservice.dao.TourPackageRepository;
import bt.edu.gcit.packagemicroservice.entity.TourPackage;
import bt.edu.gcit.packagemicroservice.service.TourPackageService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TourPackageServiceImpl implements TourPackageService {
    
    private final TourPackageRepository tourPackageRepository;

    public TourPackageServiceImpl(TourPackageRepository tourPackageRepository) {
        this.tourPackageRepository = tourPackageRepository;
    }

    @Override
    public TourPackage createPackage(TourPackage tourPackage) {
        return tourPackageRepository.save(tourPackage);
    }

    @Override
    public List<TourPackage> getAllPackages() {
        return tourPackageRepository.findAll();
    }

    @Override
    public TourPackage getPackageById(Long id) {
        return tourPackageRepository.findById(id).orElseThrow();
    }

    @Override
    public TourPackage updatePackage(TourPackage tourPackage) {
        return tourPackageRepository.save(tourPackage);
    }

    @Override
    public void deletePackage(Long id) {
        tourPackageRepository.deleteById(id);
    }
}