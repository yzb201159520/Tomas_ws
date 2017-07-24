package testdi.charter3.seniorWiring;

/**
 * Created by thomas on 2017/7/24.
 */
public class Company {
    String location;
    String companyName;
    int ownMoney;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getOwnMoney() {
        return ownMoney;
    }

    public void setOwnMoney(int ownMoney) {
        this.ownMoney = ownMoney;
    }

    @Override
    public String toString() {
        return "Company{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", ownMoney=" + ownMoney +
                '}';
    }
}
