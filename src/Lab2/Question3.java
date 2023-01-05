package Lab2;

public class Question3 {
    public static void main(String [] arug)
    {
        Invoice i1=new Invoice();
        i1.setDetails("AED76552", 30, "Milk", 22);
        System.out.println(i1.getInvoiceAmount());

    }

}
class Invoice{
    String number;
    int quantity;
    String description;
    float price;

    void setDetails(String number, int quantity, String des, float price)
    {
        this.number=number;
        this.quantity=quantity;
        this.description=des;
        this.price=price;
    }
    String getnumber()
    {
        return number;
    }
    int getqty()
    {
        return quantity;
    }
    String getdes()
    {
        return description;
    }
    float getprice()
    {
        return price;
    }
    float getInvoiceAmount()
    {
        if(quantity<=0 || price<=0)
        {
            quantity=0;
            price=0;
        }
        else{
            return quantity*price;
        }
        return 0;
    }




}