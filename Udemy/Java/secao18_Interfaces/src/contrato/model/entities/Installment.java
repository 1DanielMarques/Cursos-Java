package contrato.model.entities;

import java.time.LocalDate;

public class Installment {

    private LocalDate dueDate;
    private Double amount;

    public Installment(LocalDate dueDate, Double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public Double getAmount() {
        return amount;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    @Override
    public String toString() {
        return dueDate + " - " + String.format("%.2f", amount);
    }
}
