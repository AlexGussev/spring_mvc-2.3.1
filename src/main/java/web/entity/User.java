package web.entity;

import javax.persistence.*;


@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="id")
    private long id;
    @Column(name="name")
    private String name;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email")
    private String email;
    @Column(name="age")
    private int age;

    public User() {

    }

    public User(long id, String name, String lastName, String email, int age) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User(" +
                "id =" + id +
                ", name ='" + name + '\'' +
                ", lastName ='" + lastName + '\'' +
                ", email ='" + email + '\'' +
                ", age =" + age +
                ')';
    }
}

