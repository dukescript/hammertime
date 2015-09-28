package com.dukescript.hammertime;

import com.dukescript.hammertime.js.KnockoutHammerLibrary;
import net.java.html.json.Function;
import net.java.html.json.Model;
import net.java.html.json.Models;
import net.java.html.json.Property;

@Model(className = "Data", targetId = "", properties = {
    @Property(name = "text", type = String.class)
})
final class DataModel {

    private static Data ui;

    /**
     * Called when the page is ready.
     */
    static void onPageLoad() throws Exception {
        ui = new Data("tap here");
        Models.toRaw(ui);
        KnockoutHammerLibrary.init();
        ui.applyBindings();
    }

    @Function
    public static void onHmTap(Data data, int tapCount) {
        data.setText("Tapped "+tapCount);
    }
}
