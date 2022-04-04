package com.mysite.core.models.Impl;

import com.mysite.core.models.Default;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;


@Model(adaptables = Resource.class, adapters = Default.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class DefaultImpl implements Default {
    @Inject
    String text;

    @Inject
    String link;

    @Override
    public String getTextDef() {
        return text;
    }

    @Override
    public String getLinkDef() {
        return link;
    }
}
