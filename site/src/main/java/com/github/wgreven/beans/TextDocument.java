package com.github.wgreven.beans;

import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoHtml;

@Node(jcrType="hippogradle:textdocument")
public class TextDocument extends BaseDocument{
    
    public String getTitle() {
        return getProperty("hippogradle:title");
    }

    public String getSummary() {
        return getProperty("hippogradle:summary");
    }
    
    public HippoHtml getHtml(){
        return getHippoHtml("hippogradle:body");    
    }

}
