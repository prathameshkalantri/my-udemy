class tailor{
    private int num;
    private String name;
    private int quantity;
    private int total; 
    tailor(int Num,String Name,int Quantity){
        this.num=Num;
        this.name=Name;
        this.quantity=Quantity;
        this.total= 200*quantity;
    }
    public int totalBill(){
        return this.total;
    }
}    