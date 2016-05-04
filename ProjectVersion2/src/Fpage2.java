import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Fpage2")
public class Fpage2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public Fpage2() {
        super();
        
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String street = request.getParameter("street");
		
		out.println("<font face = 'Comic Sans MS' size = '5' color = 'white'>");
		out.println("<p align = 'center'>"+street+"</p>");
		out.println("<body background = 'https://static.pexels.com/photos/4097/city-cars-traffic-lights.jpeg'>");
		
		
		String NAME = request.getParameter("NAME");
		String ADDRESS = request.getParameter("ADDRESS");
		String TELCP = request.getParameter("TELCP");
		String NATIONALITY = request.getParameter("NATIONALITY");
		String GENDER = request.getParameter("GENDER");
		String MONTH = request.getParameter("MONTH");
		String DAY = request.getParameter("DAY");
		String YEAR = request.getParameter("YEAR");
		String HEIGHT = request.getParameter("HEIGHT");
		String WEIGHT = request.getParameter("WEIGHT");
		String BLOODTYPE = request.getParameter("BLOODTYPE");
		String LICENSENUMBER = request.getParameter("LICENSENUMBER");
		String CIVILSTATUS = request.getParameter("CIVILSTATUS");
		String HAIR = request.getParameter("HAIR");
		String EYES = request.getParameter("EYES");
		String BUILT = request.getParameter("BUILT");
		String COMPLEXION = request.getParameter("COMPLEXION");
		String BIRTHPLACE = request.getParameter("BIRTHPLACE");
		String FNAME = request.getParameter("FNAME");
		String MNAME = request.getParameter("MNAME");
		String SNAME = request.getParameter("SNAME");
		
		
		out.println("<p align ='justify'>Namw: " + NAME + "</p>");
		out.println("<p align ='justify'>Address: " + ADDRESS + "</p>");
		out.println("<p>Birthdate: " + MONTH + " " + DAY + " " + YEAR +"</p>");
		out.println("<p align ='justify'>Contact #: " + TELCP + "</p>");
		out.println("<p align ='justify'>Nationality: " + NATIONALITY +"</p>");
		out.println("<p align ='justify'>Gender: " + GENDER + "</p>");
		out.println("<p align ='justify'>Height: " + HEIGHT + "</p>");
		out.println("<p align ='justify'>Weight: " + WEIGHT + "</p>");
		out.println("<p align ='justify'>Blood Type: " + BLOODTYPE + "</p>");
		out.println("<p align ='justify'>License #: " + LICENSENUMBER + "</p>");
		out.println("<p align ='justify'>Civil Status: " + CIVILSTATUS + "</p>");
		out.println("<p align ='justify'>Hair: " + HAIR + "</p>");
		out.println("<p align ='justify'>Eyes: " + EYES + "</p>");
		out.println("<p align ='justify'>Built: " + BUILT + "</p>");
		out.println("<p align ='justify'>Complextion " + COMPLEXION + "</p>");
		out.println("<p align ='justify'>Birth Place: " + BIRTHPLACE + "</p>");
		out.println("<p align ='justify'>Father's Name: " + FNAME + "</p>");
		out.println("<p align ='justify'>Mother's Name: " + MNAME + "</p>");
		out.println("<p align ='justify'>Spouse Name: " + SNAME + "</p>");
		out.println("<br><br><br><br><br><br><br><br><br><br><br><br>");
	    out.print("<form action='./index2.html'>");
	    out.println("<center><i><input type='submit' value='Add Another Operator'></center>");
	    out.println("</form>");
	}

}
	