import java.util.*;
class Solution4
{
    public static void main(String[] args)
       {
          Scanner sc = new Scanner(System.in);
           Flowers[] ff= new Flowers[4];
             for(int i=0;i<4;i++)
             {
           int a= sc.nextInt();
           sc.nextLine();
          String b = sc.nextLine();
          int c= sc.nextInt();
          sc.nextLine();
         int  d= sc.nextInt();
          sc.nextLine();
         String  e=  sc.nextLine();
        ff[i]= new Flowers(a,b,c,d,e);
            }
          String  f= sc.nextLine();
         Flowers D = fun1(ff,f);
         if(D==null)
        {
           System.out.println("There is no flower with given  type");
        }
         else
        {
         System.out.println(D.price);
        }
        }
  public static    Flowers     fun1(Flowers[] ff,String f)
   {
     int min=Integer.MAX_VALUE; 
     Flowers temp =null;
      for(int i=0;i<ff.length;i++)
       {
          if(ff[i].rating>3 && ff[i].type.equalsIgnoreCase(f) && ff[i].price<min)
           {
              min = ff[i].price;
              temp = ff[i];
           }
       }
     if(temp!=null)
     {
        return temp;
     }
     else
    {
        return null;
    }
     
  }
    
}
class Flowers
  {
     int id;
     String name;
     int price;
     int rating;
     String type;
 public Flowers(int id,String name,int price,int rating,String type)
    {
       this.id=id;
       this.name=name;
       this.price=price;
       this.rating=rating;
       this.type=type;
    }
}