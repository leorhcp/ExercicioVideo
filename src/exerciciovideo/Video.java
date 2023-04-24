package exerciciovideo;
public class Video implements AcoesVideo{
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    
    public Video(String titulo){
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }
    
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public int getAvaliacao(){
        return avaliacao;
    }
    public void setAvaliacao(int avaliacao){
        int nova;
        nova = (int) ((this.avaliacao + avaliacao) / this.views);
        
        this.avaliacao = nova;
    }
    public int getViews(){
        
        return views;
    }
    public void setViews(int views){
        this. views = views;
    }
    public int getCurtidas(){
        return curtidas;
    }
    public void setCurtidas(int curtidas){
        this.curtidas = curtidas;
    }
    public boolean getReproduzindo(){
        return reproduzindo;
    }
    public void setReproduzindo(boolean reproduzindo){
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play() {
        setReproduzindo(true);
        System.out.println("O video está sendo reproduzido!");
    }

    @Override
    public void pause() {
        setReproduzindo(false);
        System.out.println("O video foi pausado.");
    }

    @Override
    public void like() {
        this.curtidas = getCurtidas() + 1;
        System.out.println("Alguém curtiu seu vídeo");
    }

    @Override
    public String toString() {
         return "---Video---\n" + "Titulo: " + titulo 
                + "\nAvaliacao:  " + avaliacao +" Estrelas!"
                + "\nViews: " + views + "\nCurtidas: " 
                + curtidas + "\nReproduzindo: " + reproduzindo;
      
    }
    
    
}
