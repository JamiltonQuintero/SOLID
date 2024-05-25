package com.jamiltonquintero.solid.i.coni;



interface ImprimibleAColor {
    void imprimir();

}

interface ImprimibleABlacoYNegro {
    void imprimir();

}
interface Imprimible extends ImprimibleAColor, ImprimibleABlacoYNegro{
void imprimir2();
void imprimirAColor2();

}
interface Escaneable {
    void escanear();
}

interface Faxeable {
    void enviarFax();
}
