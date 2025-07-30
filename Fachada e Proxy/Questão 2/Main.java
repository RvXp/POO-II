public class Main {
    public static void main(String[] args) {
        
    Motor motor = new Motor();
    CintoDeSeguranca cintoDeSeguranca = new CintoDeSeguranca();
    Porta porta = new Porta();
    Farol farol = new Farol();
    Radio radio = new Radio();

    FachadaCarro carro = new FachadaCarro(motor, cintoDeSeguranca, porta, farol, radio);
    
    carro.dirigir();
    carro.finalizar();
    
    }
}
