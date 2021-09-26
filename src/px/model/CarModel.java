package px.model;

public class CarModel {
    private int Carid;
    private String cartyple;
    private String color;
    private String type;

    public int getCarid() {
        return Carid;
    }

    public void setCarid(int carid) {
        Carid = carid;
    }

    public String getCartyple() {
        return cartyple;
    }

    public void setCartyple(String cartyple) {
        this.cartyple = cartyple;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
