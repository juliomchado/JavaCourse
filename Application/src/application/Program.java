package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.BusinessAccount;

public class Program {
    public static void main(String[] args) throws ParseException {

        BusinessAccount account = new BusinessAccount();

        account.deposit(3);

        
    }
}