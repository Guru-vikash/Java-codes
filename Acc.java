class Account
    {
        long ano;
        double bal;
        Account(long ano,double bal)
        {
            this.ano=ano;
            this.bal=bal;
        }
        public double chkbal()
        {
           
            return bal;
        }
    }
    class Saving extends Account
    {
        int irate;
        public Saving(long ano,double bal,int irate)
        {
            super(ano,bal);
            this.irate=irate;
        }
        public double chkbal()
        {
            System.out.println("Account number: "+ super.ano);
            double totalAmount;
            totalAmount = (super.bal*irate)/100;
            return totalAmount+super.bal;
        }
        public void withdraw(int amount)
        {
        
            if(amount<super.bal)
            {
                super.bal = super.bal-amount;
                System.out.println("Savings Account Balance after withdrawl "+amount+" : " +super.bal);
            }
            else
            {
                System.out.println("not avilable Balance");
            }
           
        }
        public void deposit(int amount)
        {
           
                super.bal = super.bal+amount;
            System.out.println("Savings Account Balance after Deposit "+amount+" : " +super.bal);
        }
    
    }
    class Current extends Account
    {
        int olt;
        public	Current(long ano,double bal,int olt)
        {
            super(ano,bal);
            this.olt=olt;
        }
        public double chkbal()
        {
            System.out.println("Account number: "+ super.ano);  	 
            return super.bal;
        }
        public void deposit(int amount)
        {
           
            super.bal = super.bal+amount;
            System.out.println("Current Account Balance after Deposit  "+amount+" : " +super.bal);
        }    
        public void withdraw(int amount)
        {
            if(amount<olt)
            {
                super.bal= super.bal-amount;
                System.out.println("Current Account Balance after withdrawl "+amount+" : " + super.bal);
            }
            else
            {
                System.out.println("Withdrawl amount exceeds Overdraft limit");
            }
           
        }
        
        
    
    }
    class Acc
    {
        public static void main(String[] args)
        {
            System.out.println("ACCOUNT DETAILS ");
    System.out.println("\n\n******* SAVING ACCOUNT *******\n\n");
    
            
    
            Saving s=new Saving(981234802,100000,10);
            System.out.println("Total Balance: " + s.chkbal());
            s.withdraw(5000);
            s.deposit(10000);
    
            System.out.println("\n\n******* CURRENT ACCOUNT *******\n\n");
    
            Current c=new Current(923479234,150000,5000);
            System.out.println("Total Balance: " + c.chkbal());
            c.withdraw(4000);  	 
            c.deposit(20000);
           
           
        }
}
    
    

