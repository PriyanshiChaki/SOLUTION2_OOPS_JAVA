import java.io.BufferedReader; 
import java.io.InputStreamReader; 
import java.io.IOException; 
import java.util.StringTokenizer;
import java.util.Arrays;
public class Solution2 {
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
        public FastReader()
        {
            br= new BufferedReader(new InputStreamReader(System.in));
        }
        String next()
        {
            while(st==null||!st.hasMoreElements())
            {
                try
                {
                    st= new StringTokenizer(br.readLine());
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt()
        {
            return Integer.parseInt(next());
        }
    }
    public static void main(String args[]) throws IOException
    {   FastReader fs= new FastReader();
        Player player[]=new Player[4];
        for(int i=0;i<player.length;i++)
        {
            player[i]=new Player(fs.nextInt(), fs.next(), fs.nextInt(), fs.nextInt(), fs.nextInt());
        }
        int target= fs.nextInt();
        double averageofruns[]= findAverageOfRuns(player,target);
        for(int i=0;i<averageofruns.length;i++)
        {
            if(averageofruns[i]>=80 && averageofruns[i]<=100)
            System.out.println(" Grade A ");
            else if(averageofruns[i]>=50 && averageofruns[i]<=79)
            System.out.println(" Grade B ");
            else
            System.out.println(" Grade C ");

        }
    }

    public static double[] findAverageOfRuns(Player[] player, int target) {
        double newArr[]=new double[0];
        for(int i=0;i<player.length;i++)
        {
            if(player[i].getMatchesPlayed()>=target)
            {
                newArr= Arrays.copyOf(newArr, newArr.length+1);
                newArr[newArr.length-1]=(double) (player[i].getRunsScored() / player[i].getMatchesPlayed());
            }
        }
        return newArr;
    }
    
    
}
class Player
{
    int id;
    String name;
    int iccRank;
    int matchesPlayed;
    int runsScored;
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }public int getIccrank()
    {
        return iccRank;
    }
    public void setIccrank(int iccRank)
    {
        this.iccRank=iccRank;
    }
    public int getMatchesPlayed()
    {
        return matchesPlayed;
    }
    public void setMatchesPlayed(int matchesPlayed)
    {
        this.matchesPlayed=matchesPlayed;
    }
    public int getRunsScored()
    {
        return runsScored;
    }
    public void setRunsScored(int runsScored)
    {
        this.runsScored=runsScored;
    }
    public Player(int id, String name, int iccRank, int matchesPlayed, int runsScored)
    {
        this.id=id;
        this.name=name;
        this.iccRank=iccRank;
        this.matchesPlayed=matchesPlayed;
        this.runsScored=runsScored;
    }

}