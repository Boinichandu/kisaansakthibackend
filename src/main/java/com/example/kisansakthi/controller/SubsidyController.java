package com.example.kisansakthi.controller;

import com.example.kisansakthi.model.Subsidy;
import com.example.kisansakthi.service.SubsidyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subsidies")
@CrossOrigin(origins = "*")
public class SubsidyController {

    @Autowired
    private SubsidyService subsidyService;

    // Get all subsidies
    @GetMapping
    public List<Subsidy> getAllSubsidies() {
        return subsidyService.getAllSubsidies();
    }

    // Get subsidy by ID
    @GetMapping("/{id}")
    public Subsidy getSubsidyById(@PathVariable Integer id) {
        return subsidyService.getSubsidyById(id);
    }

    // Add subsidy
    @PostMapping
    public Subsidy addSubsidy(@RequestBody Subsidy subsidy) {
        return subsidyService.addSubsidy(subsidy);
    }

    // Update subsidy
    @PutMapping("/{id}")
    public Subsidy updateSubsidy(@PathVariable Integer id,
            @RequestBody Subsidy subsidy) {
        return subsidyService.updateSubsidy(id, subsidy);
    }

    // Delete subsidy
    @DeleteMapping("/{id}")
    public void deleteSubsidy(@PathVariable Integer id) {
        subsidyService.deleteSubsidy(id);
    }
}