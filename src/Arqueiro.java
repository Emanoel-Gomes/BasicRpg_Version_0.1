import java.util.Random;

public class Arqueiro extends Heroi{

    public Arqueiro(String nome, float hp, int maxhp, int ataque, int ataqueMagico, int defesaFisica, int defesaMagica, boolean vivo, int nivel, int pontos, float maxExp, float exp, float critico){
        this.nome = nome;
        this.hp = hp;
        this.maxHp = maxhp;
        this.ataque = ataque;
        this.ataqueMagico = ataqueMagico;
        this.defesaFisica = defesaFisica;
        this.defesaMagica = defesaMagica;
        this.vivo = vivo;
        this.nivel = nivel;
        this.pontos = pontos;
        this.maxExp = maxExp;
        this.exp = exp;
        this.critico = critico;
    }

    public void DisparoTriplo(Arqueiro arqueiro,Arco arco, Monstro monstro){ //Disparo com 10% de erro e 10% de critico
        System.out.println("===== "+arqueiro.getNome()+" ===== DISPARO TRIPLO ===== "+monstro.getNome()+" =====");
        float antes = monstro.getHp();
        float totalCtr = ((arqueiro.getCritico() *100) + (arqueiro.getCritico() * 100));
        for (int i=0; i<3; i++){
            Random tipoAtaque = new Random();
            int tipo = tipoAtaque.nextInt(2)+1;
            switch (tipo) {
                case 1:
                Random ataqueF = new Random();
                int valorF = ataqueF.nextInt(100);
                int danoF = ((arqueiro.getAtaque() + arqueiro.getAtaqueMagico() * 7) + arco.getAtk() + arco.getAtkm()) - monstro.getDefesaFisica(); 
                float hpFinalF= monstro.getHp() - danoF;
                if (valorF >= 0 && valorF <= totalCtr){ // Critico
                    danoF*=2;
                    float hpFinalCF= monstro.getHp() - danoF;
                    while (arqueiro.isVivo() == true){
        
                        if(danoF >= monstro.getHp() && monstro.isVivo() == true){
                            System.out.println("monstro "+monstro.getNome()+" recebeu "+danoF+" de dano critico fisico e morreu");
                            monstro.setVivo(false);
                            monstro.setHp(0);
                            this.GanharExp(arqueiro, monstro);
                            break;
                        }
                        
                        else if (danoF <=0){
                            System.out.println("monstro "+monstro.getNome()+" recebeu "+1+" de dano critico fisico.");
                            monstro.setHp(monstro.getHp() - 1); 
                            break;
                        }
            
                        else if (danoF < monstro.getHp() && monstro.isVivo() == true){
                            System.out.println("monstro "+monstro.getNome()+" recebeu "+danoF+" de dano critico fisico");
                            monstro.setHp(hpFinalCF); 
                            break;   
                        }
                        
                        else{
                            System.out.println("impossível atacar, o monstro "+monstro.getNome()+" esta morto.");
                            break;
                        }
                    } 
                }
        
                else if (valorF>=totalCtr+1 && valorF<=90){ // Normal
                    while (arqueiro.isVivo() == true){
        
                        if(danoF >= monstro.getHp() && monstro.isVivo() == true){
                            System.out.println("monstro "+monstro.getNome()+" recebeu "+danoF+" de dano fisico e morreu");
                            monstro.setVivo(false);
                            monstro.setHp(0);
                            this.GanharExp(arqueiro, monstro);
                            break;
                        }
                        
                        else if (danoF <=0){
                            System.out.println("monstro "+monstro.getNome()+" recebeu "+1+" de dano fisico.");
                            monstro.setHp(monstro.getHp() - 1); 
                            break;
                        }
            
                        else if (danoF < monstro.getHp() && monstro.isVivo() == true){
                            System.out.println("monstro "+monstro.getNome()+" recebeu "+danoF+" de dano fisico");
                            monstro.setHp(hpFinalF); 
                            break;   
                        }
                        
                        else{
                            System.out.println("impossível atacar, o monstro "+monstro.getNome()+" esta morto.");
                            break;
                        }
                    } 
                }
                else{
                    System.out.println("Heroi "+this.getNome()+" errou o ataque.");
                }
                break;
            
                case 2:
                Random ataqueM = new Random();
                int valorM = ataqueM.nextInt(100);
                int danoM = ((arqueiro.getAtaque() + arqueiro.getAtaqueMagico() * 7) + arco.getAtk() + arco.getAtkm()) - monstro.getDefesaMagica();
                float hpFinalM= monstro.getHp() - danoM;
                if (valorM >= 0 && valorM <= totalCtr){ // Critico
                    danoM*=2;
                    float hpFinalCM= monstro.getHp() - danoM;
                    while (arqueiro.isVivo() == true){
        
                        if(danoM >= monstro.getHp() && monstro.isVivo() == true){
                            System.out.println("monstro "+monstro.getNome()+" recebeu "+danoM+" de dano critico magico e morreu");
                            monstro.setVivo(false);
                            monstro.setHp(0);
                            this.GanharExp(arqueiro, monstro);
                            break;
                        }
                        
                        else if (danoM <=0){
                            System.out.println("monstro "+monstro.getNome()+" recebeu "+1+" de dano critico magico.");
                            monstro.setHp(monstro.getHp() - 1); 
                            break;
                        }
            
                        else if (danoM < monstro.getHp() && monstro.isVivo() == true){
                            System.out.println("monstro "+monstro.getNome()+" recebeu "+danoM+" de dano critico magico");
                            monstro.setHp(hpFinalCM); 
                            break;   
                        }
                        
                        else{
                            System.out.println("impossível atacar, o monstro "+monstro.getNome()+" esta morto.");
                            break;
                        }
                    } 
                }
        
                else if (valorM>=totalCtr+1 && valorM<=90){ // Normal
                    while (arqueiro.isVivo() == true){
        
                        if(danoM >= monstro.getHp() && monstro.isVivo() == true){
                            System.out.println("monstro "+monstro.getNome()+" recebeu "+danoM+" de dano magico e morreu");
                            monstro.setVivo(false);
                            monstro.setHp(0);
                            this.GanharExp(arqueiro, monstro);
                            break;
                        }
                        
                        else if (danoM <=0){
                            System.out.println("monstro "+monstro.getNome()+" recebeu "+1+" de dano magico.");
                            monstro.setHp(monstro.getHp() - 1); 
                            break;
                        }
            
                        else if (danoM < monstro.getHp() && monstro.isVivo() == true){
                            System.out.println("monstro "+monstro.getNome()+" recebeu "+danoM+" de dano magico");
                            monstro.setHp(hpFinalM); 
                            break;   
                        }
                        
                        else{
                            System.out.println("impossível atacar, o monstro "+monstro.getNome()+" esta morto.");
                            break;
                        }
                    } 
                }
                else{
                    System.out.println("Heroi "+this.getNome()+" errou o ataque.");
                }
            }
        }
        System.out.println("HP "+monstro.getNome()+": "+antes+" -> "+monstro.getHp());
        System.out.println("=================================================");
        System.out.println("");
    }
    
