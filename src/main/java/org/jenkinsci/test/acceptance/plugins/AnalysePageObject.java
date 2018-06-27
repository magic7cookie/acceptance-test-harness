package org.jenkinsci.test.acceptance.plugins;

import java.net.URL;

import org.jenkinsci.test.acceptance.po.PageObject;

import com.google.inject.Injector;

public class AnalysePageObject extends PageObject {
    public AnalysePageObject(final Injector injector, final URL url) {
        super(injector, url);
    }

    protected AnalysePageObject(final PageObject context, final URL url) {
        super(context, url);
    }

    public Class<? extends PageObject> getTrend(){
        return TrendPageObject.class;
    }

    public Class<? extends PageObject> getPriority(){
        return PriorityPageObject.class;
    }
}
