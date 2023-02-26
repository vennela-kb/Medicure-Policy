package com.healthcare.medicurepolicy.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class MedicurePolicy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer policyId;
    private String policyName;
    private String policyDesc;
    private String coverage;
    private Integer policyAmount;
    private String policyTenure;
    private Integer policyValidity;
    @JsonFormat(pattern = "yyyy-MM-dd" , shape = JsonFormat.Shape.STRING)
    private String expiryDate;


}
