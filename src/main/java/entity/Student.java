package entity;

import javax.persistence.*;

/**
 * @Entity - данная аннатация говорит Hibirnate что этот клас является аналогом таблицы БД
 * @Table(name = "<name>" данная анатация помечает к какой именно таблице соответствует этот класс
 */
@Entity
@Table(name = "students")
public class Student {

    /*Анатациями указал что данная переменная будет соответствовать id в таблице и будет автоинкрементироваться*/
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "age")
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    public void setAge(int age) {
        this.age = age;
    }
}
