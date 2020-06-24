
import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customerList;

    public Branch(String name){
        this.name = name;
        this.customerList = new ArrayList<Customer>();
    }

    public String getName(){
        return name;
    }

    public ArrayList<Customer> getCustomerList(){
        return customerList;
    }

    public boolean newCustomer(String customerName, double initialAmount){
        if (findCustomer(customerName)==null){
            this.customerList.add(new Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount){
        Customer existingCustomer = findCustomer(customerName);

        if (existingCustomer!=null){
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName){
            for (int i=0;i<this.customerList.size();i++){
                Customer checkedCustomer = this.customerList.get(i);
                if (checkedCustomer.getName().equals(customerName)) {
                    return checkedCustomer;
                }
            }
            return null;
    }


}
