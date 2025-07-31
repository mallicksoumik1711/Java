class Details{
    private String name;
    private int rollNo;

    Details(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }

    void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
    int getRollNo(){
        return this.rollNo;
    }
}

class Main{
    public static void main(String args[]){
        Details d = new Details("Soumik", 12);
        System.out.println(d.getName() + d.getRollNo());

        d.setName("Soumik mallick");
        d.setRollNo(123);

        System.out.println(d.getName() + " " + d.getRollNo());
    }
}