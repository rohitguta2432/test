package com.coredge.api;

import com.coredge.api.model.Hospitals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

/**
 * @Author rohit
 * @Date 27/10/21
 **/
@Repository
public interface HospitalRepository extends JpaRepository <Hospitals, UUID>{
    List<Hospitals> findByStateCode(String code);
    List<Hospitals> findByHspnameAndState(String name,String state);
    List<Hospitals> findByHosptype(String type);
}
