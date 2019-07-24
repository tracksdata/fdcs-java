package com;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.product.config.AppConfig;
import com.cts.product.entities.Product;
import com.cts.product.service.ProductService;

public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// @Autowired
	// private ProductService ps;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//PrintWriter out = response.getWriter();

		String option = request.getParameter("menu");

		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		ProductService ps = ac.getBean(ProductService.class);

		if (option.equals("save")) {
			
			Product prod=new Product();
			prod.setProdId(request.getParameter("prodId"));
			prod.setProdName(request.getParameter("prodName"));
			prod.setPrice(Double.parseDouble(request.getParameter("price")));
			
			ps.saveProduct(prod);
			
			RequestDispatcher rd = request.getRequestDispatcher("processProduct?menu=list");
			rd.forward(request, response);
			
		}

		if (option.equals("list")) {
			
			List<Product> products = ps.findAll();

			request.setAttribute("prods", products);

			RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
			rd.forward(request, response);
		}

		ac.close();
		

		// System.out.println(products);

	}

}
