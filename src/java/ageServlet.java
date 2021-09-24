
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ageServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("message", "You must give your current age.");
        getServletContext().getRequestDispatcher("/WEB-INF/ageForm.jsp").forward(request, response);
        return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String input = request.getParameter("age");
        //System.out.println(input);
        if (input == null || input.equals("")) {
            request.setAttribute("message", "Please enter a number.");
            getServletContext().getRequestDispatcher("/WEB-INF/ageForm.jsp").forward(request, response);
            return;
        }

        try {
            int num = Integer.parseInt(input);
            request.setAttribute("message", "Your age next birthday will be " + ++num);
            getServletContext().getRequestDispatcher("/WEB-INF/ageForm.jsp").forward(request, response);
        } catch (NumberFormatException n) {
            request.setAttribute("message", "The input is not valid, please enter a number");
            getServletContext().getRequestDispatcher("/WEB-INF/ageForm.jsp").forward(request, response);
            return;
        }

    }

}
