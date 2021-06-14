package com.onebill.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({ CarConfig.class, EngineConfig.class })
@Configuration
public class CarEngineConfig {

}
