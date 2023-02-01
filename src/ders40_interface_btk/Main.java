package ders40_interface_btk;

import ders34_polymorphisim.CustumerManager;

public class Main {
    public static void main(String[] args) {
    CustumerManager custumerManager=new CustumerManager(new OracleCustomer());

        custumerManager.add();
    }
}
