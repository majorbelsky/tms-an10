package io.devmartynov.tmsAn10Java.l8.additional.document;

import java.util.Date;

/**
 * EmployeeContract
 */
public class EmployeeContract extends Document {
    private Date contractEndDate;
    private String employeeName;

    /**
     * Ctor.
     */
    public EmployeeContract() {
        super();
    }

    /**
     * Ctor.
     *
     * @param number          number
     * @param date            date
     * @param contractEndDate contractEndDate
     * @param employeeName    employeeName
     */
    public EmployeeContract(int number, Date date, Date contractEndDate, String employeeName) {
        super(number, date);
        this.contractEndDate = contractEndDate;
        this.employeeName = employeeName;
    }

    /**
     * Contract end date
     *
     * @return date
     */
    public Date getContractEndDate() {
        return contractEndDate;
    }

    /**
     * Sets contract end date
     *
     * @param contractEndDate contractEndDate
     */
    public void setContractEndDate(Date contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    /**
     * Employee name
     *
     * @return employee name
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * Sets employee name
     *
     * @param employeeName employeeName
     */
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public void displayInfo() {
        System.out.println(
            "Document: "
                + "type: " + this.getClass().getSimpleName()
                + ", " + super.getInfo()
                + ", contract end date: " + dateFormatter.format(contractEndDate)
                + ", employee name: " + employeeName
        );
    }
}
