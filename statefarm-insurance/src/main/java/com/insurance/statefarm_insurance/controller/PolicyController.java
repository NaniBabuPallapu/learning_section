package com.insurance.statefarm_insurance.controller;

import com.insurance.statefarm_insurance.entity.Policy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/policy")
public class PolicyController {

    public ResponseEntity<Policy> createPolicy(@RequestBody Policy policy){

    }
}
