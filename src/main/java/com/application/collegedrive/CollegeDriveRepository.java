package com.application.collegedrive;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeDriveRepository extends JpaRepository<CollegeDrive, Integer> {
    // No extra methods required
}
