package lesson08.homework.files_from_group_mate;

class Customer implements Comparable {
    private String name;
    private String adress;
    private String account;
    private long PAN;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public String getAccount() {
        return account;
    }
    public void setAccount(String account) {
        this.account = account;
    }
    public long getPAN() {
        return PAN;
    }
    public void setPAN(long PAN) {
        this.PAN = PAN;
    }
    public Customer() {
    }

    public Customer(String name, String adress, String account, long PAN) {
        super();
        this.name = name;
        this.adress = adress;
        this.account = account;
        this.PAN = PAN;
    }

    @Override
    public String toString() {
        return "Customer [name=" + name
                + ", adress=" + adress
                + ", account=" + account
                + ", PAN=" + PAN + "]";
    }
    @Override
    public int compareTo(Object obj) {
        if(this == obj) {
            return 0;
        }
        Customer customer = (Customer)obj;

        if(this.adress.compareTo(customer.adress) > 0) {
            return 1;
        } else if (this.adress.compareTo(customer.adress) < 0) {
            return -1;
        } else

            return 0;
    }
}