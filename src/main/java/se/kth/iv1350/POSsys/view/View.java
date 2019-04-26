package se.kth.iv1350.POSsys.view;

import se.kth.iv1350.POSsys.controller.Controller;

public class View {
    private Controller contr;
    
    public View(Controller contr) {
        this.contr = contr;
    }
    
    public void runFakeSale() {
        contr.startNewSale();
        System.out.println("New sale was started.");
    }
}
