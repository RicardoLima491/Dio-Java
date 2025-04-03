public class SmartTv { //implementa classe SmartTv
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    public void ligar(){ // metodo ligar
        ligada = true;
    }

    public void desligar(){ // metodo desligar
        ligada = false;
    }

    public void aumentarVolume(){ // metodos de controle de volume
        volume ++;
    }

    public void diminuirVolume(){
        volume --;
    }
    public void aumentarCanal(){ // metodos de controle de canais
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
    public void mudarCanal(int novoCanal){ // metodo para mudar para um canal especifico 
        canal = novoCanal;
        
    }
    

}




