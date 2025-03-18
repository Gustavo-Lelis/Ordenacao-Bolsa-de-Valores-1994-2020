package Arquivos;

import Model.BolsaDeValores;


import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class LerArquivos {
    private Scanner input;
    private ArrayList<BolsaDeValores> bolsaDeValores = new ArrayList<BolsaDeValores>();

    public ArrayList<BolsaDeValores> getBolsaDeValores(String nomeArquivo) {
        try {
            input = new Scanner(Paths.get(nomeArquivo));

            input.nextLine();

            while (input.hasNextLine()) {
                String[] line = input.nextLine().split(",");

                BolsaDeValores bolsa = new BolsaDeValores();

                String dataFormatada = LocalDate.parse(line[0], DateTimeFormatter.ofPattern("yyyy-MM-dd"))
                        .format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));

                bolsa.setData(dataFormatada);
                bolsa.setTicket(line[1]);
                bolsa.setOpen(Double.parseDouble(line[2]));
                bolsa.setClose(Double.parseDouble(line[3]));
                bolsa.setHigh(Double.parseDouble(line[4]));
                bolsa.setLow(Double.parseDouble(line[5]));
                bolsa.setVolume(Double.parseDouble(line[6]));

                bolsaDeValores.add(bolsa);
            }
        }
        catch (Exception e) {
            System.out.println("Erro : " +  e.getMessage());
        }
        return bolsaDeValores;
    }
}
