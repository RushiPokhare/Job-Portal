package org.example.springbootjobportal.controller;

import lombok.AllArgsConstructor;
import org.example.springbootjobportal.model.App;
import org.example.springbootjobportal.service.AppService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/app")
public class AppController {
    private AppService appService;

    @PostMapping
    public App saveApp(@RequestBody App app) {
        app.setApplied_at(LocalDateTime.now());
        return appService.save(app);
    }

    @PutMapping
    public App updateApps(@RequestBody App app) {
        return appService.updateApp(app);
    }

    @GetMapping
   public List<App> getAllApps() {
        return appService.getAllApps();
   }

   @GetMapping("/{id}")
   public App getAppById(@PathVariable int id) {
       return appService.getAppById(id);
   }

   @DeleteMapping("/{id}")
   public void deleteAppById(@PathVariable int id) {
        appService.deleteById(id);
   }

   @DeleteMapping
    public void deleteAllApps() {
        appService.deleteApp();
   }
}
