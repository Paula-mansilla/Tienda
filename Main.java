import control.TiendaFercher;
import views.VistaTienda;


public class Main {
public static void main(String[] args) {

    try {
        VistaTienda vistaTienda = new VistaTienda();

        //consulta
        String urlApi = "https://jsonplaceholder.typicode.com/posts/99";
        String respuesta = TiendaFercher.obtenerProductos(urlApi);
        System.out.println("Respuest de la Api");

        

        for (int i = 0; i < respuesta.length(); i++) {

                System.out.print(respuesta.charAt(i));
            
        }


    } catch (Exception e) {
        // TODO: handle exception
    }

}
}