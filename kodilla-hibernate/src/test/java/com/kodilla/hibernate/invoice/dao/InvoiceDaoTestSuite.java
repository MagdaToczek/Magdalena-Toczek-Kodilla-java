package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("milk");
        Product product2 = new Product("butter");
        Product product3 = new Product("bread");

        Item item1 = new Item(new BigDecimal("2.99"),6);
        Item item2 = new Item(new BigDecimal("7.69"), 3);
        Item item3 = new Item(new BigDecimal("4.09"), 2);
        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product3);
//        product1.setItems(new ArrayList<>(Arrays.asList(item1)));
//        product2.setItems(new ArrayList<>(Arrays.asList(item2)));
//        product3.setItems(new ArrayList<>(Arrays.asList(item3)));

        Invoice invoice = new Invoice("001/2018");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
//        invoice.setItems(new ArrayList<>(Arrays.asList(item1, item2, item3)));

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        //invoiceDao.delete(id);
    }
}
