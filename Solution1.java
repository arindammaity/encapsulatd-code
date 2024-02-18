import java.util.*;
class Solution1
{
   public static void main(String[] args)
     {
       Player[] A= new Player[4];
       Scanner sc = new Scanner(System.in);
       for(int i=0;i<4;i++)
       {
         int a = sc.nextInt();
         sc.nextLine();
         String b = sc.nextLine();
         String c=  sc.nextLine();
         double d= sc.nextDouble();
         sc.nextLine();
        A[i]= new Player(a,b,c,d);
      }
      String e= sc.nextLine();
    

       Player [] help= fun1(A,e);
       for(int i=0;i<help.length;i++)
        {
          System.out.println(help[i].id);
        }

   }
  public static   Player[]  fun1(Player[] A,String e)
    {
     Player[] help= new Player[0];
       for(int i=0;i<A.length;i++)
        {
          if(A[i].side.equals(e))
            {
              help= Arrays.copyOf(help,help.length+1);
               help[help.length-1]=A[i];
            }
       }
       for(int i=0;i<help.length;i++)
       {
           for(int j=i+1;j<help.length;j++)
              {
                 if(help[i].id>help[j].id)
                   {
                      Player temp= help[i];
                      help[i]=help[j];
                      help[j]=temp;
                    }
              }
        }
    return help;
      }       

}
class Player
 {
    int id;
    String country;
    String side;
    double price;
  public Player(int id,String country,String side,double price)
     {
        this.id=id;
        this.country=country;
        this.side=side;
        this.price=price;
    }
}
