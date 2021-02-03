package com.spring.springselenium.zaitenllc.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.*;

import java.net.URL;

@Configuration
@Lazy
@Profile("remote")
public class RemoteWebdriverConfig {

    @Value("${selenium.grid.url}")
    private URL url;


    @Bean
    @ConditionalOnMissingBean
    public WebDriver remoteChromeDriver(){

        return new RemoteWebDriver(this.url, DesiredCapabilities.chrome());
    }
    @Bean
    @ConditionalOnProperty(name = "browser" , havingValue = "firefox")
    public WebDriver remoteFirefoxDriver(){
        return new RemoteWebDriver(this.url, DesiredCapabilities.firefox());
    }
}
