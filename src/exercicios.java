import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class exercicios {
  public static void main(String[] args) {


    //EXERCICIO 1
    LocalDate dataAtual = LocalDate.now();
    System.out.println("dia: " + dataAtual.getDayOfMonth());
    System.out.println("mês: " + dataAtual.getMonthValue());
    System.out.println("ano: " + dataAtual.getYear());

    LocalDate novaData = dataAtual.plusDays(10);
    System.out.println("Nova data: " + DateTimeFormatter.ofPattern("dd/MM/yyyy").format(novaData));

    //EXERCICIO 2
    LocalTime horaAtual = LocalTime.now();
    System.out.println("Hora atual: " + horaAtual);
    LocalTime novaHora = horaAtual.plusHours(2).plusMinutes(30);
    System.out.println("Nova hora: " + novaHora);

    //EXERCICIO 3

    String dataNascinto2 = "16/02/1994";
    String dataNascinto3 = "16/02/2004";

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    LocalDate dataNascinto = LocalDate.parse(dataNascinto2, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    LocalDate dataNascinto1 = LocalDate.parse(dataNascinto3, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    Duration diff = Duration.between(dataNascinto.atStartOfDay(), dataNascinto1.atStartOfDay());
    System.out.println("Diferença em dias: " + diff.toDays());
    System.out.println("Diferença em meses: " + (diff.toDays() / 30));
    System.out.println("Diferença em anos: " + (diff.toDays() / 365));

    //EXERCICIO 4
    Scanner scanner = new Scanner(System.in);
    LocalDateTime horaAtual1 = LocalDateTime.now();
    System.out.println("pressione enter para calcular o tempo que passou...");
    scanner.nextLine();
    LocalDateTime novaHora1 = LocalDateTime.now();
    Duration diff1 = Duration.between(horaAtual1, novaHora1);
    System.out.println("Tempo que passou em segundos em nanossegundos: " + diff1.getSeconds() + " segundos e " + diff1.getNano() + " nanossegundos");





  }
}
