package net.media.training.designpattern.strategy;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 1:31:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class Employee extends GenericEmployee {
    private int maxAllowedLeaves;
    IntegerValidationStrategy maxAllowedLeavesStrategy;


    Employee(StringValidationStrategy nameStrategy,
             IntegerValidationStrategy salaryStrategy,
             StringValidationStrategy managerNameStrategy,
             IntegerValidationStrategy monthsSpentStrategy,
             IntegerValidationStrategy maxAllowedLeavesStrategy) {
        super(nameStrategy, salaryStrategy, managerNameStrategy, monthsSpentStrategy);
        this.maxAllowedLeavesStrategy=maxAllowedLeavesStrategy;
    }

    @Override
    public void setSalary(int salary) {
        super.setSalary(salary);
        this.salary = salary;
    }

    @Override
    public void setMonthsSpent(int months) {
        super.setMonthsSpent(months);
        this.monthsSpent = months;
    }

    public void setMaxAllowedLeaves(int leaves) {
        maxAllowedLeavesStrategy.validate(leaves);
        this.maxAllowedLeaves = leaves;
    }
}

