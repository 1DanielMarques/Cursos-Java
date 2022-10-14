package contrato.model.services;


import contrato.model.entities.Contract;
import contrato.model.entities.Installment;

import java.time.LocalDate;

public class ContractService {
    private OnlinePaymentService service;

    public ContractService(OnlinePaymentService service) {
        this.service = service;
    }

    public void processContract(Contract contract, int months) {
        double initialAmount = contract.getTotalValue() / months;
        for (int i = 1; i <= months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);
            double installment = service.interest(initialAmount, i);
            double amount = initialAmount + service.paymentFee(initialAmount + installment);
            contract.getInstallmentList().add(new Installment(dueDate, amount));
        }
    }

}
