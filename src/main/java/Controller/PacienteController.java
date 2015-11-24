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

@WebServlet("/PacienteController")
//@WebServlet(name = "formulariopaciente", urlPatterns = "/formularioPaciente.html")
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




        String nom=req.getParameter("nombre");

        String apellido=req.getParameter("apellidos");
        String fechaN=req.getParameter("fecha_nacimiento");
        String correo=req.getParameter("correo");
        String direc=req.getParameter("direccion");

        // ESTE ES EL ERROR LOS ENTEROS NO SE POR QUE JAJAJA
        //int telefono=Integer.parseInt("telefono");
        //int celular=Integer.parseInt("celular");
        //int documen=Integer.parseInt("documento");



        System.out.println(nom);

        System.out.println(apellido);
        System.out.println(fechaN);
        System.out.println(correo);
        System.out.println(direc);
        //System.out.println(telefono);
        //System.out.println(celular);
        //System.out.println(documen);

        // LA IDEA AQUI ES MANDAR TODOS LOS PARAMETROS A PACIENTE

        //Paciente p= new Paciente(nombre,apellido,correo,direc,telefono,celular,documen,true,b);

    }
}
