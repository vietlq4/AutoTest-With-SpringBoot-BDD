package com.spring.springselenium.config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

import java.net.URL;

@Configuration
@Lazy
@Profile("remote")
public class RemoteWebdriverConfig {

    @Value("${selenium.grid.url}")
    private URL url;

    @Value("${default.timeout:30}")
    private int timeOut;

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
    @Bean
    public WebDriverWait webDriverWait(WebDriver driver){
        return new WebDriverWait(driver,this.timeOut);
    }
}
