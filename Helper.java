import java.util.Random;

/**
 * Helper class for the final
 */
public class Helper
{
    /*
     * Converts from one unit to another, depending on the mode.
     * For mode 1, converts kilometers to miles
     * For mode 2, converts miles to kilometers
     */
    public static double Converter(double value, int mode)
    {
        if( mode ==1)
        {
            double answer1 = value/1.61;
            return answer1;
        }
        if( mode == 2)
        {
            double answer2 = value* 1.61;
            return answer2;
        }
        else
        {
            return 0;
        }
    }
    
    /*
     * Generate random numbers between min and max (with min and
     * max included). It should generate count random numbers and
     * return an array
     */
    public static int[] generateRandom(int count, int min, int max)
    {
        int randoms[] = new int[count];
        Random rand = new Random();
        for (int i = 0; i<count; i++)
        {
            randoms[i]= rand.nextInt(max)+min;
        }
        return randoms ;
    }
    
    /*
     * Find the smallest number greater than 1 that divides both n1 and n2
     */
    public static int findSmallestNumberThatDivides (int n1, int n2)
    {
        int i = 2;
        while ( n1%i !=0 && n2%i!=0)
        {
            if(( n1%i ==0) && (n2%i==0))
            {
                return i;
            }
            i++;
        }
        return i; 
    }
    
    /*
     * Find the mean of the numbers in values
     */
    public static double findMean(double[] values)
    {
        double sum = 0;
        for(int i = 0; i<values.length; i++)
        {
            sum = sum + values[i];
        }
        double mean = sum/values.length;
        return mean;
    }
    
    /*
     * Check if the SSN was issued in Michigan. 
     * The first three digits of the SSN are between 
     * 362 and 386.
     */
    public static boolean isMichiganSSN(long ssn)
    {
        long social = ssn/1000000;
        if( social<387 && social>361)
        {
        return true;
    }
        return false;
    }
    
    /*
     * Given a rate r, calculate the doubling time.
     * https://en.wikipedia.org/wiki/Doubling_time
     */
    public static double calculateDoublingTime(double r)
    {
        double time = Math.log(2)/Math.log(1+(r/100));
        return time;
    }
    
    /*
     * Create a new Product object.
     * The ID has the following rule:
     * offset is added to from 222000
     * Color code 1 is R, code two is B
     * Revision is added to the end
     * So, offset of 111, colorCode of 2 and revision 3 has id 222111B3 
     */
    public static Product makeProduct(int offset, int colorCode, int revision)
    {
        return null;
    }
    
    /*
     * Return the NetworkInterface with the given MAC_address. If not found,
     * return null
     */
    public static WirelessAdapter findbyMACAddress(WirelessAdapter[] nics, String MAC_address)
    {
        
        return null;
    }
    
    /*
     * Helper function to generate a random MAC address
     */
    public static String randomMACAddress(int seed)
    {
        Random rand = new Random();
        rand.setSeed(seed);
        
        byte[] macAddr = new byte[6];
        rand.nextBytes(macAddr);

        macAddr[0] = (byte)(macAddr[0] & (byte)254);  //zeroing last 2 bytes to make it unicast and locally administered

        StringBuilder sb = new StringBuilder(18);
        for(byte b : macAddr)
        {
            if(sb.length() > 0)
                sb.append(":");
            sb.append(String.format("%02x", b));
        }

        return sb.toString().toUpperCase();
    }
}
