package br.com.frovas.gof.facade;

import br.com.frovas.subsystem1.crm.CrmService;
import br.com.frovas.subsystem2.zipcode.ZipCodeApi;

public class Facade {

    public void migrateCustomer(String name, String zipCode){

        String city = ZipCodeApi.getInstance().getCity(zipCode);
        String uf = ZipCodeApi.getInstance().getUf(zipCode);

        CrmService.saveCustomer(name, zipCode, city, uf);
    }
}
