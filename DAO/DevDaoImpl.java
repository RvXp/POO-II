package dao;

import java.util.ArrayList;
import java.util.List;

public class DevDaoImpl implements DevInterface{

    List<Dev> Devs;

    public DevDaoImpl(){
        Devs = new ArrayList<Dev>();
        Dev Dev1 = new Dev("Heisemberg da computação bioinspirada", 0);
        Dev Dev2 = new Dev("Comissario Gordon", 1);
        Devs.add(Dev1);
        Devs.add(Dev2);
    }


    @Override
    public void deleteDev(Dev dev) {
       Devs.remove(dev.getDevId());
       System.out.println("\nDev Id: " + dev.getDevId() + ", deleted from DB");
    }

    @Override
    public List<Dev> getAllDev() {
        return Devs;
    }

    @Override
    public Dev getDev(int DevId) {
        return Devs.get(DevId);
    }

    @Override
    public void updateDev(Dev dev) {
       Devs.get(dev.getDevId()).setName(dev.getName());
       System.out.println("\nDevId " + dev.getDevId() + ", update in the DB"); 
    }
    
}
