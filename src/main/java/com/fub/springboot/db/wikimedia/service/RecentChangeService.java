package com.fub.springboot.db.wikimedia.service;

import com.fub.springboot.db.wikimedia.model.RecentChange;
import com.fub.springboot.db.wikimedia.repository.RecentChangeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RecentChangeService {
    private final RecentChangeRepository recentChangeRepository;

    @Autowired
    public RecentChangeService(RecentChangeRepository recentChangeRepository) {
        this.recentChangeRepository = recentChangeRepository;
    }

    public RecentChange saveRecentChange(RecentChange recentChange) {

        log.info("value in request "+recentChange);

        return recentChangeRepository.save(recentChange);
    }
}