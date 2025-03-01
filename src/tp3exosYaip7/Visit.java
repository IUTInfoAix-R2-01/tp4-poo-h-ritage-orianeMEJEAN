package tp3exosYaip7;

import java.util.Date;

public class Visit 
{
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(String name, Date date) 
    {
        this.customer = new Customer(name);
        this.date = date;
    }

    public String getName() 
    {
        return customer.getName();
    }

    public double getServiceExpense() 
    {
        return serviceExpense;
    }
    
    public void setServiceExpense(double serviceExpense) 
    {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() 
    {
        return productExpense;
    }

    public void setProductExpense(double productExpense) 
    {
        this.productExpense = productExpense;
    }

    public double getTotalExpense() 
    {
        double serviceDiscount = customer.isMember() ? DiscountRate.getServiceDiscountRate(customer.getMemberType()) : 0.0;
        double productDiscount = customer.isMember() ? DiscountRate.getServiceDiscountRate(null) : 0.0;
       

        double totalServiceCost = serviceExpense * (1 - serviceDiscount);
        double totalProductCost = productExpense * (1 - productDiscount);

        return totalServiceCost + totalProductCost;
    }

    @Override
    public String toString() {
        return "Visit[customer = " + customer.getName() + ", date = " + date + ", serviceExpense = " + serviceExpense + ", productExpense = " + productExpense + ", totalExpense=" + getTotalExpense() + "]";
    }
}