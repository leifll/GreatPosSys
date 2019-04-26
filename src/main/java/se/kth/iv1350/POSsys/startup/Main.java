package se.kth.iv1350.POSsys.startup;

import se.kth.iv1350.POSsys.controller.Controller;
import se.kth.iv1350.POSsys.view.View;

public class Main {
    public static void main(String[] args) {
        Controller contr = new Controller();
        View view = new View(contr);
        view.runFakeSale();
    }
}
