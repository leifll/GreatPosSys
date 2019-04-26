package se.kth.iv1350.POSsys.controller;

import se.kth.iv1350.POSsys.model.Sale;

public class Controller {
    private Sale sale;
    
    public Controller() { 
    }
    
    public void startNewSale() {
        sale = new Sale();
    }
}