    public void Sniper(Arqueiro arqueiro,Arco arco, Monstro monstro){ //Disparo com 10% de erro e 10% de critico
        System.out.println("===== "+arqueiro.getNome()+" ===== SNIPER ===== "+monstro.getNome()+" =====");
        float antes = monstro.getHp();
        float totalCtr = ((arqueiro.getCritico() *100) + (arqueiro.getCritico() * 100));
        Random tipoAtaque = new Random();
        int tipo = tipoAtaque.nextInt(2)+1;
        switch (tipo) {
            case 1:
            Random ataqueF = new Random();
            int valorF = ataqueF.nextInt(100);
            int danoF = ((arqueiro.getAtaque() + arqueiro.getAtaqueMagico() * 7) + arco.getAtk() + arco.getAtkm()) - monstro.getDefesaFisica(); 
            float hpFinalF= monstro.getHp() - danoF;
            if (valorF >= 0 && valorF <= totalCtr){ // Critico
                danoF*=2;
                float hpFinalCF= monstro.getHp() - danoF;
                while (arqueiro.isVivo() == true){
    
                    if(danoF >= monstro.getHp() && monstro.isVivo() == true){
                        System.out.println("monstro "+monstro.getNome()+" recebeu "+danoF+" de dano critico fisico e morreu");
                        monstro.setVivo(false);
                        monstro.setHp(0);
                        this.GanharExp(arqueiro, monstro);
                        break;
                    }
                    
                    else if (danoF <=0){
                        System.out.println("monstro "+monstro.getNome()+" recebeu "+1+" de dano critico fisico.");
                        monstro.setHp(monstro.getHp() - 1); 
                        break;
                    }
        
                    else if (danoF < monstro.getHp() && monstro.isVivo() == true){
                        System.out.println("monstro "+monstro.getNome()+" recebeu "+danoF+" de dano critico fisico");
                        monstro.setHp(hpFinalCF); 
                        break;   
                    }
                    
                    else{
                        System.out.println("impossível atacar, o monstro "+monstro.getNome()+" esta morto.");
                        break;
                    }
                } 
            }
    
            else if (valorF>=totalCtr+1 && valorF<=90){ // Normal
                while (arqueiro.isVivo() == true){
    
                    if(danoF >= monstro.getHp() && monstro.isVivo() == true){
                        System.out.println("monstro "+monstro.getNome()+" recebeu "+danoF+" de dano fisico e morreu");
                        monstro.setVivo(false);
                        monstro.setHp(0);
                        this.GanharExp(arqueiro, monstro);
                        break;
                    }
                    
                    else if (danoF <=0){
                        System.out.println("monstro "+monstro.getNome()+" recebeu "+1+" de dano fisico.");
                        monstro.setHp(monstro.getHp() - 1); 
                        break;
                    }
        
                    else if (danoF < monstro.getHp() && monstro.isVivo() == true){
                        System.out.println("monstro "+monstro.getNome()+" recebeu "+danoF+" de dano fisico");
                        monstro.setHp(hpFinalF); 
                        break;   
                    }
                    
                    else{
                        System.out.println("impossível atacar, o monstro "+monstro.getNome()+" esta morto.");
                        break;
                    }
                } 
            }
            else{
                System.out.println("Heroi "+this.getNome()+" errou o ataque.");
            }
            break;
        
            case 2:
            Random ataqueM = new Random();
            int valorM = ataqueM.nextInt(100);
            int danoM = ((arqueiro.getAtaque() + arqueiro.getAtaqueMagico() * 7) + arco.getAtk() + arco.getAtkm()) - monstro.getDefesaMagica();
            float hpFinalM= monstro.getHp() - danoM;
            if (valorM >= 0 && valorM <= totalCtr){ // Critico
                danoM*=2;
                float hpFinalCM= monstro.getHp() - danoM;
                while (arqueiro.isVivo() == true){
    
                    if(danoM >= monstro.getHp() && monstro.isVivo() == true){
                        System.out.println("monstro "+monstro.getNome()+" recebeu "+danoM+" de dano critico magico e morreu");
                        monstro.setVivo(false);
                        monstro.setHp(0);
                        this.GanharExp(arqueiro, monstro);
                        break;
                    }
                    
                    else if (danoM <=0){
                        System.out.println("monstro "+monstro.getNome()+" recebeu "+1+" de dano critico magico.");
                        monstro.setHp(monstro.getHp() - 1); 
                        break;
                    }
        
                    else if (danoM < monstro.getHp() && monstro.isVivo() == true){
                        System.out.println("monstro "+monstro.getNome()+" recebeu "+danoM+" de dano critico magico");
                        monstro.setHp(hpFinalCM); 
                        break;   
                    }
                    
                    else{
                        System.out.println("impossível atacar, o monstro "+monstro.getNome()+" esta morto.");
                        break;
                    }
                } 
            }
    
            else if (valorM>=totalCtr+1 && valorM<=90){ // Normal
                while (arqueiro.isVivo() == true){
    
                    if(danoM >= monstro.getHp() && monstro.isVivo() == true){
                        System.out.println("monstro "+monstro.getNome()+" recebeu "+danoM+" de dano magico e morreu");
                        monstro.setVivo(false);
                        monstro.setHp(0);
                        this.GanharExp(arqueiro, monstro);
                        break;
                    }
                    
                    else if (danoM <=0){
                        System.out.println("monstro "+monstro.getNome()+" recebeu "+1+" de dano magico.");
                        monstro.setHp(monstro.getHp() - 1); 
                        break;
                    }
        
                    else if (danoM < monstro.getHp() && monstro.isVivo() == true){
                        System.out.println("monstro "+monstro.getNome()+" recebeu "+danoM+" de dano magico");
                        monstro.setHp(hpFinalM); 
                        break;   
                    }
                    
                    else{
                        System.out.println("impossível atacar, o monstro "+monstro.getNome()+" esta morto.");
                        break;
                    }
                } 
            }
            else{
                System.out.println("Heroi "+this.getNome()+" errou o ataque.");
            }
        }
        System.out.println("HP "+monstro.getNome()+": "+antes+" -> "+monstro.getHp());
        System.out.println("=================================================");
        System.out.println("");
    }  

