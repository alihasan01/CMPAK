import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RenameFile {
	public static void main(String[] args) { 
        File oriFile = new File("java.txt"); 
        File newFile = new File("javadiscover.txt"); 
        if(oriFile.exists()){ 
            oriFile.renameTo(newFile); 
            System.out.println("File rename completed...."); 
        }else{ 
           // System.out.println("Original file not exist for renaming...."); 
        } 
        System.out.println("a");
        try{
        test();
        }catch(Exception e){
        	e.printStackTrace();
        }
    } 
	public static  void test()
	{
		/*String FILENAME = "D:/zarrar/softwares/apache-tomcat-7.0.90/logs";
		File file = new File(FILENAME);
		String filesName = ""; 
		String s = "";
		for (File fileEntry : file.listFiles())
		{
	         filesName = fileEntry.getName();
	         s = filesName.substring(0,8);
	         if (s.equals("catalina"))
	         {
	        	 break;
	         }
	         
	    }
		String FILE_PATH = "D:/zarrar/softwares/apache-tomcat-7.0.90/logs/";
		;*/
		//filesName = filesName.substring(0,19);
try{
		String FILE_EXTENSION = ".log";
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss"); // add S if you need milliseconds
		File oldfile = new File( "D:/zarrar/softwares/apache-tomcat-7.0.90/logs/ali3.log" );

        File newfile = new File( "D:/zarrar/softwares/apache-tomcat-7.0.90/logs/ali5.log");
        if(oldfile.renameTo(newfile))
        {
            System.out.println("File renamed");
        }
	}
	catch(Exception e){
		e.printStackTrace();
	}
	}
}
