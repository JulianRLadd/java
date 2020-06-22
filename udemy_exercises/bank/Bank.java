import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branchList;

    public Bank(String name) {
        this.name = name;
        this.branchList = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if(findBranch(branchName)== null){
        this.branchList.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount){
        Branch branch = findBranch(branchName);
        if(branch !=null){
            return branch.newCustomer(customerName, initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount){
        Branch branch = findBranch(branchName);
        if(branch!=null){
            return branch.addCustomerTransaction(customerName,amount);
        }
        return false;
    }

    private Branch findBranch(String branchName){
        for (int i=0;i<this.branchList.size();i++){
            Branch checkedBranch = this.branchList.get(i);
            if (checkedBranch.getName().equals(branchName)) {
                return checkedBranch;
            }
        }
        return null;
    }



    public boolean listCustomers(String branchName, boolean showTransactions){
        Branch branch = findBranch(branchName);
        if(branch!=null){
            System.out.println("Customer details for branch "+ branch.getName());
            ArrayList<Customer> branchCustomers = branch.getCustomerList();
            for(int i =0;i<branchCustomers.size();i++){
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: "+ branchCustomer.getName()+"[" +(i+1)+"]");
                if(showTransactions){
                    System.out.println("Transactions");
                ArrayList<Double> transactions = branchCustomer.getTransactions();
                for(int j=0;j < transactions.size();j++){
                    System.out.println("[" +(j+1)+"] Amount "+transactions.get(j));
                }
                }
            }
            return true;
        }else{
        return false;

        }
    }
}

/*
**Banking w/ Java Classes**
   - **Bank class**
       - List of Branches
   - **Branch class**
     - List of Customers
     - List of Transactions
   - **Customer Class**:
     - Customer Name
   - **Branch Class**:
     - addCustomer and initial transaction amount.
     - Also needs to add additional transactions for that customer/branch
   - **Bank:**
     - Add a new branch
     - Add a customer to that branch with initial transaction
     - Add a transaction for an existing customer for that branch
     - Show a list of customers for a particular branch and optionally a list of their transactions
   - Demonstration autoboxing and unboxing in your code
   - Think about where you are adding the code to perform certain actions
*/