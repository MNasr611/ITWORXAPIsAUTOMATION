package com.itworx.api.tests;

import com.itworx.api.properties.PropertiesHandler;

import java.io.IOException;
import java.util.Properties;

public class BaseAPI {
    public String BOARD_API_URL = "";
    Properties apiConfig;
    public BaseAPI(){
        try{
         apiConfig = PropertiesHandler.setAPIConfig();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        BOARD_API_URL = apiConfig.getProperty("boardAPI");
    }


}
