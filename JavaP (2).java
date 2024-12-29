import java.util.*;
class Roombook1
{
    int roomno;
    int choice;
    long mo1;
    double gst1;
    int roomchoice;
    double classic_room_price=1000;
    double deluxe_room_price=3000;
    double ac_room_price=5000;
    double price;
    int days=0;

    boolean[] rooms=new boolean[10];

    void bookroom()
    {
        System.out.println("Welcome to Galaxy hotel");
        System.out.println("-----------------------");
        System.out.println("-----------------------");
        System.out.println("Please follow the process to book a room ");
        System.out.println();

        System.out.println("The available rooms are: ");
        for(int i=0;i<rooms.length;i++)
            if(rooms[i]==false)
            {
                System.out.println("Room="+(i+1));
                System.out.println("-------------------------------");
            }
    }
    void Room()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name=sc.nextLine();
        System.out.println("Please enter your mobile number:");
        mo1=sc.nextLong();
        int flag1=0;
        int count1=0;
        while(flag1==0)
        {
            long temp1=mo1;
            while(temp1!=0)
            {
                temp1=temp1/10;
                ++count1;
            }
            if(count1!=10)
            {
                System.out.println("PLEASE ENTER THE 10 DIGIT");
                mo1=sc.nextLong();
                break;
            }
            else
            {

                flag1=1;
            }
        }
        System.out.println("Please enter the room number you want to choose=");
        roomno=sc.nextInt();

        if(rooms[roomno-1]==true)
        {
            System.out.println("Sorry,the room number selected by you is not available");
        }
        else
        {
            System.out.println("Enter a choice");
            System.out.println();
            System.out.println("1.Classic room="+classic_room_price+"per night");
            System.out.println("--------------------------------");
            System.out.println("2.Deluxe room="+deluxe_room_price+"per night");
            System.out.println("--------------------------------");
            System.out.println("3.Ac room="+ac_room_price+"per night");
            System.out.println("--------------------------------");
            roomchoice=sc.nextInt();

            switch(roomchoice)
            {
                case 1:
                {
                    price=classic_room_price;
                    break;
                }
                case 2:
                {
                    price=deluxe_room_price;
                    break;
                }
                case 3:
                {
                    price=ac_room_price;
                    break;
                }
                default:
                {
                    System.out.println("Invalid choice");
                }

            }
            System.out.println("Please enter the no. of days you want to stay:");
            days=sc.nextInt();

            price=price*days;
            gst1=(18*price)/100;
            rooms[roomno-1]=true;
            System.out.println("       Galaxy hotel    ");
            System.out.println("   ----------------------    ");
            System.out.println("   Name:    "+name);
            System.out.println("   Mobile number:    "+mo1);
            System.out.println("   Room number:    "+roomno);
            System.out.println("   Room type:    "+roomchoice);
            System.out.println("  ---------------------------");
            System.out.println("  ---------------------------");
            System.out.println("  Subtotal:"+price +" "+"per day"              );
            System.out.println("  Final price including 18% gst:"+(price+gst1)+" "+" per day"               );
        }
    }
}
class JavaP
{
    Scanner sc=new Scanner(System.in);
    int a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y;
    double bn,co,dp,eq,fr,gs,ht,iu,jv,kw,lx,my,gst,subtotal;
    long mo;
    String name;
    void booktable()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("        WELCOME TO GALAXY CAFE    ");
        System.out.println("ENTER YOUR NAME:");
        name=sc.nextLine();
        System.out.println("BOOK YOUR TABLE:");
        a=sc.nextInt();

