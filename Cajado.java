class Cajado {
public void poderelemental(PedraElemento pedra1, PedraElemento pedra2) {
    if (pedra1.getClass() == pedra2.getClass()) {
        System.out.println("Poder de " + pedra1.tipo);
    } else {
        System.out.println("Combinação desconhecida");
    }
}
//combustao
public void poderelemental(PedraFogo pedraFogo, PedraAr pedraAr) {
    System.out.println("Poder de Combustão");
}
public void poderelemental(PedraAr pedraAr, PedraFogo pedraFogo) {
    System.out.println("Poder de Combustão");
}

//lava
public void poderelemental(PedraFogo pedraFogo, PedraTerra pedraTerra) {
    System.out.println("Poder de Lava");
}
public void poderelemental(PedraTerra pedraTerra, PedraFogo pedraFogo) {
    System.out.println("Poder de Lava");
}

//planta
public void poderelemental(PedraTerra pedraTerra, PedraAgua pedraAgua) {
    System.out.println("Poder de Planta");
}
public void poderelemental(PedraAgua pedraAgua, PedraTerra pedraTerra) {
    System.out.println("Poder de Planta");
}

//neve
public void poderelemental(PedraAgua pedraAgua, PedraAr pedraAr) {
    System.out.println("Poder de Neve");
}
public void poderelemental(PedraAr pedraAr, PedraAgua pedraAgua) {
    System.out.println("Poder de Neve");
}
}