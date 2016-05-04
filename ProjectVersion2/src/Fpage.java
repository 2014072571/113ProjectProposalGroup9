
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.sun.org.apache.xalan.internal.xsltc.runtime.Operators;

/**
 * Servlet implementation class Fpage
 */
@WebServlet("/Fpage")
public class Fpage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
  /*  public Fpage() {
        super();*/
        // TODO Auto-generated constructor stub
    //}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	
	/*String month = request.getParameter("month");
	String date = request.getParameter("date");
	String year = request.getParameter("year");*/
	String street = request.getParameter("street");
	
	out.println("<font face = 'Comic Sans MS' size = '5' color = 'white'>");
	out.println("<p align = 'center'>"+street+"</p>");
	out.println("<body background = 'https://static.pexels.com/photos/4097/city-cars-traffic-lights.jpeg'>");
	//out.println("<p input type = 'submit' value = 'Add Operator'></p>");
	//JButton b1 = new JButton("Add");
	
/*	String firstName = request.getParameter("firstName");
	String miName = request.getParameter("miName");
	String lastName = request.getParameter("lastName");
	String month = request.getParameter("month");
	String date = request.getParameter("date");
	String year = request.getParameter("year");
	String hadd = request.getParameter("hadd");
	String cnum = request.getParameter("cnum");
	
	
	out.println("<p align = 'justify'><i>Name: " + firstName + " " +  miName + " " + lastName + "</i></p>");*/
	
	

	out.println("<P>");
    out.print("<form action=\"");
    out.print(response.encodeURL("index2.html"));
    out.print("\" ");
    out.println("method=POST>");
    //out.println("<input type = hidden name=\"toBuy\" value=\"Add Operator\">");
    out.println("<br><br><br><br><br><br><br><br><br><br><br><br>");
    out.println("<center><i><input type=submit value=\"Add Operator\"></center>");
    out.println("</form>");
  
    
    //Sample 2
    
   /* out.println("<html>");
    out.println("<body bgcolor=\"white\">");
    out.println("<head>");

out.println("<title> Ice cream </title>");

    out.println("</head>");
    out.println("<body>");

out.println("<h1>Thanks for trying our ice cream!</h1>");

out.println("Click");
out.println("<A HREF = \"IceCream1\">here</A>");
out.println("to buy more ice cream");

out.println("</body>");
out.println("</html>");

out.close();*/
	
}
}
