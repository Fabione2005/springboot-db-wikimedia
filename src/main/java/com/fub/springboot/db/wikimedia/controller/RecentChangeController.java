package com.fub.springboot.db.wikimedia.controller;

import com.fub.springboot.db.wikimedia.model.RecentChange;
import com.fub.springboot.db.wikimedia.service.RecentChangeService;
import io.micrometer.core.annotation.Timed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/recent-changes")
public class RecentChangeController {
    private final RecentChangeService recentChangeService;

    @Autowired
    public RecentChangeController(RecentChangeService recentChangeService) {
        this.recentChangeService = recentChangeService;
    }

    @Timed(value = "api.requests", description = "API Request Metrics")
    @PostMapping
    public RecentChange createRecentChange(@RequestBody RecentChange recentChange) {
        return recentChangeService.saveRecentChange(recentChange);
    }
}