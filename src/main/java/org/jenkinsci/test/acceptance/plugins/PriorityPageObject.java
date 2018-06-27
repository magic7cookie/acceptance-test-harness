package org.jenkinsci.test.acceptance.plugins;

import java.net.URL;

import org.jenkinsci.test.acceptance.po.ContainerPageObject;
import org.jenkinsci.test.acceptance.po.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.google.inject.Injector;

public class PriorityPageObject extends ContainerPageObject {

    protected PriorityPageObject(final Injector injector, final URL url) {
        super(injector, url);
    }

    protected PriorityPageObject(final PageObject context, final URL url) {
        super(context, url);
    }

    public WebElement getLowPriority() {
        return getElement(By.name("data_low_priority"));
    }

    public WebElement getNormalPriority() {
        return getElement(By.name("data_normal_priority"));
    }

    public WebElement getHighPriority() {
        return getElement(By.name("data_high_priority"));
    }

}
