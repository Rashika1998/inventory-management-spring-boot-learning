package com.rashika.inventorymanagement.utility_management.service;
import com.rashika.inventorymanagement.utility_management.entity.Utility;
import com.rashika.inventorymanagement.utility_management.repository.UtilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;


@Service
public class UtilityServiceImpl implements UtilityService{

    @Autowired
    private UtilityRepository utilityRepository;

    @Override
    public Utility addUtility(Utility utility) {
        return utilityRepository.save(utility);
    }

    @Override
    public List<Utility> getAllUtilities() {
        return utilityRepository.findAll();
    }

    @Override
    public Utility getUtility(Long utilityId) {
        return utilityRepository.findById(utilityId).get();
    }

    @Override
    public void deleteUtility(Long utilityId) {
        utilityRepository.deleteById(utilityId);
    }

    @Override
    public Utility updateUtility(Long utilityId, Utility utility) {

        Utility utilityDB = utilityRepository.findById(utilityId).get();

        if (Objects.nonNull(utility.getUtility_type()) && !"".equalsIgnoreCase(utility.getUtility_type())){
            utilityDB.setUtility_type(utility.getUtility_type());
        }

        if (Objects.nonNull(utility.getUtility_pay_date()) && !"".equalsIgnoreCase(utility.getUtility_pay_date())){
            utilityDB.setUtility_pay_date(utility.getUtility_pay_date());
        }



        if(Objects.nonNull(utility.getUtility_amount())){
            utilityDB.setUtility_amount(utility.getUtility_amount());
        }

        if(Objects.nonNull(utility.isUtility_paid())){
            utilityDB.setUtility_paid(utility.isUtility_paid());
        }

        return utilityRepository.save(utilityDB);

    }


}
