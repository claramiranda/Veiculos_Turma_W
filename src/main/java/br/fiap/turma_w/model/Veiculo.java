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


    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0;
    }

    /**
     * Método para atualizar o atributo de velocidadeAtual de um veículo. Não aceita valores negativos.
     * @param incremento velocidade em KMs a ser incrementada
     */
    public void acelerar(int incremento){
        //TODO implementar testes unitários para método acelerar

            if(incremento > 0) {
                if (velocidadeAtual + incremento > velocidadeMaxima){
                    System.out.println("[Erro] Incremento ultrapassa velocidade máxima aceita pelo Veículo.");
                }
                else{
                    velocidadeAtual += incremento;
                    System.out.println("[ACELERAR] Velocidade aumentou em " + incremento + " km.");
                }
            }
            //Se o incremento for menor ou igual a zero
            else {
                System.out.println("[ERRO] Não é possivel utilizar valor nulo ou negativo para acelerar o veículo.");
            }
    }

    /**
     * Método para reduzir a velocidade de um veículo. Não aceita parametros nulos ou negativos.
     * @param decremento velocidade em KMs a ser decrementada
     */
    public void reduzirVelocidade(int decremento){
    //TODO Implementar testes unitários no método reduzirVelocidade
        if (decremento > 0 && (velocidadeAtual - decremento >= 0)){
            velocidadeAtual -= decremento;
            System.out.println("[REDUZIR] Velocidade do veículo reduziu em "
                    + decremento + " km. Velocidade atual: " + this.velocidadeAtual);
        }
        else {
            System.out.println("[ERRO] Valor inválido. Decremento: " + decremento
                    + " velocidadeAtual: " + velocidadeAtual);
        }
    }


    /**
     * Método para montar string com status atual de um veículo
     * @return String com o status em texto
     */
    public String obterStatus(){
        String str;

        str = "Modelo: " + modelo + "\nMarca: " + marca +
                "\nAno: " + ano + "\nVelocidade Máxima: "
                + velocidadeMaxima + "\nVelocidade Atual: " + velocidadeAtual;

        return str;
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
