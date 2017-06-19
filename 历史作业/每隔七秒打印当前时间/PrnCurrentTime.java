
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class PrnCurrentTime implements Runnable {
 public void run(){
  while(true){
   try {
    Thread.sleep(7000);
   } catch (InterruptedException e) {
    e.printStackTrace();
   }
   Date now = new Date();
   DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
   System.out.println(df.format(now));
  }
 }
 
 /**
  * @param args
  */
 public static void main(String[] args) {
  PrnCurrentTime p = new PrnCurrentTime();
  new Thread(p).start();
 }
 
}