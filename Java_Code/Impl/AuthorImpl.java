package com.mysite.core.models.Impl;


import com.adobe.cq.wcm.core.components.models.Page;
import com.mongodb.QueryBuilder;
import com.mysite.core.models.Author;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.*;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.osgi.resource.Resource;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

@Model(adaptables = SlingHttpServletRequest.class, adapters = Author.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class AuthorImpl implements Author {
    @Inject
    @Required
    @Via("resource")
    @Default(values = "srv")
    String fname;

    @ValueMapValue   //------------->> @Inject @Via("resource")
    @Default(values = "negi")
    String lname;

    @ScriptVariable(name="currentPage")
    Page page;

    @SlingObject
    public Resource resource;

    @PostConstruct
    public void init() {

    }

    @OSGiService
    QueryBuilder queryBuilder;

    @Override
    public String getFirstName() {
        return fname;
    }

    @Override
    public String getLastName() {
        return lname;
    }

}