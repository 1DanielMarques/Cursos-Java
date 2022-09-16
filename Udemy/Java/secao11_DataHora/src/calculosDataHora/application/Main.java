package calculosDataHora.application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate d4 = LocalDate.parse("2022-09-16");
        LocalDateTime d5 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d6 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate semanaPassadaLocalDate = d4.minusDays(7);
        LocalDate proximaSemanaLocalDate = d4.plusDays(7);

        LocalDateTime semanaPassadaDateTime = d5.minusDays(7);
        LocalDateTime proximaSemanaDateTime = d5.plusDays(7);

        Instant semanaPassadaInstant = d6.minus(7, ChronoUnit.DAYS);
        Instant proximaSemanaInstant = d6.plus(7, ChronoUnit.DAYS);

        System.out.println("semanaPassadaLocalDate = " + semanaPassadaLocalDate);
        System.out.println("proximaSemanaLocalDate = " + proximaSemanaLocalDate);

        System.out.println("semanaPassadaDateTime = " + semanaPassadaDateTime);
        System.out.println("proximaSemanaDateTime = " + proximaSemanaDateTime);

        System.out.println("semanaPassadaInstant = " + semanaPassadaInstant);
        System.out.println("proximaSemanaInstant = " + proximaSemanaInstant);

        Duration t1 = Duration.between(semanaPassadaLocalDate.atStartOfDay(), d4.atStartOfDay());
        Duration t2 = Duration.between(semanaPassadaDateTime, d5);
        Duration t3 = Duration.between(semanaPassadaInstant,d6);
        Duration t4 = Duration.between(d6,semanaPassadaInstant);
        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println("t3 dias = " + t3.toDays());
        System.out.println("t4 dias = " + t4.toDays());


    }
}
