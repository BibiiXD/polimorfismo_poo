
public class Principal {
    public static void main(String[] args) {
        Figura figura1 = new Circulo("Vermelho", 5);
        Figura figura2 = new Retangulo("Roxo",3,4);
        System.out.println("A área do Círculo é: "+ figura1.area()+" "+ figura1.cor);
        System.out.println("A área do Retângulo é: "+ figura2.area()+" " + figura2.cor);
        }
    }

