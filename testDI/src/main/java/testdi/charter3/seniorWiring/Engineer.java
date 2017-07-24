package testdi.charter3.seniorWiring;

/**
 * Created by thomas on 2017/7/24.
 */
public class Engineer {
    String name;
    int workYear;
    String company;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkYear() {
        return workYear;
    }

    public void setWorkYear(int workYear) {
        this.workYear = workYear;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "name='" + name + '\'' +
                ", workYear=" + workYear +
                ", company='" + company + '\'' +
                '}';
    }
}
