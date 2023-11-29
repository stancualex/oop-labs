public class ContBancar {
    private float sold;

    ContBancar(float sold) {
        this.sold = sold;
    }

    ContBancar() {
        this(1000f);
    }

    public float retrageNumerar(float amount) throws SoldInsuficientException {
       if (sold < amount) {
           throw new SoldInsuficientException();
       }
       sold -= amount;
       return sold;
    }
}
