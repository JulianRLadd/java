public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Chase");
        bank.addBranch("Arathne");

        bank.addCustomer("Arathne","Jake",45.25 );
        bank.addCustomer("Arathne","Michael",86.93 );
        bank.addCustomer("Arathne","Rachel",305.64 );


        bank.addBranch("Dallas");

        bank.addCustomer("Dallas","Melissa",27.84 );
        bank.addCustomer("Dallas","Martin",65.21 );
        bank.addCustomer("Dallas","Rebecca",890.98 );
        bank.addCustomerTransaction("Dallas","Melissa",22.40 );
        bank.addCustomerTransaction("Dallas","Martin",16.13 );
        bank.addCustomerTransaction("Dallas","Rebecca",37.15 );

        bank.listCustomers("Arathne",true);
        bank.listCustomers("Dallas",true);

        if(!bank.addCustomer("Sykarix","Felix",9.23)){
            System.out.println("Error Syakrix does not exist");
        }
        if(!bank.addBranch("Arathne")){
            System.out.println("Arathne branch already exists");
        }
        if(!bank.addCustomerTransaction("Arathne","Mavern",58.29)){
            System.out.println("Customer does not exist at branch");
        }
        if(!bank.addCustomer("Arathne","Rachel",14.59)){
            System.out.println("Customer Rachel already exists");
        }
    }
}
