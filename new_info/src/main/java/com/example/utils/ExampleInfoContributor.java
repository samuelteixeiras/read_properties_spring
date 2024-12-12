package com.example.utils;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class ExampleInfoContributor implements InfoContributor {

    @Value("${appVersion}")
    String appVersion;

    @Value("${appName}")
    String appName;


    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("app-details",
                Collections.singletonMap("info",  appName + ":" + appVersion));
    }
}