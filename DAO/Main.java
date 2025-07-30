package dao;

public class Main {
    public static void main(String[] args) {
        DevInterface DevDao = new DevDaoImpl();

        for(Dev dev: DevDao.getAllDev()){
            System.out.println("\nDevId: " + dev.getDevId() + ", Name: " + dev.getName());
        }
        Dev dev = DevDao.getAllDev().get(0);
        dev.setName("Lakitu");
        DevDao.updateDev(dev);

        DevDao.getDev(0);
        System.out.println("\nDevId: " + dev.getDevId() + ", Name: " + dev.getName());
    }
}
