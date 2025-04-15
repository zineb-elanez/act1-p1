package dao;

public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version V WS");
        double t=11;
        return t;
    }
}
