public class Monstro extends Boneco {
    protected int dificuldade;
    
    public Monstro(String nome, float hp, int maxhp, int ataque, int ataqueMagico, int defesaFisica, int defesaMagica, boolean vivo, int dificuldade){
        this.nome = nome;
        this.hp = hp;
        this.maxHp = maxhp;
        this.ataque = ataque;
        this.ataqueMagico = ataqueMagico;
        this.defesaFisica = defesaFisica;
        this.defesaMagica = defesaMagica;
        this.vivo = vivo;
        this.dificuldade = dificuldade;
    }
    
     public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }

    public void Status(){
        System.out.println("============ Status Monstro =============");
        System.out.println("Nome: "+this.getNome());
        System.out.println("Vivo: "+this.isVivo());
        System.out.println("Ataque: "+this.getAtaque());
        System.out.println("Ataque Magico: "+this.getAtaqueMagico());
        System.out.println("Hp: "+this.getHp());
        System.out.println("=================================");
        
    }

    public void AtaqueBasico(Monstro monstro,Heroi heroi){
        System.out.println(this.getNome()+" esta atacando o heroi "+heroi.getNome()+" com "+" ataque basico.");
        int dano = monstro.getAtaque(); 
        float hpFinal= heroi.getHp() - dano;
        if (monstro.isVivo() == false){
            System.out.println("impossível atacar, o monstro "+monstro.getNome()+" esta morto.");
        }
        while (monstro.isVivo() == true){

            if(dano >= heroi.getHp() && heroi.isVivo() == true){
                System.out.println("heroi "+heroi.getNome()+" recebeu "+dano+" de dano e morreu");
                heroi.setVivo(false);
                heroi.setHp(0);
                break;
            }

            else if (dano <=0){
                System.out.println("heroi "+heroi.getNome()+" recebeu "+1+" de dano.");
                float antes = heroi.getHp();
                heroi.setHp(heroi.getHp() - 1);
                System.out.println("HP "+heroi.getNome()+": "+antes+" -> "+heroi.getHp()); 
                break;
            }
            
            else if (dano < heroi.getHp() && heroi.isVivo() == true){
                System.out.println("heroi "+heroi.getNome()+" recebeu "+dano+" de dano");
                float antes = heroi.getHp();
                heroi.setHp(hpFinal);
                System.out.println("HP "+heroi.getNome()+": "+antes+" -> "+heroi.getHp()); 
                break; 
            }
            
            else{
                System.out.println("impossível atacar, o heroi "+heroi.getNome()+" esta morto.");
                break;
            }
        } 
    }

    public void Arranhar(Monstro monstro, Heroi heroi){
        System.out.println(this.getNome()+" esta atacando o heroi "+heroi.getNome()+" com "+" 'Arranhar'.");
        //criar um numero aleatório entre 1,10 e usar o switch para escolher valores para chance de erro, ataque normal e crítico.
        int dano = monstro.getAtaque() * 3; 
        float hpFinal= heroi.getHp() - dano;
        if (monstro.isVivo() == false){
            System.out.println("impossível atacar, o monstro "+monstro.getNome()+" esta morto.");
        }
        while (monstro.isVivo() == true){

            if(dano >= heroi.getHp() && heroi.isVivo() == true){
                System.out.println("heroi "+heroi.getNome()+" recebeu "+dano+" de dano e morreu");
                heroi.setVivo(false);
                heroi.setHp(0);
                heroi.Status();
                break;
            }

            else if (dano <=0){
                System.out.println("heroi "+heroi.getNome()+" recebeu "+1+" de dano.");
                float antes = heroi.getHp();
                heroi.setHp(heroi.getHp() - 1);
                System.out.println("HP "+heroi.getNome()+": "+antes+" -> "+heroi.getHp()); 
                break;
            }
            
            else if (dano < heroi.getHp() && heroi.isVivo() == true){
                System.out.println("heroi "+heroi.getNome()+" recebeu "+dano+" de dano");
                float antes = heroi.getHp();
                heroi.setHp(hpFinal);
                System.out.println("HP "+heroi.getNome()+": "+antes+" -> "+heroi.getHp()); 
                break; 
            }
            
            else{
                System.out.println("impossível atacar, o heroi "+heroi.getNome()+" esta morto.");
                break;
            }
        } 
    }

    public void Morder(Monstro monstro, Heroi heroi){
        System.out.println(this.getNome()+" esta atacando o heroi "+heroi.getNome()+" com "+" 'Morder'.");
        //criar um numero aleatório entre 1,10 e usar o switch para escolher valores para chance de erro, ataque normal e crítico.
        int dano = monstro.getAtaque() * 5; 
        float hpFinal= heroi.getHp() - dano;
        if (monstro.isVivo() == false){
            System.out.println("impossível atacar, o monstro "+monstro.getNome()+" esta morto.");
        }
        while (monstro.isVivo() == true){

            if(dano >= heroi.getHp() && heroi.isVivo() == true){
                System.out.println("heroi "+heroi.getNome()+" recebeu "+dano+" de dano e morreu");
                heroi.setVivo(false);
                heroi.setHp(0);
                heroi.Status();
                break;
            }

            else if (dano <=0){
                System.out.println("heroi "+heroi.getNome()+" recebeu "+1+" de dano.");
                float antes = heroi.getHp();
                heroi.setHp(heroi.getHp() - 1);
                System.out.println("HP "+heroi.getNome()+": "+antes+" -> "+heroi.getHp()); 
                break;
            }
            
            else if (dano < heroi.getHp() && heroi.isVivo() == true){
                System.out.println("heroi "+heroi.getNome()+" recebeu "+dano+" de dano");
                float antes = heroi.getHp();
                heroi.setHp(hpFinal);
                System.out.println("HP "+heroi.getNome()+": "+antes+" -> "+heroi.getHp()); 
                break; 
            }
            
            else{
                System.out.println("impossível atacar, o heroi "+heroi.getNome()+" esta morto.");
                break;
            }
        } 
    }

    public void Intimidar(Monstro monstro, Heroi heroi){
        System.out.println(this.getNome()+" esta atacando o heroi "+heroi.getNome()+" com "+" 'Intimidar'.");
        //criar um numero aleatório entre 1,10 e usar o switch para escolher valores para chance de erro, ataque normal e crítico.
        int dano = monstro.getAtaque() * 2; 
        float hpFinal= heroi.getHp() - dano;
        if (monstro.isVivo() == false){
            System.out.println("impossível atacar, o monstro "+monstro.getNome()+" esta morto.");
        }
        while (monstro.isVivo() == true){

            if(dano >= heroi.getHp() && heroi.isVivo() == true){
                System.out.println("heroi "+heroi.getNome()+" recebeu "+dano+" de dano e morreu");
                heroi.setVivo(false);
                heroi.setHp(0);
                heroi.Status();
                break;
            }

            else if (dano <=0){
                System.out.println("heroi "+heroi.getNome()+" recebeu "+1+" de dano.");
                float antes = heroi.getHp();
                heroi.setHp(heroi.getHp() - 1);
                System.out.println("HP "+heroi.getNome()+": "+antes+" -> "+heroi.getHp()); 
                break;
            }
            
            else if (dano < heroi.getHp() && heroi.isVivo() == true){
                System.out.println("heroi "+heroi.getNome()+" recebeu "+dano+" de dano");
                float antes = heroi.getHp();
                heroi.setHp(hpFinal);
                System.out.println("HP "+heroi.getNome()+": "+antes+" -> "+heroi.getHp()); 
                break; 
            }
            
            else{
                System.out.println("impossível atacar, o heroi "+heroi.getNome()+" esta morto.");
                break;
            }
        } 
    }
}
