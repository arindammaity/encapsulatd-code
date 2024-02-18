import java.util.*;
class Solution10
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
     ResortGuest[] rr = new ResortGuest[4];
     for(int i=0;i<4;i++)
     {
       int a= sc.nextInt();
       sc.nextLine();
       String b = sc.nextLine();
       String c = sc.nextLine();
      int  d= sc.nextInt();
      sc.nextLine();
       String  e= sc.nextLine();
     double  f= sc.nextDouble();
     sc.nextLine();
    rr[i]=new ResortGuest(a,b,c,d,e,f);

  }
  String  g= sc.nextLine();
  String  h = sc.nextLine();
   int count =     fun1( rr, g);
   if(count>0)
   {
    System.out.println(count);
   }
    else
   {
    System.out.println("No room booked");
   }

  ResortGuest LL = fun2(rr,h);
  if(LL==null)
  {
      System.out.println("Nothing");
  }
   else
  {
    System.out.println(LL.getId());
  }
}
  public static   int      fun1(ResortGuest[] rr,String g)
   {
     int count=0;
    for(int i=0;i<4;i++)
    {
      if(rr[i].getDate().substring(3,6).equalsIgnoreCase(g))
       {
          count++;
       }
    }
  return  count;
 }
   public     static    ResortGuest fun2(ResortGuest[] rr,String h)
  {
    ResortGuest[] HIT= new ResortGuest[0];
    for(int i=0;i<4;i++)
     {
       if(rr[i].getOption().equalsIgnoreCase(h))
         {
            HIT= Arrays.copyOf(HIT,HIT.length+1);
             HIT[HIT.length-1]=rr[i];
         }
    }
    for(int i=0;i<HIT.length;i++)
    {
      for(int j=i+1;j<HIT.length;j++)
       {
         if(HIT[i].getTotal()<HIT[j].getTotal())
          {
             ResortGuest temp = HIT[i];
            HIT[i]=  HIT[j];
            HIT[j]= temp;
          }
     }
  }
  if(HIT.length>0)
   {
     return  HIT[1];
   }
   else
   {
    return null;
}
}
}
class ResortGuest
{
   int id;
  String name;
  String date;
  int  no;
  String option;
  double total;
  public ResortGuest(int id,String name,String date,int no,String option,double total)
  {
   this.id=id;
    this.name=name;
   this.date=date;
    this.no=no;
   this.option=option;
  this.total=total;
}
int getId()
{
 return id;
}
void setId(int id)
{
 this.id=id;
}
String getName()
{
 return name;
}
void setName(String name)
{
 this.name=name;
}
String  getDate()
{
 return date;
}
void setDate(String date)
{
 this.date=date;
}
int getNo()
{
 return no;
}
void setNo(int no)
{
 this.no=no;
}
String  getOption()
{
 return option;
}
void setOption(String option)
{
 this.option=option;
}
double getTotal()
{
 return total;
}
void setTotal(double total)
{
 this.total=total;
}
}
