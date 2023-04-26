public abstract class Armas {
    protected int atk;
    protected int atkm;
    protected float critico;

    public int getAtkm() {
        return atkm;
    }

    public void setAtkm(int atkm) {
        this.atkm = atkm;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getAtk() {
        return atk;
    }
    
    public void setCritico(float critico) {
        this.critico = critico;
    }

    public float getCritico() {
        return critico;
    }
    

    public void AtaqueSpecialArma(){
        System.out.println("ataque arma");
    }

    public void Status(){
        System.out.println("============ Status arco =============");
        System.out.println("Ataque: "+this.getAtk());
        System.out.println("Ataque Magico: "+this.getAtkm());
        System.out.println("=================================");
    }
}
