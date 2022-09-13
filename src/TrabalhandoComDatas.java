import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TrabalhandoComDatas {

    public static void main(String[] args) {

        LocalDateTime data = LocalDateTime.now();

        DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        String dataFormatada = formatarData.format(data);

        System.out.println("Data não formatada: "+ data);
        System.out.println("Data formatada: "+ dataFormatada);


    }
}
