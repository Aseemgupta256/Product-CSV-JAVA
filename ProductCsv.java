
import java.io.BufferedReader;
 import java.io.File;
 import java.io.FileNotFoundException;
 import java.io.PrintWriter;
 public class ProductCsv {
 public static void main(String[] args) {
   String fileName = "product.csv";
   generateCSV(fileName);
 //  readCSV(fileName);
   
}
private static void generateCSV(String fileName) {
 try {
   PrintWriter pw= new PrintWriter(new File(fileName));
   StringBuilder sb=new StringBuilder();
   sb.append("SL No.");
   sb.append(",");
   sb.append("Name");
   sb.append(",");
   sb.append("Price/Piece");
   sb.append(",");
   sb.append("Packs/Box");
   sb.append(",");
   sb.append("Single Or Multicolour");
   sb.append(",");
   sb.append("Ratings");
   sb.append(",");
   sb.append("Total Reviews");
   sb.append(",");
   sb.append("Link To Item");
   sb.append("\r\n");
   sb.append("1");
   sb.append(",");
   sb.append("Staples Reinforced Hanging File Folders");
   sb.append(",");
   sb.append("$20.99");
   sb.append(",");
   sb.append("25/Box");
   sb.append(",");
   sb.append("Multicolour");
   sb.append(",");
   sb.append("4.5+");
   sb.append(",");
   sb.append("530");
   sb.append(",");
   sb.append("https://www.quill.com/staples-reinforced-hanging-file-folders-5-tab-letter-size-blue-green-red-orange-yellow-25-box-tr18654/cbs/264106.html");
   sb.append("\r\n");
   sb.append("\r\n");
   sb.append("2");
   sb.append(",");
   sb.append("Staples Heavy Duty Hanging File Folders");
   sb.append(",");
   sb.append("$23.59");
   sb.append(",");
   sb.append("25/Box");
   sb.append(",");
   sb.append("Assorted colour");
   sb.append(",");
   sb.append("4.5+");
   sb.append(",");
   sb.append("448");
   sb.append(",");
   sb.append("https://www.quill.com/staples-heavy-duty-hanging-file-folders-5-tab-letter-size-assorted-colors-25-box-tr875411/cbs/264059.html");
   sb.append("\r\n");
   sb.append("\r\n");
   sb.append("3");
   sb.append(",");
   sb.append("Pendaflex® SureHook® 5-Tab Hanging File Folders");
   sb.append(",");
   sb.append("$24.79");
   sb.append(",");
   sb.append("20/Box");
   sb.append(",");
   sb.append("Single colour");
   sb.append(",");
   sb.append("4.5+");
   sb.append(",");
   sb.append("243");
   sb.append(",");
   sb.append("https://www.quill.com/pendaflex-surehook-5-tab-hanging-file-folders-letter-size-green-20-box-6152-1-5/cbs/212217.html");
   sb.append("\r\n");
   sb.append("\r\n");
   sb.append("4");
   sb.append(",");
   sb.append("Staples Hanging File Folder");
   sb.append(",");
   sb.append("$25.99");
   sb.append(",");
   sb.append("25/Box");
   sb.append(",");
   sb.append("Single colour");
   sb.append(",");
   sb.append("4.5+");
   sb.append(",");
   sb.append("241");
   sb.append(",");
   sb.append("https://www.quill.com/staples-hanging-file-folder-5-tab-letter-size-blue-25-box-tr163501/cbs/250508.html");
   sb.append("\r\n");
   sb.append("\r\n");
   sb.append("5");
   sb.append(",");
   sb.append("Staples Hanging File Folder");
   sb.append(",");
   sb.append("$26.99");
   sb.append(",");
   sb.append("20/Box");
   sb.append(",");
   sb.append("Assorted colour");
   sb.append(",");
   sb.append("4.5+");
   sb.append(",");
   sb.append("632");
   sb.append(",");
   sb.append("https://www.quill.com/staples-hanging-file-folders-5-tab-letter-size-assorted-colors-20-box-tr13324/cbs/263949.html");
   sb.append("\r\n");
   sb.append("\r\n");
   sb.append("6");
   sb.append(",");
   sb.append("Smead FasTab Hanging File Folders");
   sb.append(",");
   sb.append("$27.99");
   sb.append(",");
   sb.append("18/Box");
   sb.append(",");
   sb.append("Multicolour");
   sb.append(",");
   sb.append("4.5+");
   sb.append(",");
   sb.append("124");
   sb.append(",");
   sb.append("https://www.quill.com/smead-fastab-hanging-file-folders-1-3-cut-letter-size-multicolor-18-box-64053/cbs/204646.html");
   sb.append("\r\n");
   sb.append("\r\n");
   sb.append("7");
   sb.append(",");
   sb.append("Pendaflex SureHook 5-Tab Hanging File Folders");
   sb.append(",");
   sb.append("$28.99");
   sb.append(",");
   sb.append("20/Box");
   sb.append(",");
   sb.append("Multicolour");
   sb.append(",");
   sb.append("4.5+");
   sb.append(",");
   sb.append("316");
   sb.append(",");
   sb.append("https://www.quill.com/pendaflex-surehook-5-tab-hanging-file-folders-letter-size-multicolor-20-box-6152-1-5-asst/cbs/212218.html");
   sb.append("\r\n");
   sb.append("\r\n");
   sb.append("8");
   sb.append(",");
   sb.append("Staples Hanging File Folder");
   sb.append(",");
   sb.append("$29.99");
   sb.append(",");
   sb.append("50/Box");
   sb.append(",");
   sb.append("Single colour");
   sb.append(",");
   sb.append("4.5+");
   sb.append(",");
   sb.append("412");
   sb.append(",");
   sb.append("https://www.quill.com/staples-hanging-file-folder-5-tab-letter-size-standard-green-50-box-tr266262/cbs/250294.html");
   sb.append("\r\n");
   sb.append("\r\n");
   sb.append("9");
   sb.append(",");
   sb.append("Staples Heavy Duty Hanging File Folders");
   sb.append(",");
   sb.append("$35.99");
   sb.append(",");
   sb.append("25/Box");
   sb.append(",");
   sb.append("Assorted colour");
   sb.append(",");
   sb.append("4.5+");
   sb.append(",");
   sb.append("123");
   sb.append(",");
   sb.append("https://www.quill.com/staples-heavy-duty-hanging-file-folders-5-tab-legal-size-assorted-colors-25-box-tr345001/cbs/55362651.html");
   sb.append("\r\n");
   sb.append("\r\n");
   sb.append("10");
   sb.append(",");
   sb.append("Staples Hanging File Folder");
   sb.append(",");
   sb.append("$45.99");
   sb.append(",");
   sb.append("50/Box");
   sb.append(",");
   sb.append("Single colour");
   sb.append(",");
   sb.append("4.5+");
   sb.append(",");
   sb.append("112");
   sb.append(",");
   sb.append("https://www.quill.com/staples-hanging-file-folder-5-tab-legal-size-standard-green-50-box-tr490853/cbs/263295.html");
   sb.append("\r\n");
   pw.write(sb.toString());
   pw.close();
   System.out.println("finished Loading Products");
   } catch (FileNotFoundException e) {
      System.out.println("Error Can't create Product CSV");
	  e.printStackTrace();
   }

   }
/*
private static void readCSV(String fileName){
	   try (BufferedReader br = new BufferedReader(new FileReader(fileName){
	   String line = "" ; 
	   {
	   while( (line = br.readLine()) != null ) {
	   System.out.println(line);
	   }
	   }
	   } catch (FileNotFoundException e){
		      System.out.println("Error Can't create Product CSV");
			  e.printStackTrace();
		   }  catch (IOException e) {
		      System.out.println("File Cannot be closed");
			  e.printStackTrace();
		   }
	 }
	 */
 }