package com.Job.Management.Services;

import com.Job.Management.Models.Office;
import com.Job.Management.Repos.OfficeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Component
public class OfficeService {
    @Autowired
    private OfficeRepo officeRepo;

    public List<Office> addOffice() {
        return officeRepo.findAll();
    }
    public Office addOffice(Office office) {
        office.setOfficeId(UUID.randomUUID().toString());
        return officeRepo.save(office);
    }
}
