package io.devmartynov.tmsAn10Java.l8.additional.document;

import java.util.Date;

/**
 * FinancialInvoice
 */
public class FinancialInvoice extends Document {
    private double monthTotalAmount;
    private int departmentCode;

    /**
     * Ctor.
     */
    public FinancialInvoice() {
        super();
    }

    /**
     * Ctor.
     *
     * @param number           number
     * @param date             date
     * @param monthTotalAmount monthTotalAmount
     * @param departmentCode   departmentCode
     */
    public FinancialInvoice(int number, Date date, double monthTotalAmount, int departmentCode) {
        super(number, date);
        this.monthTotalAmount = monthTotalAmount;
        this.departmentCode = departmentCode;
    }

    public double getMonthTotalAmount() {
        return monthTotalAmount;
    }

    public void setMonthTotalAmount(double monthTotalAmount) {
        this.monthTotalAmount = monthTotalAmount;
    }

    public int getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(int departmentCode) {
        this.departmentCode = departmentCode;
    }

    @Override
    public void displayInfo() {
        System.out.println(
            "Document: "
                + "type: " + this.getClass().getSimpleName()
                + ", " + super.getInfo()
                + ", month total amount: " + monthTotalAmount
                + ", department code: " + departmentCode
        );
    }
}
