public class Boss extends Monstro {

    public Boss(String nome, float hp, int maxhp, int ataque, int ataqueMagico, int defesaFisica, int defesaMagica, boolean vivo, int dificuldade){
        super(nome, hp, maxhp, ataque, ataqueMagico, defesaFisica, defesaMagica, vivo, dificuldade);
    }
    public void Executar(Boss boss, Heroi heroi){
        System.out.println(this.getNome()+" esta atacando o heroi "+heroi.getNome()+" com "+" 'Executar'.");
        //criar um numero aleatório entre 1,10 e usar o switch para escolher valores para chance de erro, ataque normal e crítico.
        float dano= heroi.getHp() * 0.6f;
        float hpFinal= heroi.getHp() - dano;
        if (boss.isVivo() == false){
            System.out.println("impossível atacar, o monstro "+boss.getNome()+" esta morto.");
        }else if (heroi.isVivo() == false){
            System.out.println("impossível atacar, o heroi "+heroi.getNome()+" esta morto.");
        }
        else{
            System.out.println("heroi "+heroi.getNome()+" recebeu "+dano+" de dano");
                float antes = heroi.getHp();
                heroi.setHp(hpFinal);
                System.out.println("HP "+heroi.getNome()+": "+antes+" -> "+heroi.getHp()); 
        }
    } 
}

