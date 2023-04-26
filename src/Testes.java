
public class Testes {

    public void Batalha(){
        //Enquanto o heroi ou o monstro não morrer continuar lutando, apos terminar heroi ganha o exp do monstro
    }
    public static void main(String[] args) throws Exception {

        



        // =========================== CLASSES ===============================
        // Arqueiro
        Arqueiro arqueiro1 = new Arqueiro("Usopp", 0, 50, 50, 50, 50, 50, true, 1, 0, 100, 0, 0.1f);
 
    //     //Mago
       Mago mago1 = new Mago("Megumin", 100, 100, 10, 100, 25, 50, true, 1, 0, 100, 0, 0.1f);
       
    //    //Soldado
        Espadachim espadachim1 = new Espadachim("Erza", 100, 100, 100, 10, 50, 25, true, 1, 0, 100, 0, 0.1f);

    //     //Curandeiro
        Clerigo clerigo1 = new Clerigo("Aqua", 100, 100, 10, 40, 80, 80, true, 1, 0, 100, 0, 0);

        // =========================== FIM CLASSES ===============================

        // ============================== ARMAS ==================================
        //Arco
        Arco arco1 = new Arco(10, 10, 0.1f);

        // //Espada
        Espada espada1 = new Espada(20, 0, 0.1f);

        // // Cajado
        Cajado cajado1 = new Cajado(0, 20, 0.1f);

        // // Livro
        Livro livro1 = new Livro(0, 10, 0);

        


        // =========================== MONSTROS ====================================
        //Orc //goblin //serpente
        Monstro slime = new Monstro("Slime", 100, 100, 5, 5, 10, 10, true, 5);

        Monstro aranha = new Monstro("Aranha", 50, 50, 5, 0, 30, 25, true, 1);
        // ========================= FIM Monstro ==================================
        
        
        // ============================= BOSS =====================================
        Boss boss1 = new Boss("Hydra", 2000, 1000, 100, 100, 100, 100, true, 10);

        // ============================= BATALHA ====================================
        

        arqueiro1.DisparoTriplo(arqueiro1, arco1, boss1);
        arqueiro1.Sniper(arqueiro1, arco1, boss1);
        arqueiro1.TiroMortal(arqueiro1, arco1, boss1);

        espadachim1.CorteDuplo(espadachim1, espada1, boss1);
        espadachim1.CorteMortal(espadachim1, espada1, boss1);
        espadachim1.Tremor(espadachim1, espada1, boss1);

        mago1.Meteoro(mago1, cajado1, boss1);
        mago1.Tornado(mago1, cajado1, boss1);
        mago1.Explosao(mago1, cajado1, boss1);

        boss1.Arranhar(boss1, mago1);
        boss1.Morder(boss1, arqueiro1);
        boss1.Executar(boss1, espadachim1);

        clerigo1.Reviver(clerigo1, arqueiro1);
        clerigo1.Reviver(clerigo1, mago1);
        clerigo1.ArcoDaCura(clerigo1, livro1, mago1, espadachim1, arqueiro1);
        clerigo1.Regenerar(clerigo1, livro1, espadachim1);

        espadachim1.CorteDuplo(espadachim1, espada1, boss1);
        mago1.Explosao(mago1, cajado1, boss1);
        espadachim1.CorteMortal(espadachim1, espada1, boss1);
        espadachim1.CorteMortal(espadachim1, espada1, boss1);
        espadachim1.CorteMortal(espadachim1, espada1, boss1);
        espadachim1.CorteDuplo(espadachim1, espada1, boss1);
        espadachim1.CorteDuplo(espadachim1, espada1, boss1);


        arqueiro1.DisparoTriplo(arqueiro1, arco1, slime);
        mago1.Explosao(mago1, cajado1, aranha);



        espadachim1.EscolherAtributo("hrughs", 4);
        espadachim1.EscolherAtributo("atk", 15);

        arqueiro1.EscolherAtributo("def", 5);
        mago1.EscolherAtributo("atkm", 1);


        // =========================== FIM BATALHA =================================
    
    }
}
