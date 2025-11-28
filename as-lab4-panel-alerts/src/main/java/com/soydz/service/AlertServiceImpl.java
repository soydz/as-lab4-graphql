package com.soydz.service;

import com.soydz.entity.Alert;
import com.soydz.repository.IAlertRepository;
import com.soydz.service.interfaces.IAlertService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AlertServiceImpl implements IAlertService {

    private final Logger log = LoggerFactory.getLogger(AlertServiceImpl.class);
    private final IAlertRepository alertRepository;

    public AlertServiceImpl(IAlertRepository alertRepository) {
        this.alertRepository = alertRepository;
    }

    @Override
    public Alert saveAlert(String alertType, String responsible, String priority, String driver, String generatingUnit, String state) {
        log.info("Saving new alert ");

        Alert alert = new Alert();

        alert.setAlertType(alertType);
        alert.setResponsible(responsible);
        alert.setPriority(priority);
        alert.setDriver(driver);
        alert.setGeneratingUnit(generatingUnit);
        alert.setState(state);
        alert.setGenerationDate(LocalDateTime.now());

        return alertRepository.save(alert);
    }

    @Override
    public List<Alert> getAllAlerts() {
        return alertRepository.findAll();
    }

    @Override
    public Alert getAlertById(Long id) {
        return alertRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Alert not found"));
    }
}
