package Controller;

/**
 * Created by Jorge.
 */
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "formulariopaciente", urlPatterns = "/formularioPaciente.html")
public class PacienteController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nombre = req.getParameter("nombre");
        if(!nombre.equals(null)){
            req.setAttribute("valido", true);
        } else {
            req.setAttribute("valido", false);
        }
    }
}
