package bt.edu.gcit.packagemicroservice.controller;

import bt.edu.gcit.packagemicroservice.entity.TourPackage;
import bt.edu.gcit.packagemicroservice.service.TourPackageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/packages")
public class TourPackageController {
    
    private final TourPackageService tourPackageService;

    public TourPackageController(TourPackageService tourPackageService) {
        this.tourPackageService = tourPackageService;
    }

    @PostMapping
    public ResponseEntity<TourPackage> createPackage(@RequestBody TourPackage tourPackage) {
        return new ResponseEntity<>(tourPackageService.createPackage(tourPackage), HttpStatus.CREATED);
    }

    @GetMapping
    public List<TourPackage> getAllPackages() {
        return tourPackageService.getAllPackages();
    }

    @GetMapping("/{id}")
    public TourPackage getPackageById(@PathVariable Long id) {
        return tourPackageService.getPackageById(id);
    }

    @PutMapping("/{id}")
    public TourPackage updatePackage(@PathVariable Long id, @RequestBody TourPackage tourPackage) {
        tourPackage.setId(id);
        return tourPackageService.updatePackage(tourPackage);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePackage(@PathVariable Long id) {
        tourPackageService.deletePackage(id);
    }
}