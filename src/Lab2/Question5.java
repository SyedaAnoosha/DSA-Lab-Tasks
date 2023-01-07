package Lab2;
class JavaCoffeeOutlet {
    int bags, largeBag, medBag, smallBag, lRemain, mRemain, large, med  ;
    float totalCost;
    static float bagsPrice = 5.50F;
    float totalBag, largeCost, medCost, smallCost;
    public int getBags() {
        return bags;
    }
    public void setBags(int bags) {
        this.bags = bags;
    }
    public void details(int n){
        totalBag= bagsPrice * n ;
        System.out.println("\nNumbers of bags ordered: " + getBags());
        System.out.println("The cost of order: $" + totalBag);
    }
    public void OrderBags(int n){

        large = n % 20 ;
        lRemain = n - large ;
        largeBag = lRemain / 20 ;

        med = large % 10 ;
        mRemain = large - med;
        medBag = mRemain / 10 ;

        if(med > 0 && med <= 5){
            smallBag = 1;
        }else if (med > 5 && med <10){
            smallBag = 2;
        }

        largeCost = (float) (largeBag * 1.80);
        medCost = (float) (medBag * 1.00);
        smallCost = (float) (smallBag * 0.6);

        totalCost = (float) (largeCost + medCost + smallCost);

        System.out.println("Boxes Used: ");
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
