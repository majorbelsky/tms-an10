package io.devmartynov.tmsAn10Java.l8.additional;

import io.devmartynov.tmsAn10Java.l8.additional.document.Document;
import io.devmartynov.tmsAn10Java.l8.additional.document.EmployeeContract;
import io.devmartynov.tmsAn10Java.l8.additional.document.FinancialInvoice;
import io.devmartynov.tmsAn10Java.l8.additional.document.ProductContract;

import java.util.Date;

/*
private int number;
private Date date;
private String productType;
private int productsCount;

private int number;
private Date date;
private Date contractEndDate;
private String employeeName;

private int number;
private Date date;
private double monthTotalAmount;
private int departmentCode;
 */
public class Main {
    public static void main(String[] args) {
        Document productContract = new ProductContract(
            1,
            new Date(),
            "socks",
            100000
        );
        Document employeeContract = new EmployeeContract(
            2,
            new Date(),
            new Date(),
            "Ivanov Ivan"
        );
        Document financialInvoice = new FinancialInvoice(
            3,
            new Date(),
            10000,
            14
        );

        Document[] documents = {productContract, employeeContract, financialInvoice};

        Register register = new Register();

        register.saveDocument(productContract);
        register.saveDocument(employeeContract);
        register.saveDocument(financialInvoice);

        for (Document document : documents) {
            register.displayDocumentInfo(document);
        }

    }
}
