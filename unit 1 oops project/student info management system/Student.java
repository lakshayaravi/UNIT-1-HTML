class Student {
    String name;
    String email;
    String phone;
    String rollNo;
    String dept;
    String year;
    String city;
    String state;

    Student(String name, String email, String phone, String rollNo,
                   String dept, String year, String city, String state) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.rollNo = rollNo;
        this.dept = dept;
        this.year = year;
        this.city = city;
        this.state = state;
    }

    void display(){
        System.out.println(name + "\t" + email + "\t" + phone + "\t" + rollNo + "\t" + dept + "\t" + year + "\t" + city + "\t" + state + "\t")
    }
}
