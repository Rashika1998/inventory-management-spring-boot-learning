package com.rashika.inventorymanagement.utility_management.controller;

import com.rashika.inventorymanagement.utility_management.entity.Utility;
import com.rashika.inventorymanagement.utility_management.service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UtilityController {

    @Autowired
    private UtilityService utilityService;

    @PostMapping("/utilities")
    public Utility addUtility(@RequestBody Utility utility){
        return utilityService.addUtility(utility);
    }

    @GetMapping("/utilities")
    public List<Utility> getAllUtilities(){
        return utilityService.getAllUtilities();
    }

    @GetMapping("/utilities/{id}")
    public Utility getUtility(@PathVariable("id") Long utilityId){
        return utilityService.getUtility(utilityId);
    }

    @DeleteMapping("/utilities/{id}")
    public String deleteUtility(@PathVariable("id") Long utilityId){
        utilityService.deleteUtility(utilityId);
        return "Deleted.";
    }

    @PutMapping("/utilities/{id}")
    public Utility updateUtility(@PathVariable("id") Long utilityId,@RequestBody Utility utility){
        return utilityService.updateUtility(utilityId, utility);
    }


}
