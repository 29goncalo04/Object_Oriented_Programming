import java.util.Arrays;

public class Aux_functions {
    
    public int min(int[] array){
        int res = array[0];
        for(int i = 0; i<array.length; i++){
            if(array[i] < res) res = array[i];
        }
        return res;
    }

    public int[] arr(int a, int b, int[] array){
        int[] res = new int[b-a+1];
        for(int i = 0; a<=b; i++, a++){
            res[i] = array[a];
        }
        return res;
    }

    public int[] equal_array(int[] a, int[] b){
        int[] aux = new int[Math.max(a.length, b.length)];
        int pos = 0;
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<b.length; j++){
                if(b[j] == a[i]){
                    for(int k = 0; k<aux.length; k++){
                        if(aux[k] == b[j]) break;
                        if(k == aux.length - 1){
                            aux[pos] = b[j];
                            pos++;
                        }
                    }
                    break;
                }
            }
        }
        int[] res = new int[pos];
        for(int i = 0; i<res.length; i++) res[i] = aux[i];
        return res;
    }

    public int[] crescente(int[] array, int tam){
        int[] res = new int[tam];
        for(int i = 0; i<tam; i++) res[i] = array[i];
        for(int i = 0; i<tam; i++){
            for(int j = i; j<tam; j++){
                if(res[i]>res[j]){
                    int temp = res[j];
                    res[j] = res[i];
                    res[i] = temp;
                }
            }
            
        }
        return res;
    }

    public int pos(int[] array, int valor){
        int res = -1, esquerda = 0, direita = (array.length -1);
        while(esquerda <= direita){
            int meio = esquerda + ((direita-esquerda) / 2);
            if(array[meio] == valor) return meio;
            if(array[meio] > valor) direita = meio-1;
            else esquerda = meio+1; 
        }
        return res;
    }

    public String[] no_repeat(String[] palavras){
        String[] aux = new String[palavras.length];
        int tam = 0;
        for(int i = 0; i<palavras.length; i++){
            for(int k = 0; k<palavras.length; k++){
                if(aux[k] != null){
                    if(aux[k].equals(palavras[i])) break;
                }
                if(k == palavras.length-1){
                    aux[tam] = palavras[i];
                    tam++;
                }
            }
        }
        String[] res = new String[tam];
        for(int i = 0; i<tam; i++) res[i] = aux[i];
        return res; 
    }

    public String maior_string(String[] array){
        int tam_max = 0;
        String maior = "";
        for(int i = 0; i<array.length; i++){
            if(array[i].length() > tam_max){
                maior = array[i];
                tam_max = array[i].length();
            }
        }
        return maior;
    }

    public String[] palavras_repetidas(String[] palavras){
        int ocorr = 0, tam_array = 0;
        String[] aux_array = new String[palavras.length];
        for(int i = 0; i<palavras.length; i++){
            String aux = palavras[i];
            ocorr = 0;
            for(int j = 0; j<palavras.length; j++){
                if(palavras[j].equals(aux)){
                    ocorr++;
                }
            }
            if(ocorr>1){
                for(int j = 0; j<aux_array.length; j++){
                    if(aux.equals(aux_array[j])) break;
                    if(j == aux_array.length - 1){
                        aux_array[tam_array] = aux;
                        tam_array++;
                    }
                }
            }
        }
        String[] res = new String[tam_array];
        for(int i = 0; i<tam_array; i++) res[i] = aux_array[i];
        return res;
    }

    public int numero_ocorr(String[] array, String palavra){
        int res = 0;
        for(int i = 0; i<array.length; i++){
            if(array[i].equals(palavra)) res++;
        }
        return res;
    }

    public int soma_uc(int[][] notasTurma, int uc){
        int res = 0;
        for(int i = 0; i<5; i++) res += notasTurma[i][uc-1];
        return res;
    }

    public int media(int[][] notasTurma, int aluno){
        int res = 0;
        for(int i = 0; i<5; i++){
            res += notasTurma[aluno-1][i];
        }
        return res/5;
    }

    public int media_uc(int[][] notasTurma, int uc){
        int res = 0;
        for(int i = 0; i<5; i++) res += notasTurma[i][uc-1];
        return res/5;
    }

    public int max_note(int[][] notasTurma, int uc){
        int res = -1;
        for(int i = 0; i<5; i++){
            if(notasTurma[i][uc-1] > res) res = notasTurma[i][uc-1];
        }
        return res;
    }

    public int min_note(int[][] notasTurma, int uc){
        int res = notasTurma[0][uc-1];
        for(int i = 0; i<5; i++){
            if(notasTurma[i][uc-1] < res) res = notasTurma[i][uc-1];
        }
        return res;
    }

    public int[] acima(int[][] notasTurma, int valor){
        int[] aux = new int[notasTurma.length * notasTurma[0].length];
        int tam = 0;
        for(int i = 0; i<5; i++){
            for(int j = 0; j<5; j++){
                if(notasTurma[i][j] > valor){
                    aux[tam] = notasTurma[i][j];
                    tam++;
                }
            }
        }
        int[] res = new int[tam];
        for(int i = 0; i<tam; i++) res[i] = aux[i];
        return res;
    }

    public String all_notas(int[][] notasTurma){
        return Arrays.deepToString(notasTurma);
    }

    public int melhor_uc(int[][] notasTurma){
        int uc = -1, aux = -1, media = -1;
        for(int i = 0; i<5; i++){
            aux = 0;
            for(int j = 0; j<5; j++){
                aux += notasTurma[j][i];
            }
            if(aux/5 > media){
                media = aux/5;
                uc = i+1;
            }
        }
        return uc;
    }

    public String soma_matriz(int[][] matriz1, int[][] matriz2){
        if(matriz1.length!=matriz2.length || matriz1[0].length!=matriz2[0].length) return "Não é possível somar as matrizes";
        int[][] aux = new int[matriz1.length][matriz1[0].length];
        for(int i = 0; i<matriz1.length; i++){
            for(int j = 0; j<matriz1[0].length; j++) aux[i][j] = matriz1[i][j] + matriz2[i][j];
        }
        return Arrays.deepToString(aux);
    }

    public int same_matriz(int[][] matriz1, int[][] matriz2){  //return 1 caso sejam iguais, 0 caso não sejam
        if(matriz1.length!=matriz2.length || matriz1[0].length!=matriz2[0].length) return 0;
        for(int i = 0; i<matriz1.length; i++){
            for(int j = 0; j<matriz1[0].length; j++){
                if(matriz1[i][j] != matriz2[i][j]) return 0;
            }
        }
        return 1;
    }

    public int[][] opposite(int[][] matriz){
        int[][] res = new int[matriz.length][matriz[0].length];
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz[0].length; j++) res[i][j] = -matriz[i][j];
        }
        return res;
    }
}