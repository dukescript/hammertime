
package com.dukescript.hammertime.js;

import net.java.html.js.JavaScriptBody;
import net.java.html.js.JavaScriptResource;

@JavaScriptResource("hammer.min.js")
public class HammerLibrary {
    
    @JavaScriptBody(args = {},body="")
    public static native void init();
    
}