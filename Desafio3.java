package desafios;

import org.json.JSONArray;
import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Desafio3 {
    public static void main(String[] args) throws Exception {
        String content = new String(Files.readAllBytes(Paths.get("faturamento.json")));
        JSONArray faturamentoDiario = new JSONArray(content);

        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        double somaFaturamento = 0;
        int diasComFaturamento = 0;

        for (int i = 0; i < faturamentoDiario.length(); i++) {
            double valor = faturamentoDiario.getDouble(i);
            if (valor > 0) {
                if (valor < menorFaturamento) {
                    menorFaturamento = valor;
                }
                if (valor > maiorFaturamento) {
                    maiorFaturamento = valor;
                }
                somaFaturamento += valor;
                diasComFaturamento++;
            }
        }

        double mediaMensal = somaFaturamento / diasComFaturamento;
        int diasAcimaDaMedia = 0;

        for (int i = 0; i < faturamentoDiario.length(); i++) {
            double valor = faturamentoDiario.getDouble(i);
            if (valor > mediaMensal) {
                diasAcimaDaMedia++;
            }
        }

        System.out.println("Menor faturamento: " + menorFaturamento);
        System.out.println("Maior faturamento: " + maiorFaturamento);
        System.out.println("Dias com faturamento acima da média: " + diasAcimaDaMedia);
    }
}
