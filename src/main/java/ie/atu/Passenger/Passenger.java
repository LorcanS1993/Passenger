package ie.atu.Passenger;

public class Passenger {
    private String title;
    private String name;

    public String getId() {
        return id;
    }

    private String id;
    private long phone;
    private int age;

    public Passenger(String title, String name, long id, long phone, int age) {
        this.title = title;
        this.name = name;
        this.phone = phone;
        this.age = age;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
