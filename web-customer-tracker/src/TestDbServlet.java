import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

import java.io.PrintWriter;
import java.sql.*;
@WebServlet("/TestDbServlet")
public class TestDbServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        //setup connection variables
        String user = "springstudent";
        String pass = "springstudent";

        String jdbcUrl="jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false&serverTimezone=UTC";
        String driver="com.mysql.cj.jdbc.Driver";

        //get connection to database
            try {

                PrintWriter out = response.getWriter();

                out.println("Connecting to database: "+jdbcUrl);
                Class.forName(driver);

                Connection myConn = DriverManager.getConnection(jdbcUrl,user,pass);

                out.println("SUCCESS!!");

                myConn.close();

            }catch (Exception e){
                e.printStackTrace();
                throw new ServletException(e);
            }

    }
}
