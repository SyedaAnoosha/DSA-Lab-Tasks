package Lab2;

class JavaCoffeeOutlet {
    int bags;
    int largeBag,medBag,smallBag, lRemain , mRemain ;
    double totalCost;
    static float bagsPrice = 5.50F;
    double totalBag, largeCost, medCost, smallCost;
    public int getBags() {
        return bags;
    }
    public void setBags(int bags) {
        this.bags = bags;
    }
    public void details(int n){
        totalBag= bagsPrice * n ;
        System.out.println("Numbers of bags ordered: " + getBags());
        System.out.println("The cost of order: $" + totalBag);
    }
    public void OrderBags(int n){

        largeBag = n / 20 ;
        lRemain= n-largeBag ;
        medBag = (lRemain % 20) / 10 ;
        mRemain = lRemain - medBag ;
        smallBag = ( mRemain % 10 ) / 5 ;

        largeCost = largeBag * 1.80 ;
        medCost = medBag ;
        smallCost = smallBag * 0.6 ;

        totalCost = (float) (largeCost + medCost + smallCost);

        System.out.println(largeBag+" Large - $"+largeCost );
        System.out.println(medBag+" Medium - $"+ medCost);
        System.out.println(smallBag+" Small - $"+ smallCost);

    }
    public void Total(){
        System.out.println("Your total cost is : $"+(totalBag + totalCost));
    }
}

public class Question5 {
    public static void main(String[] args) {
        JavaCoffeeOutlet C = new JavaCoffeeOutlet();
        int n = 52;
        C.setBags(n);
        C.details(n);
        C.OrderBags(n);
        C.Total();
    }
}
