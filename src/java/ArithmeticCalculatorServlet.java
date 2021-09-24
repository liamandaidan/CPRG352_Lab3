
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("awnser", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);

        return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String type = request.getParameter("type");
        request.setAttribute("fn", first);
        request.setAttribute("sn", second);
        if (first == null || first.equals("") || second == null || second.equals("")) {
            request.setAttribute("awnser", "Invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }

        try {
            int num1 = Integer.parseInt(first);
            int num2 = Integer.parseInt(second);
            switch (type) {
                case "+":
                     request.setAttribute("awnser", num1+num2);
                    break;
                case "-":
                    request.setAttribute("awnser", num1-num2);
                    break;
                case "*":
                    request.setAttribute("awnser", num1*num2);
                    break;
                case "%":
                    request.setAttribute("awnser", num1%num2);
                    break;
                default:
                    request.setAttribute("awnser", "invalid");
                    break;
            }
           
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        } catch (NumberFormatException n) {
            request.setAttribute("awnser", "invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }
    }

}
