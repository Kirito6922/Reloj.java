
package ico.fes.poo;


public class Reloj {
    
    private int hora;
    private int minuto;
    private int segundo;
    private boolean contador=true;
 
// CONSTRUCTOR     
    public Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

// **INICIA** GETTER AND SETTER    
    
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
    
    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
    
    public int getSegundo(){
        return segundo;
    }
    
    public void setSegundo(){
        this.segundo = segundo;
    }
    
// **TERMINA** GETTER AND SETTER 
    

// METODO mostrarHora NOS SIRVE PARA MOSTRAR LA HORA Y EMPEZAR CON EL PROCESO DE INCREMENTO AL RELOJ   
    public void mostrarhora(){
        
        while(contador=true){
            
            
        // **INICIA**  MERA ESTETICA DEL PROGRAMA
        
            if(hora<10){ // Si la hora es menor a 10 entonces agregaremos un 0 antes de imprimir hora

                System.out.print("0");

            }       
            System.out.print(this.hora + ":"); // Imprime el valor de hora


            if(minuto<10){ // Mismo caso que con la hora pero ahora con los minutos

                System.out.print("0");

            }        
            System.out.print(this.minuto + ":");


            if(segundo<10){ // Mismo caso que con la hora y los minutos, ahora con los segundos

                System.out.print("0");

            }
            System.out.println(this.segundo);
            
        // **TERMINA** MERA ESTETICA DEL PROGRAMA
            
            incrementarSegundo(); // Llamamos al metodo() para empezar con todo el proceso de nuestro reloj 
            
            try { 
                Thread.sleep(1000);
               }
            catch(InterruptedException e) {
            }
            /*
            Try=Tratar, catch=atrapar,

            Básicamente en el segmento de código dentro del try estará el proceso que tratara de seguir tu programa
            y en caso de que en este ocurra un error, excepción o falla por algún motivo, entonces catch 
            atrapa dicho error o Excepcion en la variable e
            (e es solo el nombre de variable no es obligatorio llamarla siempre así pero si se aconseja).
            */
        }
        
    }
    
    
// METODO incrementarSegundo (LITERAL SIRVE PARA INCREMENTAR LOS SEGUNDOS)    
    public void incrementarSegundo(){
    
        segundo++;
        if(segundo>59){ // Si segundo es mayor a 59 regresa a 0 y llamamos al metodo incrementarMinuto
            segundo=0;
            incrementarMinuto(); // Llamamos al metodo para incrementar los minutos        
        }
    
    }
    
// METODO incrementarMinuto (LITERAL x2)    
    public void incrementarMinuto(){
    
        minuto++;
        if(minuto>59){ // Si minuto es mayor a 59 regresa a 0 y llamamos al metodo incrementarHora
            minuto=0;
            incrementarHora(); // Llamamos al metodo para incrementar la hora
        }
    
    }
    
// METODO incrementarHora (LITERAL x3)
    public void incrementarHora(){
        
        hora++;
        if(hora>23){ // Si la hora es mayor a 23 (Tomando en cuenta reloj de 24hrs) entonces llamaremos a la clase reset
            reset();
        }
        
    }
    
// METODO reset SIRVE PARA REINICIAR HORA    
    public void reset(){
        
        segundo=0;
        minuto=0;
        hora=1;
        
    }
    
    

    
    
    
}
