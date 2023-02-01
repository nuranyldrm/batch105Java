package ders40_interface_btk;

public class MySqlCustomerDal implements ICustomerDal {
    @Override
    public void add() {
        System.out.println("My Sql Eklendi");
    }
}
