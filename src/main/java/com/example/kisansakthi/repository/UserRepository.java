package com.example.kisansakthi.repository;

import com.example.kisansakthi.model.User;
import com.example.kisansakthi.rowmapper.UserRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // Register User
    public User addUser(User user) {

        String sql = "INSERT INTO users(full_name, email, phone, password) VALUES(?, ?, ?, ?)";

        jdbcTemplate.update(
                sql,
                user.getFullName(),
                user.getEmail(),
                user.getPhone(),
                user.getPassword());

        return user;
    }

    // Get All Users
    public List<User> getAllUsers() {

        String sql = "SELECT * FROM users";

        return jdbcTemplate.query(sql, new UserRowMapper());
    }

    // Get User By ID
    public User getUserById(int id) {

        String sql = "SELECT * FROM users WHERE id = ?";

        return jdbcTemplate.queryForObject(
                sql,
                new UserRowMapper(),
                id);
    }

    // Get User By Email
    public User getUserByEmail(String email) {

        String sql = "SELECT * FROM users WHERE email = ?";

        return jdbcTemplate.queryForObject(
                sql,
                new UserRowMapper(),
                email);
    }

    // Get User By Phone
    public User getUserByPhone(String phone) {

        String sql = "SELECT * FROM users WHERE phone = ?";

        return jdbcTemplate.queryForObject(
                sql,
                new UserRowMapper(),
                phone);
    }


        // Login User
    public User login(String email, String password) {
        String sql = "SELECT * FROM users WHERE email = ? AND password = ?";
        List<User> users = jdbcTemplate.query(
        sql,
        new UserRowMapper(),
        email,
        password
        );

        if (users.isEmpty()) {
            return null;
        }
        return users.get(0);
    }

    

    // Update User
    public User updateUser(int id, User user) {

        String sql = """
                UPDATE users
                SET full_name = ?,
                    email = ?,
                    phone = ?,
                    password = ?
                WHERE id = ?
                """;

        jdbcTemplate.update(
                sql,
                user.getFullName(),
                user.getEmail(),
                user.getPhone(),
                user.getPassword(),
                id);

        return getUserById(id);
    }

    // Delete User
    public void deleteUser(int id) {

        String sql = "DELETE FROM users WHERE id = ?";

        jdbcTemplate.update(sql, id);
    }
}