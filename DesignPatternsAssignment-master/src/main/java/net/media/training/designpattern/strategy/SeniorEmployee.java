package net.media.training.designpattern.strategy;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 1:35:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class SeniorEmployee extends GenericEmployee {
    private int setMaxBonus;

   IntegerValidationStrategy seniorEmployeeSalaryStrategy;
   IntegerValidationStrategy   seniorEmployeeMonthsSpentStrategy;
    IntegerValidationStrategy seniorEmployeeMaxBonusStrategy;
    SeniorEmployee(StringValidationStrategy nameStrategy,
                   IntegerValidationStrategy salaryStrategy,
                   StringValidationStrategy managerNameStrategy,
                   IntegerValidationStrategy monthsSpentStrategy,
                   IntegerValidationStrategy seniorEmployeeSalaryStrategy,
                   IntegerValidationStrategy seniorEmployeeMonthsSpentStrategy,
                   IntegerValidationStrategy seniorEmployeeMaxBonusStrategy ){

        super(nameStrategy,salaryStrategy,managerNameStrategy,monthsSpentStrategy);
        this.seniorEmployeeSalaryStrategy=seniorEmployeeSalaryStrategy;
        this.seniorEmployeeMonthsSpentStrategy=seniorEmployeeMonthsSpentStrategy;
        this.seniorEmployeeMaxBonusStrategy=seniorEmployeeMaxBonusStrategy;

    }

    @Override
    public void setSalary(int salary) {
        super.setSalary(salary);
        seniorEmployeeMaxBonusStrategy.validate(salary);
        this.salary = salary;
    }

    @Override
    public void setMonthsSpent(int months) {
        super.setMonthsSpent(months);
        seniorEmployeeMonthsSpentStrategy.validate(months);
        this.monthsSpent = months;
    }

    public void setMaxBonus(int bonus) {
        seniorEmployeeMaxBonusStrategy.validate(bonus);
        this.setMaxBonus = bonus;
    }
}
