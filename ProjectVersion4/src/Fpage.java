
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.swing.JEditorPane;
//import javax.swing.JFrame;
import javax.swing.JTable;

@WebServlet("/Fpage")
public class Fpage extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	
	String street = request.getParameter("street");
	
	
	out.println("<font face = 'Comic Sans MS' size = '5' color = 'orange'>");
	out.println("<p align = 'center'>"+street+"</p>");
	out.println("<body background = 'https://static.pexels.com/photos/4097/city-cars-traffic-lights.jpeg'>" + "<table border = '1' align = 'center' color = 'white'>" + "<tr align = 'center'>" +
			"<td>" + "<font color = 'orange'> " + "#" + "</font>" + "</td>" + "<td>" + "<font color = 'orange'> " + "IMAGE" + "</font>" + "</td>" + "<td>" + "<font color = 'orange'> " + "NAME" + "</font>" + "</td>" + "<td>" + "<font color = 'orange'> " + "ADDRESS" + "</font>" + "</td>" + "<td>" + "<font color = 'orange'>" + "CONTACT #" + "</font>" + "</td>" + "<td>" + "<font color = 'orange'> " + "PLATE #" + "</font>" + "</td>" + "</font>" + "</td>" + "<td>" + "<font color = 'orange'> " + "TRICYCLE #" + "</font>" + "</td>" + "</tr>" + 
			"<tr>" + "<td>" + "<font color = 'orange'> " + "1" + "</font>" + "</td>"	+ "<td>" + "<img src = 'https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcQhvDB0VrMPk2I9okZ-uIxr-fvtvopVEHUb9cWzD-6MpgQ2wJ7DxQ' height = 50px width = 50px>" + "</td>" +
			"<td>" + "FERRER, RAMIL MIKEY" + "</td>" + "<td>" + "SAN PABLO, LAGUNA" + "</td>" + "<td>" + "09972903591" + "</td>" + "<td>" + "ABC123" + "</td>" + "<td>" + "029" + "</td>"+ "</tr>" + 
			
			"<tr>" + "<td>" +"<font color = 'orange'> " + "2" + "</font>" + "</td>"	+ "<td>" + "<img src = 'https://travel.state.gov/content/dam/passports/photo_reel/CROPPED-DSC_0057.jpg/_jcr_content/renditions/cq5dam.thumbnail.125.125.png' height = 50px width = 50px>" + "</td>" +
			"<td>" + "JELLOY, EARLIE JANNY" + "</td>" + "<td>" + "TONDO, MANILA" + "</td>" + "<td>" + "09157003144" + "</td>" + "<td>" + "CBA321" + "</td>" + "<td>" + "069" + "</td>"+ "</tr>" + 
			
			"<tr>" + "<td>" + "<font color = 'orange'>" + "3" + "</font>" + "</td>"	+ "<td>" + "<img src = 'https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcT4tSrpive2l9-7AnLr6LShA9y5wSP-OrrJTUUnamVncE_78HA_' height = 50px width = 50px>" + "</td>" +
			"<td>" + "PUCHERO, JOHN LALEXA" + "</td>" + "<td>" + "SAMPALOC, MANILA" + "</td>" + "<td>" + "09696098119" + "</td>" + "<td>" + "BEX119" + "</td>" + "<td>" + "077" + "</td>"+ "</tr>" + "</table>"+ "</body>");
	out.println("<P>");
    out.print("<form action=\"");
    out.print(response.encodeURL("index2.html"));
    out.print("\" ");
    out.println("method=POST>");
    out.println("<");
	//File f = new File("C:\Users\Dominique\Desktop\Java Enterprise - Experiments\ProjectVersion2\WebContent");
	//bufferedWriter bw = new bufferedWriter(new FileWriter(f));
    
    
    out.println("<center><i><input type=submit value=\"Add Operator\"></center>");
    out.println("</form>");
	
}
}
