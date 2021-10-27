package com.coredge.api.model;

import javax.persistence.*;
import java.util.UUID;

/**
 * @Author rohit
 * @Date 27/10/21
 **/
@Entity
@Table(name = "hospitals")
public class Hospitals {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String hospid;
    private String hspname;
    private String stateCode;
    private String state;
    private String district;
    private String hospcontactno;
    private String hspaddress;
    private String hosptype;
}
