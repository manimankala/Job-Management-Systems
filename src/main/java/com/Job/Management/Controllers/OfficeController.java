package com.Job.Management.Controllers;

import com.Job.Management.Models.Office;
import com.Job.Management.Services.OfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/office")
public class OfficeController {

    @Autowired
    private OfficeService officeService;

    @GetMapping
    public List<Office> getOffice() {
        return officeService.addOffice();
    }
//    @PostMapping
//    public Office createOffice(@RequestBody Office office) {
//        return officeService.addOffice(office);
//    }


}
