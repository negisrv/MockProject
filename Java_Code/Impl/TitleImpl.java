package com.mysite.core.models.Impl;


import com.mysite.core.models.Title;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = Resource.class, adapters = Title.class)
public class TitleImpl implements Title {

    @Inject
    String language;

    @Inject
    String title;

    @Inject
    String info;

    @Inject
    String link;

    @Inject
    String date;


    @Override
    public String getLanguageMul() {
        return language;
    }

    @Override
    public String getTitleMul() {
        return title;
    }


    @Override
    public String getInfoMul() {
        return info;
    }

    @Override
    public String getLinkMul() {
        return link;
    }

    @Override
    public String getDateMul() {
        return date;
    }

}
