package com.soydz.controller;

import com.soydz.entity.Alert;
import com.soydz.service.interfaces.IAlertService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class AlertController {

    private static final Logger log = LoggerFactory.getLogger(AlertController.class);
    private final IAlertService alertService;

    public AlertController(IAlertService alertService) {
        this.alertService = alertService;
    }

    @QueryMapping
    public List<Alert> getAllAlerts() {
        log.info("GraphQL query: getAllAlerts");
        return alertService.getAllAlerts();
    }

    @QueryMapping
    public Alert getAlertById(@Argument Long id) {
        log.info("GraphQL query: getAlertById with id: {}", id);
        return alertService.getAlertById(id);
    }
}
