package net.media.training.designpattern.strategy;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 1:14:31 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class CompanyMember {
    private String name;
    protected String mgrName;
    protected int salary;
    protected int monthsSpent;

    StringValidationStrategy nameStrategy;
    IntegerValidationStrategy salaryStrategy;

    StringValidationStrategy managerNameStrategy;

    CompanyMember(
            StringValidationStrategy nameStrategy,
            IntegerValidationStrategy salaryStrategy,
            StringValidationStrategy managerNameStrategy
    ){
        this.nameStrategy=nameStrategy;
        this.salaryStrategy=salaryStrategy;
        this.managerNameStrategy=managerNameStrategy;

    }

//    protected void validateLength(String val, int allowedLength) {
//        if (val.length() > allowedLength)
//            throw new RuntimeException("Invalid length:" + allowedLength);
//    }
//
//    protected void notEmpty(String val) {
//        if (val == null || val.length() == 0)
//            throw new RuntimeException("not empty check failed for value:" + val);
//    }
//
//    protected void atLeast(int val, int min) {
//        if (val < min)
//            throw new RuntimeException("at least check failed:" + val);
//    }
//
//    protected void atMost(int val, int max) {
//        if (val > max)
//            throw new RuntimeException("at least check failed:" + val);
//    }

    public void setName(String name) {
        nameStrategy.validate(name);
        this.name = name;
    }

    public void setSalary(int salary) {
        salaryStrategy.validate(salary);
    }

    public void setManagerName(String name) {
        managerNameStrategy.validate(name);
    }
}
