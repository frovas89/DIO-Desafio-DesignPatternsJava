package br.com.frovas.subsystem2.zipcode;

import br.com.frovas.gof.singleton.SingletonEager;

public class ZipCodeApi {
    private static ZipCodeApi instance = new ZipCodeApi();

    private ZipCodeApi() {
        super();
    }

    public static ZipCodeApi getInstance() {
        return instance;
    }

    public String getCity(String zipCode) {
        return "Castro";
    }

    public String getUf(String zipCode) {
        return "PR";
    }
}
