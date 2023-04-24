package exerciciovideo;
public class ExercicioVideo {
    public static void main(String[] args) {
        
        Viewer vw[] = new Viewer[3];
        Video v[] = new Video[3];
        
        v[0] = new Video("Neymar é encontrado morto após chupar seu próprio pau.");
        v[1] = new Video("A faca AK-47 - Perfeita para o combate!");
        v[2] = new Video("Kassino no Sabadaço!");
        
        vw[0] = new Viewer("Leonel", 28,"M","leorhcp");
        vw[1] = new Viewer("Thais",32,"F","tais-guedes");

        
        Visualizacao vz[] = new Visualizacao[3];
        vz[0] = new Visualizacao (vw[0], v[0]); // Leonel Assiste Neymar
        vz[0].avaliar();
        System.out.println(vz[0].toString());
        vz[1] = new Visualizacao (vw[0], v[2]); // Leonel Assiste Kassino
        vz[1].avaliar(82.0f);
        System.out.println(vz[1].toString());

        
        
      
    }
    
}
