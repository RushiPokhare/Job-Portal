package org.example.springbootjobportal.service;

import lombok.AllArgsConstructor;
import org.example.springbootjobportal.dao.UserDao;
import org.example.springbootjobportal.model.Users;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private UserDao userDao;

    //    public void save(User user) {
//       userDao.save(user);
//    }    OR


    public Users save(Users users) {
        users.setCreated_at(LocalDateTime.now());
        return userDao.save(users);
    }
    public Users update(Users users) {
        users.setUpdated_at(LocalDateTime.now());
        return userDao.save(users);
    }

    public Users getById(int id) {
        return userDao.getById(id);
    }

    public List<Users> getAllusers() {
        return userDao.findAll();
    }

    public void deleteById(int id) {
        userDao.deleteById(id);
    }

    public void deleteAll() {
        userDao.deleteAll();
    }
}
