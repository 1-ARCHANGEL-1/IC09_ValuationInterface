import java.util.ArrayList;
import java.util.List;

public class Main
{

    public static void main(String[] args)
    {
	// write your code here
        List<Security> portfolio = new ArrayList<>();
        portfolio.add(new CommonStock("1234567","Apple, Inc.", 100, 100.0, 134.89));
        System.out.println("------Unsorted Portolio------");
        for(Security s: portfolio)
            System.out.println(s);
    }
}
