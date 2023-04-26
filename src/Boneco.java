
public abstract class Boneco {
    public String nome;
    public float hp;
    public int maxHp;
    public int ataque;
    public int ataqueMagico;
    public int defesaFisica;
    public int defesaMagica;
    public boolean vivo;

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getDefesaFisica() {
        return defesaFisica;
    }

    public void setDefesaFisica(int defesaFisica) {
        this.defesaFisica = defesaFisica;
    }

    public int getDefesaMagica() {
        return defesaMagica;
    }

    public void setDefesaMagica(int defesaMagica) {
        this.defesaMagica = defesaMagica;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setHp(float hp) {
        this.hp = hp;
    }

    public float getHp() {
        return hp;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaqueMagico(int ataqueMagico) {
        this.ataqueMagico = ataqueMagico;
    }

    public int getAtaqueMagico() {
        return ataqueMagico;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
}
