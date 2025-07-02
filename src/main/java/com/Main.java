package src.main.java.com;
import src.main.java.com.model.Customer;
import src.main.java.com.service.FixedFormatWriter;

import java.io.IOException;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException {
        Customer u1 = new Customer("0001", "Thiago Souza", 123.14);
        Customer u2 = new Customer("0002", "Gabi Poloni", 115.54);
        Customer u3 = new Customer("0003", "Pablo Silva", 533.32);

        FixedFormatWriter writer = new FixedFormatWriter();
        try {
            writer.writeCustomer(Arrays.asList(u1, u2, u3), "customers.txt");
        } catch (IOException e) {
            System.out.println("Erro ao gerar o arquivo: " + e.getMessage());
        }
    }
}