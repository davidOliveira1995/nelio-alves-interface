package exeCarRental.services;

import exeCarRental.entities.CarRental;

public class RentalService {

    private double pricePerHour;
    private double pricePerDay;

    private BrazilTaxService taxService;

    public RentalService(double pricePerHour, double pricePerDay, BrazilTaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental) {

    }
}
