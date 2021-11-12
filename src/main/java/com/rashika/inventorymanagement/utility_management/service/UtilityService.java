package com.rashika.inventorymanagement.utility_management.service;

import com.rashika.inventorymanagement.utility_management.entity.Utility;

import java.util.List;

public interface UtilityService {
    public Utility addUtility(Utility utility);

    public List<Utility> getAllUtilities();

    public Utility getUtility(Long utilityId);


    public  void deleteUtility(Long utilityId);

    public Utility updateUtility(Long utilityId, Utility utility);
}
