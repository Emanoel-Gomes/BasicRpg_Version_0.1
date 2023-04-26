import java.util.Random;

public class Mago extends Heroi{

    public Mago(String nome, float hp, int maxhp, int ataque, int ataqueMagico, int defesaFisica, int defesaMagica, boolean vivo, int nivel, int pontos, float maxExp, float exp, float critico){
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

    public void Explosao(Mago mago, Cajado cajado, Monstro monstro){
        System.out.println("===== "+mago.getNome()+" ===== ESPLOSAO ===== "+monstro.getNome()+" =====");
        float antes = monstro.getHp();
        float totalCtr = ((mago.getCritico() *100) + (cajado.getCritico() * 100));
        Random ataqueM = new Random();
        int valorM = ataqueM.nextInt(100);
        int danoM = (mago.getAtaqueMagico() + cajado.getAtkm() * 7) - monstro.getDefesaMagica(); 
        float hpFinalM= monstro.getHp() - danoM;
        
        if (valorM >= 0 && valorM <= totalCtr){ // Critico
            danoM*=2;
            float hpFinalCM= monstro.getHp() - danoM;
            while (mago.isVivo() == true){

                if(danoM >= monstro.getHp() && monstro.isVivo() == true){
                    System.out.println("monstro "+monstro.getNome()+" recebeu "+danoM+" de dano critico magico e morreu");
                    monstro.setVivo(false);
                    monstro.setHp(0);
                    this.GanharExp(mago, monstro);
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
            while (mago.isVivo() == true){

                if(danoM >= monstro.getHp() && monstro.isVivo() == true){
                    System.out.println("monstro "+monstro.getNome()+" recebeu "+danoM+" de dano magico e morreu");
                    monstro.setVivo(false);
                    monstro.setHp(0);
                    this.GanharExp(mago, monstro);
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
        System.out.println("HP "+monstro.getNome()+": "+antes+" -> "+monstro.getHp());
        System.out.println("=================================================");
        System.out.println("");
    }

    public void Meteoro(Mago mago, Cajado cajado, Monstro monstro){
        System.out.println("===== "+mago.getNome()+" ===== METEORO ===== "+monstro.getNome()+" =====");
        float antes = monstro.getHp();
        float totalCtr = ((mago.getCritico() *100) + (cajado.getCritico() * 100));
        Random ataqueM = new Random();
        int valorM = ataqueM.nextInt(100);
        int danoM = (mago.getAtaqueMagico() + cajado.getAtkm() * 7) - monstro.getDefesaMagica(); 
        float hpFinalM= monstro.getHp() - danoM;
        
        if (valorM >= 0 && valorM <= totalCtr){ // Critico
            danoM*=2;
            float hpFinalCM= monstro.getHp() - danoM;
            while (mago.isVivo() == true){

                if(danoM >= monstro.getHp() && monstro.isVivo() == true){
                    System.out.println("monstro "+monstro.getNome()+" recebeu "+danoM+" de dano critico magico e morreu");
                    monstro.setVivo(false);
                    monstro.setHp(0);
                    this.GanharExp(mago, monstro);
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
            while (mago.isVivo() == true){

                if(danoM >= monstro.getHp() && monstro.isVivo() == true){
                    System.out.println("monstro "+monstro.getNome()+" recebeu "+danoM+" de dano magico e morreu");
                    monstro.setVivo(false);
                    monstro.setHp(0);
                    this.GanharExp(mago, monstro);
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
        System.out.println("HP "+monstro.getNome()+": "+antes+" -> "+monstro.getHp());
        System.out.println("=================================================");
        System.out.println("");
    }

    public void Tornado(Mago mago, Cajado cajado, Monstro monstro){
        System.out.println("===== "+mago.getNome()+" ===== TORNADO ===== "+monstro.getNome()+" =====");
        float antes = monstro.getHp();
        float totalCtr = ((mago.getCritico() *100) + (cajado.getCritico() * 100));
        Random ataqueM = new Random();
        int valorM = ataqueM.nextInt(100);
        int danoM = (mago.getAtaqueMagico() + cajado.getAtkm() * 7) - monstro.getDefesaMagica(); 
        float hpFinalM= monstro.getHp() - danoM;
        
        if (valorM >= 0 && valorM <= totalCtr){ // Critico
            danoM*=2;
            float hpFinalCM= monstro.getHp() - danoM;
            while (mago.isVivo() == true){

                if(danoM >= monstro.getHp() && monstro.isVivo() == true){
                    System.out.println("monstro "+monstro.getNome()+" recebeu "+danoM+" de dano critico magico e morreu");
                    monstro.setVivo(false);
                    monstro.setHp(0);
                    this.GanharExp(mago, monstro);
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
            while (mago.isVivo() == true){

                if(danoM >= monstro.getHp() && monstro.isVivo() == true){
                    System.out.println("monstro "+monstro.getNome()+" recebeu "+danoM+" de dano magico e morreu");
                    monstro.setVivo(false);
                    monstro.setHp(0);
                    this.GanharExp(mago, monstro);
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
        System.out.println("HP "+monstro.getNome()+": "+antes+" -> "+monstro.getHp());
        System.out.println("=================================================");
        System.out.println("");
    }
}
