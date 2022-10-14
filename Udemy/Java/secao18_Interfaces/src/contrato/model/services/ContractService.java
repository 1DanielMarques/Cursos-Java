package contrato.model.services;


import contrato.model.entities.Contract;

public class ContractService {
    private OnlinePaymentService service;

    public ContractService(OnlinePaymentService service) {
        this.service = service;
    }

    public void processContract(Contract contract, int months) {
        for (int i = 1; i <= months; i++) {


        }


    }

}
