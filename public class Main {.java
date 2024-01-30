public class Main {
    // Definindo a classe "Carro"
class Carro {
    // Atributos da classe
    private String marca; // Atributo privado para encapsulamento
    private String model;   // Atributo privado para encapsulamento
    private int ano;   // Atributo privado para encapsulamento
    private String cor;   // Atributo privado para encapsulamento
    private float velocidade;   // Atributo privado para encapsulamento
    // Método construtor da classe para inicializar os atributos
    Carro(String marca, String model) {
        this.marca = marca;
        this.model = model;
        this.ano = ano;
        this.cor = cor;
        this.velocidade = velocidade;
    }
    
    // Método getter para obter a marca do carro
    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }
    
    public int getAno() {
        return ano;
    }

    public String getCor(){
        return cor;
    }

    public float getVelocidade() {
        return velocidade;
    }
}

// Classe principal que contém o método main
public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe Pessoa chamado "pessoa1"
        Carro carro1 = new Carro("João", 30);
        
        // Usando os métodos getters para obter e imprimir as informações da pessoa
        System.out.println("Nome: " + pessoa1.getNome()); // Obtém e imprime o nome da pessoa
        System.out.println("Idade: " + pessoa1.getIdade()); // Obtém e imprime a idade da pessoa
    }
}
}
