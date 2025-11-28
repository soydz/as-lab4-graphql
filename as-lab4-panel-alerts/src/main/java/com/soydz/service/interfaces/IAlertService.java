package com.soydz.service.interfaces;

import com.soydz.entity.Alert;

import java.util.List;

public interface IAlertService {

    Alert saveAlert(String alertType, String responsible, String priority, String driver, String generatingUnit, String state);

    List<Alert> getAllAlerts();

    Alert getAlertById(Long id);
}
