import java.util.*;
class Solution6
{
   public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
      Bank[] bb = new Bank[4];
     for(int i=0;i<bb.length;i++)
     {
       int a = sc .nextInt();
       sc.nextLine();
        String b  = sc.nextLine();
      int c= sc.nextInt();
       sc.nextLine();
      String  d= sc.nextLine();
    bb[i]= new Bank(a,b,c,d);
     }
   String e= sc.nextLine();
   int avg = fun1( bb,e);
   if(avg==0)
   {
       System.out.println("Bank not found");
   }
     else 
   {
       System.out.println(avg);
   }
  Bank KLA  = fun2(bb);
  if(KLA ==null)
   {
      System.out.println("Bank NOT found");
   }
   else
   {
      System.out.println(KLA.id);
      System.out.println(KLA.bank);
      System.out.println(KLA.customer);
       System.out.println(KLA.city);
    }

}
  public static   int fun1(Bank[] bb,String e)
   {
    int count=0;
    int sum=0;
  for(int i=0;i<bb.length;i++)
   {
     if(bb[i].city.equalsIgnoreCase(e))
      {
         count++;
         sum = sum + bb[i].customer;
      }
   }
if(count>0)
 {
   return  sum/count;
 }
else
{
 return 0;
}
}

  public static   Bank    fun2(Bank[] bb)
   {
     Bank[] help= new Bank[0];
     Bank  GGGG=null;
     for(int i=0;i<bb.length;i++)
     {
        if(bb[i].customer%2==0)
          {
            help = Arrays.copyOf(help,help.length+1);
            help[help.length-1]=bb[i];
         }
     }
        for(int i=0;i<help.length;i++)
         {
            for(int j=i+1;j<help.length;j++)
              {
                 if( help[i].customer>help[j].customer)
                     {
                          GGGG= help[i];
                          help[i]=help[j];
                          help[j]=GGGG;
                     }
              }
         }
   if(help.length>1)
  {
     return  help[1];
  }
  else
  {
     return null;
 }

 }


}
class Bank
{
   int id;
    String bank;
   int customer;
  String  city;
 public Bank(int id, String bank,int customer,String city)
  {
  this.id=id;
  this.bank=bank;
  this.customer=customer;
  this.city=city;
}

} 