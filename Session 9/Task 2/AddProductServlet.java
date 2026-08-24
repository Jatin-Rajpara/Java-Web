
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import com.jatin.model.Product;

@WebServlet("/add")
public class AddProductServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {


        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        String category = request.getParameter("category");


        Product p = new Product();


        p.setName(name);
        p.setPrice(price);
        p.setCategory(category);


        HttpSession session = request.getSession();


        session.setAttribute("p", p);

        response.getWriter().println("Product added successfully!");
    }
}
