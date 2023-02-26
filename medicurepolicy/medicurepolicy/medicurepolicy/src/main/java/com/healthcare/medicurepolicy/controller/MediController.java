package com.healthcare.medicurepolicy.controller;

import com.healthcare.medicurepolicy.model.MedicurePolicy;
import com.healthcare.medicurepolicy.service.MediService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v1/policymanagement")
public class MediController {

    @Autowired
    private MediService mediService;

    @RequestMapping(value = "all", method = RequestMethod.GET,
            produces = {MimeTypeUtils.APPLICATION_JSON_VALUE})
    public ResponseEntity<Iterable<MedicurePolicy>> getAllPolicy(){
        try{
            return new ResponseEntity<Iterable<MedicurePolicy>>(mediService.getPolicy(),(HttpStatus.OK));
        } catch (Exception e){
            return new ResponseEntity<Iterable<MedicurePolicy>>(mediService.getPolicy(),HttpStatus.BAD_REQUEST);
        }
    }


    @RequestMapping(value = "add", method = RequestMethod.POST,
            produces = {MimeTypeUtils.APPLICATION_JSON_VALUE},
            consumes = {MimeTypeUtils.APPLICATION_JSON_VALUE})
        public ResponseEntity<MedicurePolicy> addNewPolicy(@RequestBody MedicurePolicy medicurePolicy){
        try{
            return new ResponseEntity<MedicurePolicy>(mediService.addPolicy(medicurePolicy),(HttpStatus.OK));
        } catch (Exception e){
            return new ResponseEntity<MedicurePolicy>(mediService.addPolicy(medicurePolicy),HttpStatus.BAD_REQUEST);
        }
    }
//    @PostMapping("/add")
//    public MedicurePolicy addNewPolicy(@RequestBody MedicurePolicy medicurePolicy){
//        return this.mediService.addPolicy(medicurePolicy);
//    }

    @DeleteMapping("/all/{id}")
    public void deletePolicy(@PathVariable Integer id){
        this.mediService.deleteIdPolicy(id);
    }

    @PutMapping("/{id}")
    public MedicurePolicy updatePolicy(@PathVariable Integer id, @RequestBody MedicurePolicy medicurePolicy){
        return this.mediService.updatePolicyData(id, medicurePolicy);
    }

}
