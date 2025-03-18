package Arquivos;

import Model.BolsaDeValores;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;


public class EscreverArquivo {

    public void setBolsaDeValores(String pathOrigin){
        String path = "C:\\Users\\PC\\Documents\\b3stocks_T1.csv";

        LerArquivos arquivo = new LerArquivos();
        ArrayList<BolsaDeValores> valoresArquivos= arquivo.getBolsaDeValores(pathOrigin);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {

            bw.write("datetime,ticker,open,close,high,low,volume");
            bw.newLine();

            for (BolsaDeValores line : valoresArquivos) {
                bw.write(line.toCSV());
                bw.newLine();
            }
        } catch (Exception e) {
            System.out.println("Erro ao gerar arquivo: " + e.getMessage());
        }
    }
}
