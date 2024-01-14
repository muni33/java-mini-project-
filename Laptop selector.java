import java.util.Scanner;

class Laptop1{
    
    String brand;
    String processor;
    int ram; // in GB
    int storage; // in GB
    double price; // in Rupees

    public void Laptop1(String brand,  String processor, int ram, int storage, double price){
        this.brand = brand;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
    
}

    public void display() {
        System.out.println(brand + " " + processor + ", " + ram + "GB RAM, " + storage + "GB storage, Rupees  " + price+"\n");
    }
    public void display2(int amt){
        if(price<=amt){
            System.out.println(brand + " " + processor + ", " + ram + "GB RAM, " + storage + "GB storage, Rupees  " + price+"\n");
        }
    
    }

    
    public  static void main(String[] args) {
        Laptop1 l=new Laptop1();
        int b=1;
        do{
        
        System.out.println("1.Are you choose laptop for your amount.\n 2.See some laptops \n 3.quit \n");
        System.out.println("enter your choice 1 or 2 or 3:");
        Scanner s1 = new Scanner(System.in);
        
        int choice=s1.nextInt();
        if(choice==1){
            System.out.println("Please Enter your Amount:");
        int amt=s1.nextInt();
        l.Laptop1("Hp","11th Gen Intel Core  i7",8,256,53000);
        l.display2(amt);
        l.Laptop1("Hp","11th Gen Intel Core i5",8, 256,43000);
        l.display2(amt);
        l.Laptop1("Hp"," 11th Gen Intel Core i5",16,512,130000);
        l.display2(amt);
        l.Laptop1("Hp","11th Gen Intel Core  i7",16,512,150000);
        l.display2(amt);
        l.Laptop1("Dell","11th Gen Intel Core  i7",8,256,73000);
        l.display2(amt);
        l.Laptop1("Dell","11th Gen Intel Core i5",8, 256,53000);
        l.display2(amt);
        l.Laptop1("Dell"," 11th Gen Intel Core i5",16,512,140000);
        l.display2(amt);
        l.Laptop1("Dell","11th Gen Intel Core  i7",16,512,160000);
        l.display2(amt);
        l.Laptop1("Lenovo","11th Gen Intel Core  i7",8,256,63000);
        l.display2(amt);
        l.Laptop1("Lenovo","11th Gen Intel Core i5",8, 256,44000);
        l.display2(amt);
        l.Laptop1("Lenovo"," 11th Gen Intel Core i5",16,512,90000);
        l.display2(amt);
        l.Laptop1("Lenovo","11th Gen Intel Core  i7",16,512,100000);
        l.display2(amt);
        l.Laptop1("Acer","11th Gen Intel Core  i7",8,256,43000);
        l.display2(amt);
        l.Laptop1("Acer","11th Gen Intel Core i5",8, 256,24000);
        l.display2(amt);
        l.Laptop1("Acer"," 11th Gen Intel Core i5",16,512,70000);
        l.display2(amt);
        l.Laptop1("Acer","11th Gen Intel Core  i7",16,512,90000);
        l.display2(amt);
        }
        else if(choice==2){
            System.out.println(" \t 1.Hp \n2.Dell \n3.Lenovo \n4.Acer");
            System.out.println("Enter Number:");
            int a=s1.nextInt();
            if(a==1){
        l.Laptop1("Hp","11th Gen Intel Core  i7",8,256,53000);
        l.display();
        l.Laptop1("Hp","11th Gen Intel Core i5",8, 256,43000);
        l.display();
        l.Laptop1("Hp"," 11th Gen Intel Core i5",16,512,130000);
        l.display();
        l.Laptop1("Hp","11th Gen Intel Core  i7",16,512,150000);
        l.display();
            }
            else if (a==2){
         l.Laptop1("Dell","11th Gen Intel Core  i7",8,256,73000);
        l.display();
        l.Laptop1("Dell","11th Gen Intel Core i5",8, 256,53000);
        l.display();
        l.Laptop1("Dell"," 11th Gen Intel Core i5",16,512,140000);
        l.display();
        l.Laptop1("Dell","11th Gen Intel Core  i7",16,512,160000);
        l.display();
            }
            else if(a==3){
    l.Laptop1("Lenovo","11th Gen Intel Core  i7",8,256,63000);
    l.display();
    l.Laptop1("Lenovo","11th Gen Intel Core i5",8, 256,44000);
    l.display();
    l.Laptop1("Lenovo"," 11th Gen Intel Core i5",16,512,90000);
    l.display();
    l.Laptop1("Lenovo","11th Gen Intel Core  i7",16,512,100000);
    l.display();
    }
    else if(a==4){
        l.Laptop1("Acer","11th Gen Intel Core  i7",8,256,43000);
        l.display();
        l.Laptop1("Acer","11th Gen Intel Core i5",8, 256,24000);
        l.display();
        l.Laptop1("Acer"," 11th Gen Intel Core i5",16,512,70000);
        l.display();
        l.Laptop1("Acer","11th Gen Intel Core  i7",16,512,90000);
        l.display();
    }
    else {
        System.out.println("Invlid choice");
    }
        } 
        else if (choice==3){
            break;
        }
        
        } while (b<=2);
   }
}
