package _03_DefiningClasses_BankAccount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<Integer, BankAccount> bankAccountMap = new HashMap<>();

        //Create
        //· Deposit {Id} {Amount}
        //· SetInterest {Interest}
        //· GetInterest {ID} {Years}

        while (!input.equals("End")){
            String command = input.split("\\s+")[0];
            switch (command){
                case "Create" :
                    BankAccount bankAccount = new BankAccount();
                    bankAccountMap.put(bankAccount.getId(), bankAccount);
                    System.out.println("Account ID" + bankAccount.getId() + "created");
                    break;
                case "Deposit" :
                    int id = Integer.parseInt(input.split("\\s+")[1]);
                    double amount = Double.parseDouble(input.split("\\s+")[2]);
                    if(!bankAccountMap.containsKey(id)){
                        System.out.println("Account does not exist");
                    } else {

                    }
                    break;
                case "SetInterest" :
                    break;
                case "GetInterest" :
                    break;
            }





            input = scanner.nextLine();
        }



    }
}
