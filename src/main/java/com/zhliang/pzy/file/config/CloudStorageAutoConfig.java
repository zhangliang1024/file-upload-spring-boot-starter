package com.zhliang.pzy.file.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(CloudStorageProperties.class)
public class CloudStorageAutoConfig {

}
