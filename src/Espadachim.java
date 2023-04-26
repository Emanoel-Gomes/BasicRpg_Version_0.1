import java.util.Random;

public class Espadachim extends Heroi{

    public Espadachim(String nome, float hp, int maxhp, int ataque, int ataqueMagico, int defesaFisica, int defesaMagica, boolean vivo, int nivel, int pontos, float maxExp, float exp, float critico){
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

    public void Tremor(Espadachim espadachim, Espada espada, Monstro monstro){
        System.out.println("===== "+espadachim.getNome()+" ===== TREMOR ===== "+monstro.getNome()+" =====");
        float antes = monstro.getHp();
        float totalCtr = ((espadachim.getCritico() *100) + (espada.getCritico() * 100));
        Random ataqueF = new Random();
        int valorF = ataqueF.nextInt(100);
        int danoF = (espadachim.getAtaque() + espada.getAtk() * 5) - monstro.getDefesaFisica(); 
        float hpFinalM= monstro.getHp() - danoF;
        
        if (valorF >= 0 && valorF <= totalCtr){ // Critico
            danoF*=2;
            float hpFinalCF= monstro.getHp() - danoF;
            while (espadachim.isVivo() == true){

                if(danoF >= monstro.getHp() && monstro.isVivo() == true){
                    System.out.println("monstro "+monstro.getNome()+" recebeu "+danoF+" de dano critico fisico e morreu");
                    monstro.setVivo(false);
                    monstro.setHp(0);
                    this.GanharExp(espadachim, monstro);
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
            while (espadachim.isVivo() == true){

                if(danoF >= monstro.getHp() && monstro.isVivo() == true){
                    System.out.println("monstro "+monstro.getNome()+" recebeu "+danoF+" de dano fisico e morreu");
                    monstro.setVivo(false);
                    monstro.setHp(0);
                    this.GanharExp(espadachim, monstro);
                    break;
                }
                
                else if (danoF <=0){
                    System.out.println("monstro "+monstro.getNome()+" recebeu "+1+" de dano fisico.");
                    monstro.setHp(monstro.getHp() - 1); 
                    break;
                }
    
                else if (danoF < monstro.getHp() && monstro.isVivo() == true){
                    System.out.println("monstro "+monstro.getNome()+" recebeu "+danoF+" de dano fisico");
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
        System.out.println("HP "+monstro.getNome()+": "+antes+" -> "+monstro.getHp());
        System.out.println("=================================================");
        System.out.println("");
    }

    public void CorteDuplo(Espadachim espadachim, Espada espada, Monstro monstro){
        System.out.println("===== "+espadachim.getNome()+" ===== CORTE DUPLO ===== "+monstro.getNome()+" =====");
        float antes = monstro.getHp();
        float totalCtr = ((espadachim.getCritico() *100) + (espada.getCritico() * 100));
        Random ataqueF = new Random();
        int valorF = ataqueF.nextInt(100);
        int danoF = (espadachim.getAtaque() + espada.getAtk() * 3) - monstro.getDefesaFisica(); 
        float hpFinalM= monstro.getHp() - danoF;
        for (int i=0; i<2; i++){
        
            if (valorF >= 0 && valorF <= totalCtr){ // Critico
                danoF*=2;
                float hpFinalCF= monstro.getHp() - danoF;
                while (espadachim.isVivo() == true){

                    if(danoF >= monstro.getHp() && monstro.isVivo() == true){
                        System.out.println("monstro "+monstro.getNome()+" recebeu "+danoF+" de dano critico fisico e morreu");
                        monstro.setVivo(false);
                        monstro.setHp(0);
                        this.GanharExp(espadachim, monstro);
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
                while (espadachim.isVivo() == true){

                    if(danoF >= monstro.getHp() && monstro.isVivo() == true){
                        System.out.println("monstro "+monstro.getNome()+" recebeu "+danoF+" de dano fisico e morreu");
                        monstro.setVivo(false);
                        monstro.setHp(0);
                        this.GanharExp(espadachim, monstro);
                        break;
                    }
                    
                    else if (danoF <=0){
                        System.out.println("monstro "+monstro.getNome()+" recebeu "+1+" de dano fisico.");
                        monstro.setHp(monstro.getHp() - 1); 
                        break;
                    }
        
                    else if (danoF < monstro.getHp() && monstro.isVivo() == true){
                        System.out.println("monstro "+monstro.getNome()+" recebeu "+danoF+" de dano fisico");
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


    public void CorteMortal(Espadachim espadachim, Espada espada, Monstro monstro){
        System.out.println("===== "+espadachim.getNome()+" ===== CORTE MORTAL ===== "+monstro.getNome()+" =====");
        float antes = monstro.getHp();
        float totalCtr = ((espadachim.getCritico() *100) + (espada.getCritico() * 100));
        Random ataqueF = new Random();
        int valorF = ataqueF.nextInt(100);
        int danoF = (espadachim.getAtaque() + espada.getAtk() * 7) - monstro.getDefesaFisica(); 
        float hpFinalM= monstro.getHp() - danoF;
        
        if (valorF >= 0 && valorF <= totalCtr){ // Critico
            danoF*=2;
            float hpFinalCF= monstro.getHp() - danoF;
            while (espadachim.isVivo() == true){

                if(danoF >= monstro.getHp() && monstro.isVivo() == true){
                    System.out.println("monstro "+monstro.getNome()+" recebeu "+danoF+" de dano critico fisico e morreu");
                    monstro.setVivo(false);
                    monstro.setHp(0);
                    this.GanharExp(espadachim, monstro);
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
            while (espadachim.isVivo() == true){

                if(danoF >= monstro.getHp() && monstro.isVivo() == true){
                    System.out.println("monstro "+monstro.getNome()+" recebeu "+danoF+" de dano fisico e morreu");
                    monstro.setVivo(false);
                    monstro.setHp(0);
                    this.GanharExp(espadachim, monstro);
                    break;
                }
                
                else if (danoF <=0){
                    System.out.println("monstro "+monstro.getNome()+" recebeu "+1+" de dano fisico.");
                    monstro.setHp(monstro.getHp() - 1); 
                    break;
                }
    
                else if (danoF < monstro.getHp() && monstro.isVivo() == true){
                    System.out.println("monstro "+monstro.getNome()+" recebeu "+danoF+" de dano fisico");
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
        System.out.println("HP "+monstro.getNome()+": "+antes+" -> "+monstro.getHp());
        System.out.println("=================================================");
        System.out.println("");
    }
}
