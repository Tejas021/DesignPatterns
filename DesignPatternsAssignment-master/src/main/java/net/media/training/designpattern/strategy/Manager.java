package net.media.training.designpattern.strategy;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 1:37:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class Manager extends CompanyMember {
    private String managementBand;
    StringValidationStrategy managementBandStrategy;

    Manager(StringValidationStrategy nameStrategy,
            IntegerValidationStrategy salaryStrategy,
            StringValidationStrategy managerNameStrategy,
            StringValidationStrategy managementBandStrategy){

        super(nameStrategy,salaryStrategy,managerNameStrategy);
        this.managementBandStrategy = managementBandStrategy;

    }
    @Override
    public void setSalary(int salary) {
        super.setSalary(salary);
        this.salary = salary;
    }

    public void setMonthsSpent(int months) {
        this.monthsSpent = months;
    }

    public void setManagementBand(String managementBand) {
        managementBandStrategy.validate(managementBand);
        this.managementBand = managementBand;
    }
}
