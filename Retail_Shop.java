public class Retail_Shop
{
    public static void main(String[] args)
    {
        double quantA=2, quantB=1, quantC=3, discount=0.1, servicetax=0.05;
        double itemA=200, itemB=75, itemC=500;
        double priceA=quantA*(itemA-(discount*itemA)+(servicetax*itemA));
        double priceB=quantB*(itemB-(discount*itemB)+(servicetax*itemB));
        double priceC=quantC*(itemC-(discount*itemC)+(servicetax*itemC));
        double price=priceA+priceB+priceC;
        System.out.println("Total amount Mathew has to pay is:"+price);
    }
}