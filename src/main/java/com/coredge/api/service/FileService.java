package com.coredge.api.service;


import com.coredge.api.model.Hospitals;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

/**
 * @Author rohit
 * @Date 27/10/21
 **/
public interface FileService {
    List<Hospitals> fetchAllHospital() throws JSONException;
    List<Hospitals>  getHospitalByCode(String code) throws JSONException;
    List<Hospitals>  getHospitalByNameAndState(String name,String state);
    List<Hospitals>  getHospitalByType(String type);
}
