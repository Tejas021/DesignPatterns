package net.media.training.designpattern.strategy;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 1:27:08 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class GenericEmployee extends CompanyMember {

    IntegerValidationStrategy monthsSpentStrategy;

    GenericEmployee(StringValidationStrategy nameStrategy,
                    IntegerValidationStrategy salaryStrategy,
                    StringValidationStrategy managerNameStrategy,
                    IntegerValidationStrategy monthsSpentStrategy){
        super(nameStrategy,salaryStrategy,managerNameStrategy);
        this.monthsSpentStrategy=monthsSpentStrategy;

    }
    public void setSalary(int salary) {
        salaryStrategy.validate(salary);
    }

    public void setManagerName(String name) {
        managerNameStrategy.validate(name);
        this.mgrName = name;
    }

    public void setMonthsSpent(int months) {
        monthsSpentStrategy.validate(months);
    }
}
