public class Televisao {
        boolean ligada;
        int canal;
        int volume;

        void ligar(){
            ligada = true;
            System.out.println("Ligada!");
        }
        void sintonizar(int novoCanal){
            canal = novoCanal;
        }

        int consultarCanal(){
            return canal;
        }
}
