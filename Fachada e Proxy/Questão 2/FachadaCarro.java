
public class FachadaCarro {
    Motor motor;
    CintoDeSeguranca cintoDeSeguranca;
    Porta porta;
    Farol farol;
    Radio radio;

    public FachadaCarro(Motor motor, CintoDeSeguranca cintoDeSeguranca, Porta porta, Farol farol, Radio radio){
        this.motor = motor;
        this.cintoDeSeguranca = cintoDeSeguranca;
        this.porta = porta;
        this.farol = farol;
        this.radio = radio;
    }

    public void dirigir(){
        motor.ligar();
        porta.trancarPorta();
        cintoDeSeguranca.travarSinto();
        farol.ligar();
        radio.ligar();
        radio.sintonizar();
        System.out.println("Dirigindo...");
    }
    public void finalizar(){
        System.out.println("Fim da corrida...");
        motor.desligar();
        porta.abrirPorta();
        cintoDeSeguranca.destravarSinto();
        farol.desligar();
        radio.desligar();
    }
}
