package com.ust.iics.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cart.html")
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>\r\n" + 
				"<html lang=\"en\">\r\n" + 
				"<head>\r\n" + 
				"	<meta charset=\"UTF-8\">\r\n" + 
				"	<title>Shopping Cart</title>\r\n" + 
				"	<link rel=\"stylesheet\" href=\"cart.css\">\r\n" + 
				"	<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n" + 
				"</head>\r\n" + 
				"<body>		\r\n" + 
				"	<div class=\"wrapper\">\r\n" + 
				"		<div class =\"nav\">\r\n" + 
				"		<nav class=\"navbar\">\r\n" +  
				"			<ul>\r\n" + 
				"				<li><a href=\"index.html\">Home</a></li>\r\n" + 
				"				<li><a href=\"#\">Apparel</a>\r\n" + 
				"					<div class = \"sub-menu\">\r\n" + 
				"						<ul>\r\n" + 
				"							<li><a href=\"men's apparel.html\">Men's Apparel</a></li>\r\n" + 
				"							<li><a href=\"women's apparel.html\">Women's Apparel</a></li>\r\n" + 
				"							<li><a href=\"kid's apparel.html\">Kid's Apparel</a></li>\r\n" + 
				"						</ul>\r\n" + 
				"					</div>\r\n" + 
				"				</li>\r\n" + 
				"				<li>\r\n" + 
				"				<a href=\"about.html\">About</a></li>\r\n" + 
				"				<li><a href=\"contact.html\">Contact</a></li>\r\n" + 
				"				<li class = \"btn\">\r\n" + 
				"					<input class=\"search-txt\" type=\"text\" name=\"\" placeholder=\"Type to search . . .\"><a href = \"#\">\r\n" + 
				"						<i class=\"fa fa-search\" aria-hidden=\"true\"></i></a>\r\n" + 
				"				</li>\r\n" + 
				"				<li><a href = \"#\"><i class=\"fa fa-shopping-cart\" aria-hidden=\"true\"></i></a></li>\r\n" + 
				"			</ul>\r\n" + 
				"		</nav>\r\n" + 
				"		</div>\r\n" + 
				"		<div class = \"cart\" >\r\n" + 
				"			<br>\r\n" + 
				"			<table>\r\n" + 
				"				<tr>\r\n" + 
				"					<th>Product</th>\r\n" + 
				"					<th>Quantity</th>\r\n" + 
				"					<th>Subtotal</th>\r\n" + 
				"				</tr>\r\n" + 
				"				<tr>\r\n" + 
				"					<td>\r\n" + 
				"						<div class = \"cart-info\">\r\n" + 
				"							<img src =\"https://lcpshop.net/wp-content/uploads/2020/08/559936-m9iwyj.jpg\">\r\n" + 
				"							<div>\r\n" + 
				"								<p>Floral Summer Dress</p>\r\n" + 
				"								<small>Price: PHP500.00</small>\r\n" + 
				"								<br>\r\n" + 
				"								<a href =\"\">Remove</a>\r\n" + 
				"							</div>\r\n" + 
				"						</div>\r\n" + 
				"					</td>\r\n" + 
				"					<td><input type=\"number\" value=\"1\"></td>\r\n" + 
				"					<td>PHP500.00</td>\r\n" + 
				"				</tr>\r\n" + 
				"				\r\n" + 
				"				<tr>\r\n" + 
				"					<td>\r\n" + 
				"						<div class = \"cart-info\">\r\n" + 
				"							<img src =\"https://cdn.shopify.com/s/files/1/1213/2346/products/dickies_874work_pant_darkbrown_1_1024x1024.jpg?v=1563202681\">\r\n" + 
				"							<div>\r\n" + 
				"								<p>Men's Straight Cut Pants 874</p>\r\n" + 
				"								<small>Price: PHP500.00</small>\r\n" + 
				"								<br>\r\n" + 
				"								<a href =\"\">Remove</a>\r\n" + 
				"							</div>\r\n" + 
				"						</div>\r\n" + 
				"					</td>\r\n" + 
				"					<td><input type=\"number\" value=\"1\"></td>\r\n" + 
				"					<td>PHP500.00</td>\r\n" + 
				"				</tr>\r\n" + 
				"			</table>\r\n" + 
		 
				"			<div class=\"total\">\r\n" + 
				"				<table>\r\n" + 
				"					<tr>\r\n" + 
				"						<td>Subtotal</td>\r\n" + 
				"						<td>PHP1,000.00</td>\r\n" + 
				"					</tr>\r\n" + 
				"										<tr>\r\n" + 
				"						<td>Shipping fee</td>\r\n" + 
				"						<td>To be calculated depending on location.</td>\r\n" + 
				"					</tr>\r\n" + 
				"										<tr>\r\n" + 
				"						<td>Total</td>\r\n" + 
				"						<td>To be calculated after checking out.</td>\r\n" + 
				"					</tr>\r\n" + 
				"<tr>\r\n" + 
				"<form action=\"compute.html\" method = 'get'>" +
				"<td><label for=\"Location\">Location: </label></td>\r\n" + 
				"\r\n" + 
				"<td><select name=\"Location\" id=\"Location\">\r\n" + 
				"  <option value=\"NCR\">NCR</option>\r\n" + 
				"  <option value=\"Outside NCR\">Outside NCR</option>\r\n" + 
				"  <option value=\"International\">International</option>\r\n" + 
				"</select></td>"+
				"<tr>\r\n" +
				"<td><label for=\"Payment\">Payment Method: </label></td>\r\n" + 
				"\r\n" + 
				"	<td><select name=\"Payment\" id=\"Payment\">\r\n"+
				"	<option value=\"Cash\">Cash</option>\r\n" +
				"	<option value=\"Credit\">Credit Card</option>\r\n" +
				"	</select></td>"+
				"</tr>\r\n" + 
				"<tr>\r\n" +
				"  <td><input type=\"submit\" value=\"Check Out\" style = \"width: 100px; height: 50px\"></td>\r\n" + 
				"</tr>\r\n" + 
				"</form>"+
				"</tr>\r\n" + 
				"				</table>\r\n" +
				"			</div>\r\n" + 
				"	</div>\r\n" + 
				"</body>\r\n" + 
				"</html>");
				out.close();
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
