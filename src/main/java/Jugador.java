import org.jboss.logging.Logger;

import java.util.Scanner;

/**
 * autor jhosepe11
 * author JorgeMontoya
 * * esta clase define los atributos  necesarios que debe de tener el jugador, con su respectivo constructor
 * y metodos getter y setter para acceder u obtener sus valores
 *
 */
public class Jugador  {

    /**
     * autor jhosep11
     * jorgeMontoya
     * se definen los atributos de de la clase jugador
     */
    private String idJugador;
    private String nombreJugador;
    private Integer Puntos;

    Logger escribirEnConsola = Logger.getLogger(Jugador.class) ;
    /**
     * autor jhosep11
     * Se crea el constructor con los siguientes parametros
     * @param idJugador - el identificador unico que tendra el jugador generado automaticamente en MySQl
     * @param nombreJugador - nombre del jugador capturado por consola
     * @param puntos - puntos obtenidos por cada respuesta correcta
     */
    public Jugador(String idJugador, String nombreJugador, Integer puntos) {
        this.idJugador = idJugador;
        this.nombreJugador = nombreJugador;
        Puntos = puntos;
    }
    public Jugador(){

    }

    /**
     * autor jhosep11
     * metodo que permite obtener el nombre del Jugador
     * @return nombreJugador
     */
    public String getNombreJugador() {
        return nombreJugador;
    }




    /**
     * autor jhosep11
     * metodo que permite obtener el valor de los puntos del jugador
     * @return puntos
     */
    public Integer getPuntos() {
        return Puntos;
    }

    /**
     * autor jhosep11
     * metodo que permite actualizar el valor de los puntos del jugador
     * @param puntos son los puntos del jugador
     */
    public void setPuntos(Integer puntos) {
        Puntos = puntos;
    }

    /**
     * autor jhosep11

     * el metodo crearJugador se encarga de recibir por consola el nombre del jugador; este metodo recibe
     * como parametro el idJugador.
     * @param idJugador es el id del jugador
     * @return idJugador, nombreJugador y los puntos en cero
     */
    public Jugador CrearJugador(String idJugador){
        Scanner entradaConsola = new Scanner(System.in);
        escribirEnConsola.info("Ingrese su nombre: ");
        String nombreJugador = entradaConsola.nextLine();

        return new Jugador(idJugador,nombreJugador,0);

    }
    
}
