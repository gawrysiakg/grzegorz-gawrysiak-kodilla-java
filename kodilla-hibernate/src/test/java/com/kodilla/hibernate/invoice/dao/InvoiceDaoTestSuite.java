package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import java.math.BigDecimal;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(SpringExtension.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;

    @Test
    void testInvoiceDaoSave(){
        //Given
        Product product1 = new Product("Dell mouse");
        Product product2 = new Product("Lexmark 45XL");
        Product product3 = new Product("Samsung USB cable");
        Item item1 = new Item(new BigDecimal(122), new BigDecimal(244), 2);
        Item item2 = new Item(new BigDecimal(100), new BigDecimal(200), 2);
        Item item3 = new Item(new BigDecimal(39), new BigDecimal(39), 1);
        Item item4 = new Item(new BigDecimal(122), new BigDecimal(366), 3);
        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product3);
        item4.setProduct(product1);
        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);
        Invoice invoice = new Invoice("PCmarket orders");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        invoice.getItems().add(item4);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        item4.setInvoice(invoice);


        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();
        long numberOfProducts = productDao.count();
        List<Invoice> result = invoiceDao.findInvoiceByNumber("PCmarket orders");

        //Then
        assertEquals(1, result.size());
        assertNotEquals(0L, numberOfProducts);
        assertEquals(3, numberOfProducts);

        //CleanUp
        try {
            productDao.deleteById(product1.getId());
            productDao.deleteById(product2.getId());
            productDao.deleteById(product3.getId());
            invoiceDao.deleteById(id);
        } catch (Exception e) {
            //do nothing
        }


    }


}
