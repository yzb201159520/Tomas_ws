package testdi.charter2.beans;

import java.util.List;

/**
 *
 * Created by thomas on 2017/7/23.
 */
public class Students {

    private String name;
    private String grade;
    private String stuNum;
    private List<String> lessons;

    public Students() {
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", stuNum='" + stuNum + '\'' +
                ", lessons=" + lessons +
                '}';
    }

    public Students(String name, String grade, String stuNum, List<String> lessons) {
        this.name = name;
        this.grade = grade;
        this.stuNum = stuNum;
        this.lessons = lessons;
    }

    public List<String> getLessons() {
        return lessons;
    }

    public void setLessons(List<String> lessons) {
        this.lessons = lessons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }
}
