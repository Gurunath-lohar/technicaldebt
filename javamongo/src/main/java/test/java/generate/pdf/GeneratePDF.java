package test.java.generate.pdf;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStream;
import java.io.StringReader;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;

public class GeneratePDF {
    public static void main(String[] args) {
        try {

            String str = getHTMLString();

            OutputStream file = new FileOutputStream(new File("C:\\Test.pdf"));

            Document document = new Document();
            PdfWriter pdfWriter = PdfWriter.getInstance(document, file);

            document.open();

            XMLWorkerHelper worker = XMLWorkerHelper.getInstance();
            worker.parseXHtml(pdfWriter, document, new StringReader(str));

            document.close();
            file.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
    
    private static String getHTMLString() {
    	StringBuffer sb = new StringBuffer();
    	try{
	    	File file = new File("C:\\Users\\glohar\\Downloads\\document_guru.html");
	    	FileReader fr = new FileReader(file);
	    	BufferedReader bf = new BufferedReader(fr);	  
	    	String line =  bf.readLine();
	    	while( line != null) {
	    		sb.append(line);
	    		line = bf.readLine();
	    	}
	    	bf.close();
	    	fr.close();
    	}
    	catch(Throwable t){
    		t.printStackTrace();
    	}    	
    	
    	return sb.toString();
    }
}