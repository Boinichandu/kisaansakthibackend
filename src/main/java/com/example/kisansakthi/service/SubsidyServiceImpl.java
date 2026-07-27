package com.example.kisansakthi.service;

import com.example.kisansakthi.model.Subsidy;
import com.example.kisansakthi.repository.SubsidyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubsidyServiceImpl implements SubsidyService {

    @Autowired
    private SubsidyRepository subsidyRepository;

    @Override
    public List<Subsidy> getAllSubsidies() {
        return subsidyRepository.findAll();
    }

    @Override
    public Subsidy getSubsidyById(Integer id) {
        return subsidyRepository.findById(id).orElse(null);
    }

    @Override
    public Subsidy addSubsidy(Subsidy subsidy) {
        return subsidyRepository.save(subsidy);
    }

    @Override
    public Subsidy updateSubsidy(Integer id, Subsidy subsidy) {

        Subsidy existing = subsidyRepository.findById(id).orElse(null);

        if (existing != null) {

            existing.setSchemeName(subsidy.getSchemeName());
            existing.setCategory(subsidy.getCategory());
            existing.setGovernmentRate(subsidy.getGovernmentRate());
            existing.setMarketRate(subsidy.getMarketRate());
            existing.setFarmerPrice(subsidy.getFarmerPrice());
            existing.setDistrict(subsidy.getDistrict());
            existing.setMandal(subsidy.getMandal());
            existing.setDescription(subsidy.getDescription());

            // New fields
            existing.setStartDate(subsidy.getStartDate());
            existing.setLastDate(subsidy.getLastDate());
            existing.setRequiredDocuments(subsidy.getRequiredDocuments());
            existing.setEligibility(subsidy.getEligibility());

            return subsidyRepository.save(existing);
        }

        return null;
    }

    @Override
    public void deleteSubsidy(Integer id) {
        subsidyRepository.deleteById(id);
    }
}