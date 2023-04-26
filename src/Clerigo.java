import java.util.ArrayList;
import java.util.List;

public class Clerigo extends Heroi{

    public Clerigo(String nome, float hp, int maxhp, int ataque, int ataqueMagico, int defesaFisica, int defesaMagica, boolean vivo, int nivel, int pontos, float maxExp, float exp, float critico){
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
    
    public void Regenerar(Clerigo clerigo, Livro livro, Heroi heroi){
        System.out.println("===== "+clerigo.getNome()+" ===== REGENERAR ===== "+heroi.getNome()+" =====");
        float antes = heroi.getHp();
        int cura = (clerigo.getAtaqueMagico() + livro.getAtkm());
        float depois = heroi.getHp() + cura;
        if (depois >= heroi.getMaxHp() && heroi.isVivo() == true){
            heroi.setHp(heroi.getMaxHp());
            System.out.println(antes+" -> "+heroi.getHp()); 
        }else if (heroi.isVivo() == true){
            heroi.setHp(depois);
            System.out.println(heroi.getNome()+" HP :"+antes+" -> "+heroi.getHp());
        }else{
            System.out.println("Impossivel curar o heroi "+heroi.getNome());
        }
        System.out.println("=================================================");
        System.out.println("");
    }

    public void ArcoDaCura(Clerigo clerigo, Livro livro, Heroi heroi1 ,Heroi heroi2 ,Heroi heroi3){
        System.out.println("===== "+clerigo.getNome()+"==== ARCO DA CURA ==============");
        List<Heroi> listaHerois = new ArrayList<Heroi>();
        listaHerois.add(heroi1);
        listaHerois.add(heroi2);
        listaHerois.add(heroi3);
        System.out.println("alvos : "+listaHerois.get(0).getNome()+", "+listaHerois.get(1).getNome()+", "+listaHerois.get(2).getNome());

        for (int i=0; i<listaHerois.size();i++){
            float antes = listaHerois.get(i).getHp();
            int cura = (clerigo.getAtaqueMagico() + livro.getAtkm());
            float depois = listaHerois.get(i).getHp() + cura;
            if (depois >= listaHerois.get(i).getMaxHp() && listaHerois.get(i).isVivo() == true){
                listaHerois.get(i).setHp(listaHerois.get(i).getMaxHp());
                System.out.println(listaHerois.get(i).getNome()+" HP "+antes+" -> "+listaHerois.get(i).getHp()); 
            }else if (listaHerois.get(i).isVivo() == true){
                listaHerois.get(i).setHp(depois);
                System.out.println(listaHerois.get(i).getNome()+" HP :"+antes+" -> "+listaHerois.get(i).getHp());
            }else{
                System.out.println("impossível curar o heroi "+listaHerois.get(i).getNome()+", o heroi está morto.");
            }
        }
        System.out.println("=================================================");
        System.out.println("");
    }

    public void Reviver(Clerigo clerigo, Heroi heroi){
        System.out.println("===== "+clerigo.getNome()+" ===== REVIVER ===== "+heroi.getNome()+" =====");
        if (heroi.isVivo() == false){
            float antes = heroi.getHp();
            heroi.setVivo(true);
            heroi.setHp(heroi.getMaxHp()/2);
            System.out.println("heroi "+heroi.getNome()+" foi revivido");
            System.out.println("HP "+heroi.getNome()+" "+antes+" -> "+heroi.getHp());
        }else{
            System.out.println("Inposivel reviver o heroi selecionado!");
        }
    }
}
