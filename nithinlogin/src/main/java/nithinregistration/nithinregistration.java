package nithinregistration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class nithinregistration
 */
@WebServlet("/nithinregistration")
public class nithinregistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public nithinregistration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String Email=request.getParameter("Email");
		String pass=request.getParameter("pass");
	
		String contact=request.getParameter("contact");
		
		
		
		PrintWriter pw=response.getWriter();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nithinregistration","root","123456");
			
			PreparedStatement pst=Con.prepareStatement("insert into nithinlogin (name,Email,pass,contact)values(?,?,?,?)");
			pst.setString(1,name);
			pst.setString(2,Email);
			pst.setString(3,pass);
			pst.setString(4, contact);
			
			int i=pst.executeUpdate();
			if(i!=0)
				pw.println("Register successfully");
			else
				pw.println("register agin");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
