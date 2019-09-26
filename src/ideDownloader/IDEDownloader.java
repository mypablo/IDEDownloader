package ideDownloader;
import java.io.IOException;
import java.util.Scanner;

public class IDEDownloader {
	
	
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please type the name of one IDE of the following to download: "+
		"\n Eclipse \n Microsoft Visual Studio \n NeatBeans \n IntelliJ IDEA \n PyCharm \n Code:: Blocks \n Komodo " + "\n" + "input here: ");
		String newscan = scan.nextLine();
		
		
		
		
		
		switch(newscan){
		case "Eclipse": 
			String url_open ="https://www.eclipse.org/downloads/";
		java.awt.Desktop.getDesktop().browse(java.net.URI.create(url_open));
			break;
			
		case "Microsoft Visual Studio":
			String url_open2 ="https://visualstudio.microsoft.com/";
			java.awt.Desktop.getDesktop().browse(java.net.URI.create(url_open2));
			break;
			
		case "NeatBeans":
			String url_open3 ="https://netbeans.apache.org/download/index.html";
			java.awt.Desktop.getDesktop().browse(java.net.URI.create(url_open3));
			break;
			
		case "IntelliJ IDEA":
			String url_open4 ="https://www.jetbrains.com/idea/download/#section=linux";
			java.awt.Desktop.getDesktop().browse(java.net.URI.create(url_open4));
			break;
			
		case "PyCharm":
			String url_open5 ="https://www.jetbrains.com/pycharm/download/#section=linux";
			java.awt.Desktop.getDesktop().browse(java.net.URI.create(url_open5));
			break;
			
		case "Code:: Blocks":
			String url_open6 ="http://www.codeblocks.org/downloads";
			java.awt.Desktop.getDesktop().browse(java.net.URI.create(url_open6));
			break;
			
		case "Komodo":
			String url_open7 ="https://www.activestate.com/products/komodo-ide/";
			java.awt.Desktop.getDesktop().browse(java.net.URI.create(url_open7));
			break;
			
		}
		
		
	}
	

}
