public class User {
    private int id;
    private int age;
    private String name;
    private String username;
    private String passsword;
    private String address;

    public User(){}
    public User(int id, String name,int age, String username, String passsword, String address) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.username = username;
        this.passsword = passsword;
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasssword() {
        return passsword;
    }

    public void setPasssword(String passsword) {
        this.passsword = passsword;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", passsword='" + passsword + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}