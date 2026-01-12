package time;

import java.time.LocalDate;

public enum LegalHoliday {

    NEW_YEAR(LocalDate.of(2026, 1, 1)),
    SEOLLAL1(LocalDate.of(2026, 2, 16)),
    SEOLLAL2(LocalDate.of(2026, 2, 17)),
    SEOLLAL3(LocalDate.of(2026, 2, 18)),
    MARCH1(LocalDate.of(2026, 3, 1)),
    MARCH1_SUB(LocalDate.of(2026, 3, 2)),
    CHILDRENS_DAY(LocalDate.of(2026, 5, 5)),
    BUDDHAS_DAY(LocalDate.of(2026, 5, 24)),
    BUDDHAS_DAY_SUB(LocalDate.of(2026, 5, 25)),
    ELECTION_DAY(LocalDate.of(2026, 6, 3)),
    MEMORIAL_DAY(LocalDate.of(2026, 6, 6)),
    LIBERATION_DAY(LocalDate.of(2026, 8, 15)),
    LIBERATION_DAY_SUB(LocalDate.of(2026, 8, 17)),
    CHUSEOK1(LocalDate.of(2026, 9, 24)),
    CHUSEOK2(LocalDate.of(2026, 9, 25)),
    CHUSEOK3(LocalDate.of(2026, 9, 26)),
    FOUNDATION_DAY(LocalDate.of(2026, 10, 3)),
    FOUNDATION_DAY_SUB(LocalDate.of(2026, 10, 5)),
    HANGUL_DAY(LocalDate.of(2026, 10, 9)),
    CHRISTMAS(LocalDate.of(2026, 12, 25));

    private final LocalDate date;
  
    LegalHoliday(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }
}
