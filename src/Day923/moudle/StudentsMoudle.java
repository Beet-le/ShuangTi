package Day923.moudle;

public class StudentsMoudle {
    private int id;
    private String name;
    private String paseward;
    private String sex;

    public StudentsMoudle(int id, String name, String paseward, String sex) {
        this.id = id;
        this.name = name;
        this.paseward = paseward;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPaseward() {
        return paseward;
    }

    public void setPaseward(String paseward) {
        this.paseward = paseward;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
