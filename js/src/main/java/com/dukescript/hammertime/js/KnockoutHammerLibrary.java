/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dukescript.hammertime.js;

import net.java.html.js.JavaScriptBody;
import net.java.html.js.JavaScriptResource;

/**
 *
 * @author antonepple
 */
@JavaScriptResource("knockout-hammer.js")
public class KnockoutHammerLibrary {
    
    
    public static void init(){
       HammerLibrary.init();
       init_impl();
    }

    @JavaScriptBody(args = {},body="console.log('initializing knockout hammer');")
    public static native void init_impl();
    
    @JavaScriptBody(args = {  }, body = "console.log(ko.bindingHandlers);")
    public static native void listHandlers();
}