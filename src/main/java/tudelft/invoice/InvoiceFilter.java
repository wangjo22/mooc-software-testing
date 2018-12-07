package tudelft.invoice;

import java.util.ArrayList;
import java.util.List;

public class InvoiceFilter {

    /*
        I wanna filter all the invoices where their value are
        smaller than 100.0.
        Invoices come from the database
     */
    public List<Invoice> filter() {

        InvoiceDao invoiceDao = new InvoiceDao();
        List<Invoice> allInvoices = invoiceDao.all();

        List<Invoice> filtered = new ArrayList<>();

        for(Invoice inv : allInvoices) {
            if(inv.getValue() < 100.0)
                filtered.add(inv);
        }

        return filtered;

    }
}