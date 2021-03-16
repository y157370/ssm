package top.top234.ssm.diAnnotation;

import org.springframework.stereotype.Component;

/**
 * Don't forget to be awesome!
 *
 * Created by LEARNING on 2021/3/16 0:19.
 *
 * ********************************
 *
 * @author top234
 */
@Component("mySchool")
public class School {
    private String name;
    private String address;

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public School() {
    }

    public School(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
