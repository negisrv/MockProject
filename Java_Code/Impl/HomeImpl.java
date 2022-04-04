package com.mysite.core.models.Impl;


import com.mysite.core.models.Jan;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;
@Model(adaptables = Resource.class, adapters = Jan.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HomeImpl implements Jan {

    @Inject
    String linkname;

    @Inject
    @Default(values = "January 2022")
    String janname;


    @Override
    public String getLinkJan() {
        return linkname;
    }

    @Override
    public String getNameJan() {
        return janname;
    }
}
