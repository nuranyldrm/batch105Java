package ders40_interface_btk;

public class OracleCustomer implements ICustomerDal  {
    @Override
    public void add() {
        System.out.println("Oracle eklendi");
    }
}