        System.out.println("ENTER YOUR MOBILE NUMBER:");
        mo=sc.nextLong();
        int flag=0;
        int count=0;
        while(flag==0)
        {
            long temp=mo;
            while(temp!=0)
            {
                temp=temp/10;
                ++count;
            }
            if(count!=10)
            {
                System.out.println("PLEASE ENTER THE 10 DIGIT");
                mo=sc.nextLong();
                break;
            }
            else
            {

                flag=1;
            }
        }
    }
    void menu()
    {
        System.out.println();
        System.out.println("                     MENU                       ");
        System.out.println();
        System.out.println("                    STARTERS                    ");
        System.out.println("   DISHES                                    PRICES");
        System.out.println("   =================================================");
        System.out.println("   1.MANCHOW SOUP                               100");
        System.out.println("   -------------------------------------------------");
        System.out.println("   2.TOMATO SOUP                                100");
        System.out.println("   -------------------------------------------------");
        System.out.println("   3.MANCHURIAN                                 200");
        System.out.println("   -------------------------------------------------");
        System.out.println("   4.PANEER CHILLI                              200");
        System.out.println("   -------------------------------------------------");
        System.out.println("                     BURGERS                    ");
        System.out.println("   5.ITALIAN BURGER                           70");
        System.out.println("   -------------------------------------------------");
        System.out.println("   6.MAXICAN BURGER                             100");
        System.out.println("   -------------------------------------------------");
        System.out.println("   7.CHEESE BURGER                              120");
        System.out.println("   -------------------------------------------------");
        System.out.println("                     PIZZA               		  ");
        System.out.println("   8.MARGERITA PIZZA                            200");
        System.out.println("   -------------------------------------------------");
        System.out.println("   9.7 CHEESE PIZZA                             250");
        System.out.println("   -------------------------------------------------");
        System.out.println("   10.SUPREME PIZZA                              250");
        System.out.println("   -------------------------------------------------");
        System.out.println("                     DESSERTS               ");
        System.out.println("   11.CHOCO LAVA CAKE                            100");
        System.out.println("   -------------------------------------------------");
        System.out.println("   12.CHOCALATE COCO                             100");
        System.out.println("   -------------------------------------------------");
    }
    void order()
    {
        System.out.println("ENTER THE NUMBER FOR ORDER:");
        int or=sc.nextInt();
        switch(or)
        {
            case 1:
            {
                System.out.println("ENTER THE MANCHOW SOUP QUNTATY:");
                n=sc.nextInt();
                break;
            }
            case 2:
            {
                System.out.println("ENTER THE TOMATO SOUP QUNTATY:");
                o=sc.nextInt();
                break;
            }
            case 3:
            {
                System.out.println("ENTER THE MANCHURIAN QUNTATY:");
                p=sc.nextInt();
                break;
            }
            case 4:
            {
                System.out.println("ENTER THE PANEER CHILLI QUNTATY:");
                q=sc.nextInt();
                break;
            }
            case 5:
            {
                System.out.println("ENTER THE ITALIAN BURGER QUNTATY:");
                r=sc.nextInt();
                break;
            }
            case 6:
            {
                System.out.println("ENTER THE MAXICAN BURGER QUNTATY:");
                s=sc.nextInt();
                break;
            }
            case 7:
            {
                System.out.println("ENTER THE CHEESE BURGER QUNTATY:");
                t=sc.nextInt();
                break;
            }
            case 8:
            {
                System.out.println("ENTER THE MARGERITA PIZZA QUNTATY:");
                u=sc.nextInt();
                break;
            }
            case 9:
            {
                System.out.println("ENTER THE 7 CHEESE PIZZA QUNTATY:");
                v=sc.nextInt();
                break;
            }
            case 10:
            {
                System.out.println("ENTER THE SUPREME PIZZA QUNTATY:");
                w=sc.nextInt();
                break;
            }
            case 11:
            {
                System.out.println("ENTER THE CHOCO LAVA CAKE QUNTATY:");
                x=sc.nextInt();
                break;
            }
            case 12:
            {
                System.out.println("ENTER THE CHOCALATE COCO QUNTATY:");
                y=sc.nextInt();
                break;
            }
            case 13:
            {
                this.calculate();
                this.bill();
            }
            default:
            {
                System.out.println("PLEASE ENTER NUMBER BETWEEN 1 TO 13:");
            }
        }
    }
    void calculate()
    {
        b=100;
        c=100;
        d=200;
        e=200;
        f=70;
        g=100;
        h=120;
        i=200;
        j=250;
        k=250;
        l=100;
        m=100;
        bn=b*n;
        co=c*o;
        dp=d*p;
        eq=e*q;
        fr=f*r;
        gs=g*s;
        ht=h*t;
        iu=i*u;
        jv=j*v;
        kw=k*w;
        lx=l*x;
        my=m*y;
        subtotal=bn+co+dp+eq+fr+gs+ht+iu+jv+kw+lx+my;
        gst=(18*subtotal)/100;
    }
    void bill()
    {
        System.out.println();
        System.out.println();
        System.out.println("                GALAXY CAFE          ");
        System.out.println("   TABLE NUMBER:   "+a);
        System.out.println("   NAME:   "+name);
        System.out.println("   MOBILE NUMBER:   "+mo);
        System.out.println("   =====================================================");
        System.out.println("      DISHES            PRICE     QUNTATY     TOTAL");
        System.out.println("   -----------------------------------------------------");
        if(bn!=0)
        {
            System.out.println("   MANCHOW SOUP"+"          "+b+"        "+n+"       "+bn);
        }
        if(co!=0)
        {
            System.out.println("   TOMATO SOUP "+"          "+c+"        "+o+"       "+co);
        }
        if(dp!=0)
        {
            System.out.println("   MANCHURIAN  "+"          "+d+"        "+p+"       "+dp);
        }
        if(eq!=0)
        {
            System.out.println("   PANEER CHILLI"+"         "+e+"        "+q+"       "+eq);
        }
        if(fr!=0)
        {
            System.out.println("   ITALIAN BURGER"+"         "+f+"        "+r+"       "+fr);
        }
        if(gs!=0)
        {
            System.out.println("   MAXICAN BURGER"+"        "+g+"        "+s+"       "+gs);
        }
        if(ht!=0)
        {
            System.out.println("   CHEESE BURGER"+"         "+h+"        "+t+"       "+ht);
        }
        if(iu!=0)
        {
            System.out.println("   MARGERITA PIZZA"+"       "+i+"        "+u+"       "+iu);
        }
        if(jv!=0)
        {
            System.out.println("   7 CHEESE PIZZA"+"        "+j+"        "+v+"       "+jv);
        }
        if(kw!=0)
        {
            System.out.println("   SUPREME PIZZA"+"         "+k+"        "+w+"       "+kw);
        }
        if(lx!=0)
        {
            System.out.println("   CHOCO LAVA CAKE"+"       "+l+"        "+x+"       "+lx);
        }
        if(my!=0)
        {
            System.out.println("   CHOCALATE COCO"+"        "+m+"        "+y+"       "+my);
        }
        System.out.println("   =====================================================");
        System.out.println("   SUBTOTAL"+"                                 "+subtotal);
        System.out.println("   INCLUDING GST 18%"+"                        "+(subtotal+gst));
        System.out.println("   ================THANKS FOR VISITING==================");
    }
}
class main44 {
    public static void main(String args[]) {
        int number;
        Scanner sc = new Scanner(System.in);
        JavaP p = new JavaP();
        Roombook1 r1 = new Roombook1();
        for (int ii = 0; ; ii++) {
            System.out.println("Enter what you want to book \"Room or Table\"");
            String aa = sc.nextLine();

            if (aa.equalsIgnoreCase("room")) {
                r1.bookroom();
                r1.Room();
                System.out.println("Enter Exit To Exit");
            }
            else if (aa.equalsIgnoreCase("table")) {
                p.booktable();
                p.menu();
                System.out.println("Enter total number of orders:- ");
                number = sc.nextInt();
                for (int i = 0; i < number; i++) {
                    p.order();
                }
                p.calculate();
                p.bill();
                System.out.println("Enter Exit To Exit");
            }
            else if(aa.equalsIgnoreCase("exit"))
            {
                break;
            }
            else {
                System.out.println("Invalid Argument");
            }
        }
    }
}