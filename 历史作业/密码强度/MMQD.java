import java.util.*; 
public class MMQD { 
    public static void main ( String[] args ) { 
        Scanner scanner = new Scanner (System.in); 
        System.out.println ("����������:"); 
        while (scanner.hasNextLine ())  { 
            String line = scanner.nextLine (); 
            if (line.matches ("^\\d+$")) { 
                System.out.println ("�����֣�����"); 
            }else if (line.matches ("^[a-zA-Z]+$")) { 
				System.out.println ("����ĸ������"); 
            }else if (line.matches ("(?i)^((\\d+[\\da-z]*[a-z]+)|([a-z]+[\\da-z]*\\d+)|([a-z]+[\\da-z]*[a-z]*)|(\\d+[\\da-z]*\\d*))$")) { 
                System.out.println ("����ǿ"); 
            }else{ 
                System.out.println ("���岻ǡ���ַ�"); 
                scanner.close (); 
                break; 
            } 
        } 
    } 
}