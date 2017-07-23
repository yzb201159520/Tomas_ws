package testdi.charter2.beans;

import java.util.List;

/**
 * Created by thomas on 2017/7/23.
 */
public class Teacher {

    private String name;
    private int age;
    private List<String> gradeThatTeach;

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gradeThatTeach=" + gradeThatTeach +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getGradeThatTeach() {
        return gradeThatTeach;
    }

    public void setGradeThatTeach(List<String> gradeThatTeach) {
        this.gradeThatTeach = gradeThatTeach;
    }

    public Teacher() {
    }

    public Teacher(String name, int age, List<String> gradeThatTeach) {
        this.name = name;
        this.age = age;
        this.gradeThatTeach = gradeThatTeach;
    }
}
