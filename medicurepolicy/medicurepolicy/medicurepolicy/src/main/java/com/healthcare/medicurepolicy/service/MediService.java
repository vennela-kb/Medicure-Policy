package com.healthcare.medicurepolicy.service;


import com.healthcare.medicurepolicy.model.MedicurePolicy;
import com.healthcare.medicurepolicy.repository.MediRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Service
public class MediService {

        @Autowired
        private MediRepository mediRepository;
    public List<MedicurePolicy> getPolicy() {

        return this.mediRepository.findAll();
    }

    public MedicurePolicy addPolicy(MedicurePolicy medicurePolicy) {

        return this.mediRepository.save(medicurePolicy);
    }

    public void deleteIdPolicy(Integer id) {
        this.mediRepository.deleteById(id);
    }


    public MedicurePolicy updatePolicyData(Integer id, MedicurePolicy medicurePolicy) {
            MedicurePolicy policy1 = this.mediRepository.findById(id).get();
            policy1.setPolicyName(medicurePolicy.getPolicyName());
            policy1.setPolicyDesc(medicurePolicy.getPolicyDesc());
            policy1.setPolicyAmount(medicurePolicy.getPolicyAmount());
            this.mediRepository.save(policy1);
            return policy1;
        }
    }

