package Lab2;

public class Question3 {
    public static void main(String [] args) {
        Invoice i1=new Invoice();
        i1.setNumber("AED76552");
        i1.setDescription("Milk");
        i1.setPrice(30);
        i1.setQuantity(22);

        System.out.println(i1.getInvoiceAmount());

    }

}
class Invoice{
    String number;
    int quantity;
    String description;
    float price;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getInvoiceAmount()
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