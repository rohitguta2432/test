package com.coredge.api.service;


import com.coredge.api.HospitalRepository;
import com.coredge.api.model.Hospitals;
import lombok.Data;


import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author rohit
 * @Date 27/10/21
 **/

@Service
@Data
public class FileServiceImpl implements FileService {

    @Autowired
    private HospitalRepository hsoRepository;

    @Override
    public List<Hospitals> fetchAllHospital() throws JSONException {
        return hsoRepository.findAll();
    }

    @Override
    public List<Hospitals> getHospitalByCode(String code) throws JSONException {
        return hsoRepository.findByStateCode(code);
    }

    @Override
    public List<Hospitals> getHospitalByNameAndState(String name, String state) {
        return hsoRepository.findByHspnameAndState(name,state);
    }

    @Override
    public List<Hospitals> getHospitalByType(String type) {
        return hsoRepository.findByHosptype(type);
    }

}
