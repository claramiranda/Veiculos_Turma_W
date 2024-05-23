import br.fiap.turma_w.model.Moto;
import br.fiap.turma_w.model.Veiculo;

public class Main {

    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Volkswagen", "Fusca", 1995);
        System.out.println(veiculo.obterStatus());

        Moto moto = new Moto("Kawasaki", "Ninja", 2023);
        //moto.empinarMoto();

        moto.acelerar(30);
        //moto.empinarMoto();

        //moto.reduzirVelocidade(10);
        moto.empinarMoto();
        System.out.println(moto.obterStatus());
    }
}
