package br.fiap.turma_w.model;

/**
 * Superclasse que implementa a abstração de um veículo
 *
 */
public class Veiculo {

    private String marca;
    private String modelo;
    private int ano;
    private int velocidadeMaxima;
    private int velocidadeAtual;


    //Metodos da Classe

    public void acelerar(int incremento){
        //TODO implementar método de aceleração
        //verificar se o incremento vai superar a velocidade máxima
        //atualizar velocidadeAtual do veículo
        //notificar usuário da nova velocidade
    }

    public void reduzirVelocidade(int decremento){
    //TODO Implementar redução de Velocidade
        //validar se o valora ser decrementado é menor do que zero
        //decrementar velocidadeAtual
        //Notificar usuário

    }

    public void obterStatus(){
        //TODO implementar método que imprime o estado atual do objeto

    }


    //Getters and Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
}
