package com.jimac.common_model.XReading;

public class XReadingModel {

    String transaction_date;
    String terminal_code;
    Double gross_sales = (double) 0.0F;
    Double net_sales = (double) 0.0F;
    Double total_collection = (double) 0.0F;
    int total_collection_count = 0;
    String start_invoice_no;
    String end_invoice_no;
    String start_transaction_no;
    String end_transaction_no;
    int transaction_count = 0;
    int sales_transaction_count = 0;
    int sales_item_count = 0;
    Double new_net = (double) 0.0F;
    Double old_net = (double) 0.0F;

    public String getTransaction_date() {
        return transaction_date;
    }

    public void setTransaction_date(String transaction_date) {
        this.transaction_date = transaction_date;
    }

    public String getTerminal_code() {
        return terminal_code;
    }

    public void setTerminal_code(String terminal_code) {
        this.terminal_code = terminal_code;
    }

    public Double getGross_sales() {
        return gross_sales;
    }

    public Double getNet_sales() {
        return net_sales;
    }

    public void setGross_sales(Double gross_sales) {
        this.gross_sales = gross_sales;
    }

    public void setNet_sales(Double net_sales) {
        this.net_sales = net_sales;
    }

    public Double getTotal_collection() {
        return total_collection;
    }

    public void setTotal_collection(Double total_collection) {
        this.total_collection = total_collection;
    }

    public int getTotal_collection_count() {
        return total_collection_count;
    }

    public void setTotal_collection_count(int total_collection_count) {
        this.total_collection_count = total_collection_count;
    }

    public String getStart_invoice_no() {
        return start_invoice_no;
    }

    public void setStart_invoice_no(String start_invoice_no) {
        this.start_invoice_no = start_invoice_no;
    }

    public String getEnd_invoice_no() {
        return end_invoice_no;
    }

    public void setEnd_invoice_no(String end_invoice_no) {
        this.end_invoice_no = end_invoice_no;
    }

    public String getStart_transaction_no() {
        return start_transaction_no;
    }

    public void setStart_transaction_no(String start_transaction_no) {
        this.start_transaction_no = start_transaction_no;
    }

    public String getEnd_transaction_no() {
        return end_transaction_no;
    }

    public void setEnd_transaction_no(String end_transaction_no) {
        this.end_transaction_no = end_transaction_no;
    }

    public int getTransaction_count() {
        return transaction_count;
    }

    public void setTransaction_count(int transaction_count) {
        this.transaction_count = transaction_count;
    }

    public int getSales_transaction_count() {
        return sales_transaction_count;
    }

    public void setSales_transaction_count(int sales_transaction_count) {
        this.sales_transaction_count = sales_transaction_count;
    }

    public int getSales_item_count() {
        return sales_item_count;
    }

    public void setSales_item_count(int sales_item_count) {
        this.sales_item_count = sales_item_count;
    }

    public Double getOld_net() {
        return old_net;
    }

    public void setOld_net(Double old_net) {
        this.old_net = old_net;
    }

    public Double getNew_net() {
        return new_net;
    }

    public void setNew_net(Double new_net) {
        this.new_net = new_net;
    }
}
