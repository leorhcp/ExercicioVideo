package exerciciovideo;
public class Viewer extends Pessoa{
    private String login;
    private int totAssistido;

    public Viewer(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }
    
    public void viuMaisUm(){
        
    }
    
    public String getLogin(){
        return login;
    }
    public void setLogin(String login){
        this.login = login;
    }
    public int getTotAssistido(){
        return totAssistido;
    }
    public void setTotAssistido(int totAssistido){
        this.totAssistido = totAssistido;
    }

    @Override
    public void ganharExp() {
        this.experiencia++;
    }

    @Override
    public String toString() {
        return "---Viewer---" + super.toString() +
                "\nLogin: " + login 
                + "\nTotal de vídeos assistido:" + totAssistido;
    }
    
    
}
