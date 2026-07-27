package com.example.kisansakthi.service;

import com.example.kisansakthi.model.Expert;

import java.util.List;

public interface ExpertService {

    List<Expert> getAllExperts();

    Expert getExpertById(Integer id);

    Expert addExpert(Expert expert);

    Expert updateExpert(Integer id, Expert expert);

    void deleteExpert(Integer id);

    List<Expert> getExpertsByDistrict(String district);

    List<Expert> getExpertsByMandal(String mandal);

    List<Expert> getExpertsByDistrictAndMandal(String district, String mandal);

    List<Expert> getExpertsBySpecialization(String specialization);
}