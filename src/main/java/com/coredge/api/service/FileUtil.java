package com.coredge.api.service;



import org.json.JSONException;
import org.json.JSONObject;

/**
 * @Author rohit
 * @Date 27/10/21
 **/

public class FileUtil {

    public static JSONObject getData() throws JSONException {
        JSONObject jsonArray = new JSONObject("{\n" +
                "\"hospid\": \"HOSP23G108570\",\n" +
                "\"hospname\": \"REGIONAL HOSPITAL KOTMA COLLIERY\",\n" +
                "\"statecode\": \"23\",\n" +
                "\"state\": \"MADHYA PRADESH\",\n" +
                "\"districtid\": \"390\",\n" +
                "\"district\": \"ANUPPUR\",\n" +
                "\"hospcontactno\": \"9407146406\",\n" +
                "\"hospaddress\": \"REGIONAL HOSPITAL KOTMA COLLIERY\",\n" +
                "\"hosptype\": \"Public\"\n" +
                "},\n" +
                "{\n" +
                "\"hospid\": \"HOSP23G100602\",\n" +
                "\"hospname\": \"COMMUNITY HEALTH CENTER VENKATNAGAR\",\n" +
                "\"statecode\": \"23\",\n" +
                "\"state\": \"MADHYA PRADESH\",\n" +
                "\"districtid\": \"390\",\n" +
                "\"district\": \"ANUPPUR\",\n" +
                "\"hospcontactno\": \"9406775224\",\n" +
                "\"hospaddress\": \"423,venkatnagar river,post- jaitehri\",\n" +
                "\"hosptype\": \"Public\"\n" +
                "},\n" +
                "{\n" +
                "\"hospid\": \"HOSP23G100450\",\n" +
                "\"hospname\": \"CHC FUNGA\",\n" +
                "\"statecode\": \"23\",\n" +
                "\"state\": \"MADHYA PRADESH\",\n" +
                "\"districtid\": \"390\",\n" +
                "\"district\": \"ANUPPUR\",\n" +
                "\"hospcontactno\": \"9406775224\",\n" +
                "\"hospaddress\": \"GRAM FUNGA\",\n" +
                "\"hosptype\": \"Public\"\n" +
                "},\n" +
                "{\n" +
                "\"hospid\": \"HOSP23G100424\",\n" +
                "\"hospname\": \"COMUNITY HEALTH CENTER PARASI\",\n" +
                "\"statecode\": \"23\",\n" +
                "\"state\": \"MADHYA PRADESH\",\"districtid\": \"390\",\n" +
                "\"district\": \"ANUPPUR\",\n" +
                "\"hospcontactno\": \"9406775224\",\n" +
                "\"hospaddress\": \"GRAM PARASI, LATAR ROAD\",\n" +
                "\"hosptype\": \"Public\"\n" +
                "},\n" +
                "{\n" +
                "\"hospid\": \"22020025\",\n" +
                "\"hospname\": \"PRIMARY HEALTH CENTRE SANKARA\",\n" +
                "\"statecode\": \"22\",\n" +
                "\"state\": \"CHHATTISGARH\",\n" +
                "\"districtid\": \"646\",\n" +
                "\"district\": \"BALOD\",\n" +
                "\"hospcontactno\": \"9826643061\",\n" +
                "\"hospaddress\": \"SANKRA J\",\n" +
                "\"hosptype\": \"Private\"\n" +
                "},\n" +
                "{\n" +
                "\"hospid\": \"22020026\",\n" +
                "\"hospname\": \"MAX HEALTH CARE SANKARA\",\n" +
                "\"statecode\": \"22\",\n" +
                "\"state\": \"CHHATTISGARH\",\n" +
                "\"districtid\": \"646\",\n" +
                "\"district\": \"BALOD\",\n" +
                "\"hospcontactno\": \"9826643061\",\n" +
                "\"hospaddress\": \"SANKRA J\",\n" +
                "\"hosptype\": \"Private\"\n" +
                "},\n" +
                "{\n" +
                "\"hospid\": \"22020033\",\n" +
                "\"hospname\": \"PHC KURDI\",\n" +
                "\"statecode\": \"24\",\n" +
                "\"state\": \"RAJASTHAN\",\n" +
                "\"districtid\": \"649\",\n" +
                "\"district\": \"PALI\",\n" +
                "\"hospcontactno\": \"9479057739\",\n" +
                "\"hospaddress\": \"PHC KURDI\",\n" +
                "\"hosptype\": \"Public\"\n" +
                "}");
        return jsonArray;
    }

}
