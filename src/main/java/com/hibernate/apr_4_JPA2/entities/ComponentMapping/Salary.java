package com.hibernate.apr_4_JPA2.entities.ComponentMapping;

import jakarta.persistence.Embeddable;

@Embeddable
public class Salary {
    private Long basicsalary;
    private Long bonussalary;
    private Long taxamount;
    private Long specialallowancesalary;

    public Long getBasicsalary() {
        return basicsalary;
    }

    public void setBasicsalary(Long basicsalary) {
        this.basicsalary = basicsalary;
    }

    public Long getBonussalary() {
        return bonussalary;
    }

    public void setBonussalary(Long bonussalary) {
        this.bonussalary = bonussalary;
    }

    public Long getTaxamount() {
        return taxamount;
    }

    public void setTaxamount(Long taxamount) {
        this.taxamount = taxamount;
    }

    public Long getSpecialallowancesalary() {
        return specialallowancesalary;
    }

    public void setSpecialallowancesalary(Long specialallowancesalary) {
        this.specialallowancesalary = specialallowancesalary;
    }
}
