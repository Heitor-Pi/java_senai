public class Carro {
    private String modelo;
    private int velocidade;

    public int acelerar (int velocidade){
        if (velocidade >= 100){
            System.out.println("Catchau");
            System.out.println("Seu carro é rapido");
        } else{
            System.out.println("carro é lento");
        }
        return velocidade;
    }

    public void acelerar(){
        System.out.println("Catchau");
        System.out.println("Seu carro é rapido");
    }

    public Carro() {
    }

    public Carro(String modelo, int velocidade) {
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", velocidade=" + velocidade +
                '}';
    }

}
