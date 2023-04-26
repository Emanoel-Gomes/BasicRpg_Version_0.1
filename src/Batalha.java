// import java.util.ArrayList;
// import java.util.List;
import java.util.Random;

public class Batalha {


        public void Valor(Heroi heroi, Armas arma){
        float totalCtr = ((heroi.getCritico() *100) + (arma.getCritico() * 100));
        Random ataqueM = new Random();
        int valorM = ataqueM.nextInt(100);
        System.out.println(valorM);
        System.out.println("total CTR: "+totalCtr);
        if (valorM >= 0 && valorM <= totalCtr){
            System.out.println("critico");
        }
        else{
            System.out.println("normal");
        }
    }
}
