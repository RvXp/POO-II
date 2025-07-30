package dao;

import java.util.List;

public interface DevInterface {
    public List<Dev> getAllDev();
    public Dev getDev(int DevId);
    public void updateDev(Dev dev);
    public void deleteDev(Dev dev);
}
