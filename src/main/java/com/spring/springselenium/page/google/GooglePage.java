package com.spring.springselenium.page.google;

import com.spring.springselenium.page.Base;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy
@Scope("prototype")
public class GooglePage extends Base {


    @Autowired
    private SearchComponent searchComponent;

    @Autowired
    private SearchResult searchResult;

    @Value("${application.url}")
    private String url;

    public void goTo(){
        this.driver.get(url);
    }

    public SearchComponent getSearchComponent(){
        return searchComponent;
    }
    public SearchResult getSearchResult(){
        return searchResult;
    }


    @Override
    public boolean isAt() {
       return this.searchComponent.isAt();
    }
}
