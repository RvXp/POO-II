package dao;

public class Dev {
    private String name;
    private int DevId;

    Dev(String name, int DevId){
        this.name = name;
        this.DevId = DevId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDevId() {
        return DevId;
    }

    public void setDevId(int devId) {
        DevId = devId;
    }

    
}
