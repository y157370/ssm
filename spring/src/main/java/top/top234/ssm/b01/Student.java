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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
