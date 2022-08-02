package assignment6;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

class MyFilenameFilter implements FilenameFilter{
	String initials;
	
	public MyFilenameFilter(String initials)
	{
		this.initials = initials;
	}
	
	public boolean accept(File dir, String name)
	{
		return name.endsWith(initials);
	}
}

public class Question1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Folder Path-: ");
		String path = sc.next();
		File directory = new File(path);
		System.out.println("Enter File Extension-: ");
		String extension = sc.next();
		MyFilenameFilter filter = new MyFilenameFilter(extension);
		String[] flist = directory.list(filter);
		if(flist == null)
		{
			System.out.println("Empty directory or directory does not exist.");
		}
		else
		{
			for(int i=0;i<flist.length;i++)
			{
				System.out.println(flist[i]+" found");
			}
		}
		sc.close();
	}

}
