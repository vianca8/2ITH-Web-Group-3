package com.ust.iics.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ust.model.CartBean;

@WebServlet("/display.html")
public class CartDisplay extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		CartBean bean = (CartBean) request.getAttribute("compDetails");
		out.println("<html>");
		out.println("<head> <title> Receipt </title> </head>");
		out.println("<div align = \"left\" style = \"margin-left: 40%; \" >");
		out.println("</div>");
		
		
		String location = request.getParameter("Location");
		String payment = request.getParameter("Payment");
		
		out.println("<body style = \"background: url(https://www.insauga.com/sites/default/files/article/2017/08/pexels-photo-291762.jpg); background-size: cover; height: 10vh; background-repeat: no-repeat;  \">");
		out.println("<h1 style = \"margin-top: 15px; color: white;font-family:'Arial'; font-size: 40px; text-align: center;\">Thank you for shopping with us!</h1>");
		out.println("<div align = \"center\">\r\n");
		out.println("<div style = \"container; width: 350px; padding: 50px; text-align: top; background-color: #FFFFFF; position: top;\">\r\n");
		out.println("<p style = \"font-family: monaco,Consolas,Lucida Console,monospace; font-size: 30px;\"> <strong> OFFICIAL RECEIPT</strong>");
		out.println("<br>");
		out.println("<table style =\"margin: 80px auto margin-bottom: 0px; width: 100%; border-collapse: collapse;\">");
		out.println("<tr style = \"text-align: center;\">");
		out.println("<br>");
		out.println("<th style = \"color: gray;\">Product</th>");
		out.println("<th style = \"color: gray;\">Quantity</th>");
		out.println("<th style = \"color: gray;\">Price</th>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>");
		out.println("<p>Floral Summer Dress</p>");		
		out.println("</td>");
		out.println("<td><input style =\"width: 40px; text-align: center\" value='1'></td>");
		out.println("<td>500.00</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>");
		out.println("<p>Men's Straight Cut Pants</p>");
		out.println("</td>");
		out.println("<td><input style =\"width: 40px; text-align: center\" value='1'></td>");
		out.println("<td>500.00</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>");
		out.println("</table>");
		
		out.println("<p style = \"color: black; text-align: left;\"> Location: " + "<span style = \"color: rgba(255,0,0,0.6)\" > " + location);
		out.println("<p style = \"color: black; text-align: left;\"> Payment Method: " + "<span style = \"color: rgba(255,0,0,0.6)\" > " + payment);
		
		if(location.equals("NCR")) {
			out.println("<p style = \"color: black; text-align: left; \"> Shipping Fee: " + "<span style = \"color: rgba(255,0,0,0.6)\" > " + "PHP " + bean.getLocal());
			out.println("<p style = \"color: black; text-align: left;\"> Total Amount: " + "<span style = \"color: rgba(255,0,0,0.6)\" > " + "PHP " + bean.getTotal1());
			out.println("<p>");
			out.println("<p style = \"color: maroon;\"> <b> A confirmation message will be sent to your email.</b>");
		}
		
		if(location.equals("Outside NCR")) {
			out.println("<p style = \"color: black; text-align: left;\"> Shipping Fee: " + "<span style = \"color: rgba(255,0,0,0.6)\" > " + "PHP " + bean.getOutside());
			out.println("<p style = \"color: black; text-align: left;\"> Total Amount: " + "<span style = \"color: rgba(255,0,0,0.6)\" > " + "PHP " + bean.getTotal2());
			out.println("<p>");
			out.println("<p style = \"color: maroon;\"><b> A confirmation message will be sent to your email.</b>");
		}
		
		if(location.equals("International")) {
			out.println("<p style = \"color: black; text-align: left;\"> Shipping Fee: " + "<span style = \"color: rgba(255,0,0,0.6)\" > " + "PHP " + bean.getInter());
			out.println("<p style = \"color: black; text-align: left;\"> Total Amount: " + "<span style = \"color: rgba(255,0,0,0.6)\" > " + "PHP " + bean.getTotal3());
			out.println("<p>");
			out.println("<p style = \"color: maroon; text-align: left;\"><b> A confirmation message will be sent to your email.</b>");
		}
		out.println("<br><a href=\"apparelhome.html\"><button style = \"margin-top: 10px; background: maroon; color:white; height: 40px; border-radius: 5px;\">Continue Shopping</button></a>");
		out.println("</div>");
		out.println("</div>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
