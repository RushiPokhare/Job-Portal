package org.example.springbootjobportal.service;

import lombok.AllArgsConstructor;
import org.example.springbootjobportal.dao.AppDao;
import org.example.springbootjobportal.model.App;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AppService {
    private AppDao appDao;

    public List<App> getAllApps() {
        return appDao.findAll();
    }

    public App save(App app) {
        return appDao.save(app);
    }

    public App updateApp(App app) {
        return appDao.save(app);
    }

    public App getAppById(int id) {
        return appDao.getById(id);   // if not work used findById(id).get();
    }

    public void deleteById(int id) {
        appDao.deleteById(id);
    }

    public void deleteApp() {
        appDao.deleteAll();
    }
}
