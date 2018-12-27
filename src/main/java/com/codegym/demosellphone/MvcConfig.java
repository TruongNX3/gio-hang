package com.codegym.demosellphone;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("/**")
                .addResourceLocations("file:/D:image/", "/orther-resources")
                .addResourceLocations("file:/C:/Users/TruongDepZai/Desktop/websitegalaxynote8-master/demo-sell-phone/src/main/resources/static");
    }
}
