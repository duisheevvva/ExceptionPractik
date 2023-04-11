public class Creat {
    private String name;
    private String lastName;
    private int age;
    private String email;
    private String password;

    public Creat() {

    }

    public Creat(String name, String lastName, int age, String email, String password) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws MyException {

        if (age <= 0) {
            throw new MyException("Age cannot be below zero!");
        } else {
            this.age = age;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws MyException2 {
        if (!email.contains("@")) {
            throw new MyException2("Email must contain the @ symbol!");
        } else {
            this.email = email;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws MyException3 {
        if (password.length() <= 7) {
            throw new MyException3("Password must contain at least 7 characters!");
        } else {
            this.password = password;
        }
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", password=" + password +
                '}';
    }
}
