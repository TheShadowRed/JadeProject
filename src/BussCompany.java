import java.util.ArrayList;
import java.util.Iterator;

public class BussCompany {
    ArrayList<BussRoutes> al=new ArrayList<BussRoutes>();

    public int GetBussPrice(String CurrentLocation,String Destination)
    {
        int returnid=0;
        GenerateBussPrices();
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            BussRoutes st=(BussRoutes)itr.next();
            if(st.Departure==CurrentLocation && st.Arival==Destination)
            {
                returnid= st.Price;
                break;
            }
        }
        return returnid;
    }
    public void GenerateBussPrices()
    {
        BussRoutes s1=new BussRoutes("Craiova","Bucuresti",10);

        al.add(s1);

    }
    class BussRoutes{
        String Departure;
        String Arival;
        int Price;
        BussRoutes(String Departure,String Arival,int Price){
            this.Departure=Departure;
            this.Arival=Arival;
            this.Price=Price;
        }
    }
}
