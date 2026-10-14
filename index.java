class Student {
    private int age;

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setAge(18);
        System.out.println("Age: " + s1.getAge());
    }
}
