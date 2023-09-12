public class Main {
    public static void main(String[] args) {
        Cajado cajado = new Cajado();

        PedraFogo pedraFogo1 = new PedraFogo();
        PedraFogo pedraFogo2 = new PedraFogo();
        cajado.executarPoderElemental(pedraFogo1, pedraFogo2);

        PedraFogo pedraFogo = new PedraFogo();
        PedraAr pedraAr = new PedraAr();
        cajado.executarPoderElemental(pedraFogo, pedraAr);

        PedraTerra pedraTerra = new PedraTerra();
        PedraAgua pedraAgua = new PedraAgua();
        cajado.executarPoderElemental(pedraTerra, pedraAgua);

        PedraAgua pedraAgua2 = new PedraAgua();
        PedraAr pedraAr2 = new PedraAr();
        cajado.executarPoderElemental(pedraAgua2, pedraAr2);
    }
}