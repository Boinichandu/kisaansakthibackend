package com.example.kisansakthi.rowmapper;

import com.example.kisansakthi.model.FarmingTip;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FarmingTipRowMapper implements RowMapper<FarmingTip> {

    @Override
    public FarmingTip mapRow(ResultSet rs, int rowNum) throws SQLException {

        FarmingTip tip = new FarmingTip();

        tip.setId(rs.getInt("id"));
        tip.setCropName(rs.getString("crop_name"));
        tip.setCategory(rs.getString("category"));
        tip.setStage(rs.getString("stage"));
        tip.setTitle(rs.getString("title"));
        tip.setDescription(rs.getString("description"));

        return tip;
    }
}