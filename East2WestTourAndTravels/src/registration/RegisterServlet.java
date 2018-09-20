package registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Connection.ConnectionProvider;

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegisterServlet() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String emailid = request.getParameter("email");
			String name = request.getParameter("name");
			String address = request.getParameter("address");
			String dob = request.getParameter("dateOfBirth");
			String password = request.getParameter("password");
			String role = request.getParameter("role");
			int userid = Integer.parseInt(request.getParameter("userid"));
			System.out.println("---------->" + emailid);
			ConnectionProvider cp = new ConnectionProvider();
			Connection conn = cp.getConnection();
			response.setContentType("text/html");
			String query = "insert into userclass values(?,?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, userid);
			ps.setString(2, emailid);
			ps.setString(3, name);
			ps.setString(4, address);
			ps.setString(5, dob);
			ps.setString(6, password);
			ps.setString(7, role);
			int isInserted = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
