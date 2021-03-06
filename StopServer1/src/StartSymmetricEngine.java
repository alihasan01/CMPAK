import java.io.PrintWriter;
import java.net.Socket;

public class StartSymmetricEngine {
	private static String SERVER = "localhost"; 
	public static void main(String[] args) throws Exception {
		 try{
		        Socket s = new Socket("localhost",8081);
		        if(s.isConnected()){
		        	System.out.println("Running");
		            PrintWriter print = new PrintWriter(s.getOutputStream(),true);
		            print.println("SHUTDOWN"); /*Command to stop tomcat according to the line "<Server port="8005" shutdown="SHUTDOWN">" in catalina_home/conf/server.xml*/
		            print.close();
		            s.close();
		        }
		        Runtime.getRuntime().exec(System.getProperty("catalina.home")+"\\bin\\startup.bat");  /*Instruction to run tomcat after it gets stopped*/
		    }catch (Exception ex){
		        ex.printStackTrace();
		    }
	    }
}
