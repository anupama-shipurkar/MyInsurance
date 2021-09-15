import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		PhoneLog log1 = new PhoneLog("dailed", LocalDate.of(2021, 03, 13),"Julie");
		PhoneLog log2 = new PhoneLog("dailed", LocalDate.of(2021, 04, 13),"Annie");
		PhoneLog log3 = new PhoneLog("dailed", LocalDate.of(2021, 05, 13),"Jennie");
		PhoneLog log4 = new PhoneLog("dailed", LocalDate.of(2021, 06, 13),"Tannie");
		System.out.println("Logs are ready");
				
		ArrayList<PhoneLog> myPhoneLog = new ArrayList<PhoneLog>();
	System.out.println("Log container is ready");
	myPhoneLog.add(log1);
	myPhoneLog.add(log2);
	myPhoneLog.add(log3);
	myPhoneLog.add(log4);
	myPhoneLog.add(new PhoneLog("recieved",LocalDate.of(2021, 06, 13), "Mom"));
	
	for(PhoneLog o : myPhoneLog) {
		System.out.println("The log is : "+o);
	}
	System.out.println("---------------------------------------------------------");
	Iterator<PhoneLog>myLogIterator= myPhoneLog.iterator();
	while(myLogIterator.hasNext()) {
		PhoneLog theLog = myLogIterator.next();
		System.out.println("Log : "+theLog);
	}
	System.out.println("-----------------------------------------------------");
	/*for(int i=0;i<myPhoneLog.size();i++) {
		System.out.println("the log : "+myPhoneLog.get(i));
	}*/
	System.out.println("Sorting base on name ");
	Collections.sort(myPhoneLog);
	}
	

}
class PhoneLog implements Comparable<PhoneLog>
{
	String logType;
	LocalDate logTime;
	String name;
	public PhoneLog(String logType, LocalDate logTime, String name) {
		super();
		this.logType = logType;
		this.logTime = logTime;
		this.name = name;
	}
	@Override
	public String toString() {
		return "PhoneLog [logType=" + logType + ", logTime=" + logTime + ", name=" + name + "]";
	}
	@Override
	public int compareTo(PhoneLog o) {
		// TODO Auto-generated method stub
		System.out.println("Comparing "+name+" with "+o.name);
		return name.compareTo(o.name);
	}
		
	}