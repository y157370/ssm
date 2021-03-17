package top.top234.ssm.service;

/**
 * Don't forget to be awesome!
 *
 * Created by LEARNING on 2021/3/17 17:14.
 *
 * ********************************
 *
 * @author top234
 */
public class Student {
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
