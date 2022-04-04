
package com.mysite.core.models.Impl;


import com.mysite.core.models.MultifieldTest;
import com.mysite.core.models.Title;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;
import java.util.List;

@Model(adaptables = Resource.class, adapters = MultifieldTest.class)
public class MultifieldTestImpl implements MultifieldTest {

    @Inject
    List<Title> blog;

    @Override
    public List<Title> getTitlesMul() {
        return blog;
    }
}