package myCoddingChallenges;

public class HavingFun {
    private String name;
    private String pin;
    private String accountNumber;


    public void setName(String name){
        this.name = name;
    }

    public void setPin(String pin){
        this.pin = pin;
    }


//    public HavingFun(String name, String pin, String accountNumber){
//        this.name = name;
//        this.pin = pin;
//        this.accountNumber = accountNumber;
//    }
//
//    public HavingFun(String name, String pin){
//        this.name = name;
//        this.pin = pin;
//        this.accountNumber = "00000000000";
//    }
//
//    public HavingFun(String name){
//        this.name = name;
//        this.pin = "iQew87Qe";
//        this.accountNumber = "00000000000";
//    }
//
//    public HavingFun(){
//        this.name = "null";
//        this.pin = "iQew87Qe";
//        this.accountNumber = "00000000000";
//    }
    public String getName(){
        return name;
    }

    public String getPin(){
        return pin;
    }

    public String getAccountNumber(){
        return accountNumber;
    }


}
