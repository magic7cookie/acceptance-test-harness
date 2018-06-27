package org.jenkinsci.test.acceptance.plugins;

import java.net.URL;

import org.jenkinsci.test.acceptance.po.ContainerPageObject;
import org.jenkinsci.test.acceptance.po.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.google.inject.Injector;

public class TrendPageObject extends PageObject {

    protected TrendPageObject(final Injector injector, final URL url) {
        super(injector, url);
    }

    protected TrendPageObject(final PageObject context, final URL url) {
        super(context, url);
    }

    public WebElement getNewIssues() {
        return getElement(By.name("data_new_issues"));
    }

    public WebElement getFixedIssues() {
        return getElement(By.name("data_fixed_issues"));
    }

    public WebElement getOutstandingIssues() {
        return getElement(By.name("data_outstanding_issues"));
    }

}
