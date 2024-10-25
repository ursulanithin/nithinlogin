package nithinregistration;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String Email = request.getParameter("email");
		String pass = request.getParameter("password");
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nithinregistration?useSSL=false","root","123456");
			PreparedStatement pst = con.prepareStatement("select * from nithinlogin where Email=? and pass=?");
			pst.setString(1, Email);
			pst.setString(2, pass);
			    ResultSet rs = pst.executeQuery();
			    if(rs.next()) {
			    	session.setAttribute("mail",rs.getString("Email"));
			    	dispatcher = request.getRequestDispatcher("index.jsp");
			    }
			    else {
			    	request.setAttribute("status", "failed");
			    	dispatcher = request.getRequestDispatcher("login.jsp");
			    }
			    dispatcher.forward(request,response);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
