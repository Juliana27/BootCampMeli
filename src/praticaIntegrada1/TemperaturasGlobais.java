package praticaIntegrada1;

public class TemperaturasGlobais {

    public static void main(String[] args) {

        String[] cidades = {"Londres", "Madrid", "Nueva York", "BuenosAires", "Asuncion", "São Paulo", "Lima",
                "Santiago de Chile", "Lisboa", "Tokio"};

        int[][] matrixTemperatura = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};
        int minTemp = 0;
        int maxTemp = 0;
        int indiceMinTemp = 0;
        int indiceMaxTemp = 0;

        for (int i = 0; i < matrixTemperatura.length; i++) {

            if (matrixTemperatura[i][0] < minTemp) {

                minTemp = matrixTemperatura[i][0];
                indiceMinTemp = i;

            }

            for (int j = 0; j < matrixTemperatura[i].length; j++) {

                if (matrixTemperatura[i][j] > maxTemp) {

                    maxTemp = matrixTemperatura[i][j];
                    indiceMaxTemp = i;
                }
            }
        }

        System.out.println("A temperatura mais baixa foi em " + cidades[indiceMinTemp] + ", com " + minTemp + "ºC");
        System.out.println("A temperatura mais alta foi em " + cidades[indiceMaxTemp] + ", com " + maxTemp + "ºC");
    }
}
