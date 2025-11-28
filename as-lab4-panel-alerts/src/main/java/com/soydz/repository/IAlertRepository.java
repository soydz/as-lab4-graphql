package com.soydz.repository;

import com.soydz.entity.Alert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAlertRepository extends JpaRepository<Alert, Long> {
}
