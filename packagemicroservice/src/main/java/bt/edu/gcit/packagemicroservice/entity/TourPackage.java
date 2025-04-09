package bt.edu.gcit.packagemicroservice.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "tour_packages")
public class TourPackage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String packageName;

    private int numberOfDays;
    
    @ElementCollection
    private List<String> tourPhotos;
    
    @Column(length = 2000)
    private String tourOverview;
    
    @ElementCollection
    private List<String> tripHighlights;
    
    @Lob
    private String daywiseTourPlan;
    
    @ElementCollection
    private List<String> tourInclusion;
    
    @ElementCollection
    private List<String> tourExclusion;
}