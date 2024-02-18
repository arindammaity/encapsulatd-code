import java.util.*;
class Solution9
{
  public static  void main(String[] arge)
  {
    Scanner sc = new Scanner(System.in);
    Sim[] ss= new Sim[5];
     for(int i=0;i<5;i++)
    {
     int a=sc.nextInt();
     sc.nextLine();
     String b = sc.nextLine();
     double c= sc.nextDouble();
     sc.nextLine();
     double  d= sc.nextDouble();
     sc.nextLine();
     String   e= sc.nextLine();
     ss[i]=new Sim(a,b,c,d,e);
   }
    String  f= sc.nextLine();
    String  g= sc.nextLine();
     Sim[] DON  = fun1(ss, f, g);
    for(int i=0;i<DON.length;i++)
    {
     System.out.println(DON[i].id+" "+DON[i].name+" "+DON[i].rate);
   }    
 }
   public static  Sim[]   fun1(Sim[] ss,String f,String g)
   {
     Sim[] DON= new Sim[0];
     for(int i=0;i<5;i++)
     {
        if(ss[i].circle.equalsIgnoreCase(f))
            {
               ss[i].circle= g;
             DON = Arrays.copyOf(DON,DON.length+1);
             DON[DON.length-1]=ss[i];
            }
    }
    for(int i=0;i<DON.length;i++)
    {
       for(int j=i+1;j<DON.length;j++)
        {
          if(DON[i].rate<DON[j].rate)
           {
             Sim JJJ= DON[i];
            DON[i]=DON[j];
            DON[j]=JJJ;
         }
     }
  }
   return DON;
  }
}
class Sim
{
  int id;
  String name;
  double balance;
  double rate;
  String circle;
  public Sim(int id,String name,double balance,double rate,String circle)
  {
   this.id=id;
   this.name=name;
   this.balance=balance;
   this.rate=rate;
   this.circle=circle;
}

}