package br.senac.tads3.pi03b.gruposete.servlets;

import br.senac.tads3.pi03b.gruposete.dao.ClienteDAO;
import br.senac.tads3.pi03b.gruposete.models.Cliente;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@WebServlet(name = "BuscaClienteServlet", urlPatterns = {"/BuscaCliente"})
public class BuscaClienteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/BuscaCliente.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ClienteDAO dao = new ClienteDAO();
        String pesquisa = request.getParameter("pesquisa");

        try {
            if ("".equals(pesquisa.trim())) {
                List<Cliente> encontrados = dao.ListarCliente();
                request.setAttribute("encontrados", encontrados);
                request.setAttribute("pesquisa", pesquisa);
            } else {
                List<Cliente> encontrados = dao.procurarCliente(pesquisa);
                request.setAttribute("encontrados", encontrados);
                request.setAttribute("pesquisa", pesquisa);
            }
            
            RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/ListaCliente.jsp");
            dispatcher.forward(request, response);

        } catch (IOException | SQLException | ClassNotFoundException ex) {
            Logger.getLogger(BuscaClienteServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