    public void TiroMortal(Arqueiro arqueiro,Arco arco, Monstro monstro){ //Disparo com 10% de erro e 10% de critico
        System.out.println("===== "+arqueiro.getNome()+" ===== TIRO MORTAL ===== "+monstro.getNome()+" =====");
        float antes = monstro.getHp();
        float totalCtr = ((arqueiro.getCritico() *100) + (arqueiro.getCritico() * 100));
        Random tipoAtaque = new Random();
        int tipo = tipoAtaque.nextInt(2)+1;
        switch (tipo) {
            case 1:
            Random ataqueF = new Random();
            int valorF = ataqueF.nextInt(100);
            int danoF = ((arqueiro.getAtaque() + arqueiro.getAtaqueMagico() * 8) + arco.getAtk() + arco.getAtkm()) - monstro.getDefesaFisica(); 
            float hpFinalF= monstro.getHp() - danoF;
            if (valorF >= 0 && valorF <= totalCtr){ // Critico
                danoF*=2;
                float hpFinalCF= monstro.getHp() - danoF;
                while (arqueiro.isVivo() == true){
    
                    if(danoF >= monstro.getHp() && monstro.isVivo() == true){
                        System.out.println("monstro "+monstro.getNome()+" recebeu "+danoF+" de dano critico fisico e morreu");
                        monstro.setVivo(false);
                        monstro.setHp(0);
                        this.GanharExp(arqueiro, monstro);
                        break;
                    }
                    
                    else if (danoF <=0){
                        System.out.println("monstro "+monstro.getNome()+" recebeu "+1+" de dano critico fisico.");
                        monstro.setHp(monstro.getHp() - 1); 
                        break;
                    }
        
                    else if (danoF < monstro.getHp() && monstro.isVivo() == true){
                        System.out.println("monstro "+monstro.getNome()+" recebeu "+danoF+" de dano critico fisico");
                        monstro.setHp(hpFinalCF); 
                        break;   
                    }
                    
                    else{
                        System.out.println("impossível atacar, o monstro "+monstro.getNome()+" esta morto.");
                        break;
                    }
                } 
            }
    
            else if (valorF>=totalCtr+1 && valorF<=90){ // Normal
                while (arqueiro.isVivo() == true){
    
                    if(danoF >= monstro.getHp() && monstro.isVivo() == true){
                        System.out.println("monstro "+monstro.getNome()+" recebeu "+danoF+" de dano fisico e morreu");
                        monstro.setVivo(false);
                        monstro.setHp(0);
                        this.GanharExp(arqueiro, monstro);
                        break;
                    }
                    
                    else if (danoF <=0){
                        System.out.println("monstro "+monstro.getNome()+" recebeu "+1+" de dano fisico.");
                        monstro.setHp(monstro.getHp() - 1); 
                        break;
                    }
        
                    else if (danoF < monstro.getHp() && monstro.isVivo() == true){
                        System.out.println("monstro "+monstro.getNome()+" recebeu "+danoF+" de dano fisico");
                        monstro.setHp(hpFinalF); 
                        break;   
                    }
                    
                    else{
                        System.out.println("impossível atacar, o monstro "+monstro.getNome()+" esta morto.");
                        break;
                    }
                } 
            }
            else{
                System.out.println("Heroi "+this.getNome()+" errou o ataque.");
            }
            break;
        
            case 2:
            Random ataqueM = new Random();
            int valorM = ataqueM.nextInt(100);
            int danoM = ((arqueiro.getAtaque() + arqueiro.getAtaqueMagico() * 7) + arco.getAtk() + arco.getAtkm()) - monstro.getDefesaMagica();
            float hpFinalM= monstro.getHp() - danoM;
            if (valorM >= 0 && valorM <= totalCtr){ // Critico
                danoM*=2;
                float hpFinalCM= monstro.getHp() - danoM;
                while (arqueiro.isVivo() == true){
    
                    if(danoM >= monstro.getHp() && monstro.isVivo() == true){
                        System.out.println("monstro "+monstro.getNome()+" recebeu "+danoM+" de dano critico magico e morreu");
                        monstro.setVivo(false);
                        monstro.setHp(0);
                        this.GanharExp(arqueiro, monstro);
                        break;
                    }
                    
                    else if (danoM <=0){
                        System.out.println("monstro "+monstro.getNome()+" recebeu "+1+" de dano critico magico.");
                        monstro.setHp(monstro.getHp() - 1); 
                        break;
                    }
        
                    else if (danoM < monstro.getHp() && monstro.isVivo() == true){
                        System.out.println("monstro "+monstro.getNome()+" recebeu "+danoM+" de dano critico magico");
                        monstro.setHp(hpFinalCM); 
                        break;   
                    }
                    
                    else{
                        System.out.println("impossível atacar, o monstro "+monstro.getNome()+" esta morto.");
                        break;
                    }
                } 
            }
    
            else if (valorM>=totalCtr+1 && valorM<=90){ // Normal
                while (arqueiro.isVivo() == true){
    
                    if(danoM >= monstro.getHp() && monstro.isVivo() == true){
                        System.out.println("monstro "+monstro.getNome()+" recebeu "+danoM+" de dano magico e morreu");
                        monstro.setVivo(false);
                        monstro.setHp(0);
                        this.GanharExp(arqueiro, monstro);
                        break;
                    }
                    
                    else if (danoM <=0){
                        System.out.println("monstro "+monstro.getNome()+" recebeu "+1+" de dano magico.");
                        monstro.setHp(monstro.getHp() - 1); 
                        break;
                    }
        
                    else if (danoM < monstro.getHp() && monstro.isVivo() == true){
                        System.out.println("monstro "+monstro.getNome()+" recebeu "+danoM+" de dano magico");
                        monstro.setHp(hpFinalM); 
                        break;   
                    }
                    
                    else{
                        System.out.println("impossível atacar, o monstro "+monstro.getNome()+" esta morto.");
                        break;
                    }
                } 
            }
            else{
                System.out.println("Heroi "+this.getNome()+" errou o ataque.");
            }
        }
        System.out.println("HP "+monstro.getNome()+": "+antes+" -> "+monstro.getHp());
        System.out.println("=================================================");
        System.out.println("");
    }
}
