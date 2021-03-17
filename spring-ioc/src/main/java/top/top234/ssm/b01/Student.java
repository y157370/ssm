package top.top234.ssm.b01;

/**
 * Don't forget to be awesome!
 *
 * Created by LEARNING on 2021/3/15 18:49.
 *
 * ********************************
 *
 * @author top234
 */
public class Student {
    private int id;
    private String name;
    private School school;

    public Student() {
    }

    public Student(int id, String name, School school) {
        this.id = id;
        this.name = name;
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", school=" + school +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
