package com.mysite.core.models.Impl;

import com.mysite.core.models.About;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;


@Model(adaptables = Resource.class, adapters = About.class)
public class AboutImpl implements About {

    @Inject
    @Default(values = "Etiam porta sem malesuada magna mollis euismod. Cras mattis consectetur purus sit amet fermentum. Aenean lacinia bibendum nulla sed consectetur.")
    String about;

    @Override
    public String getAboutInfo() {
        return about;
    }
}
