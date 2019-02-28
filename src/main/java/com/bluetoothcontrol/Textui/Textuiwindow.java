package com.bluetoothcontrol.Textui;

 import com.bluetoothcontrol.Textui.Textui;
 import com.bluetoothcontrol.Main;
 import com.bluetoothcontrol.server.*;
 import jexer.*;

class Textuiwindow extends TWindow {


    public Textuiwindow(TApplication application) {
            // See TWindow's API for several constructors.  This one uses the
            // application, title, width, and height.  Note that the window width
            // and height include the borders.  The widgets inside the window
            // will see (0, 0) as the top-left corner inside the borders,
            // i.e. what the window would see as (1, 1).
            super(application, "Bluetooth-control", 30, 20);

            // See TWidget's API for convenience methods to add various kinds of
            // widgets.  Note that ANY widget can be a container for other
            // widgets: TRadioGroup for example has TRadioButtons as child
            // widgets.addText("Click button to launch server", 4,5);
            // We will add a basic label, text entry field, and button.

            // it.
            addButton("Run Server", 5, 8, new TAction() {
                public void DO() {
                    Textuiwindow.this.messageBox("Server active", " yay!");

                }
            } );
    }
}
