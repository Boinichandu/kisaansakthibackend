package com.example.kisansakthi.controller;

import com.example.kisansakthi.model.Expert;
import com.example.kisansakthi.service.ExpertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/experts")
@CrossOrigin(origins = "*")
public class ExpertController {

    @Autowired
    private ExpertService expertService;

    // Get All Experts
    @GetMapping
    public List<Expert> getAllExperts() {

        return expertService.getAllExperts();

    }

    // Get Expert By ID
    @GetMapping("/{id}")
    public Expert getExpertById(@PathVariable Integer id) {

        return expertService.getExpertById(id);

    }

    // Add Expert
    @PostMapping
    public Expert addExpert(@RequestBody Expert expert) {

        return expertService.addExpert(expert);

    }

    // Update Expert
    @PutMapping("/{id}")
    public Expert updateExpert(@PathVariable Integer id,
            @RequestBody Expert expert) {

        return expertService.updateExpert(id, expert);

    }

    // Delete Expert
    @DeleteMapping("/{id}")
    public void deleteExpert(@PathVariable Integer id) {

        expertService.deleteExpert(id);

    }

    // Get Experts By District
    @GetMapping("/district/{district}")
    public List<Expert> getExpertsByDistrict(@PathVariable String district) {

        return expertService.getExpertsByDistrict(district);

    }

    // Get Experts By Mandal
    @GetMapping("/mandal/{mandal}")
    public List<Expert> getExpertsByMandal(@PathVariable String mandal) {

        return expertService.getExpertsByMandal(mandal);

    }

    // Get Experts By District And Mandal
    @GetMapping("/search")
    public List<Expert> searchExperts(
            @RequestParam String district,
            @RequestParam String mandal) {

        return expertService.getExpertsByDistrictAndMandal(district, mandal);

    }

    // Get Experts By Specialization
    @GetMapping("/specialization/{specialization}")
    public List<Expert> getExpertsBySpecialization(
            @PathVariable String specialization) {

        return expertService.getExpertsBySpecialization(specialization);

    }

}