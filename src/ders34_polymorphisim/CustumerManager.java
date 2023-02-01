package ders34_polymorphisim;

import ders40_interface_btk.OracleCustomer;

public class CustumerManager {
    public static OracleCustomer customerDal;
    private BaseLogger logger;

    public CustumerManager(BaseLogger logger){
        this.logger=logger;

    }

    public CustumerManager() {

    }

    public CustumerManager(OracleCustomer oracleCustomer) {
    }

    public void add(){
        System.out.println("Müsteri eklendi");
        this.logger.log("log mesaji");
    }

}
