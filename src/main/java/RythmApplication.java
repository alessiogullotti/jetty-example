import org.rythmengine.Rythm;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class RythmApplication extends HttpServlet
{


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response ) throws IOException {
        //String name = request.getParameter("name");

        response.setContentType("text/html");
        response.setStatus(HttpServletResponse.SC_OK);
        write(response, Rythm.render("insert.html"));

    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
            String firstname = req.getParameter("firstname");

            String lastname = req.getParameter("lastname");

            String pizza = req.getParameter("pizza-type");

            String time = req.getParameter("mytime");
            OrderClass.addorder(firstname,lastname,pizza,time);
            ArrayList<Order> list=OrderClass.getOrders();
            write(resp, Rythm.render("ListHtml.html",list.get(0)));
    }


    private void write(HttpServletResponse resp, String message) throws IOException {
        resp.getWriter().write(message);
    }
}
