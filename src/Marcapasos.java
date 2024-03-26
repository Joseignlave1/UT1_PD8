public class Marcapasos {
    //Parte a
    short presionSanguínea; //Rango de 0 a 250
    short frecuenciaCardíaca; //Rango de 0 a 226
    short azucaEnSangre; //Rango de 0 a 1000
    long maximaFuerzaExpuesta; //Rango de 0 a 3.000.000.000
    float minimoTiempoEntreLatido; //Rango de 0 a 100
    float bateriaRestante; //Rango de 0 a 100
    char[] codigodelFabricante; //Secuencia de códigos y letras, máximo rango de 0 a 8
    public static void main(String[] args) {

    }
}

/*
    //Parte b
    Calculo de memoria objeto Marcapasos(considerando solamente el espacio ocupado por las variables)
    short presionSanguínea = 2 bytes;
    short frecuenciaCardíaca = 2 bytes;
    short azucaEnSangre = 2 bytes;
    long maximaFuerzaExpuesta = 8 bytes;
    float minimoTiempoEntreLatido = 4 bytes;
    float bateriaRestante = 4 bytes;
    char[] codigodelFabricante = new char[8] = 8 bytes el objeto de tipo charArray;

    total memoria = 2 + 2 + 2 + 8 + 4 + 4 + 8 = 30 bytes de memoria.
 */