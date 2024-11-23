package br.com.frovas.subsystem1.crm;

public class CrmService {

    private CrmService() {
    }

    public static void saveCustomer(String name, String zipcode, String city, String uf) {
        System.out.println("Cliente salvo no sistema de CRM.");
        System.out.println(name);
        System.out.println(zipcode);
        System.out.println(city);
        System.out.println(uf);
    }
}
