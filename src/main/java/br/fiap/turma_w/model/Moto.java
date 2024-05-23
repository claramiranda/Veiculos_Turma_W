package br.fiap.turma_w.model;

public class Moto extends Veiculo {

    private boolean empinando;

    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        setVelocidadeMaxima(120);
        empinando = false;
    }

    public boolean empinarMoto(){
            if ((getVelocidadeAtual() > 20) && (getVelocidadeAtual() < 50)){
                empinando = true;
                System.out.println("[MOTO] Está empinando");
            }
            else {
                if(getVelocidadeAtual() <= 20){
                    System.out.println("[MOTO] Erro: velocidade baixa demais para empinar");
                }
                else {
                    System.out.println("[MOTO] Erro: velocidade alta demais para empinar");
                }
            }
        return this.empinando;
    }

    @Override
    public String obterStatus() {
        String str = "\n[IMPRIMINDO MOTO]\n" + super.obterStatus();
        str += "\nEstá empinando? " + empinando;

        return str;
    }
}
