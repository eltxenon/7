public class Main {
    public static void main(String[] args) {

        Product[] products=new Product[7];
        products[0]=new DigitalProduct("Samsung",1500,128);
        products[1]=new DigitalProduct("Apple",2400,512);
        products[2]=new DigitalProduct("Nokia",1780,128);
        products[3]=new DigitalProduct("Lg",1100,64);
        products[4]=new DigitalProduct("Xiaomi",1250,256);
        products[5]=new PhysicalProduct("Meat",160,1);
        products[6]=new PhysicalProduct("SRice",250,10);
        
        for(int i=0;i<7;i++){
            products[i].displayInfo();
        }
        System.out.println();
        for(int i=0;i<5;i++){
            System.out.println(products[i].getName()+": $"+products[i].applyDiscount(.15));
        }
    }
}