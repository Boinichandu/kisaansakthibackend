package com.example.kisansakthi.service;

import com.example.kisansakthi.model.Expert;
import com.example.kisansakthi.repository.ExpertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpertServiceImpl implements ExpertService {

    @Autowired
    private ExpertRepository expertRepository;

    @Override
    public List<Expert> getAllExperts() {
        return expertRepository.findAll();
    }

    @Override
    public Expert getExpertById(Integer id) {
        return expertRepository.findById(id).orElse(null);
    }

    @Override
    public Expert addExpert(Expert expert) {
        return expertRepository.save(expert);
    }

    @Override
    public Expert updateExpert(Integer id, Expert expert) {

        Expert existingExpert = expertRepository.findById(id).orElse(null);

        if (existingExpert != null) {

            existingExpert.setExpertName(expert.getExpertName());
            existingExpert.setSpecialization(expert.getSpecialization());
            existingExpert.setDistrict(expert.getDistrict());
            existingExpert.setMandal(expert.getMandal());
            existingExpert.setPhoneNumber(expert.getPhoneNumber());
            existingExpert.setEmail(expert.getEmail());
            existingExpert.setOfficeName(expert.getOfficeName());
            existingExpert.setAvailableDays(expert.getAvailableDays());
            existingExpert.setAvailableTime(expert.getAvailableTime());

            return expertRepository.save(existingExpert);
        }

        return null;
    }

    @Override
    public void deleteExpert(Integer id) {

        expertRepository.deleteById(id);

    }

    @Override
    public List<Expert> getExpertsByDistrict(String district) {

        return expertRepository.findByDistrict(district);

    }

    @Override
    public List<Expert> getExpertsByMandal(String mandal) {

        return expertRepository.findByMandal(mandal);

    }

    @Override
    public List<Expert> getExpertsByDistrictAndMandal(String district, String mandal) {

        return expertRepository.findByDistrictAndMandal(district, mandal);

    }

    @Override
    public List<Expert> getExpertsBySpecialization(String specialization) {

        return expertRepository.findBySpecialization(specialization);

    }

}