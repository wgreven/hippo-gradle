package com.github.wgreven.beans;

import java.util.Calendar;

import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSetBean;

@Node(jcrType="hippogradle:newsdocument")
public class NewsDocument extends BaseDocument{

    public String getTitle() {
        return getProperty("hippogradle:title");
    }
    
    public String getSummary() {
        return getProperty("hippogradle:summary");
    }
    
    public Calendar getDate() {
        return getProperty("hippogradle:date");
    }

    public HippoHtml getHtml(){
        return getHippoHtml("hippogradle:body");    
    }

    /**
     * Get the imageset of the newspage
     *
     * @return the imageset of the newspage
     */
    public HippoGalleryImageSetBean getImage() {
        return getLinkedBean("hippogradle:image", HippoGalleryImageSetBean.class);
    }


}
