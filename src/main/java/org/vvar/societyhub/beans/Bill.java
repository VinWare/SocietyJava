package org.vvar.societyhub.beans;

public class Bill {
    private final String dueDate;
    private final String amount;
    private final String bill_num;

    public Bill(String dueDate, String amount, String bill_num) {
        this.dueDate = dueDate;
        this.amount = amount;
        this.bill_num = bill_num;
    }
}
