package com.example.kisansakthi.repository;

import com.example.kisansakthi.model.FarmingTip;
import com.example.kisansakthi.rowmapper.FarmingTipRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FarmingTipRepositoryImplement implements FarmingTipRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<FarmingTip> getTipsByCrop(String cropName) {

        String sql = """
                SELECT *
                FROM farming_tips
                WHERE crop_name = ?
                ORDER BY category, id
                """;

        return jdbcTemplate.query(
                sql,
                new FarmingTipRowMapper(),
                cropName);
    }
}