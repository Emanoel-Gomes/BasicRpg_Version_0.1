
public class Heroi extends Boneco {
    public int nivel;
    public int pontos;
    public float maxExp;
    public float exp;
    public float critico;

    

    public float getCritico() {
        return critico;
    }

    public void setCritico(float critico) {
        this.critico = critico;
    }

    public float getExp() {
        return exp;
    }

    public void setExp(float exp) {
        this.exp = exp;
    }

    public float getMaxExp() {
        return maxExp;
    }

    public void setMaxExp(float maxExp) {
        this.maxExp = maxExp;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

     public void Status(){
        System.out.println("============ Status Herói =============");
        System.out.println("Nome: "+this.getNome());
        System.out.println("Vivo: "+this.isVivo());
        System.out.println("Ataque: "+this.getAtaque());
        System.out.println("Ataque Magico: "+this.getAtaqueMagico());
        System.out.println("Hp: "+this.getHp());
        System.out.println("=================================");
        
    }

    public void EscolherAtributo(String atributo, int pontos){
        if (atributo != "atk" && atributo != "atkm" && atributo != "hp" && atributo != "def" && atributo != "defm"){
            System.out.println("              Atributo invalido!");
            System.out.println("============= LISTA DE ATRIBUTOS =============");
            System.out.println("atk");
            System.out.println("atkm");
            System.out.println("hp");
            System.out.println("def");
            System.out.println("defm");
        }
        else{
            int antesAtk = this.getAtaque();
            int antesAtkm = this.getAtaqueMagico();
            float antesHp = this.getMaxHp();
            int antesDef = this.getDefesaFisica();
            int antesDefm = this.getDefesaMagica();

            System.out.println("===== "+this.getNome()+" ===== ATRIBUTOS MELHORADOS ==========");
            for (int i=0; i<pontos;i++){
                if (atributo == "atk" && this.getPontos()>0){
                    this.setPontos(this.getPontos()-1);
                    this.setAtaque(this.getAtaque()+5);
                }
                else if (atributo == "atkm" && this.getPontos()>0){
                    this.setPontos(this.getPontos()-1);
                    this.setAtaqueMagico(this.getAtaqueMagico()+5);   
                }
                else if (atributo == "hp" && this.getPontos()>0){
                    this.setPontos(this.getPontos()-1);
                    this.setMaxHp(this.getMaxHp()+50);  
                }
                else if (atributo == "def" && this.getPontos()>0){
                    this.setPontos(this.getPontos()-1);
                    this.setDefesaFisica(this.getDefesaFisica()+10);   
                }
                else if (atributo == "defm" && this.getPontos()>0){
                    this.setPontos(this.getPontos()-1);
                    this.setDefesaMagica(this.getDefesaMagica()+10);   
                }
            }
            System.out.println("atk "+antesAtk+" -> "+this.getAtaque());
            System.out.println("atkm "+antesAtkm+" -> "+this.getAtaqueMagico());
            System.out.println("maxhp "+antesHp+" -> "+this.getMaxHp());
            System.out.println("def "+antesDef+" -> "+this.getDefesaFisica());
            System.out.println("defm "+antesDefm+" -> "+this.getDefesaMagica());
        }
        System.out.println("Pontos restantes: "+this.getPontos());
        System.out.println("=================================================");
        System.out.println("");
    }

    public void PassarLv(){
        System.out.println("heroi "+this.getNome()+" passou de nivel!");
        int antes = nivel;
        // float antesME = this.getMaxExp();
        this.nivel++;
        this.setMaxExp(getMaxExp()*1.5f);       
        System.out.println(antes+" -> "+nivel);
        this.pontos+=5;
        // System.out.println("max exp :"+antesME+" -> "+this.getMaxExp());
    }

    public void GanharExp(Heroi heroi, Monstro monstro){
        if (monstro.getDificuldade() == 1){
            heroi.setExp(heroi.getExp()+50);
            float resto = heroi.getExp() - maxExp;
            if (resto >= 0){
                while(heroi.maxExp <= heroi.getExp()){
                    resto = heroi.getExp() - maxExp;
                    heroi.PassarLv();
                    heroi.setExp(resto);  
                }
            }
            System.out.println(heroi.getNome()+" Exp atual -> "+heroi.getExp());        
        }
        else if (monstro.getDificuldade() == 2){
            heroi.setExp(heroi.getExp()+60);
            float resto = heroi.getExp() - maxExp;
            if (resto >= 0){
                while(heroi.maxExp <= heroi.getExp()){
                    resto = heroi.getExp() - maxExp;
                    heroi.PassarLv();
                    heroi.setExp(resto);  
                }
            }
            System.out.println(heroi.getNome()+" Exp atual -> "+heroi.getExp());        
        }
        else if (monstro.getDificuldade() == 3){
            heroi.setExp(heroi.getExp()+70);
            float resto = heroi.getExp() - maxExp;
            if (resto >= 0){
                while(heroi.maxExp <= heroi.getExp()){
                    resto = heroi.getExp() - maxExp;
                    heroi.PassarLv();
                    heroi.setExp(resto);  
                }
            }
            System.out.println(heroi.getNome()+" Exp atual -> "+heroi.getExp());        
        }
        else if (monstro.getDificuldade() == 4){
            heroi.setExp(heroi.getExp()+80);
            float resto = heroi.getExp() - maxExp;
            if (resto >= 0){
                while(heroi.maxExp <= heroi.getExp()){
                    resto = heroi.getExp() - maxExp;
                    heroi.PassarLv();
                    heroi.setExp(resto);  
                }
            }
            System.out.println(heroi.getNome()+" Exp atual -> "+heroi.getExp());        
        }
        else if (monstro.getDificuldade() == 5){
            heroi.setExp(heroi.getExp()+100);
            float resto = heroi.getExp() - maxExp;
            if (resto >= 0){
                while(heroi.maxExp <= heroi.getExp()){
                    resto = heroi.getExp() - maxExp;
                    heroi.PassarLv();
                    heroi.setExp(resto);  
                }
            }
            System.out.println(heroi.getNome()+" Exp atual -> "+heroi.getExp());        
        }
        else if (monstro.getDificuldade() == 6){
            heroi.setExp(heroi.getExp()+120);
            float resto = heroi.getExp() - maxExp;
            if (resto >= 0){
                while(heroi.maxExp <= heroi.getExp()){
                    resto = heroi.getExp() - maxExp;
                    heroi.PassarLv();
                    heroi.setExp(resto);  
                }
            }
            System.out.println(heroi.getNome()+" Exp atual -> "+heroi.getExp());        
        }
        else if (monstro.getDificuldade() == 7){
            heroi.setExp(heroi.getExp()+140);
            float resto = heroi.getExp() - maxExp;
            if (resto >= 0){
                while(heroi.maxExp <= heroi.getExp()){
                    resto = heroi.getExp() - maxExp;
                    heroi.PassarLv();
                    heroi.setExp(resto);  
                }
            }
            System.out.println(heroi.getNome()+" Exp atual -> "+heroi.getExp());        
        }
        else if (monstro.getDificuldade() == 8){
            heroi.setExp(heroi.getExp()+160);
            float resto = heroi.getExp() - maxExp;
            if (resto >= 0){
                while(heroi.maxExp <= heroi.getExp()){
                    resto = heroi.getExp() - maxExp;
                    heroi.PassarLv();
                    heroi.setExp(resto);  
                }
            }
            System.out.println(heroi.getNome()+" Exp atual -> "+heroi.getExp());        
        }
        else if (monstro.getDificuldade() == 9){
            heroi.setExp(heroi.getExp()+180);
            float resto = heroi.getExp() - maxExp;
            if (resto >= 0){
                while(heroi.maxExp <= heroi.getExp()){
                    resto = heroi.getExp() - maxExp;
                    heroi.PassarLv();
                    heroi.setExp(resto);  
                }
            }
            System.out.println(heroi.getNome()+" Exp atual -> "+heroi.getExp());        
        }
        else if (monstro.getDificuldade() == 10){
            heroi.setExp(heroi.getExp()+500);
            float resto = heroi.getExp() - maxExp;
            if (resto >= 0){
                while(heroi.maxExp <= heroi.getExp()){
                    resto = heroi.getExp() - maxExp;
                    heroi.PassarLv();
                    heroi.setExp(resto);  
                }
                System.out.println(heroi.getNome()+" Exp atual -> "+heroi.getExp());
            }        
        }
        else{
            System.out.println("erro");
        }
    }
}
        