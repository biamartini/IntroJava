package intro;

public class medidas {

    public static void main (String[] args) {

        calcularAreaModoCurto();
        calcularAreaModoExtenso();
    }

        public static void calcularAreaModoCurto(){

            System.out.println("Cálculo de área Modo curto");

            int largura = 4;
            int comprimento = 3;


            System.out.println("Para a largura de " + largura + " m2 e o comprimento de " + comprimento +
                    " m2, a area é de " + largura * comprimento +"m2");

        // calculo reduzido

        }


            public static void calcularAreaModoExtenso(){

                System.out.println("Calculo de area modulo extenso");
                int largura;
                int comprimento;
                int resultado;

                largura = 5;
                comprimento = 6;

                resultado = largura * comprimento;

                System.out.println("Para a largura de " + largura + " m2 e o comprimento de " + comprimento +
                        " m2, a area é de " + resultado + "  m2");
    }
}
