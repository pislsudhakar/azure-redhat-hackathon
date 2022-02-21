package com.aro.handlingformsubmission;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class EnvironmentService implements IEnvironmentService {

    @Value("${spring.envType}")
    String envType;

    @Override
    public String getEnvironmentType() {

        return envType;
    }
}