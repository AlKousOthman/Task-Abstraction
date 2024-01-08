 class Teacher extends Person {
    private String subject;
    private String school;
    private int id;

    public Teacher(String name, String subject, String school, int id){

        super(name);
        this.subject = subject;
        this.school = school;
        this.id = id;
    }

    @Override
    void describeRole(){
        System.out.println(getName() + " Teaches " + subject + "at" + school);
    }

    void id(){
        System.out.println("Teacher ID: " + id);
    }

}
