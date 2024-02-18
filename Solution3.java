import java.util.*;
class Solution3
{
   public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      HeadSets[] h= new HeadSets[4];
      for(int i=0;i<4;i++)
      {
        String  a= sc.nextLine();
        String  b = sc.nextLine();
        int  c= sc.nextInt();
       boolean  d= sc.nextBoolean();
       sc.nextLine();
      h[i]=new HeadSets(a,b,c,d);
      }
     String  e= sc.nextLine();
    int sum = fun1(h,e);
    if(sum>0)
    {
      System.out.println(sum);
    }
     else
     {
       System.out.println("No Headsets available with the given brand");
     }

  HeadSets  V = fun2(h);
 if(V==null)
 {
    System.out.println("No Headsets available");
 }
 else
 {
   System.out.println(V.name);
   System.out.println(V.price);
}
    }
   public static   int     fun1(HeadSets[]h,String e)
    {
       int sum =0;
       for(int i=0;i<4;i++)
        {
           if(h[i].brand.equalsIgnoreCase(e))
              {
                   sum = sum + h[i].price;
              }
        }
   return sum;
   }

  public  static HeadSets    fun2( HeadSets[] h)
  {
     HeadSets[] help= new HeadSets[0];
     for(int i=0;i<4;i++)
      {
        if(h[i].avail==true)
         {
             help= Arrays.copyOf(help,help.length+1);
             help[help.length-1]=h[i];
          }
      }
   for(int i=0;i<help.length;i++)
   {
      for(int j=i+1;j<help.length;j++)
        {
           if(help[i].price>help[j].price)
           {
             HeadSets temp = help[i];
              help[i]= help[j];
            help[j]= temp;
           }
        }
   }
    if(help.length>0)
   {
      return  help[1];
   }
   else
   {
    return null;
   }
}
}
class HeadSets
  {
    String name;
    String brand;
    int price;
    boolean avail;
     public HeadSets(String name,String brand,int price,boolean avail)
       {
          this.name=name;
          this.brand=brand;
          this.price=price;
          this.avail=avail;
       }
   }